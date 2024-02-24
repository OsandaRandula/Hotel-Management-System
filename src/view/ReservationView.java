/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.CustomerController;
import control.ReservationController;
import control.RoomCategoryController;
import control.RoomController;
import dto.CustomerDto;
import dto.ReservationDetailsDto;
import dto.ReservationDto;
import dto.RoomCategoryDto;
import dto.RoomDto;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author osand
 */
public class ReservationView extends javax.swing.JFrame {

    CustomerController customerController;
    RoomCategoryController roomCategoryController;
    RoomController roomController;
    ReservationController reservationController;
    
    List<ReservationDetailsDto> reservationDetailsList = new ArrayList<>();
    
    public ReservationView() {
        initComponents();
        loadTable();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        customerController =new CustomerController();
        roomCategoryController = new RoomCategoryController();
        roomController = new RoomController();
        reservationController = new ReservationController();
        searchRoomCategory();
        getRoomsFromSpecificCategory();
        //MouseListener l;
        
 
        //inDate.setMinSelectableDate(new Date());
        
         SwingUtilities.invokeLater(() -> {
            // Start your always-running operation or thread here
            startAlwaysRunningTask();
        });
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textCustId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btSearchCustomer = new javax.swing.JButton();
        btSearchRoomType2 = new javax.swing.JButton();
        btSearchRoomType3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        customerDetails1 = new javax.swing.JLabel();
        customerDetails2 = new javax.swing.JLabel();
        packageSelector = new javax.swing.JComboBox<>();
        roomCategory = new javax.swing.JComboBox<>();
        outDate = new com.toedter.calendar.JDateChooser();
        inDate = new com.toedter.calendar.JDateChooser();
        roomSelector = new javax.swing.JComboBox<>();
        textResID = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        customerDetails3 = new javax.swing.JLabel();
        textRoomNo = new javax.swing.JTextField();
        btCancelReservation = new javax.swing.JToggleButton();
        customerDetails4 = new javax.swing.JLabel();
        textCancelRes1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Reservation Management ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setText("Customer ID");

        textCustId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCustIdActionPerformed(evt);
            }
        });

        jLabel3.setText("Room Category");

        jLabel4.setText("Package");

        jLabel5.setText("Room ID");

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
        jScrollPane2.setViewportView(table);

        btSearchCustomer.setText("Search");
        btSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchCustomerActionPerformed(evt);
            }
        });

        btSearchRoomType2.setText("Add");
        btSearchRoomType2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchRoomType2ActionPerformed(evt);
            }
        });

        btSearchRoomType3.setText("Reserve");
        btSearchRoomType3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchRoomType3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Check Out");

        jLabel7.setText("Check In");

        customerDetails2.setText("Reservation ID");

        packageSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FB", "HB", "BB" }));
        packageSelector.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                packageSelectorItemStateChanged(evt);
            }
        });

        roomCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                roomCategoryItemStateChanged(evt);
            }
        });
        roomCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomCategoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roomCategoryMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                roomCategoryMouseReleased(evt);
            }
        });

        outDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outDateMouseClicked(evt);
            }
        });

        inDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inDateMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inDateMousePressed(evt);
            }
        });

        roomSelector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomSelectorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roomSelectorMouseEntered(evt);
            }
        });
        roomSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomSelectorActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        customerDetails3.setText("Reservation No");

        btCancelReservation.setText("Cancel Reservation");
        btCancelReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelReservationActionPerformed(evt);
            }
        });

        customerDetails4.setText("Room No");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(customerDetails3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCancelRes1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(customerDetails4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btCancelReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerDetails3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelReservation)
                    .addComponent(customerDetails4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCancelRes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(roomSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(inDate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(43, 43, 43)
                                            .addComponent(outDate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(customerDetails2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(textResID))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btSearchRoomType2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4)))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(textCustId, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(packageSelector, javax.swing.GroupLayout.Alignment.LEADING, 0, 113, Short.MAX_VALUE)
                                                    .addComponent(roomCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(btSearchRoomType3)
                                                    .addGap(18, 18, 18))))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btSearchCustomer)
                                        .addGap(31, 31, 31)
                                        .addComponent(customerDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerDetails2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textResID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textCustId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearchCustomer)
                    .addComponent(customerDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(roomCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(packageSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(roomSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(outDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSearchRoomType3)
                            .addComponent(btSearchRoomType2)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
       
    }//GEN-LAST:event_tableMouseClicked

    private void btSearchRoomType2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchRoomType2ActionPerformed
        addRoom();
    }//GEN-LAST:event_btSearchRoomType2ActionPerformed

    private void btSearchRoomType3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchRoomType3ActionPerformed
        reserveRooms();
    }//GEN-LAST:event_btSearchRoomType3ActionPerformed

    private void btSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchCustomerActionPerformed
        searchCustomer();
    }//GEN-LAST:event_btSearchCustomerActionPerformed

    private void roomSelectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomSelectorMouseClicked
        
    }//GEN-LAST:event_roomSelectorMouseClicked

    private void roomSelectorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomSelectorMouseEntered
        
    }//GEN-LAST:event_roomSelectorMouseEntered

    private void roomCategoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomCategoryMouseEntered
        
    }//GEN-LAST:event_roomCategoryMouseEntered

    private void roomCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomCategoryMouseClicked
       
    }//GEN-LAST:event_roomCategoryMouseClicked

    private void roomCategoryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomCategoryMouseReleased
        
    }//GEN-LAST:event_roomCategoryMouseReleased

    private void packageSelectorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_packageSelectorItemStateChanged
        
    }//GEN-LAST:event_packageSelectorItemStateChanged

    private void roomCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_roomCategoryItemStateChanged
       getRoomsFromSpecificCategory();
    }//GEN-LAST:event_roomCategoryItemStateChanged

    private void inDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inDateMouseClicked
        
  
        //inDate.setMinSelectableDate(new Date());
        
    }//GEN-LAST:event_inDateMouseClicked

    private void outDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outDateMouseClicked
        /*
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inDate.getDate());
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        outDate.setMinSelectableDate(calendar.getTime());*/
        
    }//GEN-LAST:event_outDateMouseClicked

    private void inDateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inDateMousePressed
        
              
        
        
    }//GEN-LAST:event_inDateMousePressed

    private void textCustIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCustIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCustIdActionPerformed

    private void roomSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomSelectorActionPerformed

    private void btCancelReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelReservationActionPerformed
       deleteReservation();
    }//GEN-LAST:event_btCancelReservationActionPerformed

   private void searchCustomer() {
    
    try {
            
            String id = textCustId.getText();
            CustomerDto customerDto = customerController.getCustomer(id);
            
            if(customerDto!=null){
            
            customerDetails1.setText(customerDto.getDesignation()+". "+customerDto.getFirstName()+" "+customerDto.getLastName());
            }
            
            else{
            
              customerDetails1.setText("Invalid Customer");
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Invalid Customer");
       
        }
    
    
    
    }
   
   private void getRoomsFromSpecificCategory(){
   
   
       DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
       roomSelector.setModel(comboBoxModel);
       String category = (String) roomCategory.getSelectedItem();
       
       try {
            
           
           List<RoomDto> list = roomController.getRoomsFromSpecificCategory(category);
           
           for (RoomDto r:list){
            
            comboBoxModel.addElement(r.getRoomId());
            
            
           }
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(ReservationView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
   
 
   
   
   
   }
   
   private void searchRoomCategory(){
       
       DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
       roomCategory.setModel(comboBoxModel);
       
        try {
            
            List<RoomCategoryDto> list = roomCategoryController.loadCategory();
            for (RoomCategoryDto r:list){
            
            comboBoxModel.addElement(r.getCatName());
            
            }
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(ReservationView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
       
       
   }
   
   private void addRoom() {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
           
            
            ReservationDetailsDto reservationDetailsDto = new ReservationDetailsDto();
            
        
            reservationDetailsDto.setRoomId((String) roomSelector.getSelectedItem());       
            reservationDetailsDto.setInDate(inDate.getDate());
            reservationDetailsDto.setOutDate(outDate.getDate());
            reservationDetailsDto.setPakage((String) packageSelector.getSelectedItem()); 
            reservationDetailsDto.setRoomCategory((String) roomCategory.getSelectedItem());
            
            LocalDate localDateIn = inDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate localDateOut = outDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            long numOfDays = ChronoUnit.DAYS.between(localDateIn,localDateOut);
            double price = reservationController.getPrice(numOfDays,(String) roomCategory.getSelectedItem(),(String) packageSelector.getSelectedItem());
            reservationDetailsDto.setPrice(price);
            
            if(reservationController.roomAvailablity(reservationDetailsDto)){
            
            reservationDetailsList.add(reservationDetailsDto);
           
                     
           Object[] obj = {reservationDetailsDto.getRoomId(),sdf.format(reservationDetailsDto.getInDate()),sdf.format(reservationDetailsDto.getOutDate()),numOfDays,reservationDetailsDto.getPakage(),reservationDetailsDto.getRoomCategory(),price};
           
           DefaultTableModel dtm = (DefaultTableModel) table.getModel();
           dtm.addRow(obj);
            
            }
            
            else {
            
             JOptionPane.showMessageDialog(this, "This room is alredy book in selected period");
            
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ReservationView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
        
   
   }

   private void loadTable(){
   
    String[] columns = {"Room","In Date","Out Date","Days","Package","Category","Price"};
           DefaultTableModel dtm = new DefaultTableModel(columns,0){
       
       @Override
       public boolean isCellEditable(int row, int column) {
                return false;
            }
       
       };
       
       table.setModel(dtm);
       
       table.getColumnModel().getColumn(0).setPreferredWidth(50);
       table.getColumnModel().getColumn(1).setPreferredWidth(100);
       table.getColumnModel().getColumn(2).setPreferredWidth(100);
       table.getColumnModel().getColumn(3).setPreferredWidth(50);
   
   
   }


    private void reserveRooms() {
          
        try {
            ReservationDto reservationDto = new ReservationDto(textResID.getText(), new Date(),Integer.valueOf(textCustId.getText()), reservationDetailsList);
            String result = reservationController.reserve(reservationDto);
            JOptionPane.showMessageDialog(this, result);
            reservationDetailsList.clear();
            cleartext();
            
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            
            int rowCount = dtm.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                    dtm.removeRow(i);
                }
            
            
        } catch (Exception ex) {
            Logger.getLogger(ReservationView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    
    
    
    }
    
     private void deleteReservation() {
        
        
        String resId  = textCancelRes1.getText();
        String roomId = textRoomNo.getText();
        try { 
            
            String result = reservationController.deleteReservation(resId,roomId);
            JOptionPane.showMessageDialog(this, result);
            clearCancelText();
                     
        } catch (Exception ex) {
            Logger.getLogger(ReservationView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
         
           
        
     }
     
     private void cleartext() {
    
        textResID.setText("");
        textCustId.setText("");
    
    }

    private void clearCancelText() {
    
        textCancelRes1.setText("");
        textRoomNo.setText("");
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btCancelReservation;
    private javax.swing.JButton btSearchCustomer;
    private javax.swing.JButton btSearchRoomType2;
    private javax.swing.JButton btSearchRoomType3;
    private javax.swing.JLabel customerDetails1;
    private javax.swing.JLabel customerDetails2;
    private javax.swing.JLabel customerDetails3;
    private javax.swing.JLabel customerDetails4;
    private com.toedter.calendar.JDateChooser inDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser outDate;
    private javax.swing.JComboBox<String> packageSelector;
    private javax.swing.JComboBox<String> roomCategory;
    private javax.swing.JComboBox<String> roomSelector;
    private javax.swing.JTable table;
    private javax.swing.JTextField textCancelRes1;
    private javax.swing.JTextField textCustId;
    private javax.swing.JTextField textResID;
    private javax.swing.JTextField textRoomNo;
    // End of variables declaration//GEN-END:variables

    private void startAlwaysRunningTask() {
    
    Thread alwaysRunningThread = new Thread(() -> {
            while (true) {
               
                inDate.setMinSelectableDate(new Date());
                
                if(inDate.getDate()!=null){
                    
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(inDate.getDate());
                calendar.add(Calendar.DAY_OF_YEAR, 1);
                outDate.setMinSelectableDate(calendar.getTime());
                }
                
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });
        alwaysRunningThread.start();
    
    
    }

      

    
}
