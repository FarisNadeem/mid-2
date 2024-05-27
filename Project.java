public class Project {
    private String title;
    private String description;
    private String client;

    public Project(String title, String description, String client) {
        this.title = title;
        this.description = description;
        this.client = client;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getClient() {
        return client;
    }

    @Override
    public String toString() {
        return title + "," + description + "," + client;
    }
}
