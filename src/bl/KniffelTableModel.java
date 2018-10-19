
package bl;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class KniffelTableModel extends AbstractTableModel {
    
    private ArrayList<KniffelEntry> entries = new ArrayList<>();
    private String[] colNames = {"Spiel", "Wahl", "Punkte"};
    
    public void addEntry(KniffelEntry ke) {
        entries.add(ke);
        fireTableRowsInserted(entries.size() - 1, entries.size() - 1);
    }

    @Override
    public int getRowCount() {
        return entries.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        KniffelEntry ke = entries.get(rowIndex);
        return ke;
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }
    
}