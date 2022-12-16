import org.jetbrains.annotations.NotNull;

public class Computer {
    int year;
    double price;
    String operationSystem;

    public Computer(int year, double price, String operationSystem) {
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

    int comparePrices(@NotNull Computer compare) {
        if (price == compare.price) {
            return 0;}
                if (price > compare.price) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }










