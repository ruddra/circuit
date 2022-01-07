/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuit;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author arnabkumarshil
 */
public abstract class Unary extends Circuit {

    protected Circuit left;
    protected boolean value;

    public void setOperand(Circuit left) {
        this.left = left;
    } 
    
    public Map<Boolean, Boolean> getBooleanOutput() {
        Map<Boolean,Boolean> map=new HashMap<Boolean,Boolean>();
        map.put(true, this.getResult());
        return map;
    }
    
    public Map<Boolean, Double> getDoubleOutput() {
        Map<Boolean,Double> map=new HashMap<Boolean,Double>();
        map.put(false, this.getDoubleResult());
        return map;
    }

}
