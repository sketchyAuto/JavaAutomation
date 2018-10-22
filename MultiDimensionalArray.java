public class MultiDimensionalArray {

    public static void main(String[] args){
        int[][] aryNumbers = new int[3][5];
        //The first row is row 0. The column then goes from 0 - 4
        aryNumbers[0][0] = 10;
        aryNumbers[0][1] = 12;
        aryNumbers[0][2] = 43;
        aryNumbers[0][3] = 11;
        aryNumbers[0][4] = 22;

        aryNumbers[1][0] = 20;
        aryNumbers[1][1] = 45;
        aryNumbers[1][2] = 56;
        aryNumbers[1][3] = 1;
        aryNumbers[1][4] = 33;

        aryNumbers[2][0] = 28;
        aryNumbers[2][1] = 49;
        aryNumbers[2][2] = 56;
        aryNumbers[2][3] = 13;
        aryNumbers[2][4] = 55;

        //To Access all the items in a multi-dimensional array the technique is to use one loop inside of another
        int rows = 3;
        int columns = 5;
        int i, j;
        for(i=0; i< rows; i++){
            for (j=0; j< columns; j++){
                System.out.print(aryNumbers[i][j]+" ");
            }
            System.out.println("");
        }

        //To access an array
        System.out.print(aryNumbers[0][2]);
    }
}
