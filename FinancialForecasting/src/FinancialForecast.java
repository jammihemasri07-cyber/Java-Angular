public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {

        // Base case
        if (years == 0) {
            return presentValue;
        }

        // Recursive call
        return calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);

    }

    public static void main(String[] args) {

        double presentValue = 10000;
        double growthRate = 0.10;   // 10%
        int years = 3;

        double futureValue = calculateFutureValue(presentValue, growthRate, years);

        System.out.println("Present Value : ₹" + presentValue);
        System.out.println("Growth Rate : " + (growthRate * 100) + "%");
        System.out.println("Years : " + years);
        System.out.println("Future Value : ₹" + futureValue);

    }

}
