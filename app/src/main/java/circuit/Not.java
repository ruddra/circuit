/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuit;

/**
 *
 * @author arnabkumarshil
 */
public class Not extends Unary {

    public boolean getResult() {
        return !this.left.getResult();
    }

    public double getDoubleResult() {
        return 1 - this.left.getDoubleResult();
    }

}
