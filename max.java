import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }

        int max = arr[0];
        for(int j = 0; j < n; j++){
            if(arr[j] > max){
                max = arr[j];
            }
        }

        System.out.println("Max of array " + max);
    }
}
