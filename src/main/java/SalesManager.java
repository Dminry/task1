


public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long min() {
        long min = sales[0];
        for (int i = 1;i < sales.length;i++)
        {
            if (sales [i]< min) {
                min = sales[i];
            }
        }
        return min;

    }
    public long average() {
        long sum = 0;
        for (long sale : sales){
            sum += sale;

        }
        return (sum - (max() + min()))/(sales.length - 2);

    }
}
