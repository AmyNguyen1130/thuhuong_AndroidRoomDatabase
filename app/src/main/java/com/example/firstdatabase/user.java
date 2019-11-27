package com.example.firstdatabase;

import androidx.room.Entity;
import androidx.room.PrimaryKey;



@Entity
public class user {
    @PrimaryKey(autoGenerate = true)
    public int uId;
    String name;
    user(String name){
        this.name = name;
    }

}
