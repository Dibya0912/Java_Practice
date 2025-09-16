public class ConditionalsExample4 {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if (hasID) {
            if (age >= 18) {
                System.out.println("You are allowed to enter the club.");
                
                if (age >= 21) {
                    System.out.println("You can also buy alcoholic drinks.");
                } else {
                    System.out.println("But you cannot buy alcoholic drinks yet.");
                }

            } else {
                System.out.println("Sorry, you are underage.");
            }
        } else {
            System.out.println("You need to show an ID to enter.");
        }
    }
}
