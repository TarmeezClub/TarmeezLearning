import java.util.ArrayList;
import java.util.List;

public class ProjectManager implements Manageable<Project> {
    private List<Project> projectList;

    public ProjectManager() {
        // Initialize the projectList as an empty list
        projectList = new ArrayList<>();
    }

    @Override
    public void add(Project project) {
        projectList.add(project);
        System.out.println("[+] project added: " + project.getName() + ", " + project.getProjectID());
    }

    @Override
    public void update(Project project) {
        // Assuming project information can be updated based on some criteria, implement
        // the update logic here.
        // You might want to find the project in the list and update their information.
        // No Need to implement this method .!
    }

    @Override
    public void delete(Project project) {
        projectList.remove(project);
        System.out.println("[-] project deleted: " + project.getName() + ", " + project.getProjectID());
    }

    @Override
    public List<Project> list() {
        return projectList;
    }
}

class Project {
    private String projectID;
    private String name;
    private String description;

    public Project(String projectID, String name, String description) {
        this.projectID = projectID;
        this.name = name;
        this.description = description;
    }

    public String getProjectID() {
        return this.projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Project ID: " + projectID + "\n" +
                "Name: " + name + "\n" +
                "Description: " + description + "\n";
    }
}
