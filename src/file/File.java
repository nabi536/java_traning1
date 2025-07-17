package file;

import java.io.FileReader;
import java.io.IOException;


public class File {
    public static void main(String[] args) throws IOException {
        try{
            FileReader fr = new FileReader("Resources/TestFile.txt");
            int ch = fr.read();
            while(ch != -1){
                System.out.print((char)ch);
                ch = fr.read();
            }
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
