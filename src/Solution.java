public class Solution {
    public static void main(String[] args){

        int arr[] = {3,8,6,9,45};

        ArrayUtil.sort(arr,new DecComparator() );
        System.out.println("values n array");

        for(int ele : arr){
            System.out.println(ele);
        }
    }
}
