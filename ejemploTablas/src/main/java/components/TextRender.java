/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author oscar
 */
public class TextRender extends DefaultTableCellRenderer{

    public TextRender() {
        super();
    }
   
    public void setValue(Object value) {
        setText((value == null) ? "" : value+" JJJJ");
    }
    
    
}
