public class SalesData {
    private String name;
    private double total;
    private int max;
    private int min;
    private double average;
    private int quantity;

    public SalesData(String name, Double total, int max){
        this.name = name;
        this.total = total;
        this.max = max;
        this.min = min;
        this.average = average;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return total;
    }
    public void setTotal(double total){ this.total = total;
    }

    public int getMin() {
        return min;
    }
    public void setMin(){
        this.min = min;
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString(){
        return "Names: "+name+", Price: "+total+", Quantity Sold: "+quantity;
    }

}
