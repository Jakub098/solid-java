package payment.methods;

public class BlikPayment implements BlikProcessor{

    private String blikCode;

    public BlikPayment(String blikCode) {
        this.blikCode = blikCode;
    }

    @Override
    public void pay(double amount) {
        processCode(blikCode);
        System.out.println("Paying " + amount + " using Blik code");
    }

    @Override
    public void processCode(String blikCode) {
        System.out.println("Checking blik code...");
    }
}
