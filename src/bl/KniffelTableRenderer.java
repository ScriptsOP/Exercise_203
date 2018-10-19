
package bl;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class KniffelTableRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        KniffelEntry ke = (KniffelEntry) value;
        JLabel label = new JLabel();
        JCheckBox checkbox = new JCheckBox();
        label.setOpaque(true);
        
        switch(column){
            case 0:
                label.setText(ke.getSpiel()); return label;
            case 1:
                checkbox.setSelected(ke.isWahl()); return checkbox;
            case 2:
                label.setText(ke.getPunkte() + ""); return label;
        }
        return label;
    }
    
}
