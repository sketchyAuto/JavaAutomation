package LearnAndHomeTextFile;

import java.io.IOException;

public class FileData {

    public static void main(String[] args) throws IOException{
        String file_name = "/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/HomeandLearn/src/main/resources/Write.txt";

        try{
            ReadFile file = new ReadFile(file_name);
            String[] aryLines = file.OpenFile();

            int i;
            for(i=0; i< aryLines.length; i++){
                System.out.println(aryLines[i]);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());

        }
        System.out.println();

        try{
            ReadFile file = new ReadFile(file_name);
            int arryLines = file.readLines();

            int i;
            for(i=1; i< arryLines; i++) System.out.println(i);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {
            // create a new object from your WriteFile class
            WriteFile data = new WriteFile(file_name, true);
            data.writeToFile("This is another line of text");
            System.out.println("Text File now Written");

            //Overwiting the file constructor
            //WriteFile data = new WriteFile(file_name);
            //data.writeToFile("This is another line of text");
            //System.out.println("Text File now Written");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
