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
    
    public Gte getGte(Circuit left, Circuit right) {
        Gte gte = new Gte();
        gte.setOperand(left, right);
        return gte;
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
    
    public Constant getConstant(boolean value) {
        Constant constant = new Constant();
        constant.setValue(value);
        return constant;
    }
    
    public Constant getDoubleConstant(boolean type, double value) throws CircuitInputException {
        Constant constant = new Constant();
        try {
            constant.setDoubleValue(type, value);
        } catch (CircuitInputException e) {
            throw e;
        }
        
        return constant;
    }
    
    public Constant getBooleanConstant(boolean type, boolean value) throws CircuitInputException {
        Constant constant = new Constant();
        try {
            constant.setBoolValue(type, value);
        } catch (CircuitInputException e) {
            throw e;
        }
        
        return constant;
    }

}
