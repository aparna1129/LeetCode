class Solution {
    public int minBitFlips(int start, int goal) {
        return countSetBits(start ^ goal);
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }
}