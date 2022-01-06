/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuit;

/**
 *
 * @author arnabkumarshil
 */
public class CircuitFactory {

    public Circuit circuit;

    public And getAnd(Circuit left, Circuit right) {
        And and = new And();
        and.setOperand(left, right);
        return and;
    }

    public Or getOr(Circuit left, Circuit right) {
        Or or = new Or();
        or.setOperand(left, right);
        return or;
    }

    public Not getNot(Circuit left) {
        Not not = new Not();
        not.setOperand(left);
        return not;
    }

    public Constant getTrueConstant() {
        Constant constant = new Constant();
        constant.setValue(true);
        return constant;
    }

    public Constant getFalseConstant() {
        Constant constant = new Constant();
        constant.setValue(false);
        return constant;
    }

}
