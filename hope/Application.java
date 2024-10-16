package hope;

import java.util.HashMap;
import java.util.Map;

/**
 * The Application class manages application submissions and provides methods 
 * for interacting with submitted applications.
 * <p>
 * This class allows the creation, submission, status checking, and editing 
 * of applications related to services. It uses a map to simulate a storage 
 * system for the applications.
 * </p>
 */
public class Application {
    private int applicationId;
    private int userId;
    private int serviceId;
    private String applicationDate;
    private String status;
    private String documents;

    // Sample map to simulate submitted applications
    private static Map<Integer, Application> applications = new HashMap<>();

    /**
     * Constructs a new Application instance with the specified details.
     *
     * @param applicationId   The unique ID of the application.
     * @param userId          The ID of the user submitting the application.
     * @param serviceId       The ID of the service for which the application is made.
     * @param applicationDate The date of the application submission.
     * @param status          The current status of the application.
     * @param documents       The documents associated with the application.
     */
    public Application(int applicationId, int userId, int serviceId, String applicationDate, String status, String documents) {
        this.applicationId = applicationId;
        this.userId = userId;
        this.serviceId = serviceId;
        this.applicationDate = applicationDate;
        this.status = status;
        this.documents = documents;
        applications.put(applicationId, this);
    }

    /**
     * Submits the application.
     * <p>
     * This method changes the application status to "Submitted" and 
     * confirms the submission process.
     * </p>
     */
    public void submitApplication() {
        this.status = "Submitted";
        System.out.println("Application submitted successfully.");
    }

    /**
     * Checks the current status of the application.
     * <p>
     * This method prints the current status of the application to the console.
     * </p>
     */
    public void checkStatus() {
        System.out.println("Application Status: " + status);
    }

    /**
     * Uploads documents related to the application.
     *
     * @param newDocuments The new documents to be associated with the application.
     */
    public void uploadDocuments(String newDocuments) {
        this.documents = newDocuments;
        System.out.println("Documents uploaded successfully.");
    }

    /**
     * Edits the application status.
     *
     * @param newStatus The new status to update the application with.
     */
    public void editApplication(String newStatus) {
        this.status = newStatus;
        System.out.println("Application updated successfully.");
    }
}
