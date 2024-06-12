package View;

import static OtherFunctions.DataValidation.calculateNifLetter;
import static OtherFunctions.DataValidation.validateNifNumber;
import static OtherFunctions.DataValidation.validateNameLetter;
import java.awt.dnd.DropTarget;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jdatepicker.DateModel;
import org.jdatepicker.JDatePicker;

/**
 * @author Francesc Perez
 * @version 1.1.0
 */
public class Insert extends javax.swing.JDialog {

    public Insert(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        DropPhotoListener d = new DropPhotoListener(photo, this);
        DropTarget dropTarget = new DropTarget(photo, d);
        insert.setEnabled(false);
        pack();
    }

    public JButton getReset() {
        return reset;
    }

    public JButton getInsert() {
        return insert;
    }

    public JTextField getNam() {
        return name;
    }

    public JDatePicker getDateOfBirth() {
        return dateOfBirth;
    }

    public JTextField getNif() {
        return nif;
    }

    public JLabel getPhoto() {
        return photo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        insert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        photo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nif = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateOfBirth = new org.jdatepicker.JDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Insert - People v1.1.0");
        setMinimumSize(new java.awt.Dimension(810, 280));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        insert.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        insert.setText("INSERT");
        insert.setMaximumSize(new java.awt.Dimension(187, 33));
        insert.setMinimumSize(new java.awt.Dimension(187, 33));
        insert.setPreferredSize(new java.awt.Dimension(187, 33));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        getContentPane().add(insert, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Name");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 22));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 22));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        getContentPane().add(jLabel1, gridBagConstraints);

        name.setMaximumSize(new java.awt.Dimension(400, 22));
        name.setMinimumSize(new java.awt.Dimension(400, 22));
        name.setPreferredSize(new java.awt.Dimension(400, 22));
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 24);
        getContentPane().add(name, gridBagConstraints);

        reset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reset.setText("RESET");
        reset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reset.setMaximumSize(new java.awt.Dimension(187, 33));
        reset.setMinimumSize(new java.awt.Dimension(187, 33));
        reset.setPreferredSize(new java.awt.Dimension(187, 33));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 24);
        getContentPane().add(reset, gridBagConstraints);

