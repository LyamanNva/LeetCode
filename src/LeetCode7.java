class LeetCode7 {
    public int reverse(int x) {
        int k = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            x /= 10;

            if (k > Integer.MAX_VALUE / 10 || (k == Integer.MAX_VALUE / 10 && lastDigit > 7))
                return 0;
            if (k < Integer.MIN_VALUE / 10 || (k == Integer.MIN_VALUE / 10 && lastDigit < -8))
                return 0;

            k = k * 10 + lastDigit;
        }
        return k;
    }
}
