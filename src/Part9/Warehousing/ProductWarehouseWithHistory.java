package Part9.Warehousing;

public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
    }

    public String history() {
        return this.changeHistory.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(getBalance());
    }

    public double takeFromWarehouse(double amount) {
        if (super.getBalance() < amount) {
            this.changeHistory.add(getBalance());
            return super.getBalance();
        }
        super.takeFromWarehouse(amount);
        this.changeHistory.add(getBalance());

        return super.getBalance();
    }

    public void printAnalysis(){

        System.out.println("Product: " + this.getName());
        System.out.println("History: " + changeHistory.toString());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product:" + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());


    }


}
