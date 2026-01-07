// to solve two sum problem there are approaches: -brute force -optimized one

//TWO SUM using Brute force approach
//nums = 2,7,11,15   target = 9
// class Twosum{
//     public static void main(String[] args){
//         int[] nums = {2,7,11,15};
//         int target = 9;
//         for(int i = 0; i < nums.length; i++){
//             for(int j = i+1; j < nums.length; j++){
//                 if(nums[j] == target - nums[i]){
//                     System.out.println("["+i+" "+j+"]");
//                 }
//             }
//         }
//     }
// }
//--------------------------OPTIMIZED APPROACH-----------------//
import java.util.*;

class Twosum {

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            //store current number with its index
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
