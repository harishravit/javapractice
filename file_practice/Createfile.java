package file_practice;
import java.io.*;
public class Createfile {
        public void createFile(String path) throws IOException{
        File create_file=new File(path);
        if(create_file.createNewFile()){
            System.out.println("File was created "+create_file.getPath());
        }
        else{
          System.out.println("already exist");
        }
    }    
}
