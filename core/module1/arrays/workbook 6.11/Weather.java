public class Weather {
    public static void main(String[] args) {
        
        double[] celsius = {25.3, 27.7, 22.2, 23.5, 25.8, 24.6, 29.1, 27.9};
        double[] fahrenheit = celsiusToFahrenheit(celsius);
      
        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");
    }
 
    public static double[] celsiusToFahrenheit(double[] celsius) {
        double[] fahrenheit = new double[celsius.length];
        for (int i = 0; i < celsius.length; i++) {
            fahrenheit[i] = (celsius[i]/5 * 9)+32;
        }
        return fahrenheit;
    }

    public static void printTemperatures(double[] temp, String type) {
        System.out.print(type + ": ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.print("\n");
    }
}
