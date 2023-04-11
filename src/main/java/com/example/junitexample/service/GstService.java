package com.example.junitexample.service;

public class GstService {
    private GstProvider gstProvider;

    public GstService(GstProvider gstProvider) {
        this.gstProvider = gstProvider;
    }

    public int calculateGST() {

        System.out.println("Calculating GST");

        int rate = this.gstProvider.getGSTDetail();

        System.out.println("GST Rate is " + rate);

        return rate;

    }
}
