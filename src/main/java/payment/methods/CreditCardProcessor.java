package payment.methods;

import payment.PaymentMethod;

//Interface segregation principle
public interface CreditCardProcessor extends PaymentMethod {
    void validateCardInfo(String cardNumber, String expirationDate, String cvv);


}
