package com.example.librarymanager.entity;



import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;



public class Book {
    private Integer bId;
    private String bName;
    private String bAuthor;
    private String bType;
    private Integer bCollection;
    private Integer bBorrow;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate bDate;

    public Book(String bName, String bAuthor, String bType, Integer bCollection, Integer bBorrow, LocalDate bDate, String description) {
        this.bName = bName;
        this.bAuthor = bAuthor;
        this.bType = bType;
        this.bCollection = bCollection;
        this.bBorrow = bBorrow;
        this.bDate = bDate;
        this.description = description;
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public String getbType() {
        return bType;
    }

    public void setbType(String bType) {
        this.bType = bType;
    }

    public Integer getbCollection() {
        return bCollection;
    }

    public void setbCollection(Integer bCollection) {
        this.bCollection = bCollection;
    }

    public Integer getbBorrow() {
        return bBorrow;
    }

    public void setbBorrow(Integer bBorrow) {
        this.bBorrow = bBorrow;
    }

    public LocalDate getbDate() {
        return bDate;
    }

    public void setbDate(LocalDate bDate) {
        this.bDate = bDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "bId=" + bId +
                ", bName='" + bName + '\'' +
                ", bAuthor='" + bAuthor + '\'' +
                ", bType='" + bType + '\'' +
                ", bCollection=" + bCollection +
                ", bBorrow=" + bBorrow +
                ", bDate=" + bDate +
                ", description='" + description + '\'' +
                '}';
    }
}
