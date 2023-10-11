package com.example.spring20230920.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main25")

public class Controller25 {
    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public void method1() {
    }

    @PostMapping("sub1")
    public void method1(@RequestParam(value = "id", required = false) Integer customerId) throws SQLException {

        if (customerId == null) {
            System.out.println("삭제를 id를 넣어주세요");
            return;
        }
        String sql = """
                DELETE FROM customers
                WHERE customerId = ?
                """;
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        try (connection; statement;) {

            statement.setInt(1, customerId);
            int rows = statement.executeUpdate();// inset, delete, update (int)

            if (rows == 1) {
                System.out.println(rows + "개 레코드 잘 지워짐");
            } else {
                System.out.println("잘 지워지지않음");
            }
        }
    }

    @GetMapping("sub2")
    public void method2() {
    }

    @PostMapping("sub2")
    public void method2(@RequestParam(value = "pid", required = false) Integer royy) throws SQLException {

        if (royy == null) {
            System.out.println("입력하세요");
            return;
        }

        String sql = """
                DELETE FROM customers
                WHERE customerId = ?
                """;
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        try (connection; statement;) {
            statement.setInt(1, royy);
            int roy = statement.executeUpdate();
            if (roy == 1) {
                System.out.println("ok");
            } else {
                System.out.println("no");
            }

        }
    }

    @GetMapping("sub4")
    public void method4() {
        String sql = """
                UPDATE shippers
                SET shipperName = ?,
                phone = ?
                WHERE
                shipperID = ?
                """;
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "이강인");
            statement.setString(2, "010000000000");
            statement.setInt(3, 1);
            int rows = statement.executeUpdate();


            if (rows == 1) {
                System.out.println("실행");
            } else {
                System.out.println("no");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("sub5")
    public void method5(@RequestParam("id") Integer shipperId, Model model) throws SQLException {
        String sql = """
                SELECT * FROM shippers
                WHERE shipperId = ?
                                   
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        try (connection; statement) {
            statement.setInt(1, shipperId);
            ResultSet resulSet = statement.executeQuery();
            try (resulSet) {
                if (resulSet.next()) {
                    model.addAttribute("shipper", Map.of("shipperId", resulSet.getInt("shipperId"),
                            "shipperName", resulSet.getString("shipperName"),
                            "phone", resulSet.getString("phone")));
                }
            }
        }
    }

    @PostMapping("sub5")
    public String method6(
            @RequestParam("id") Integer shipperId,
            @RequestParam("name") String shipperName,
            @RequestParam("phone") String phone,
            RedirectAttributes rttr
    ) throws SQLException {
        String sql = """
                UPDATE shippers
                SET shipperName =?,
                phone = ?
                WHERE
                shipperID= ?
                """;
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        try (connection; statement;) {
            statement.setString(1, shipperName);
            statement.setString(2, phone);
            statement.setInt(3, shipperId);

            int rows = statement.executeUpdate();

            if (rows == 1) {
                System.out.println("ok");
            } else {
                System.out.println("no");
            }
        }
        rttr.addAttribute("id", shipperId);
        return "redirect:/main25/sub5";
    }

    @GetMapping("sub7")
    public void method7(@RequestParam(value = "id", required = false) Integer employeeId, Model model) throws SQLException {
        if (employeeId == null) {
            return;
        }
        String sql = """
                SELECT * FROM employees
                WHERE employeeId = ?
                """;
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        try (connection; statement) {
            statement.setInt(1, employeeId);

            ResultSet resultSet = statement.executeQuery();

            try (resultSet) {
                if (resultSet.next()) {
                    String lastName = resultSet.getString("lastName");
                    String firstName = resultSet.getString("firstName");
                    LocalDate birthDate = resultSet.getTimestamp("birthDate").toLocalDateTime().toLocalDate();
                    String photo = resultSet.getString("photo");
                    String notes = resultSet.getString("notes");

                    model.addAttribute("employees", Map.of("lastName", lastName,
                            "firstName", firstName,
                            "birthDate", birthDate,
                            "photo", photo,
                            "notes", notes,
                            "employeeId", employeeId));
                }
            }
        }
    }

    @PostMapping("sub7")
    public String method8(Integer id,
                          String lastName,
                          String firstName,
                          String birthDate,
                          String photo,
                          String notes,
                          RedirectAttributes rttr) throws SQLException {
        String sql = """
                UPDATE employees
                SET LastName =?,
                firstName = ?,
                photo = ?,
                BirthDate = ?,
                notes =?
                WHERE EmployeeID = ?
                """;
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        try (connection; statement) {
            statement.setString(1, lastName);
            statement.setString(2, firstName);
            statement.setString(4, birthDate);
            statement.setString(3, photo);
            statement.setString(5, notes);
            statement.setInt(6, id);

            int rows = statement.executeUpdate();
            if (rows == 1) {
                rttr.addAttribute("message", "변경완료");
            } else {
                rttr.addFlashAttribute("message", "변경 놉");
            }
        }
        rttr.addAttribute("id", id);

        return "redirect:/main25/sub7";
    }


    @GetMapping("sub9")
    public String method9(RedirectAttributes rttr) {
        // Controller의 request handler 메소드의 리턴이
        // void(또는 null 리턴)이면 view의 이름으로 해석

        // String 이면 view의 이름으로 해석
        // "redirect:" 접두어가 붙으면
        // 응답코드가 302이고 location 응답헤더의 값이 접두어 이후의 값으로 셋팅

        // 쿼리스트링에 request parameter로 붙음
        rttr.addAttribute("abc", "def");
        rttr.addAttribute("address", "seoul");

        // 모델에 붙임 (session을 잠깐 거침)
        rttr.addFlashAttribute("email", "abc@gmail.com");

        return "redirect:/main25/sub10";
    }
    @GetMapping("sub10")
    public void method10(Model model) {
        Object email = model.getAttribute("email");
        System.out.println("email = " + email);
        System.out.println("Controller25.method10");
    }
}
