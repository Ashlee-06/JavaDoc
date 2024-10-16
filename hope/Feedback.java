package hope;

/**
 * The Feedback class handles the creation, submission, and management of user feedback.
 * <p>
 * This class provides functionalities to submit feedback, view feedback details,
 * and respond to feedback messages. Feedback is associated with a user and contains
 * information such as feedback ID, user ID, feedback message, date, and response.
 * </p>
 */
public class Feedback {
    private int feedbackId;
    private int userId;
    private String message;
    private String date;
    private String response;

    /**
     * Constructs a new Feedback instance with the specified details.
     *
     * @param feedbackId The unique ID of the feedback.
     * @param userId     The ID of the user who submitted the feedback.
     * @param message    The feedback message content.
     * @param date       The date the feedback was submitted.
     */
    public Feedback(int feedbackId, int userId, String message, String date) {
        this.feedbackId = feedbackId;
        this.userId = userId;
        this.message = message;
        this.date = date;
        this.response = "";
    }

    /**
     * Submits feedback on behalf of a user.
     * <p>
     * This method simulates the submission of feedback and displays a message indicating
     * that the feedback has been submitted.
     * </p>
     *
     * @param userId  The ID of the user submitting the feedback.
     * @param message The feedback message to be submitted.
     */
    public void submitFeedback(int userId, String message) {
        System.out.println("Feedback submitted by User ID: " + userId + " - " + message);
    }

    /**
     * Displays the details of the feedback.
     * <p>
     * This method outputs the feedback message to the console.
     * </p>
     */
    public void viewFeedback() {
        System.out.println("Feedback: " + message);
    }

    /**
     * Responds to the feedback message.
     * <p>
     * This method sets the response to the feedback and displays the response message.
     * </p>
     *
     * @param response The response message to the feedback.
     */
    public void responseToFeedback(String response) {
        this.response = response;
        System.out.println("Response to feedback: " + response);
    }
}
