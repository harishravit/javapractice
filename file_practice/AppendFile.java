package file_practice;
import java.io.*;
public class AppendFile {
      public void appendFile(String path) throws IOException{
        FileWriter append_file=new FileWriter(path,true);
        append_file.write("\nwhat are you doing nowdadad?");
        append_file.close();
        System.out.println("content append succefully");
    }
}