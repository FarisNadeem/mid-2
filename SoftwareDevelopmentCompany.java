import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoftwareDevelopmentCompany {
    public SoftwareDevelopmentCompany(String myTechCompany) {

    }
    // ... (rest of the class: name, projects list, addProject, removeProject, saveState, restoreState as before)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SoftwareDevelopmentCompany company = new SoftwareDevelopmentCompany("MyTechCompany");

        // Load previous state if available
        company.restoreState();

        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Add Project");
            System.out.println("2. Remove Project");
            System.out.println("3. List Projects");
            System.out.println("4. Save State");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Client: ");
                    String client = scanner.nextLine();
                    company.addProject(title, description, client);
                    break;
                case 2:
                    System.out.print("Title of project to remove: ");
                    String projectToRemove = scanner.nextLine();
                    if (company.removeProject(projectToRemove)) {
                        System.out.println("Project removed.");
                    } else {
                        System.out.println("Project not found.");
                    }
                    break;
                case 3:
                    List<Project> projects = company.getProjects();
                    if (projects.isEmpty()) {
                        System.out.println("No projects yet.");
                    } else {
                        for (Project project : projects) {
                            System.out.println(project.getTitle() + " - " + project.getClient());
                        }
                    }
                    break;
                case 4:
                    company.saveState();
                    System.out.println("State saved.");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void restoreState() {
    }

    private List<Project> getProjects() {
        return null;
    }

    private boolean removeProject(String projectToRemove) {
        return false;
    }

    private void saveState() {
    }

    private void addProject(String title, String description, String client) {
    }
}
