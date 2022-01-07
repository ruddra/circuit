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
        this.operand = val;
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
            throw new CircuitInputException("invalid value");
        }

    }

    public void setDoubleValue(boolean boolType, double dval) throws CircuitInputException {

        if (!boolType && dval >= 0.0 && dval <= 1.0) {
            this.doubleValue = dval;
            
        }
        else  {
            throw new CircuitInputException("out of bounds: " + dval);
        }

    }
}
