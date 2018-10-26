package LearnAndHomeTextFile;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {

    private String path;

    //All we're doing here is passing in the name of a file, and then handing the file name over to the path field
    public ReadFile(String file_path){
        path = file_path;
    }

    //create a method that returns all the lines of code from the text file. The lines will be held in an array.
    public String[] OpenFile() throws IOException{

        //To read characters from a text fileYou can read whole lines of text, rather than single characters.
        // To do this, you can hand your FileReader over to something called a BufferedReader
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        int numberOfLines = 24;
        String[] textData = new String [numberOfLines];

        int i;
        for(i=0; i<numberOfLines; i++){
            textData[i] = textReader.readLine();
        }

        textReader.close();
        return textData;
    }

    //we need is to go through any text file and count how many lines it has
    int readLines() throws IOException{
        FileReader file_to_read = new FileReader(path);
        BufferedReader bf = new BufferedReader(file_to_read);

        String aLine;
        int numberOfLines = 1;

        while((aLine = bf.readLine()) !=null){
            numberOfLines++;
        }
        bf.close();
        return numberOfLines;
    }
}
