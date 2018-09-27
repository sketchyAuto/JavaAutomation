package BasicsStarter;

public class StringDemo {
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "welcome";
        String str4 = "       Spaces all around     ";
        String str5 = "HELLO";

        System.out.println(str1);

        String str = "This is a the test string.";
        //To get the length of the string
        System.out.println(str.length());

        //To get a character in the string
        System.out.println(str.charAt(2));

        //Combine a string to the end of the string
        System.out.println(str.concat(" This is the appended string"));

        //To check if true a string contains the word
        System.out.println(str.contains("his"));

        //Check if a string starts with a given prefix
        System.out.println(str.startsWith("This"));

        //Check if a string ends with a given prefix
        System.out.println(str.endsWith("string."));

        //This checks if the content for 2 strings are the same
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        //Check the index of a given character value or string
        System.out.println(str.indexOf('i'));

        //Check if string is empty
        System.out.println(str.isEmpty());

        //Eliminates leading and trailing spaces
        System.out.println(str4.trim());

        //Replace a string
        System.out.println(str3.replace("welcoma","Reward"));
        System.out.println(str3.replace("a","e"));

        //Substring get part of the string
        System.out.println(str.substring(5));
        System.out.println(str.substring(10,13));

        char[] charArray = str.toCharArray();
        for(int i = 0; i<charArray.length; i++){
            System.out.println(("Index "+i + " is: "+charArray[i]));
        }

        //ToLower
        System.out.println("Print all string to lower case: "+str5.toLowerCase());

    }
}
