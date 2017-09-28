/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferasalazzeh
 */
abstract public class Operator {

    abstract public int priority();

    abstract public Operand execute(Operand op1, Operand op2);

    abstract public Operand execute(Operand op1);

    public static boolean check(String token) {

        return token.matches("[-+/*^() ]");

    }

}
