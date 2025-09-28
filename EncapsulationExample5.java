
class Password {
    private String secret;

    public void setSecret(String secret) {
        this.secret = secret;
    }
}

public class EncapsulationExample5 {
    public static void main(String[] args) {
        Password pwd = new Password();
        pwd.setSecret("myStrongPassword123");
        System.out.println("Password set successfully (hidden).");
    }
}
