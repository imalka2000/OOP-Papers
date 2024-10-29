package Q1_B;

class Product {
    String name;
    int quantity;
    double price;

    public Product(String name, int quantity, double price) 
    {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + ", Quantity: " + quantity + ", Price: $" + price;
    }
}
