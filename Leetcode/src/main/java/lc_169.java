public class lc_169 {

    public static void main(String[] args) {
        lc_169 obj=new lc_169();
        int[] nums = new int[]{3,2,3};
        //int[] nums = new int[]{2,2,1,1,1,2,2};

        System.out.println(obj.majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        int count=0;
        int curr=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==curr){
                count++;
            } else {
                count--;
            } if(count==0){
                curr=nums[i];
                count++;
            }
        }
        //find real occurrence
        int occ=0;
        for(int e:nums){
            if(e==curr) occ++;
        }
        return occ>nums.length/2 ? curr:0;
    }
}
