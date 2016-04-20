
package med;

import java.util.ArrayList;
import static java.util.Collections.list;

import java.util.List;
import javax.swing.table.AbstractTableModel;

// klasa modelujaca tabele
public class PacjenciTableModel extends AbstractTableModel {

    private List pacjenci;
    private String[] columnNames = { "Imię i Nazwisko", "Płeć", "Pesel","Ubezpieczenie","Badanie"};

    public PacjenciTableModel(List lista){
         this.pacjenci = lista;
    }
     
    @Override
    public String getColumnName(int columnIndex){
         return columnNames[columnIndex];
    }
    
    @Override
    public int getRowCount() {
        return pacjenci.size();
    }

    @Override
    public int getColumnCount() {
       return 5;
    }
    
    @Override
    public Class getColumnClass(int column) {
            return getValueAt(0, column).getClass();
            }

    @Override
    public Object getValueAt(int i, int i1) {
        Pacjent liczba = null;
        liczba  = (Pacjent) pacjenci.get(i);
        switch (i1) {
            case 0: 
            {
                String ImieINazwisko = liczba.getImie() + " " + liczba.getNazwisko();
                return ImieINazwisko;
            }
            case 1:
                return liczba.getPlec();
            case 2:
                return liczba.getPesel();
            case 3:
                return liczba.getUbezpieczenie();
            case 4:
                return (Boolean) liczba.isBadanie();
           }
           return null;
    }
    
}
