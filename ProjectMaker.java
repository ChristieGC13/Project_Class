public class ProjectMaker {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public String elevatorPitch() {
        return (name + " : " + description);
    }

    public ProjectMaker() {
    }

    public ProjectMaker(String name) {
        this.name = name;
    }

    public ProjectMaker(String name, String description) {
        this.name = name;
        this.description = description;
    }
}