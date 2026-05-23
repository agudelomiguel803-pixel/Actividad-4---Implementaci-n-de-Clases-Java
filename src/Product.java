public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;
    private boolean available;

    public Product() {
        this.id = "1";
        this.name = "Computador";
        this.price = 300000.0;
        this.stock = 20;
        this.available = true;
    }

    public Product(String id, String name, double price, int stock, boolean disponible) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.available = disponible;
    }

    // Getters.
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }

    public boolean getAvailable() {
        return this.available;
    }

    // Setters.
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {

    if (price < 0) {
        System.out.println("Precio no valido");
    } else {
        this.price = price;
    }
}
    

    public void setStock(int stock) {

    if (stock < 0) {
        System.out.println("Stock no valido");
    } else {
        this.stock = stock;
    }
}

    public void setIvailable(boolean available) {
        this.available = available;
    }

    public String toString() {
        return "Producto ID: " + id + "\n" +
                ", Nombre: " + name + "\n" +
                ", Precio: " + price + "\n" +
                ", Stock: " + stock + "\n" +
                ", Available:" + available;
    }

}
