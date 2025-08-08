package week1;

public class FinancialForecasting {
    public static void main(String[] args) {
        double currentValue = 1000.0;
        double[] growthRates = {0.05, 0.03, 0.04, 0.02};
        
        double futureValue = calculateFutureValue(currentValue, growthRates);
        System.out.printf("Future value after %d periods: $%.2f%n", 
                         growthRates.length, futureValue);
    }

    public static double calculateFutureValue(double currentValue, double[] growthRates) {
        return calculateFutureValueRecursive(currentValue, growthRates, 0);
    }

    private static double calculateFutureValueRecursive(double currentValue, 
                                                      double[] growthRates, 
                                                      int index) {
        if (index >= growthRates.length) {
            return currentValue;
        }
        double nextValue = currentValue * (1 + growthRates[index]);
        return calculateFutureValueRecursive(nextValue, growthRates, index + 1);
    }
}