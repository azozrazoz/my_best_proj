package ExampleSDP211;

public class AprilItStep implements SDP, SDP2 {
    int A, B;
    @Override
    public void programming(int a, int b) {
        SDP.super.programming(a, b);
        SDP2.super.programming(a,b);
    }
}

interface SDP {
    default void programming(int a, int b) {

    }
}

interface SDP2 {
    default void programming(int a, int b) {

    }
}
