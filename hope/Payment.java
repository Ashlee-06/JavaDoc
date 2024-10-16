package hope;

/**
 * Represents a payment associated with an application.
 * 
 * <p>
 * This class handles payment-related operations, including making payments, checking payment status, 
 * and generating receipts. Each payment is linked to an application and has details like payment ID, 
 * amount, date, and status.
 * </p>
 */
public class Payment {
    private int paymentId;
    private int applicationId;
    private double amount;
    private String paymentDate;
    private String paymentStatus;

    /**
     * Constructs a new Payment with the specified details.
     *
     * @param paymentId      The unique ID of the payment.
     * @param applicationId  The ID of the associated application.
     * @param amount         The amount of the payment.
     * @param paymentDate    The date when the payment was made.
     */
    public Payment(int paymentId, int applicationId, double amount, String paymentDate) {
        this.paymentId = paymentId;
        this.applicationId = applicationId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentStatus = "Pending";
    }

    /**
     * Makes the payment and updates the payment status to "Completed".
     * <p>
     * This method simulates the payment process and sets the payment status to "Completed" once 
     * the payment is made successfully.
     * </p>
     */
    public void makePayment() {
        // Simulate payment process
        this.paymentStatus = "Completed";
        System.out.println("Payment made successfully for Application ID: " + applicationId);
    }

    /**
     * Gets the current status of the payment.
     * <p>
     * This method displays the current payment status, which can be "Pending" or "Completed".
     * </p>
     */
    public void getPaymentStatus() {
        // Display payment status
        System.out.println("Payment Status: " + paymentStatus);
    }

    /**
     * Generates a receipt for the payment.
     * <p>
     * This method simulates the process of generating a receipt for the payment, showing the payment ID.
     * </p>
     */
    public void generateReceipt() {
        // Logic to generate payment receipt
        System.out.println("Receipt generated for Payment ID: " + paymentId);
    }
}
