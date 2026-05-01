class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int answer = 0;
        while(i < j){
            int h1 = heights[i];
            int h2 = heights[j];
            int area;
            int height;
            if(h1 > h2){
                area = h2 * (j-i);
                answer = area > answer ? area : answer;
                j--;
            }else{
                area = h1 * (j-i);
                answer = area > answer ? area : answer;
                i++;
            }
            
        }
        return answer;
    }
}
