class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int carry = 0;

        for (int i = num.length - 1; i >= 0 || k > 0 || carry > 0; i--) {
            int x = i >= 0 ? num[i] : 0;
            int y = k % 10;
            int sum = x + y + carry;

            list.add(sum % 10);
            carry = sum / 10;

            k /= 10;
        }

        // Reverse the list before returning
        Collections.reverse(list);
        return list;
    }
}