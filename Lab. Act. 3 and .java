public class Customer {
    // Instance variables
    private String name;
    private int points;

    // Static variable
    private static int totalCustomers = 0;

    // Default constructor
    public Customer() {
        this.name = "Unknown";
        this.points = 0;
        totalCustomers++;
    }

    // Parameterized constructor
    public Customer(String name, int points) {
        this.name = name;
        this.points = points;
        totalCustomers++;
    }

    // Add points method
    public void addPoints(int points) {
        this.points += points;
    }

    // Redeem reward method
    public void redeemReward() {
        while (this.points >= 100) {
            System.out.println(this.name + " redeemed a free drink!");
            this.points -= 100;
        }
    }

    // Display customer info
    public void displayCustomerInfo() {
        System.out.println("Name: " + this.name + ", Points: " + this.points);
    }

    // Static method to display total customers
    public static void displayTotalCustomers() {
        System.out.println("Total customers: " + totalCustomers);
    }

    // Static method to show allowed rewards redemption
    public static void getAllowedRewardsRedemption(Customer customer) {
        int rewards = customer.points / 100;
        System.out.println(customer.name + " can redeem " + rewards + " reward(s).");
    }
}

// CoffeeShop.java (Main class)
public class CoffeeShop {
    public static void main(String[] args) {
        // Creating three customers
        Customer customer1 = new Customer("Joseph", 200);
        Customer customer2 = new Customer("Peter", 0);
        Customer customer3 = new Customer(); // Name unknown

        // Peter's purchases
        customer2.addPoints(200); // pastries & beverages
        customer2.addPoints(20);  // water

        // Redeem rewards for all
        customer1.redeemReward();
        customer2.redeemReward();
        customer3.redeemReward();

        // Display customer info and total customers
        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
        customer3.displayCustomerInfo();
        Customer.displayTotalCustomers();

        // Fourth customer Diane
        Customer customer4 = new Customer("Diane", 50);
        Customer.displayTotalCustomers();

        // Check allowed reward redemption
        Customer.getAllowedRewardsRedemption(customer1);
        Customer.getAllowedRewardsRedemption(customer2);
        Customer.getAllowedRewardsRedemption(customer3);
        Customer.getAllowedRewardsRedemption(customer4);
    }
}
