package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int IS_FULL = 11;

	private static final int TAB_INT = 12;

	private static final int DEFAULT_RETURN = -1;

	private int[] NUMBERS = new int[TAB_INT];

    public int total = DEFAULT_RETURN;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == DEFAULT_RETURN;
        }
        
            public boolean isFull() {
                return total == IS_FULL;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return DEFAULT_RETURN;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return DEFAULT_RETURN;
                        return NUMBERS[total--];
                    }

}
