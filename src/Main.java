import java.util.*;

public class Main {
        public static void main(String[] args) {

        // Se creeaza o instanta a clasei ArrayList cu duplicate
        ArrayList<String> family = new ArrayList<>();
        // Se adauga elemente de tip String in lista
        family.add("Mother");
        family.add("Father");
        family.add("Son");
        family.add("Dog");
        family.add("Son"); // duplicat
        // se adauga mai multe elemente pron metoda addAll
        family.addAll(Arrays.asList("Daughter", "Father")); //Father este element duplicat

     //   family.remove("Dog"); // se sterge din lista

        // apelam metoda care sterge duplicate
        ArrayList<String> unice = valoriUnice(family);
            // Se afiseaza colectia unica rezultata dupa eliminarea duplicatelor
            System.out.println("Lista fara duplicate: " + unice);
    }

    /*
    Definirea metodei valoriUnice ce va elimina elementele
    duplicate din lista de intrare si va returna o colectie unica
     */
    public static ArrayList<String> valoriUnice(ArrayList<String> family) {
        /*
        se creeaza o instanta a clasei HashSet de tip String, cu lista de intrare ca argument,
        astfel incat sa se elimine elementele duplicate
        */
        ArrayList<String> unice = new ArrayList<>();
        for (String element : family) { // verifica fiecare element de tip string din arraylist "family"
            if (!unice.contains(element)) { //daca el nu se contine in lista noua "unice"
                unice.add(element); // atunci il adaugam
            }
        }
        return unice; // cerem sa returnam ca rezultat o lista noua cu valori unice
    }
}