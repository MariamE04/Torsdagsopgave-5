package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu;


    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    public void loadMenuData() {
        try {
            File file = new File("coffe.txt");
            Scanner sc = new Scanner(file);
            coffeeMenu = new ArrayList<>();
            while (sc.hasNextLine()) {
                coffeeMenu.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename");
        }
    }
}