package com.kodilla.testing.weather.stub;

import java.util.Arrays;
import java.util.Random;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]

        }
        return resultMap;
    }

    public double meanTemperature() {


        double sum = 0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            sum = temperature.getValue() + sum;

        }

        double mean = sum / calculateForecast().size();

        return mean;

    }

    public double medianaTemperature() {

        double mean = 0;
        double mediana = 0;
        int i = 0;

        double[] tab = new double[calculateForecast().size()];

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            tab[i] = temperature.getValue();

            i++;

        }

        Arrays.sort(tab);

        if( tab.length % 2 == 0 ) {

            mean = tab[tab.length / 2] + tab[(tab.length/2)-1];
            mediana = mean / 2;

        }

        else{

            mediana = tab[tab.length/2];

        }

        return mediana;
    }
}

