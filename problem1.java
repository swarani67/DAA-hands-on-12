public class DA {
    public int[] A;
    public int n, val;
    public DA() {
        val = 12;
        A = new int[val];
        n = 0;
    }
    public void add(int e) {
        if (n == val) {
            increasevalue();
        }
        A[n++] = e;
    }
    public int get(int idx) {
        if (idx < 0 || idx >= n) {
            throw new IndexOutOfBoundsException("The array exceeds its size");
        }
        return A[idx];
    }
    public int n() {
        return n;
    }
    private void increasevalue() {
        int newvalue = val * 2;
        int[] newArray = new int[newvalue];
        System.arraycopy(A, 0, newArray, 0, n);
        A = newArray;
        val = newvalue;
    }
    public static void main(String[] args) {
        DA dynamicArray = new DA();
        dynamicArray.add(22);
        dynamicArray.add(65);
        dynamicArray.add(3);
        dynamicArray.add(89);
        dynamicArray.add(57);
        System.out.println("Size of an array: " + dynamicArray.n());
        for (int i = 0; i < dynamicArray.n(); i++) {
            System.out.println("Index " + i + ": " + dynamicArray.get(i));
        }
    }
}


OUTPUT:
Size of an array: 5
Index 0: 22
Index 1: 65
Index 2: 3
Index 3: 89
Index 4: 57
