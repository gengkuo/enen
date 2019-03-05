package com.example.librarymanager.entity;


import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class BorrowBook {
    private Integer borrowId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate borrowDate;

    private Integer userId;
    private Integer bId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public Integer getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(Integer borrowId) {
        this.borrowId = borrowId;
    }


    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }




}
