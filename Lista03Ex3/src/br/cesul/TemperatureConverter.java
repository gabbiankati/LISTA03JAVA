package br.cesul;

public class TemperatureConverter {

        public static void main(String[] args) {
            double tempInFahrenheit = 105.0;
            double tempInCelsius = ((tempInFahrenheit - 32) / 1.8);
            System.out.println(tempInFahrenheit + "°F é igual a " + tempInCelsius + "°C");

            tempInCelsius = 120.0;
            double tempInFahrenheitt = 32 + (tempInCelsius * 1.8);
            System.out.println(tempInCelsius + "°C é igual a " + tempInFahrenheitt + "°F");
        }
    }

