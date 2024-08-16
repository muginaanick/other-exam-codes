public class TelecomBilling {
    public static void main(String[] args) {
        final double Initial_Airtime = 10000.0;
        final double Loading_Charge_Percent = 10.0;
        final int Call_Duration_Seconds = 300;
        final double Call_Rate_Per_Second = 200.0;

        double loadingCharge = (Loading_Charge_Percent / 100) * Initial_Airtime;


        double remainingBalance = Initial_Airtime - loadingCharge;


        double callCost = Call_Duration_Seconds * Call_Rate_Per_Second;

        if (callCost > remainingBalance) {
            System.out.println("Insufficient balance for the call.");
        } else {
            double finalBalance = remainingBalance - callCost;
            System.out.println("Final balance after the call: UGX " + finalBalance);
        }
    }
}
