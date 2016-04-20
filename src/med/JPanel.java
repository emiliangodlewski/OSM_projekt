/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package med;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JPanel extends javax.swing.JPanel {
    List pacjenci = new ArrayList();
    boolean dodawanie = false;
    boolean edycja = false;
    int nrPacjenta = 0;
    PacjenciTableModel model = new PacjenciTableModel(pacjenci);

    public JPanel() {
        initComponents();
        jButton1.setEnabled(dodawanie);
        jTable1.setModel(model);
        jPanel1.setVisible(false);
        jButton2.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        jLabel7 = new JLabel();
        jLabel4 = new JLabel();
        jDialog1 = new JDialog();
        buttonGroup3 = new ButtonGroup();
        buttonGroup4 = new ButtonGroup();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel5 = new JLabel();
        jComboBox1 = new JComboBox();
        jLabel6 = new JLabel();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jLabel13 = new JLabel();
        jSeparator1 = new JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new JLabel();
        jRadioButton4 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jButton6 = new JButton();
        jButton3 = new JButton();
        jLabel9 = new JLabel();
        jRadioButton5 = new JRadioButton();
        jRadioButton6 = new JRadioButton();
        jLabel8 = new JLabel();
        jRadioButton7 = new JRadioButton();
        jRadioButton8 = new JRadioButton();
        jDateChooser1 = new JDateChooser();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();

        jLabel7.setText("jLabel7");

        jLabel4.setText("jLabel4");

        GroupLayout jDialog1Layout = new GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setMinimumSize(new Dimension(800, 400));
        setPreferredSize(new Dimension(800, 400));

        jTable1.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setToolTipText("");

        jLabel1.setText("Imię");

        jLabel2.setText("Nazwisko");
        jLabel2.setToolTipText("");

        jLabel3.setText("PESEL");

        jLabel5.setText("Płeć");

        jComboBox1.setModel(new DefaultComboBoxModel(new String[] { "", "NFZ", "Prywatne", "Brak" }));
        jComboBox1.setToolTipText("");

        jLabel6.setText("Ubezpieczenie");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Kobieta");
        jRadioButton1.setActionCommand("K");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Mężczyzna");
        jRadioButton2.setActionCommand("M");

        jButton1.setText("zapisz");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("usuń");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("dodaj");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("anuluj");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel13.setText("Dane pacjenta");

        jSeparator1.setBackground(new Color(240, 240, 240));
        jSeparator1.setForeground(new Color(240, 240, 240));
        jSeparator1.setOrientation(SwingConstants.VERTICAL);

        jLabel10.setText("Antygen HBS");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Negatywny");
        jRadioButton4.setActionCommand("0");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Pozytywny");
        jRadioButton3.setActionCommand("1");

        jButton6.setText("anuluj");
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton3.setText("zapisz");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setText("Przeciwciała HIV");
        jLabel9.setAutoscrolls(true);

        buttonGroup3.add(jRadioButton5);
        jRadioButton5.setText("Pozytywny");
        jRadioButton5.setActionCommand("1");

        buttonGroup3.add(jRadioButton6);
        jRadioButton6.setText("Negatywny");
        jRadioButton6.setActionCommand("0");

        jLabel8.setText("Przeciwciała HCV");

        buttonGroup4.add(jRadioButton7);
        jRadioButton7.setText("Pozytywny");
        jRadioButton7.setActionCommand("1");

        buttonGroup4.add(jRadioButton8);
        jRadioButton8.setText("Negatywny");
        jRadioButton8.setActionCommand("0");

        jLabel11.setText("Badanie");

        jLabel12.setText("Data");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel10)
                                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jRadioButton7)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton8))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jRadioButton3)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton4))
                                .addComponent(jDateChooser1, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jRadioButton5)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton6))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jButton3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton6)))
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(jDateChooser1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jRadioButton3)
                        .addComponent(jRadioButton4))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton5)
                        .addComponent(jRadioButton6))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jRadioButton7)
                        .addComponent(jRadioButton8))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton6))
                    .addContainerGap()))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2))
                                    .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1, GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton2)))
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jLabel5))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton5))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String info = "";
        boolean blad = false;
        
        if(jTextField1.getText().isEmpty() && !edycja)
        {
            info += "Uzupełnij imię";
            blad = true;
        }
        if(jTextField2.getText().isEmpty() && !edycja)
        {
            info +="Uzupełnij nazwisko\n";
            blad = true;
        }
        if(jTextField3.getText().isEmpty() && !edycja)
        {
            info+="Uzupełnij pesel\n";
            blad = true;
        }
        if(!jTextField3.getText().isEmpty() && !edycja)
        {
            String pesel = jTextField3.getText();
            for(int i =0; i<pacjenci.size();i++)
            {
                Pacjent pac = new Pacjent();
                pac = (Pacjent) pacjenci.get(i);
                String pesel2 = pac.getPesel();
                if(pesel.equals(pesel2))
                {
                    info +="Pacjent o podanym numerze PESEL już istnieje\n";
                    blad = true;
                }
            }
        }
        if(!jTextField3.getText().isEmpty() && edycja)
        {
            String pesel = jTextField3.getText();
            for(int i =0; i<pacjenci.size();i++)
            {
                Pacjent pac = new Pacjent();
                pac = (Pacjent) pacjenci.get(i);
                String pesel2 = pac.getPesel();
                if(pesel.equals(pesel2))
                {
                    if(i==nrPacjenta)
                        break;
                    else
                    {
                    info +="Pacjent o podanym numerze PEESL już istnieje\n";
                    blad = true;
                
                    }
                }
            }
        }
        if(buttonGroup1.getSelection() == null  && !edycja)
        {
            info += "Wybierz płeć\n";
            blad = true;
        }
        if(jComboBox1.getSelectedItem().toString() == ""  && !edycja)
        {
            info+="Podaj informację o ubezpieczeniu\n";
            blad = true;
        }
        
        if(blad == true && dodawanie == true || blad == true && edycja == true)
        {
              JOptionPane.showMessageDialog(jDialog1, info);
              
        }
        else if(blad == false  && dodawanie == true) //stworzenie nowego pacjenta
        {
            Pacjent pac = new Pacjent();
            pac.setImie(jTextField1.getText());
            pac.setNazwisko(jTextField2.getText());
            pac.setPesel(jTextField3.getText());
            pac.setPlec(buttonGroup1.getSelection().getActionCommand());
            pac.setUbezpieczenie(jComboBox1.getSelectedItem().toString()); 
            pacjenci.add(pac);
            model.fireTableDataChanged();
            dodawanie = false;
            jButton1.setEnabled(dodawanie);
            czyszczenie();
            jButton4.setEnabled(true);
        }
        else if(blad == false  && edycja == true) //edycja istniej�cego pacjenta
        {
            Pacjent pac = new Pacjent();
            pac = (Pacjent) pacjenci.get(nrPacjenta);
            pac.setImie(jTextField1.getText());
            pac.setNazwisko(jTextField2.getText());
            pac.setPesel(jTextField3.getText());
            pac.setPlec(buttonGroup1.getSelection().getActionCommand());
            pac.setUbezpieczenie(jComboBox1.getSelectedItem().toString());  
            model.fireTableDataChanged();
            edycja = false;
            jButton1.setEnabled(edycja);
            czyszczenie();
            jButton4.setEnabled(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    //usuwanie pacjenta
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String info = "";
       boolean blad = false;
       int wiersz = jTable1.getSelectedRow();
      if(wiersz == -1)
      {
       info += "Nie wybrano rekordu";
       blad = true;
      }
      if(blad)
      {
          JOptionPane.showMessageDialog(jDialog1, info);
      }
      else
      {
        System.out.println(pacjenci.get(wiersz));
       pacjenci.remove(wiersz);
       model.fireTableDataChanged();
       czyszczenie();
      }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    //dodaj
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dodawanie = true;
        edycja = false;
        jButton1.setEnabled(dodawanie);
    }//GEN-LAST:event_jButton4ActionPerformed
    
    //anuluj
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        czyszczenie();
        dodawanie = false;
        jButton4.setEnabled(true);
        jTable1.clearSelection();
        jButton1.setEnabled(dodawanie);
    }//GEN-LAST:event_jButton5ActionPerformed

    //obsługa wcisniecia rekordu w tabeli, wypelnienie pól w formularzach
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       jButton2.setEnabled(true);
       czyszczenie();
       jButton4.setEnabled(false);
       int wiersz = jTable1.getSelectedRow();
       nrPacjenta = wiersz;
       Pacjent pac = new Pacjent();
       if(wiersz != -1)
       {
            pac = (Pacjent) pacjenci.get(wiersz);
            jTextField1.setText(pac.getImie());
            jTextField2.setText(pac.getNazwisko());
            jTextField3.setText(pac.getPesel());
            String plec = pac.getPlec();
            if(plec == "K")
                jRadioButton1.setSelected(true);
            else if(plec == "M")
                jRadioButton2.setSelected(true);
            jComboBox1.setSelectedItem(pac.getUbezpieczenie());
            if(pac.isBadanie())
            {
                jDateChooser1.setDate(pac.getData());
                if(pac.isHbs())
                    jRadioButton3.setSelected(true);
                else
                    jRadioButton4.setSelected(true);
                if(pac.isHiv())
                    jRadioButton5.setSelected(true);
                else
                    jRadioButton6.setSelected(true);
                if(pac.isHcv())
                    jRadioButton7.setSelected(true);
                else
                    jRadioButton8.setSelected(true);
            }
            edycja = true;
            jButton1.setEnabled(edycja);
       }
       jPanel1.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    //zapisanie informacji o badaniach
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String info = "";
        Date data = jDateChooser1.getDate();
        boolean badania = false;
        boolean blad = false;
        Pacjent pac = new Pacjent();
        pac = (Pacjent) pacjenci.get(nrPacjenta);
        if(data != null)
        {
            if(buttonGroup2.getSelection() == null  || buttonGroup3.getSelection() == null || buttonGroup4.getSelection() == null )
            {
                info += "Podaj wyniki badań\n";
                blad = true;
            }
            if(buttonGroup2.getSelection() != null  || buttonGroup3.getSelection() != null || buttonGroup4.getSelection() != null )
            {
                badania = true;
            }
        }
        if(data == null && (buttonGroup2.getSelection() != null  || buttonGroup3.getSelection() != null || buttonGroup4.getSelection() != null) )
        {
            if(buttonGroup2.getSelection() == null  || buttonGroup3.getSelection() == null || buttonGroup4.getSelection() == null )
            {
                info += "Podaj datę wykonania badań\n";
                blad = true;
            }
        }
        if(blad == true)
        {
            JOptionPane.showMessageDialog(jDialog1, info);
        }
        if(blad != true && data == null && buttonGroup2.getSelection() == null  && buttonGroup3.getSelection() == null && buttonGroup4.getSelection() == null )
        {   //usuniecie informacji o badaniu
            pac.setData(null);
            pac.setHbs(null);
            pac.setHiv(null);
            pac.setHcv(null);
            pac.setBadanie(false);
            model.fireTableDataChanged();
        } else if (blad !=true)
        {
        pac.setData(jDateChooser1.getDate());
        String hbs = buttonGroup2.getSelection().getActionCommand();
        if(hbs == "1")
        pac.setHbs(true);
        else
        pac.setHbs(false);
        String hiv = buttonGroup3.getSelection().getActionCommand();
        if(hiv == "1")
        pac.setHiv(true);
        else
        pac.setHiv(false);
        String hcv = buttonGroup4.getSelection().getActionCommand();
        if(hcv == "1")
        pac.setHcv(true);
        else
        pac.setHcv(false);
        pac.setBadanie(true);
        model.fireTableDataChanged();
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    //anuluj
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        jDateChooser1.setCalendar(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    //czyszczenie formularza z danymi pacjenta
    private void czyszczenie()
    {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        buttonGroup1.clearSelection();
        jComboBox1.setSelectedItem("");
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        jDateChooser1.setCalendar(null);
        jPanel1.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
