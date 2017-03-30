package com.example.wangxin.mvvpdemo;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by wAngxIn on 2017/3/24.
 */

public class User extends BaseObservable {
    private  String firstName;
    private  String lastName;
    public int age=0;
    public User( String firstName, String lastName,int age) {
        this(firstName,lastName);
        this.age = age;
    }
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private boolean large = false;

    public boolean isLarge() {
        return large;
    }

    public void setLarge(boolean large) {
        this.large = large;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String displayName() {
        return "名字为空";
    }

    public Boolean isAdult() {
        return true;
    }

}
