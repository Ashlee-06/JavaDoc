package hope;

/**
 * Represents a notification sent to a user.
 * 
 * <p>
 * The `Notification` class handles sending notifications to users, marking notifications as read, 
 * and retrieving notifications for a specific user. Each notification has attributes like 
 * notification ID, user ID, message, date, and status.
 * </p>
 */
public class Notification {
    private int notificationId;
    private int userId;
    private String message;
    private String date;
    private String status;

    /**
     * Constructs a new Notification with the specified details.
     *
     * @param notificationId The unique ID of the notification.
     * @param userId         The ID of the user to whom the notification is sent.
     * @param message        The message content of the notification.
     * @param date           The date when the notification was sent.
     */
    public Notification(int notificationId, int userId, String message, String date) {
        this.notificationId = notificationId;
        this.userId = userId;
        this.message = message;
        this.date = date;
        this.status = "Unread";
    }

    /**
     * Sends a notification to a specified user.
     *
     * @param userId  The ID of the user to send the notification to.
     * @param message The message content of the notification.
     * <p>
     * This method simulates sending a notification to the user by displaying the message on the console.
     * </p>
     */
    public void sendNotification(int userId, String message) {
        // Simulate sending notification
        System.out.println("Notification sent to User ID: " + userId + " - " + message);
    }

    /**
     * Marks the notification as read.
     * <p>
     * This method updates the notification status to "Read" and confirms the change via a console message.
     * </p>
     */
    public void markAsRead() {
        // Mark notification as read
        this.status = "Read";
        System.out.println("Notification marked as read.");
    }

    /**
     * Retrieves notifications for a specific user.
     *
     * @param userId The ID of the user whose notifications are being fetched.
     * <p>
     * This method simulates fetching notifications for the given user ID.
     * </p>
     */
    public void getNotifications(int userId) {
        // Simulate getting notifications for a user
        System.out.println("Fetching notifications for User ID: " + userId);
    }
}
