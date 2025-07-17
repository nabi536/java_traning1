package file;

import java.io.*;

public class File3 {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fr = new FileReader("Resources/abc.text");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("Resources/abcCopy.text");
            BufferedWriter bw = new BufferedWriter(fw);

            String line = br.readLine();
            while (line != null) {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}