package bitManipulation;

public class Insertion {
    public static long updateBits(int n, int m, int i, int j) {

        int allOnes = ~0;
        int left = allOnes << (j + 1);
        int right = ((1 << i) - 1);

        int mask = left | right;

        int n_cleared = n & mask;
        int m_shifted = m << i;
        return n_cleared | m_shifted;
    }

    public static void main(String[] args) {
        int n =1000000000;
        int m=1011;
        int i= 2;
        int j=6;
        System.out.println(updateBits(n,m,i,j));
    }
}
