class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        
        for(int i = 0; i <= nums.length-3; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue; 
            int j = i+1;
            int k = nums.length - 1;
            int first = nums[i];
            while(j < k){
                int second = nums[j];
                int third = nums[k];
                if(-first == second + third){
                    answer.add(List.of(first, second, third));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                
                }else if(-first > second + third){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return answer;
    }
}
