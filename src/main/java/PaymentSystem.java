import payment.PaymentMethod;
import payment.PaymentProcessor;
import payment.methods.BlikPayment;
import payment.methods.CreditCardPayment;

//Dependency inversion principle
public class PaymentSystem {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(155.50);

        PaymentMethod creditCard = new CreditCardPayment("123456", "06/07", "123");
        PaymentProcessor creditCardProcessor = new PaymentProcessor(creditCard);

        PaymentMethod blicCode = new BlikPayment("123789");
        PaymentProcessor blikProcessor = new PaymentProcessor(blicCode);

        creditCardProcessor.processPayment(invoice.getAmount());
        blikProcessor.processPayment(invoice.getAmount());
    }
}
