class Solution {
    public boolean isPowerOfAnother(int X, int Y) {
        // code here
        if(X == 1){
            return (Y == 1);
        }
        long pow = 1;
        while(pow < Y){
            pow *= X;
        }
        return (pow == Y);
    }
}
