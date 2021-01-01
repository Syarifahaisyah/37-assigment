import java.io.IOException;
import java.nio.file.*;

public class Bacaisidarifile {
    public static void main(String[] args) {
      
      try {
          Path file = Paths.get("data.txt");
          byte[] data = Files.readAllBytes(file);
          String isi = new String (data);
          System.out.println(isi);
      } catch (IOException Exception) {
        System.out.println("File tidak ditemukan");
      }


    }
}