/**
 * bubbleSort
 */
public class bubbleSort {
    static void bubbleSort(int [] a){
        int n = a.length;

        for (int i = 0; i < n-1; i++) {
            boolean flag = false;
            for (int j = 0; j < n-i-1; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int [] a = {7,6,5,4,3};
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("");
        bubbleSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}