class Solution {
    public boolean canAliceWin(int n) {
        int x = 10;
        boolean aliceTurn = true;

        while (n >= x) {
            n = n - x;
            x--;

            aliceTurn = !aliceTurn;
        }

        return !aliceTurn;
    }
}