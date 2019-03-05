package com.example.librarymanager.entity;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.MappedTypes;

@Alias("Gender")

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    UNSPECIFIED("Unspecified");

    private final String displayName;

    Gender(String displayName) {
        this.displayName = displayName;
    }


}