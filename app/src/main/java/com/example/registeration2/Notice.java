package com.example.registeration2;

public class Notice {

    //변수
    String Notice;
    String Name;
    String date;

    //생성자
    public Notice(String notice, String name, String date) {
        Notice = notice;
        Name = name;
        this.date = date;
    }

    //get set
    public String getNotice() {
        return Notice;
    }

    public void setNotice(String notice) {
        Notice = notice;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
