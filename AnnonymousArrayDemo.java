public class AnnonymousArrayDemo {
    public static void main(String args[]) {
        printArray(new int[] {10, 20, 30, 40});
    }
    static void printArray(int arr[]){
        System.out.println("The elements in the annonnymous array:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
