import java.util.Arrays;
public class pigeonholeSort {
    public static void sarangMerpatiSort(int theArray[], int arrayLength){



        int min = theArray[0]; // set default value
        int max = theArray[0]; // set default value
        int range, i, j, index;

        for (int k = 0; k < arrayLength; k++) {
            if(theArray[k] > max){
                 max = theArray[k];
            }

            if(theArray[k] < min){
                min = theArray[k];
            }

        }

        range = max - min + 1; //rumus pigeonhole

        int[] container = new int[range]; // container is the pigeonhole
        Arrays.fill(container, 0);

        for (int l = 0; l < arrayLength; l++) {
            container[theArray[l] - min]++;
        }

        index = 0;

        for (int k = 0; k < range ; k++) {
            while (container[k]-- > 0){
                theArray[index++] = k + min;
            }
        }




    }

    public static void main (String[] args){

        pigeonholeSort sort = new pigeonholeSort();
        int[] inputArray = {10,1,4,3,12};

        System.out.println("Sorted Order Is : ");

        sarangMerpatiSort(inputArray, inputArray.length);

        for(int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }



    }


}
