// File: PelangganApp.java
public class PelangganApp {
    public static void main(String[] args) {
        Customer customer1 = new RegularCustomer("John Doe", 100);
        Customer customer2 = new PremiumCustomer("Jane Smith", 200);

        System.out.println(customer1.getName() + " memiliki diskon sebesar " + customer1.getDiscount() + "%");
        System.out.println(customer2.getName() + " memiliki diskon sebesar " + customer2.getDiscount() + "%");

        customer1.setPurchaseAmount(150);
        customer2.setPurchaseAmount(300);

        System.out.println(customer1.getName() + " memiliki jumlah pembelian baru sebesar " + customer1.getPurchaseAmount());
        System.out.println(customer2.getName() + " memiliki jumlah pembelian baru sebesar " + customer2.getPurchaseAmount());
    }
}

// File: Customer.java
abstract class Customer {
    private final String name;
    private double purchaseAmount;

    public Customer(String name, double purchaseAmount) {
        this.name = name;
        this.purchaseAmount = purchaseAmount;
    }

    public String getName() {
        return name;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public abstract double getDiscount();
}

// File: RegularCustomer.java
class RegularCustomer extends Customer {
    public RegularCustomer(String name, double purchaseAmount) {
        super(name, purchaseAmount);
    }

    @Override
    public double getDiscount() {
        return 5.0; // Pelanggan reguler mendapatkan diskon 5%
    }
}

// File: PremiumCustomer.java
class PremiumCustomer extends Customer {
    public PremiumCustomer(String name, double purchaseAmount) {
        super(name, purchaseAmount);
    }

    @Override
    public double getDiscount() {
        return 10.0; // Pelanggan premium mendapatkan diskon 10%
    }
}
