import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> family = new HashSet<>();
        family.add("Mother");
        family.add("Father");
        family.add("Son");
        family.add("Dog");
        family.addAll(Arrays.asList("Daughter", "Father"));

        family.remove("Dog");

        System.out.println(family);
    }
}