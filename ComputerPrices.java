

public class ComputerPrices {
    public static void main(String[] args) {
        Computer Computer = new Computer(2011, 10000, "Windows");
        Computer ComputerTwo = new Computer(2000, 5000000, "linux");
        System.out.println(Computer.comparePrices(ComputerTwo));

    }
}



