public class StringMaker {

    private static int randomInt(int min, int max) {
        double rand = Math.random();
        double width = max - min + 1;
        double scaled = (rand * width) + min;
        return (int) scaled;
    }

    private int minLength;
    private int maxLength;
    private String allowedChars;
    private int charsLen;

    public StringMaker() {
        this.minLength = 5;
        this.maxLength = 5;
        this.allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        this.charsLen = this.allowedChars.length();
    }

    public StringMaker(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        this.charsLen = this.allowedChars.length();
    }

    public StringMaker(int minLength, int maxLength, boolean alphaOnly) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        if (alphaOnly)
            this.allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        else
            this.allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        this.charsLen = this.allowedChars.length();
    }

    private char getRandomChar() {
        return this.allowedChars.charAt(randomInt(0, this.charsLen-1));
    }

    public String makeString() {
        int length = randomInt(minLength, maxLength);
        String rand = "";
        for(int i = 0; i < length; i++) {
            rand += getRandomChar();
        }
        return rand;
    }
}
