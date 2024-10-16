package hope;

import java.util.HashMap;
import java.util.Map;

/**
 * Provides functionality related to services.
 * Services can be listed and details about each service can be retrieved.
 * 
 * <p>
 * This class allows the creation of services and provides methods to list all available services and get the details of a specific service.
 * Each service has attributes like service ID, name, description, department ID, fee, and required documents.
 * </p>
 */
public class Service {
    private int serviceId;
    private String serviceName;
    private String description;
    private int departmentId;
    private double fee;
    private String requiredDocuments;

    // Sample map to simulate available services
    private static Map<Integer, Service> services = new HashMap<>();

    /**
     * Constructs a new Service with the specified details.
     *
     * @param serviceId         The unique identifier of the service.
     * @param serviceName       The name of the service.
     * @param description       The description of the service.
     * @param departmentId      The ID of the department to which the service belongs.
     * @param fee               The fee associated with the service.
     * @param requiredDocuments The documents required for the service.
     */
    public Service(int serviceId, String serviceName, String description, int departmentId, double fee, String requiredDocuments) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.description = description;
        this.departmentId = departmentId;
        this.fee = fee;
        this.requiredDocuments = requiredDocuments;
        services.put(serviceId, this);
    }

    /**
     * Lists all available services.
     * <p>
     * This method displays the service ID and service name of all services available in the system.
     * </p>
     */
    public static void listAllServices() {
        // Display all services
        for (Service service : services.values()) {
            System.out.println(service.serviceId + ": " + service.serviceName);
        }
    }

    /**
     * Gets details about a specific service.
     *
     * @param serviceId The ID of the service to retrieve details for.
     *                  If the service exists, it prints the service's name, description, fee, and required documents.
     *                  If not, it indicates that the service was not found.
     */
    public static void getServiceDetails(int serviceId) {
        // Fetch and display service details
        Service service = services.get(serviceId);
        if (service != null) {
            System.out.println("Service Name: " + service.serviceName);
            System.out.println("Description: " + service.description);
            System.out.println("Fee: " + service.fee);
            System.out.println("Required Documents: " + service.requiredDocuments);
        } else {
            System.out.println("Service not found.");
        }
    }

    /**
     * Calculates the fee for the service.
     *
     * @return The fee associated with the service.
     */
    public double calculateFee() {
        // Basic fee calculation logic
        return fee;
    }
}
