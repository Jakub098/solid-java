package payment.methods;

//Liskov substitution principle
public class CreditCardPayment implements  CreditCardProcessor {
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        validateCardInfo(cardNumber, expirationDate, cvv);
        System.out.println("Paying " + amount + " using Credit Card.");
    }

    @Override
    public void validateCardInfo(String cardNumber, String expirationDate, String cvv) {
        System.out.println("Validating credit card info...");
    }
}
