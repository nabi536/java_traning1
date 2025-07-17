package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File1 {
        public static void main(String[] args) throws IOException {
            try{
                FileReader fr = new FileReader("Resources/TestFile.txt");
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                while(line != null){
                    System.out.print(line);
                    line = br.readLine();
                }
            }
            catch(IOException e){
                throw new RuntimeException(e);
            }
        }
    }
