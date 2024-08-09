package payment.methods;

import payment.PaymentMethod;

public interface BlikProcessor extends PaymentMethod {

    void processCode(String blikCode);

}
