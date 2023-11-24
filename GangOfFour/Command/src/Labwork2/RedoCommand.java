/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labwork2;

/**
 *
 * @author SP20-BSE-072
 */
public class RedoCommand extends Command{
    RedoCommand (Editor editor){
    super(editor);
    }
    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
