class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int studentLikeOne = 0;
        int studentLikeZero = 0;
        for(int ele : students){
            if(ele == 1) studentLikeOne++;
            else studentLikeZero++;
        }
        for(int ele : sandwiches){
            if(ele == 1){
                if(studentLikeOne <= 0) return studentLikeZero;
                studentLikeOne--;
            }else{
                if(studentLikeZero <= 0) return studentLikeOne;
                studentLikeZero--;
            }
        }
        return 0;
    }
}