package com.example.citesshow;

public class User {

    private String Date,time,to,price,busnumber,remained,reserved;

    private int id;

    public String getRemained() {
        return remained;
    }

    public void setRemained(String remained) {
        this.remained = remained;
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User() {
    }


    public User(String date, String time ) {
        Date = date;
        this.time = time;

    }


    public User(int id, String date, String time, String to, String price, String busnumber, String reserved, String remained ) {
        Date = date;
        this.time = time;
        this.to = to;
        this.price = price;
        this.busnumber = busnumber;
        this.id = id;
        this.reserved=reserved;
        this.remained=remained;

    }

    public User(String date, String time, String to, String price, String busnumber, String reserved, String remained ) {
        Date = date;
        this.time = time;
        this.to = to;
        this.price = price;
        this.busnumber = busnumber;

        this.reserved=reserved;
        this.remained=remained;

    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBusnumber() {
        return busnumber;
    }

    public void setBusnumber(String busnumber) {
        this.busnumber = busnumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "Date='" + Date + '\'' +
                ", time='" + time + '\'' +
                ", to='" + to + '\'' +
                ", price='" + price + '\'' +
                ", busnumber='" + busnumber + '\'' +
                ", remained='" + remained + '\'' +
                ", reserved='" + reserved + '\'' +

                '}';
    }
}
