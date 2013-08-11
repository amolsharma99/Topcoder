import java.util.*;

public class JumpFurther {
    public int furthest(int N, int badStep) {
        if (badStep > (N * (N + 1)) / 2)
            return (N * (N + 1) / 2);
        else {
            Integer step =0;
            Integer possibleJump=1;
            for (int i = 0; i < N; i++) {
                if(badStep!=step+possibleJump){
                    step+=possibleJump;
                }
                else{
                    step+=possibleJump-1;
                }
                possibleJump++;
            }
            return step;
        }
    }
}
