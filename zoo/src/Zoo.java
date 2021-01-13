import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    private ArrayList<Animal> animals;
    public Zoo(String zooAnimalsFile) {
        animals = AnimalsParser.getParsedAnimals(zooAnimalsFile);
    }
    public Animal getAnimal(String animalName) {
        for (Animal animal: animals) {
            if (animal.getName().equals(animalName)) {
                return animal;
            }
        }
        return new Animal("", "", "");
    }
    public ArrayList<Animal> getAnimals() {
        return animals;
    }
    public static void printZooMenu() {
        System.out.println("Welcome to the zoo!");
        System.out.println("you can read about some animals that are here");
        System.out.println("To see an animal info, just type the name of the animal.");
        System.out.println("To see all animals info, type the command \"all\" ");
        System.out.println("To see all animals present in this zoo type the command \"list\" ");
        System.out.println("The animal name you want to print needs to have the first letter in uppercase");
        System.out.println("To leave the zoo, type \"exit\"\n");
        System.out.println("print this menu again by typing \"menu\"");
    }
}
