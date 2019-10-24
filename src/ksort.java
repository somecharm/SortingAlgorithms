public class ksort {
    public String[] items;

    public ksort() {
        items = new String[8 * 10 * 10];
    }

    public int index(String s) {
        char A = s.charAt(0);
        char M = s.charAt(1);
        char N = s.charAt(2);

        if (A >= 'a' && A <= 'h' && M >= '0' && M <= '9' && N >= '0' && N <= '9') {
            return (A - 'a') * 100 + (M - '0') * 10 + (N - '0');
        }
        return -1;
    }

    public boolean add(String s) {
        int index = index(s);
        if (index >= 0) {
            items[index] = s;
            return true;
        }
        return false;
    }
}
