public class lc_27_3 {

    public static void main(String[] args) {
        lc_27_3 obj = new lc_27_3();

        //int[] nums=new int[]{3,2,2,3}; int val=2;
        //int[] nums=new int[]{0,1,2,2,3,0,4,2}; int val=2;
        int[] nums=new int[]{}; int val=0;
        //int[] nums=new int[]{1}; int val=1;
        //int[] nums = new int[]{0, 4, 4, 0, 4, 4, 4, 0, 2}; int val=4;
        //int[] nums = new int[]{3,4,4,2,4,2,4,0,4,4,2}; int val=4;
        System.out.println(obj.removeElement(nums, val));
    }

    public int removeElement(int[] nums, int val) {
        int k = 0;
        int i = 0;
        while(i<nums.length){
            if(nums[i]!=val){
                int temp=nums[i];nums[i]=nums[k];nums[k]=temp;
                k++;
            }
            i++;
        }
        return k;
    }
}