        photo.setBackground(new java.awt.Color(255, 255, 255));
        photo.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setText("<html><center>PHOTO</center></br><br><center> <i>Supported formats: .GIF, .PNG, .JFIF, .JPG</i></center></br><br><center><i>Maximum size 64KB</i></center></html>");
        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        photo.setMaximumSize(new java.awt.Dimension(150, 135));
        photo.setMinimumSize(new java.awt.Dimension(150, 135));
        photo.setPreferredSize(new java.awt.Dimension(150, 135));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 24, 12, 12);
        getContentPane().add(photo, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("NIF");
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 22));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 22));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 12, 12, 12);
        getContentPane().add(jLabel5, gridBagConstraints);

        nif.setMaximumSize(new java.awt.Dimension(400, 22));
        nif.setMinimumSize(new java.awt.Dimension(400, 22));
        nif.setPreferredSize(new java.awt.Dimension(400, 22));
        nif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nifKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nifKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nifKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 12, 12, 24);
        getContentPane().add(nif, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Date of Birth");
        jLabel8.setMaximumSize(new java.awt.Dimension(150, 22));
        jLabel8.setMinimumSize(new java.awt.Dimension(150, 22));
        jLabel8.setPreferredSize(new java.awt.Dimension(150, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        getContentPane().add(jLabel8, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 8)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Author: francesc.perez@stucom.com - Version 1.1.0");
        jLabel2.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(12, 24, 12, 24);
        getContentPane().add(jLabel2, gridBagConstraints);

        dateOfBirth.setMaximumSize(new java.awt.Dimension(350, 22));
        dateOfBirth.setMinimumSize(new java.awt.Dimension(350, 22));
        dateOfBirth.setPreferredSize(new java.awt.Dimension(350, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 24);
        getContentPane().add(dateOfBirth, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
        if (!validateNameLetter(evt.getKeyChar()) && evt.getKeyCode() != KeyEvent.VK_UP
                && evt.getKeyCode() != KeyEvent.VK_DOWN && evt.getKeyCode() != KeyEvent.VK_LEFT
                && evt.getKeyCode() != KeyEvent.VK_RIGHT && evt.getKeyCode() != KeyEvent.VK_SHIFT
                && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != KeyEvent.VK_DELETE) {
            JOptionPane.showMessageDialog(this, "Type only uppercase or lowercase letters, hyphens, and whitespace.", "Insert - People v1.0", JOptionPane.ERROR_MESSAGE);
            int posDelete = name.getText().indexOf(evt.getKeyChar());
            StringBuilder newName = new StringBuilder(name.getText());
            name.setText(newName.deleteCharAt(posDelete).toString());
        } else if (validateNameLetter(evt.getKeyChar()) || evt.getKeyCode() != KeyEvent.VK_BACK_SPACE || evt.getKeyCode() != KeyEvent.VK_DELETE) {
            showInsert();
        }
    }//GEN-LAST:event_nameKeyPressed

    private void nifKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nifKeyPressed
        if (nif.isEditable()) {
            if (!validateNifNumber(evt.getKeyChar()) && evt.getKeyCode() != KeyEvent.VK_UP
                    && evt.getKeyCode() != KeyEvent.VK_DOWN && evt.getKeyCode() != KeyEvent.VK_LEFT
                    && evt.getKeyCode() != KeyEvent.VK_RIGHT && evt.getKeyCode() != KeyEvent.VK_SHIFT
                    && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != KeyEvent.VK_DELETE) {
                JOptionPane.showMessageDialog(this, "Type only numbers [0-9].", "Insert - People v1.0", JOptionPane.ERROR_MESSAGE);
                int posDelete = nif.getText().indexOf(evt.getKeyChar());
                StringBuilder newNif = new StringBuilder(nif.getText());
                nif.setText(newNif.deleteCharAt(posDelete).toString());
            }
        }
    }//GEN-LAST:event_nifKeyPressed

    private void nifKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nifKeyReleased
        if (nif.getText().length() == 8) {
            nif.setText(calculateNifLetter(nif.getText()));
            nif.setEditable(false);
            showInsert();
        }
    }//GEN-LAST:event_nifKeyReleased

    private void showInsert() {
        if (!name.getText().isEmpty() && !nif.isEditable()) {
            insert.setEnabled(true);
        } else {
            insert.setEnabled(false);
        }
    }

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        name.setText("");
        nif.setEditable(true);
        nif.setText("");
        insert.setEnabled(false);
        //We reset the calendar date to the current date ...
        LocalDate dateLocate = LocalDate.now();
        ZoneId systemTimeZone = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = dateLocate.atStartOfDay(systemTimeZone);
        Date dateUtil = java.sql.Date.from(zonedDateTime.toInstant());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateUtil);
        DateModel<Calendar> dateModel = (DateModel<Calendar>) dateOfBirth.getModel();
        dateModel.setValue(calendar);
        //... but do not display it in the JDatePicker box
        dateOfBirth.getModel().setValue(null);
        photo.setIcon(null);
    }//GEN-LAST:event_resetActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        showInsert();
    }//GEN-LAST:event_nameKeyReleased

    /**
     * En el evento KeyTyped el evt.getKeyCode siempre es 0 y no se conoce la
     * tecla pulsada. Calcula automaticamente la letra del NIF si pulso la 
     * tecla numerica de forma continua
     * @param evt
     */
    private void nifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nifKeyTyped
        if (nif.getText().length() == 8) {
            nif.setText(calculateNifLetter(nif.getText()));
            nif.setEditable(false);
            showInsert();
        }

    }//GEN-LAST:event_nifKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdatepicker.JDatePicker dateOfBirth;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nif;
    private javax.swing.JLabel photo;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
