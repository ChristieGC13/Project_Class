public class ProjectMakerTest {
    public static void main(String[] args) {
        ProjectMaker firstProjectMaker = new ProjectMaker("First", "This is the first project created");
        String name = firstProjectMaker.getName();
        System.out.println(firstProjectMaker.elevatorPitch());
        
    }
}