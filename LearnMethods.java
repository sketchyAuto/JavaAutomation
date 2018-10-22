public class LearnMethods {

    //A method is just a chunk of code that does a particular job. The methods return type goes first then method name
    //return is the value we want to return from the method after the code has been executed. It must be the same type
    //as the return type in the method header. void is used when you don't want to return anything.

    /**
     *
     * @param aNumber
     * @return 20 + the value of aNumber
     */
    int total(int aNumber){
        int results = aNumber + 10;
        return results;
    }

    void printText(String someName){
        System.out.println("Some Name here: ");
    }

    //We now have two methods with the same name: total.
    // The difference between the two is that this new one has a value between the round brackets.
    // Java allows you to do this, and it is called method overloading.
    int total(){
        int a_Value = 19+10;
        return a_Value;
    }

    //Passing more than one value (Parameter)
    void printText(String value, int aValue){
        System.out.println("The string is: "+value+" and the int is: "+aValue);
    }

}
