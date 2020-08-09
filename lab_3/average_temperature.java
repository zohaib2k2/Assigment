
public class average_temperature{
    public static void main(String[] args) {
        final int nLocation = 10;
        final int nMonths = 12;
        final int lower_temp = -10; // because i m opting for celcious
        final int upper_temp = 35;
        double[][] temperature = new double[nLocation][nMonths];
        double[] sums = new double[nLocation];
        double[] average = new double[nLocation];

        // zero the sum array
        for (int i = 0; i < sums.length ;i++) sums[i] = 0;


        double current_temp;

        for (int location = 0; location < nLocation ; location++) {
            for (int month = 0; month < nMonths; month++) {

                // this will assign each cell: temperature[location][month]
                // a random number from -10 to 35
                current_temp = (Math.random()*(upper_temp - lower_temp + 1)
                                                    + lower_temp);

                temperature[location][month] = current_temp;
            }
        }
        for (int location = 0; location < nLocation ; location++) {
            for (int month = 0; month < nMonths; month++) {
                sums[location] += temperature[location][month];
            }
            average[location] = sums[location] / nLocation;
            System.out.print("The average temperature at location "+(location+1)
                            +" is "+average[location]+"\n");
        }
    }
}
