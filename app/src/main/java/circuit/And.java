/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuit;

/**
 *
 * @author arnabkumarshil
 */
public class And extends Binary {

    @Override
    public boolean getResult() {
        return this.left.getResult() && this.right.getResult();
    }

    @Override
    public double getDoubleResult() {
        return left.getDoubleResult() * right.getDoubleResult();
    }

}
