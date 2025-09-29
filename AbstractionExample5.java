abstract class Bank {
    abstract int getRateOfInterest();
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class HDFC extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

public class AbstractionExample5 {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        System.out.println("SBI Interest Rate: " + b1.getRateOfInterest() + "%");
        System.out.println("HDFC Interest Rate: " + b2.getRateOfInterest() + "%");
    }
}
