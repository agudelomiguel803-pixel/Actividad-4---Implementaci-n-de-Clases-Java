public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product();
        Product product2 = new Product("2", "Laptop", 2500000, 55, true );
         
        //Profe aca uso los metodos setters.
        product1.setName("Aire acondicionado");
        product2.setPrice(420000);

        //Aca los getts.
        System.out.println("El Nombre del producto 1 es: " + product1.getName());
        System.out.println("El Precio del producto 1 es:"  + product1.getPrice());
        System.out.println("------------------------------------------------------");
        System.out.println("El Nombre del productos 2 es: " + product2.getName());
        System.out.println("Precio del producto 2: " + product2.getPrice());
        System.out.println("-----------------------------------------------------------");
        System.out.println(product1.toString());
        System.out.println("--------------------------------------");
        System.out.println(product2.toString());

    }


}
