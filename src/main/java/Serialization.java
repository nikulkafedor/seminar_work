import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable {
    public static void writeObject(List<>){
         try (FileWriter fileWriter = new FileWriter(Files.newInputStream(path))){
             fileWriter.writeObject(animalList);
         }
     }
     void readObject() {

     }

}
