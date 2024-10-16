package hope;

import java.util.HashMap;
import java.util.Map;

/**
 * The Department class manages department information and operations.
 * <p>
 * This class allows for the creation of department objects and provides
 * functionalities to list all departments and retrieve specific department
 * information.
 * </p>
 */
public class Department {
    private int departmentId;
    private String departmentName;
    private String contactInfo;

    // Sample map to simulate departments
    private static Map<Integer, Department> departments = new HashMap<>();

    /**
     * Constructs a new Department instance with the specified details.
     *
     * @param departmentId   The unique ID of the department.
     * @param departmentName The name of the department.
     * @param contactInfo    The contact information for the department.
     */
    public Department(int departmentId, String departmentName, String contactInfo) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.contactInfo = contactInfo;
        departments.put(departmentId, this);
    }

    /**
     * Lists all available departments.
     * <p>
     * This method iterates through the list of stored departments and prints
     * the ID and name of each department.
     * </p>
     */
    public static void listDepartments() {
        for (Department department : departments.values()) {
            System.out.println(department.departmentId + ": " + department.departmentName);
        }
    }

    /**
     * Retrieves and displays information about a specific department.
     * <p>
     * This method fetches the department details based on the provided
     * department ID and prints the department name and contact information.
     * If the department is not found, it notifies the user.
     * </p>
     *
     * @param departmentId The ID of the department to retrieve information for.
     */
    public static void getDepartmentInfo(int departmentId) {
        Department dept = departments.get(departmentId);
        if (dept != null) {
            System.out.println("Department Name: " + dept.departmentName);
            System.out.println("Contact Info: " + dept.contactInfo);
        } else {
            System.out.println("Department not found.");
        }
    }
}
