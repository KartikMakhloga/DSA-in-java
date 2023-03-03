public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,3,4));
    }

    static int maxRange(int[] arr,int start,int end){

        if(end > start && arr == null){
            return -1;
        }

//
        int max = arr[start];
        for (int i = start;i<end;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    // Imagine that arr is not empty
    static int max(int[] arr){
//        int max = Integer.MIN_VALUE;   // if the array is empty
        int max = arr[0];
        for (int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
