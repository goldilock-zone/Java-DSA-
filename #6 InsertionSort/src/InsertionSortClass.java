public class InsertionSortClass{
    //Implementation for insertion sort with char arrays
    public static void InsertionSort(char[] data, boolean verbose) {
        int n = data.length;
        for (int k = 1; k < n; k++){
            char current = data[k];
            int j = k;
            while (j > 0 && data[j-1] > current){
                data[j] = data[j-1];
                j--;
            }
            data[j] = current;
            if (verbose){
                System.out.println("Step " + (k-1));
                System.out.println(data);
            }
        }
    }

}
