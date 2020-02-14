import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Serialization implements Serializable {

     public static void serialize(List<Animal> listOfAnimals,Path path) throws IOException {
         try (ObjectOutputStream outputStream =
                      new ObjectOutputStream(Files.newOutputStream(path))) {
             outputStream.writeObject(listOfAnimals);
         }

     }
    public static List<Animal> deserialize(Path path) throws IOException, ClassNotFoundException{
         List<Animal> newAnimalList;
        //Path path = Paths.get("object.bin");
        try (ObjectInputStream inputStream =
                     new ObjectInputStream(Files.newInputStream(path))) {
            newAnimalList = (List<Animal>) inputStream.readObject();
        }
        return newAnimalList;
    }

}
