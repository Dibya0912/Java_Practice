class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 5;
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

public class InheritanceExample5 {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new ICICI();
        System.out.println("SBI ROI: " + b1.getRateOfInterest() + "%");
        System.out.println("ICICI ROI: " + b2.getRateOfInterest() + "%");
    }
}
