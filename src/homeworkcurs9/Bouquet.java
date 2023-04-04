package homeworkcurs9;

import java.util.HashSet;

public class Bouquet {
    public static void main(String[] args){
        HashSet <String> bouquet = new HashSet<>();
        bouquet.add("crin");
        bouquet.add("lacramioara");
        bouquet.add("lalea");
        bouquet.add("trandafir");
        bouquet.add("ghiocel");
        System.out.println(bouquet);
        bouquet.add("narcisa");
        bouquet.remove("lacramioara");
        bouquet.add("crin");
        System.out.println(bouquet);
    }
}
