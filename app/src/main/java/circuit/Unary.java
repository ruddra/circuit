/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuit;

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

}
