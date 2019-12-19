package com.example.sampleparcelable;

public class TelItem {
    String name,phone;

    public TelItem(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "TelItem{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}