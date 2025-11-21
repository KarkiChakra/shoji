class Test{
    public static void main(String[] args) {
        Printer p = new Printer();

    }
    
}
abstract class product{ 
    public Product (int x) {
        System.out.println("Product"+x);
    }
}

class Printer extends Product{
    public Printer(){
        System.out.println("Printer");
    }
}

