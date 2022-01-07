/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuit;

/**
 *
 * @author arnabkumarshil
 */
public class Constant extends Circuit {

    private boolean operand;
    private double doubleValue;

    public boolean getResult() {
        return operand;
    }

    public void setValue(boolean val) {
        try{
            this.setBoolValue(true, val);
        } catch (CircuitInputException e)
        {
            // do nothing
        }
    }

    @Override
    public double getDoubleResult() {
        return doubleValue;
    }
    
    public void setBoolValue(boolean boolType, boolean dval) throws CircuitInputException {

        if (boolType) {
            if (dval == true) {
                this.doubleValue = 1.0;
            } else {
                this.doubleValue = 0.0;
            }
            this.operand = dval;
            
        }
        else  {
            throw new CircuitInputException("invalid type value");
        }

    }

    public void setDoubleValue(boolean boolType, double dval) throws CircuitInputException {

        if (!boolType && dval >= 0.0 && dval <= 1.0) {
            this.doubleValue = dval;
            if (dval == 1.0) {
                this.operand = true;
            } else {
                this.operand = false;
            }
            
        } else if (boolType) {
            throw new CircuitInputException("input type value should be false");
        }
        else  {
            throw new CircuitInputException("out of bounds: " + dval);
        }

    }
}
