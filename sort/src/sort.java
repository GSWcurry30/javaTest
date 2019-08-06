public class sort {

    public static void quickSort(int[] nums,int start,int end)
    {
        int i = start;
        int j = end;
        int key = nums[i];
        while(i<j){
            while(nums[j]>key){
                j--;
            }
            swap(nums,i,j);
            i++;
            while(nums[i]<key){
                i++;
            }
            swap(nums,i,j);
            j--;
        }
        quickSort(nums,start,i);
        quickSort(nums,i+1,end);
    }

    private static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args){
        int[] array = {3,4,2,1,9,8,7};
        String s = "asd";
        System.out.println();
    }
}
