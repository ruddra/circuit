/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuit;

/**
 *
 * @author arnabkumarshil
 */
/*interface*/
abstract class Circuit {
    public abstract boolean getResult();
    
}

abstract class BinaryGate extends Circuit {

    protected Circuit left;
    protected Circuit right;

    public void setOperand(Circuit left, Circuit right) {
        this.left = left;
        this.right = right;
    }

}

abstract class Unary extends Circuit {

    protected Circuit left;
    protected boolean value;

    public void setOperand(Circuit left) {
        this.left = left;
    } 

}

class Not extends Unary {

    
    public boolean getResult() {
        return !this.left.getResult();
    }

}

class And extends BinaryGate {

    public boolean getResult() {
        return this.left.getResult() && this.right.getResult();
    }

}

class Or extends BinaryGate {

    public boolean getResult() {
        return this.left.getResult() || this.right.getResult();
    }

}

class Constant extends Circuit {
	private boolean operand;

    public boolean getResult() {
        return operand;
    }

    public void setValue(boolean val) {
        this.operand = val;
    }
}