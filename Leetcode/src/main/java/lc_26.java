public class lc_26 {
    public static void main(String[] args) {
        lc_26 obj=new lc_26();
        int[] nums=new int[]{1,1,2};

        System.out.println(obj.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int i=1;int k=0;
        if(nums.length<2) return nums.length;
        while(i<nums.length){
            if(nums[i]!=nums[k]){
                k++;
                //int temp=nums[i];nums[i]=nums[k];nums[k]=temp;
            }
            i++;
        }
        return k+1;
    }
}
