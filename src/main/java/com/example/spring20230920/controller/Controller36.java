package com.example.spring20230920.controller;

import com.example.spring20230920.dao.MyDao7;
import com.example.spring20230920.domain.MyDto16;
import com.example.spring20230920.domain.MyDto40;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;

@Controller
@RequestMapping("main36")
@RequiredArgsConstructor
public class Controller36 {

    private final MyDao7 dao;

    @GetMapping("sub1")
    public void method1() {

    }

    // axios.get("/main36/sub2", {params: {id: 5}})
    // /main36/sub2?id=5
    @GetMapping("sub2")
    public void method2(Integer id) {
        Map<String, Object> data = dao.selectByCustomerId(id);
        System.out.println("data = " + data);
    }

    // axios.get("/main36/sub3", {params: {id: 2}});
    /*
    axios.request({
            url: "/main36/sub3",
            method: "get",
            params: {id: 2}
        });

     */
    // /main36/sub3?id=2
    @GetMapping("sub3")
    public void method3(Integer id) {
        Map<String, Object> data = dao.selectByEmployeeId(id);
        System.out.println("data = " + data);
    }

    /*
    axios.post("/main36/sub4", {
        lastName: "손",
        firstName: "흥민",
        birthDate: "2020-02-02"
    }, {
        headers: {
            "content-type": "application/x-www-form-urlencoded"
        }
    })

     */
    // post /main36/sub4
    // lastName=손&firstName=흥민&birthDate=2020-02-02
    @PostMapping("sub4")
    public void method4(String lastName,
                        String firstName,
                        LocalDate birthDate) {
        int i = dao.insertEmployee(lastName, firstName, birthDate);
        System.out.println(i + "개 데이터 입력됨");
    }

    //브라우저 개발자도구 콘솔에 axios 코드 작성 후 실행
    //axios.post(/maim36/sub5){
    // post /main36/sub5
    // name=라면&price=150.00&category=3
    @PostMapping("sub5")
    public void method5(String name,
                        Double price,
                        Integer category) {
        int r = dao.insertProduct(name, price, category);
    }

    /*
    axios.delete("/main36/sub6")
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "sub6")
    public void method6() {
        System.out.println("Controller36.method6");
    }

    /*
    axios.delete("main36/sub7")
     */
    @DeleteMapping("sub7")
    public void method7() {
        System.out.println("Controller36.method7");
    }

    /*
    axios.delete("/main36/sub8?name=son")
    asios.delete
     */
    @DeleteMapping("sub8")
    public void method8(String name) {
        System.out.println("name = " + name);
    }

    // PathVariable : 경로의 포함된 데이터
    //axios.delete("/main36/sub9/son")
    //axios.delete("/main36/sub9/lee")
    @DeleteMapping("sub9/{name}")
    public void method9(@PathVariable("name") String n) {
        System.out.println("n = " + n);
    }

    /*
    axios.delete("/mein36/sub10/3")
    axios.delete("/mein36/sub10/5")
    axios.delete("/mein36/sub10/7")
     */
    // delete/main36/sub10
    // 일하는 메소드 작성
    // 3,5,7은 메소드 아규먼트로 받아서 콘솔에 출력
    @DeleteMapping("sub10/{int}")
    public void method10(@PathVariable("int") String i) {
        System.out.println("i = " + i);
    }

    @DeleteMapping("sub11/{pid}")
    public void method11(@PathVariable Integer pid) {
        dao.deleteByProductId(pid);
        System.out.println("개 데이터 삭제됨");

    }

    /*
    axios.delete("/main36/sub12/1")
    axios.delete("/main36/sub12/3")
    axios.delete("/main36/sub12/5")
     */
    // 1,3,5, 고객 삭제되도록 메소드 작성
    @DeleteMapping("sub12/{id}")
    public void method12(@PathVariable String d) {
        dao.deleteByProduct(d);
        System.out.println("고객삭제");
    }

    /*
    axios.put("/main36/sub13")
    put /main36/sub13
     */
//  @RequestMapping(method = RequestMethod.PUT, value = "sub13") -->밑에꺼랑 같다
    @PutMapping("sub13")
    public void method13() {
        System.out.println("controller");
    }

    /*
    axios.put("/main36/sub14",{
    name : "son",
    address: "korea"
    },{
    headers: {
        "content- type": "application/x-www-form-urlencoded"
        }
       })
     */
    //put /main36/sub14
    //name=son&address=korea
    @PutMapping("sub14")
    public void method14(String name, String address) {
        System.out.println("name = " + name);
        System.out.println("address = " + address);
    }

    /*
    axios.put("/main36/sub15",{
    city: "seoul",
    age:78,
    score: 3.14
    }, {
    headers: {
    "content -type": "application/x-www-form-urlencoded"
    }
    });
     */
    @PutMapping("sub15")
    public void method15(String city,
                         Integer age,
                         Double score) {
        System.out.println("city = " + city);
        System.out.println("age = " + age);
        System.out.println("score = " + score);
    }

    /*
   axios.put("/main36/sub16", {
        id: 3,
        name: "햄버거",
        category: 2,
        price: 5000.00
    }, {
        headers : {
            "content-type": "application/x-www-form-urlencoded"
        }
    });
   */
    @PutMapping("sub16")
    public void method16(MyDto40 dto) {
        int rows = dao.updateProduct(dto);
        System.out.println(rows + "수정됨");
    }

    /*
  axios.put("/main36/sub17", {
      lastName: "lee",
      firstName: "kangin",
      birthDate: "2020-01-01",
      id: 5
  }, {
      headers : {
          "content-type": "application/x-www-form-urlencoded"
      }

  });
   */
    @PutMapping("sub17")
    public void method17(String lastName,
                         String firstName,
                         Integer birthDate,
                         Integer id) {
        dao.updatecustomer();
        System.out.println("됐음");
    }
}