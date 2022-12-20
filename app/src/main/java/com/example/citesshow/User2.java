package com.example.citesshow;

public class User2 {





        private String Date,time,to,price,busnumber,not,reserved,remained;

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    public String getRemained() {
        return remained;
    }

    public void setRemained(String remained) {
        this.remained = remained;
    }

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }

    private int id;


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public User2() {
        }


        public User2(  String not,String date, String time, String to, String price, String busnumber , String reserved, String remained) {
            Date = date;
            this.time = time;
            this.to = to;
            this.price = price;
            this.reserved=reserved;
            this.remained=remained;
            this.busnumber = busnumber;
            this.not=not;

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
                    '}';
        }
    }


