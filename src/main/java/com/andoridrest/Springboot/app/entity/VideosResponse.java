package com.andoridrest.Springboot.app.entity;

public class VideosResponse {

    private int topPerformaing;
    private int totalVideos;
    private int rentalVideo;
    private int totalWebSeries;

    public VideosResponse(int topPerformaing, int totalVideos, int rentalVideo, int totalWebSeries) {
        this.topPerformaing = topPerformaing;
        this.totalVideos = totalVideos;
        this.rentalVideo = rentalVideo;
        this.totalWebSeries = totalWebSeries;
    }

    public VideosResponse() {
    }

    public int getTopPerformaing() {
        return topPerformaing;
    }

    public void setTopPerformaing(int topPerformaing) {
        this.topPerformaing = topPerformaing;
    }

    public int getTotalVideos() {
        return totalVideos;
    }

    public void setTotalVideos(int totalVideos) {
        this.totalVideos = totalVideos;
    }

    public int getRentalVideo() {
        return rentalVideo;
    }

    public void setRentalVideo(int rentalVideo) {
        this.rentalVideo = rentalVideo;
    }

    public int getTotalWebSeries() {
        return totalWebSeries;
    }

    public void setTotalWebSeries(int totalWebSeries) {
        this.totalWebSeries = totalWebSeries;
    }

    @Override
    public String toString() {
        return "VideosResponse{" +
                "topPerformaing=" + topPerformaing +
                ", totalVideos=" + totalVideos +
                ", rentalVideo=" + rentalVideo +
                ", totalWebSeries=" + totalWebSeries +
                '}';
    }
}
