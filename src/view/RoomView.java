/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.RoomCategoryController;
import control.RoomController;
import dto.RoomCategoryDto;
import dto.RoomDto;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author osand
 * 
 */
public class RoomView extends javax.swing.JFrame {

    RoomCategoryController roomCategoryController;
    final RoomController roomController;
    
    public RoomView() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        roomController = new RoomController(); 
        roomCategoryController = new RoomCategoryController();
        loadRoom();
        searchRoomCategory();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textRoomID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btUpdate = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        textFloorArea = new javax.swing.JTextField();
        textBedType = new javax.swing.JComboBox<>();
        textAc = new java.awt.Checkbox();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textAttachedBathroom = new java.awt.Checkbox();
        jLabel9 = new javax.swing.JLabel();
        textFloor = new javax.swing.JComboBox<>();
        btDelete = new javax.swing.JButton();
        CatName = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Room Management ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel5.setText("Room No");

        jLabel2.setText("Floor");

        jLabel6.setText("Bed Type");

        jLabel7.setText("AC");

        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel3.setText("Floor Area");

        textBedType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Thrible" }));
        textBedType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBedTypeActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ddsd.png"))); // NOI18N

        jLabel8.setText("Table");

        jLabel9.setText("Category");

        textFloor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(246, 246, 246))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textFloorArea, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textBedType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textFloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(textAttachedBathroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(CatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(49, 49, 49))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(textRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(185, 185, 185)))))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btDelete)
                        .addGap(27, 27, 27)
                        .addComponent(btUpdate)
                        .addGap(29, 29, 29)
                        .addComponent(btSave)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(textRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textFloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textFloorArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textBedType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(textAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(textAttachedBathroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btUpdate)
                                    .addComponent(btSave)
                                    .addComponent(btDelete)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(CatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        updateRoom();
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        saveRoom();
    }//GEN-LAST:event_btSaveActionPerformed

    private void textBedTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBedTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBedTypeActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        searchRoom();
    }//GEN-LAST:event_tableMouseClicked

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        deleteRoom();
    }//GEN-LAST:event_btDeleteActionPerformed
 
    private void saveRoom(){
    
        try {
                    
           
            RoomDto roomDto = new RoomDto(
                    
                    textRoomID.getText(),
                    Integer.valueOf((String) textFloor.getSelectedItem()),
                    Double.valueOf(textFloorArea.getText()),
                    (String)textBedType.getSelectedItem(),
                    (textAc.getState())?"Yes":"No",
                    (textAttachedBathroom.getState())?"Yes":"No",
                    (String) CatName.getSelectedItem()
            );
            
            
            String result = roomController.saveRoom(roomDto);
            JOptionPane.showMessageDialog(this, result);
            loadRoom();
            clearForm();
           
          
        } catch (Exception ex) {
            
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
   
    
    }

    private void updateRoom(){
    
        try {
                    
           
            RoomDto roomDto = new RoomDto(
                    
                    textRoomID.getText(),
                    Integer.valueOf((String) textFloor.getSelectedItem()),
                    Double.valueOf(textFloorArea.getText()),
                    (String)textBedType.getSelectedItem(),
                    (textAc.getState())?"Yes":"No",
                    (textAttachedBathroom.getState())?"Yes":"No",
                    (String) CatName.getSelectedItem()
                                                                                          
            );
            
            
            String result = roomController.updateRoom(roomDto);
            JOptionPane.showMessageDialog(this, result);
            loadRoom();
            clearForm();
           
          
        } catch (Exception ex) {
            
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
   
    
    }
    
    
    private void deleteRoom(){
    
        try {
                              
            String id = textRoomID.getText();
                    
            String result = roomController.deleteRoom(id);
            JOptionPane.showMessageDialog(this, result);
            loadRoom();
            clearForm();
           
          
        } catch (Exception ex) {
            
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
   
    
    }
    
    private void searchRoom(){
   
   try{
       
           String id = table.getValueAt(table.getSelectedRow(), 0).toString();
           RoomDto roomDto = roomController.serchRoom(id);
           
                    textRoomID.setText(roomDto.getRoomId());
                    textFloor.setSelectedItem(String.valueOf(roomDto.getFloor()));
                    textFloorArea.setText(String.valueOf(roomDto.getFloorArea()));
                    textBedType.setSelectedItem(roomDto.getBedType());
                    
                    if (roomDto.getAc().equals("Yes")){
                        textAc.setState(true);
                    }
                    else{                   
                         textAc.setState(false);
                    }
                                       
                    if (roomDto.getAttachedBathrooms().equals("Yes")){
                        textAttachedBathroom.setState(true);
                    }
                    else{                   
                        textAttachedBathroom.setState(false);
                    }
                    
              
                    CatName.setSelectedItem(roomDto.getCatID());
                    
                                 
       
       }
       catch(Exception ex){
       
           Logger.getLogger(RoomCategoryView.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(this, ex.getMessage());
       
       }
   
   
   }
    
    private void loadRoom(){
       
       String[] columns = {"Room No","Floor","Floor Area","Bed Type","AC","Attached Bathrooms","Category"};
       DefaultTableModel dtm = new DefaultTableModel(columns,0){
       
       @Override
       public boolean isCellEditable(int row, int column) {
                return false;
            }
       
       };
       
       table.setModel(dtm);
   
       try{
       
           List <RoomDto> roomDtoList = roomController.loadRoom();
           
               for(RoomDto d:roomDtoList){
               
               Object[] obj = {d.getRoomId(),d.getFloor(),d.getFloorArea(),d.getBedType(),d.getAc(),d.getAttachedBathrooms(),d.getCatID()};
               dtm.addRow(obj);
               
               }    
          
       
       }
       catch(Exception ex){
       
           Logger.getLogger(RoomCategoryView.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(this, ex.getMessage());
       
       }
       
    }
    
   private void searchRoomCategory(){
       
       DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
       CatName.setModel(comboBoxModel);
       
        try {
            
            List<RoomCategoryDto> list = roomCategoryController.loadCategory();
            for (RoomCategoryDto r:list){
            
            comboBoxModel.addElement(r.getCatName());
            
            }
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(ReservationView.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    
   }
    
    
      
    
    private void clearForm(){
    
        textRoomID.setText("");
        textFloorArea.setText("");
        textAc.setState(false);            
        textAttachedBathroom.setState(false);
                                                                          
    }
       
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CatName;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private java.awt.Checkbox textAc;
    private java.awt.Checkbox textAttachedBathroom;
    private javax.swing.JComboBox<String> textBedType;
    private javax.swing.JComboBox<String> textFloor;
    private javax.swing.JTextField textFloorArea;
    private javax.swing.JTextField textRoomID;
    // End of variables declaration//GEN-END:variables
}
