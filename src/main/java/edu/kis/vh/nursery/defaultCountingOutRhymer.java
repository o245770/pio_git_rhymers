package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int J_INT = 11;

	private static final int TAB_INT = 12;

	private static final int I_INT = -1;

	private int[] NUMBERS = new int[TAB_INT];

    public int total = I_INT;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == I_INT;
        }
        
            public boolean isFull() {
                return total == J_INT;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return I_INT;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return I_INT;
                        return NUMBERS[total--];
                    }

}
