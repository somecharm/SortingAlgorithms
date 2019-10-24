public class ksort {
    public String[] items;

    public ksort() {
        items = new String[8 * 10 * 10];
    }

    public int index(String s) {
        char A = s.charAt(0);
        char M = s.charAt(1);
        char N = s.charAt(2);

        if (A >= 97 && A <= 104 && M >= 48 && M <= 57 && N >= 48 && N <= 57) {
            return (A - 97) * 100 + (M - 48) * 10 + (N - 48);
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
