class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0;
        int left = 0;
        int right = 0;
        Map<Integer,Integer> map = new HashMap<>();
        while(right < fruits.length){
            map.put(fruits[right],map.getOrDefault(fruits[right], 0) + 1);
            if(map.size() > 2){
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if(map.get(fruits[left]) == 0){
                    map.remove((fruits[left]));
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}