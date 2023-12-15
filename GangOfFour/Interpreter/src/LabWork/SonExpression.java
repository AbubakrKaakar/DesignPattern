/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabWork;

/**
 *
 * @author sp20-bse-072
 */
public class SonExpression implements Expression{
    
   private Expression Son = null;
   private Expression Father = null;

    public SonExpression(Expression expr1, Expression expr2) { 
      this.Son = expr1;
      this.Father = expr2;
   }   
    @Override
    public boolean interpret(String context) {
        return Son.interpret(context) && Father.interpret(context);
    }
    
}
