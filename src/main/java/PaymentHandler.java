import java.util.List;
import java.util.Random;

public class PaymentHandler {
    public static List<String> SUPPORTED_CURRENCIES = List.of("USD", "EUR", "JPY", "CHF");
    public static int ERROR = 0;

    public void processPayment(int paymentAmount, int cost, String currency)
            throws InvalidPaymentCurrencyException, InvalidPaymentAmountException, BankProcessingFailedException {

        if (!SUPPORTED_CURRENCIES.contains(currency)) {
            throw new InvalidPaymentCurrencyException(String.format("Currency %s is not supported for your region", currency));
        }

        if (paymentAmount < cost) {
            throw new InvalidPaymentAmountException("Your transaction was failed, insufficient funds");
        }

        requestBankProcessing();

    }

    public void requestBankProcessing() throws BankProcessingFailedException {
        // Some bank communication magic here
        Random random = new Random();
        int statusCode = random.nextInt(2);
        if (statusCode == ERROR) {
            throw new BankProcessingFailedException(String.format("Your transaction was failed with status code %s. Please try again later.", statusCode));
        }
    }

    // Lesson 17
    public static void main(String[] args) {

        try {
            PaymentHandler paymentHandler = new PaymentHandler();
            paymentHandler.processPayment(33, 33, "FHF");
        } catch (InvalidPaymentCurrencyException | InvalidPaymentAmountException |
                 BankProcessingFailedException exception) {
            System.out.println(exception.getMessage());
            return;
        }
        System.out.println("Your payment was processed successfully!");
    }
}

