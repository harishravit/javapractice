package Exception_practice;

import java.io.IOException;
import file_practice.*;
public class Throws_keyword {
    public static void main(String[] args){
        try {
            String path="C:\\Users\\Students\\Desktop\\java pratice\\file_practice\\text.txt";
            // Createfile createfile=new Createfile();
            // createfile.createFile(path);
            // WriteFile writefile =new WriteFile();
            // writefile.writeFile(path);
            AppendFile appendfile=new AppendFile();
            appendfile.appendFile(path);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
