public class GroceryList {
    GroceryItemOrder[] groceries;
    int groceries_index;
    public GroceryList() {
        groceries = new GroceryItemOrder[10];
        groceries_index = 0;
    }
    public void add(GroceryItemOrder item) {
        this.groceries[groceries_index] = item;
        groceries_index++;
    }
    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < this.groceries_index; i++) {
            totalCost += this.groceries[i].getCost();
        }
        return totalCost;
    }

}
