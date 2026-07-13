class Solution {
    public boolean judgeSquareSum(int c) {

        for (long a = 0; a * a <= c; a++) {
            int b = (int) Math.sqrt(c - a * a);

            if ((long)b * b == c - a * a)
                return true;
        }

        return false;
    }
}