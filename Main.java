public class Main {
    public static void main(String[] args) {
        Developer john = new Developer("John", "Desktop");
        Developer jane = new Developer("Jane", "Laptop");
        john.runCode(john);
        jane.runCode(jane);
    }
}
