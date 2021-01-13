import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class AnimalsParser {
    public static ArrayList<Animal> getParsedAnimals (String jsonFilePath) {
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        File file = new File(jsonFilePath);
        if (!file.exists() || file.length() == 0) {
            return animalList;
        }
        try {
            JSONTokener parser = new JSONTokener(new FileInputStream(file));
            JSONArray jsonList = new JSONArray(parser);

            for(int n = 0; n < jsonList.length(); n++) {
                JSONObject obj = (JSONObject) jsonList.get(n);
                Animal animal = new Animal(
                        obj.getString("name"),
                        obj.getString("species"),
                        obj.getString("description")
                );
                animalList.add(animal);
            }
        } catch (Exception e) {
            System.out.println("Sorry, something went wrong");
        }
        return  animalList;
    }
}
