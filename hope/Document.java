package hope;

/**
 * The Document class handles the management of documents associated with applications.
 * <p>
 * This class provides functionalities for uploading, downloading, and validating
 * documents that are linked to specific applications.
 * </p>
 */
public class Document {
    private int documentId;
    private String documentType;
    private String documentPath;
    private int applicationId;

    /**
     * Constructs a new Document instance with the specified details.
     *
     * @param documentId    The unique ID of the document.
     * @param documentType  The type of the document (e.g., ID Proof, Application Form).
     * @param documentPath  The file path where the document is stored.
     * @param applicationId The ID of the application associated with this document.
     */
    public Document(int documentId, String documentType, String documentPath, int applicationId) {
        this.documentId = documentId;
        this.documentType = documentType;
        this.documentPath = documentPath;
        this.applicationId = applicationId;
    }

    /**
     * Simulates the upload of a document.
     * <p>
     * This method simulates the document upload process and prints a message indicating
     * that the document has been uploaded to the specified path.
     * </p>
     */
    public void uploadDocument() {
        System.out.println("Document uploaded at path: " + documentPath);
    }

    /**
     * Simulates the download of a document by its ID.
     * <p>
     * This method simulates the process of downloading a document and prints a message
     * indicating that the document with the specified ID is being downloaded.
     * </p>
     *
     * @param documentId The unique ID of the document to be downloaded.
     */
    public void downloadDocument(int documentId) {
        System.out.println("Downloading document with ID: " + documentId);
    }

    /**
     * Simulates the validation of the document.
     * <p>
     * This method simulates the document validation process and prints a message
     * indicating that the document has been validated successfully.
     * </p>
     */
    public void validateDocument() {
        System.out.println("Document validated successfully.");
    }
}
