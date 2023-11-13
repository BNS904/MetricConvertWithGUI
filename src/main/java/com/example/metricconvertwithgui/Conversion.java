package com.example.metricconvertwithgui;

public class Conversion {
    public static String tempConvert(double temp) {
        double convertedTemp = (temp * 1.8) + 32;
        return temp + "° Celsius is " + convertedTemp + "° Fahrenheit.";
    }

    public static String weightConvert(double weight) {
        double convertedWeight = weight * 2.2046;
        return weight + " Kilograms is " + convertedWeight + " Pounds.";
    }

    public static String distanceOneConvert(double distance1) {
        double convertedDistance1 = distance1 * 0.6214;
        return distance1 + " Kilometers is " + convertedDistance1 + " Miles.";
    }

    public static String distanceTwoConvert(double distance2) {
        double convertedDistance2 = distance2 * 3.2808;
        return distance2 + " Meters is " + convertedDistance2 + " Feet.";
    }
}
