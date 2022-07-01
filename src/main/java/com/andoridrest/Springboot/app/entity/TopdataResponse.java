package com.andoridrest.Springboot.app.entity;

public class TopdataResponse {

    private int userRegisterToday;
    private int userSubToday;
    private long salesToday;

    public TopdataResponse(int userRegisterToday, int userSubToday, long salesToday) {
        this.userRegisterToday = userRegisterToday;
        this.userSubToday = userSubToday;
        this.salesToday = salesToday;
    }

    public TopdataResponse() {
    }

    public int getUserRegisterToday() {
        return userRegisterToday;
    }

    public void setUserRegisterToday(int userRegisterToday) {
        this.userRegisterToday = userRegisterToday;
    }

    public int getUserSubToday() {
        return userSubToday;
    }

    public void setUserSubToday(int userSubToday) {
        this.userSubToday = userSubToday;
    }

    public long getSalesToday() {
        return salesToday;
    }

    public void setSalesToday(long salesToday) {
        this.salesToday = salesToday;
    }

    @Override
    public String toString() {
        return "TopdataResponse{" +
                "userRegisterToday=" + userRegisterToday +
                ", userSubToday=" + userSubToday +
                ", salesToday=" + salesToday +
                '}';
    }
}
