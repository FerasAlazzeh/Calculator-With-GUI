
import java.lang.*;

public class Bang extends Operator {

    public int priority() {

        return 4;

    }

    public Operand execute(Operand op1, Operand op2) {

        int sum;
        sum = (int) Math.pow(op1.getValue(), op2.getValue());
        Operand solution = new Operand(sum);
        return solution;

    }

    public Operand execute(Operand op1) {

        return op1;

    }

}
