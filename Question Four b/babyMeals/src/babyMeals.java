public class babyMeals {
    public static void main(String[] args) {

        final double Cup_Size = 0.5;
        final double totalPorridgeVolume = 2.0;
        final double Total_Milk = 2.0;
        final int Porridge_Interval = 45;
        final int Milk_Interval = 30;
        int porridgeFeedings = (int) (totalPorridgeVolume / Cup_Size);
        int milkFeedings = (int) (Total_Milk / Cup_Size);
        int totalPorridgeTime = porridgeFeedings * Porridge_Interval;
        int totalMilkTime = milkFeedings * Milk_Interval;
        int totalTime = totalPorridgeTime + totalMilkTime;
        int hours = totalTime / 60;
        int minutes = totalTime % 60;
        System.out.println("Total time to finish both porridge and milk: "
                + hours + " hours and " + minutes + " minutes.");
    }
}
