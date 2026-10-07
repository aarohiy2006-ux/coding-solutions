class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);

int[] arr = new int[str.length()];

for (int i = 0; i < str.length(); i++) {
    arr[i] = str.charAt(i) - '0';
}
       int original = x;
int reverse = 0;

while (x > 0) {
    int digit = x% 10;
    reverse = reverse * 10 + digit;
    x = x / 10;
}

if( original == reverse){
       return true;
    }
    return false;
    }
}