/*在第一次迭代中，我们将每个元素的值和它的索引添加到表中。
然后，在第二次迭代中，我们将检查每个元素所对应的目标元素（target - nums[i]target−nums[i]）是否存在于表中。*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int a=target-nums[i];
            if(map.containsKey(a)&&map.get(a)!=i)
                return new int[]{i,map.get(a)};
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
