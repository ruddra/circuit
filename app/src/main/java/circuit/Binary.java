/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuit;

/**
 *
 * @author arnabkumarshil
 */
public abstract class Binary extends Circuit {

    protected Circuit left;
    protected Circuit right;

    public void setOperand(Circuit left, Circuit right) {
        this.left = left;
        this.right = right;
    }

}
