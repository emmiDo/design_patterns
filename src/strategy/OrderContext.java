package strategy;

public class OrderContext {

    //this class doesn't know the strategy that user picked. It's the context

    private int totalCost;

    private boolean isClosed;

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }

}
