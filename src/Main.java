public class Main {
    public static void main(String args[]){
    int[] nums = {12,32,33,11,53,231,54,56};
    int target = 333;
    int ans = linearSearch(nums,target);
    System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target){

        // if array is null
        if(arr.length == 0){
            return -1;
        }

        // loop through the array for searching element or target
        for(int i =0; i < arr.length ; i++){
            if(target == arr[i]){
                return i;
            }
        }

        // if the element or target is not present return -1
        return -1;

    }
}
