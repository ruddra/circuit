/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuit;

/**
 *
 * @author arnabkumarshil
 */

public class Gte extends Binary {

    public boolean getResult() {
        return this.left.getDoubleResult() >= this.right.getDoubleResult();
    }
    
    public double getDoubleResult() {
        boolean val = this.getResult();
        if (val == true){
            return 1.0;
        } else {
            return 0.0;
        }
    }

}