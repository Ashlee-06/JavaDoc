package hope;
/**
 * Represents a user in the system.
 * Each user has a unique ID and personal details such as name, email, phone number, address, and user type.
 */
public class User {
    private static int userCounter = 1; // Static counter to generate unique user IDs
    private int userId;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String userType;

 
    /**
     * Constructs a new User with the specified details.
     *
     * @param name         The name of the user.
     * @param email        The email address of the user.
     * @param phoneNumber  The phone number of the user.
     * @param address      The address of the user.
     * @param userType     The type of the user (e.g., Citizen, Admin).
     */
    public User(String name, String email, String phoneNumber, String address, String userType) {
        this.userId = userCounter++;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.userType = userType;
    }

    /**
     * Gets the unique ID of the user.
     *
     * @return The user ID.
     */
    public int getUserId() {
        return userId;
    }
    /**
     * Registers the user and prints a confirmation message.
     */
    public void register() {
        // Simulate registration logic
        System.out.println("User registered successfully: " + name + " (User ID: " + userId + ")");
    }
    /**
     * Logs the user in based on email and phone number.
     *
     * @param email        The email address of the user.
     * @param phoneNumber  The phone number of the user.
     * @return True if login is successful, false otherwise.
     */
    public boolean login(String email, String phoneNumber) {
        // Simulate login logic
        if (this.email.equals(email) && this.phoneNumber.equals(phoneNumber)) {
            System.out.println("User logged in successfully: " + name);
            return true;
        } else {
            System.out.println("Login failed. Incorrect email or phone number.");
            return false;
        }
    }
    /**
     * Updates the user's address.
     *
     * @param newAddress The new address to be set for the user.
     */
    public void updateProfile(String newAddress) {
        this.address = newAddress;
        System.out.println("Profile updated with new address: " + address);
    }
    /**
     * Displays available services for the user.
     */
    public void viewServices() {
        // Simulate viewing services logic
        System.out.println("Viewing available services for user: " + name);
    }
    /**
     * Submits feedback from the user.
     *
     * @param message The feedback message from the user.
     */
    public void submitFeedback(String message) {
        // Simulate submitting feedback
        System.out.println("Feedback submitted by User ID: " + userId + " - " + message);
    }
}
