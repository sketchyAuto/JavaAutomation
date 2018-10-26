package LearnAndHomeTextFile;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class WriteFile {
    //When you write to a file, you can either start from the beginning and overwrite everything.
    // Or you can start at the end and append to the file. The FileWriter class allows you to specify which.
    //We'll add a field that sets the append value for the FileWriter class.
    // We'll also add a field to set the name of the file.

    private String path;
    private boolean append_to_file = false; //The boolean field is called append_to_file and has been set to a value of false

    //We can set up a second one and pass in an append value. That way, a user can either just use the first constructor
    // and hand over a file name, or a file name and an append value.
    public WriteFile(String file_path){
        path = file_path;
    }

    //To Append to the file
    public WriteFile(String file_path, boolean append_value){
        path = file_path;
        append_to_file = append_value;
    }

    //To Write to the files
    public void writeToFile(String textLine) throws IOException{
        //FileWriter takes care of opening the correct file, and of storing the text as bytes
        FileWriter write = new FileWriter(path,append_to_file);
        PrintWriter print_line = new PrintWriter(write);

        print_line.printf("%s"+"%n", textLine);//The %s between double quotes means a string of characters of any length.
        print_line.close();
    }

}
