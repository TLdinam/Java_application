import com.sun.net.httpserver.Authenticator;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Module {
    public static List<String> SUPPORTED_CURRENCIES = List.of("USD", "EUR", "JPY", "CHF");


    public String processPayment(int paymentAmount, String currency, String clientID)
            throws InvalidPaymentCurrencyException, InvalidPaymentAmountException, BankProcessingFailedException {

        if (!SUPPORTED_CURRENCIES.contains(currency)) {
            throw new InvalidPaymentCurrencyException(String.format("Currency %s not supported", currency));
        }

        if (paymentAmount <= 0) {
            throw new InvalidPaymentAmountException("Negative or zero payment amount");
        }

        return requestBankProcessing(paymentAmount);

    }

    public String requestBankProcessing(int paymentAmount) throws BankProcessingFailedException {
        // Some bank communication magic here
        Random random = new Random();
        int statusCode = random.nextInt(10);
        if (statusCode > 5) {
            throw new BankProcessingFailedException(String.format("Bank returned result code %s", statusCode));
        }
        return "trx_4knfsf4gs412355";


    }
    // Lesson 17
    public static void main(String[] args) {

        try  {
            Module result = new Module();
            result.processPayment(44,"EUR","5");
        }
        catch ( InvalidPaymentCurrencyException exception  ) {
            System.out.println(exception.getMessage());
        }
        catch ( InvalidPaymentAmountException exception2  ) {
            System.out.println(exception2.getMessage());
        }
        catch ( BankProcessingFailedException exception3  ) {
            System.out.println(exception3.getMessage());
        }

        finally {

            System.out.println("Process Payment is Success");

        }
    }


}

