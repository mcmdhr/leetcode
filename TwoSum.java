public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0; i<len; i++){
            map.put(numbers[i], i);
        }
        
        for (int i=0; i<len; i++){
            int one = numbers[i];
            Integer two = map.get(target-one);
            if (two != null && i<two){
                res[0] = i+1;
                res[1] = two+1;
                break;
            }
        }
        return res;
    }
}