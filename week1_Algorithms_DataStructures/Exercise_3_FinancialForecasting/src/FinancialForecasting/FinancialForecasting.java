package FinancialForecasting;

public class FinancialForecasting {

   
    public static double calculateFutureValue(double presentValue, double rate, int years) {
       
        if (years == 0) {
            return presentValue;
        }

        
        return (1 + rate) * calculateFutureValue(presentValue, rate, years - 1);
    }
    public static double calculateFutureValueIterative(double presentValue, double rate, int years) {
        double result = presentValue;
        for (int i = 0; i < years; i++) {
            result *= (1 + rate);
        }
        return result;
    }
    
    public static double calculateFutureValueMemo(double presentValue, double rate, int years, Double[] memo) {
        if (years == 0) return presentValue;
        if (memo[years] != null) return memo[years];

        memo[years] = (1 + rate) * calculateFutureValueMemo(presentValue, rate, years - 1, memo);
        return memo[years];
    }

    public static void main(String[] args) {
        double presentValue = 10000; 
        double growthRate = 0.08;    
        int years = 5;

        
        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("Future Value (Recursive): ₹%.2f\n", futureValue);

       
        Double[] memo = new Double[years + 1];
        double optimizedValue = calculateFutureValueMemo(presentValue, growthRate, years, memo);
        System.out.printf("Future Value (Memoized): ₹%.2f\n", optimizedValue);
    }
}
