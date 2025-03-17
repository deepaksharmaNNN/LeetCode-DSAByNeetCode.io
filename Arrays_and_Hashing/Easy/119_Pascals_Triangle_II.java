class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ls = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < i + 1; j++){
                list.add(1);
            }
            for(int j = 1; j < i; j++){
                list.set(j, ls.get(i - 1).get(j) + ls.get(i - 1).get(j - 1));
            }
            ls.add(list);
        }
        return ls.get(rowIndex);
    }
}