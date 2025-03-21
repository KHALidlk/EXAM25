package com.example.exam25.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private String mail;
    @OneToMany(mappedBy = "user")
    private List<Borrow> borrowList;

    public List<Borrow> getBorrowList() {
        return borrowList;
    }


    public void setBorrowList(List<Borrow> borrowList) {
        this.borrowList = borrowList;
    }

    public User() {
    }

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
