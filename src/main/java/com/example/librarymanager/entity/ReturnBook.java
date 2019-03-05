package com.example.librarymanager.entity;


import java.sql.Date;



public class ReturnBook {
    private int returnId;
    private Date returnDate;


    public int getReturnId() {
        return returnId;
    }

    public void setReturnId(int returnId) {
        this.returnId = returnId;
    }


    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }



}
