package com.andoridrest.Springboot.app.entity;

public class UserDashResponse {

    private int totalUser;
    private int totalSub;
    private int userbycountry;

    public UserDashResponse(int totalUser, int totalSub, int userbycountry) {
        this.totalUser = totalUser;
        this.totalSub = totalSub;
        this.userbycountry = userbycountry;
    }

    public UserDashResponse() {
    }

    public int getTotalUser() {
        return totalUser;
    }

    public void setTotalUser(int totalUser) {
        this.totalUser = totalUser;
    }

    public int getTotalSub() {
        return totalSub;
    }

    public void setTotalSub(int totalSub) {
        this.totalSub = totalSub;
    }

    public int getUserbycountry() {
        return userbycountry;
    }

    public void setUserbycountry(int userbycountry) {
        this.userbycountry = userbycountry;
    }

    @Override
    public String toString() {
        return "UserDashResponse{" +
                "totalUser=" + totalUser +
                ", totalSub=" + totalSub +
                ", userbycountry=" + userbycountry +
                '}';
    }
}
