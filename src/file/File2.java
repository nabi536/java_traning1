package file;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File2 {
    public static void main(String[] args) throws IOException {
        try{
            FileWriter fr = new FileWriter("Resources/TestFile.txt",true);
            BufferedWriter br = new BufferedWriter(fr);
            br.write("Hello how are you");
            br.close();
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
