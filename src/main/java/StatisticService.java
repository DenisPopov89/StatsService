public class StatisticService {

    public long sum(int[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(int[] sales) {
        return sum(sales) / 12;
    }

    public int maximum(long[] sales) {
        long minSale = sales[0];
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            long maxSale = 0;
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int bellowMonths(int[] sales) {
        long average = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }

    public int MinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[minMonth] >= sales[i]) {
                minMonth = i;
            }
        }
        minMonth += 1;
        return minMonth;
    }

    public int UpperMonths(int[] sales) {
        long average = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > average) {
                counter += 1;
            }
        }
        return counter;
    }
}

