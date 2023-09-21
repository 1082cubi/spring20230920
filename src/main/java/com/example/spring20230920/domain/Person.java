package com.example.spring20230920.domain;

public class Person {
    // name property (읽기,쓰기)
    // age property (읽기, 쓰기)
    // address property (읽기,쓰기)
    private String nama;
    private Integer age;
    private String address;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nama='" + nama + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
