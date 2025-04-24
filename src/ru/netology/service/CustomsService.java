package ru.netology.service;

public class CustomsService {
    public static final int WEIGHT_FEE = 100;

    public static int calculateCustoms(int price, int weight ) {
        int priceFee = price / 100;
        int weightFee = weight * 100;

        return priceFee + weightFee;
    }
}
