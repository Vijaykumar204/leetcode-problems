class remove_element {
    public static int removeElement(int nums[],int val){
	int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k++]=nums[i];
            }
        }
              return k;    }
    public static void main(String v[]){
        int[] nums={3,2,2,3};
        int val=3;
       System.out.print(removeElement(nums,val));
    }
}
