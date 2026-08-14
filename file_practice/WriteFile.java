package file_practice;
import java.io.*;
public class WriteFile {
      public void writeFile(String path) throws IOException{
        FileWriter write_file=new FileWriter(path);
        write_file.write("what are you doing nowdadad?");
        write_file.close();
        System.out.println("content is write succefully");
    }
}