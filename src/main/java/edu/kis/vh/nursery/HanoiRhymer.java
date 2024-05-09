package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {
    private static final int CONSTANT_ZERO = 0;
	int totalRejected = CONSTANT_ZERO;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
