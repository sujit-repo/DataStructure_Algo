/**
 *  [1,1,1,2,2,3]   i=3 ele=2 n[i-2]=1
 */

public class lc_80 {

    public static void main(String[] args) {
        lc_80 obj = new lc_80();
        //int[] nums=new int[]{1,1,1,2,2,3};
        //int[] nums=new int[]{};
        //int[] nums=new int[]{0,0,1,1,1,1,2,3,3};
        int[] nums=new int[]{1,2,3};
        int k= obj.removeDuplicates(nums);
        System.out.println(k);
    }

    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int ele: nums){
             if(i==0 || i==1 ||ele!=nums[i-2]){
                 nums[i]=ele;
                 i++;
             }
        }
        return i;
    }
}
