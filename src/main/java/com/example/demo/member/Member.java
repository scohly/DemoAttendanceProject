package com.example.demo.member;

import javax.persistence.*;
import java.time.LocalDate;

//this member class is basically our member object
//will have id, name, attendance date, integer age, UID (db number)

@Entity     //for hibernate
@Table      //for table in db
public class Member {
    @Id
    @SequenceGenerator(
            name = "member_sequence",
            sequenceName = "member_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "member_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private String uid; //unique id number given by DB
    private Integer age;
    private LocalDate attendanceDate;

    public Member() {
    }

    //constsructor w/o ID as DB will create id
    public Member(String name, String email, String uid, Integer age, LocalDate attendanceDate) {
        this.name = name;
        this.email = email;
        this.uid = uid;
        this.age = age;
        this.attendanceDate = attendanceDate;
    }

    public Member(Long id, String name, String email, String uid, Integer age, LocalDate attendanceDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.uid = uid;
        this.age = age;
        this.attendanceDate = attendanceDate;
    }

    //getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(LocalDate attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    @Override
    public String  toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", uid='" + uid + '\'' +
                ", age=" + age +
                ", attendanceDate=" + attendanceDate +
                '}';
    }
}
