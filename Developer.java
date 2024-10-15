public class Developer {
    private String name;
    private String computerType;

    public Developer(String name, String computerType) {
        this.name = name;
        this.computerType = computerType;
    }

    public void runCode(Developer developer) {
        System.out.println(developer.name + " is using a " + developer.computerType + " to run code.");
    }
}
