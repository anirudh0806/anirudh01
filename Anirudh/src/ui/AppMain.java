/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;


/**
 *
 * @author Anirudh
 */
public class AppMain extends javax.swing.JFrame {

    /**
     * Creates new form jdesktest
     */
    public AppMain() {
        initComponents();
        try {
			Class.forName("dao.DBUtil");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeDesktop = new javax.swing.JDesktopPane();
        
        jMenuBar1 = new javax.swing.JMenuBar();
        actionsMenu = new javax.swing.JMenu();
        loginMenuItem = new javax.swing.JMenuItem();
        logoutMenuItem = new javax.swing.JMenuItem();
        fundsTransferMenuItem = new javax.swing.JMenuItem();
        customerDefaultMenuItem = new javax.swing.JMenuItem();
        depositMenuItem = new javax.swing.JMenuItem();
        withdrawlMenuItem = new javax.swing.JMenuItem();
        createUserMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout homeDesktopLayout = new javax.swing.GroupLayout(homeDesktop);
        homeDesktop.setLayout(homeDesktopLayout);
        
        homeDesktopLayout.setHorizontalGroup(
            homeDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, Short.MAX_VALUE, Short.MAX_VALUE)
        );
        homeDesktopLayout.setVerticalGroup(
            homeDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, Short.MAX_VALUE, Short.MAX_VALUE)
        );

        actionsMenu.setText("Actions");
        

        loginMenuItem.setText("Login");
        loginMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	menuActionPerformed(evt);
            }
        });
        logoutMenuItem.setText("Logout");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	menuActionPerformed(evt);
            }
        });
        
        fundsTransferMenuItem.setText("Funds Transfer");
        fundsTransferMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	menuActionPerformed(evt);
            }
        });
        
        customerDefaultMenuItem.setText("My Transactions");
        customerDefaultMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	menuActionPerformed(evt);
            }
        });
        
        depositMenuItem.setText("Deposits");
        depositMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	menuActionPerformed(evt);
            }
        });
        
        withdrawlMenuItem.setText("Withdrawls");
        withdrawlMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	menuActionPerformed(evt);
            }
        });
        
        createUserMenuItem.setText("Create User");
        createUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	menuActionPerformed(evt);
            }
        });
        
        actionsMenu.add(loginMenuItem);

        jMenuBar1.add(actionsMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homeDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeDesktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   //GEN-LAST:event_loginMenuItemActionPerformed

    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppMain().setVisible(true);
            }
        });
    }
    
    public void changeMenuForCustomer() {
    	this.actionsMenu.remove(loginMenuItem);
    	this.actionsMenu.add(logoutMenuItem);
    	this.actionsMenu.add(fundsTransferMenuItem);
    	this.actionsMenu.add(customerDefaultMenuItem);
    	
    	removeScreen(LOGIN_SCREEN);
    	addScreen(CUSTOMER_SCREEN);
    }
    
    public void changeMenuForAdmin() {
    	this.actionsMenu.remove(loginMenuItem);
    	this.actionsMenu.add(logoutMenuItem);
    	
    	this.actionsMenu.add(createUserMenuItem);
    	
    	removeScreen(LOGIN_SCREEN);
    	addScreen(ACCOUNT_CREATION_SCREEN);
    }
    
    public void changeMenuForTeller() {
    	this.actionsMenu.remove(loginMenuItem);
    	this.actionsMenu.add(logoutMenuItem);
    	
    	this.actionsMenu.add(depositMenuItem);
    	this.actionsMenu.add(withdrawlMenuItem);
    	
    	removeScreen(LOGIN_SCREEN);
    	addScreen(DEPOSITS_SCREEN);
    }
    
    private void addScreen(int screen) {
    	if(screen == LOGIN_SCREEN  && (loginScreen == null || loginScreen.isVisible() == false)) {
    		loginScreen = new Login();
        	loginScreen.appMain = this;
        	homeDesktop.add(loginScreen);
	        loginScreen.setVisible(true);
    	} else if(screen == CUSTOMER_SCREEN && (customerScreen == null || customerScreen.isVisible() == false)) {
    		customerScreen = new CustomerScreen();
        	homeDesktop.add(customerScreen);
        	customerScreen.setVisible(true);
        	if(fundsTransferScreen!=null) {
        		fundsTransferScreen.addTransactionListener(customerScreen);
        	}
    	} else if(screen == WITHDRAWLS_SCREEN  && (withdrawlScreen == null || withdrawlScreen.isVisible() == false)) {
    		withdrawlScreen = new WithdrawlScreen();
        	homeDesktop.add(withdrawlScreen);
        	withdrawlScreen.setVisible(true);
    	} else if(screen == FUNDS_TRANSFER_SCREEN && (fundsTransferScreen == null || fundsTransferScreen.isVisible() == false)) {
    		fundsTransferScreen = new FundsTransferScreen();
        	homeDesktop.add(fundsTransferScreen);
        	fundsTransferScreen.setVisible(true);
        	if(customerScreen!=null) {
        		fundsTransferScreen.addTransactionListener(customerScreen);
        	}
    	} else if(screen == ACCOUNT_CREATION_SCREEN && (accountCreationScreen == null || accountCreationScreen.isVisible() == false)) {
    		accountCreationScreen = new UserAccntCreation();
        	homeDesktop.add(accountCreationScreen);
        	accountCreationScreen.setVisible(true);
    	} else if(screen == DEPOSITS_SCREEN  && (depositScreen == null || depositScreen.isVisible() == false)) {
    		depositScreen = new DepositScreen();
        	homeDesktop.add(depositScreen);
        	depositScreen.setVisible(true);
    	}
    }
    
    private void removeScreen(int screen) {
    	if(screen == LOGIN_SCREEN && loginScreen != null) {
    		loginScreen.dispose();
    	} else if(screen == CUSTOMER_SCREEN && customerScreen != null) {
    		customerScreen.dispose();
    	} else if(screen == WITHDRAWLS_SCREEN && depositScreen != null) {
    		depositScreen.dispose();
    		
    	} else if(screen == FUNDS_TRANSFER_SCREEN && fundsTransferScreen != null) {
    		fundsTransferScreen.dispose();
    	} else if(screen == ACCOUNT_CREATION_SCREEN && accountCreationScreen != null) {
    		accountCreationScreen.dispose();
    	} else if(screen == DEPOSITS_SCREEN && depositScreen != null) {
    		depositScreen.dispose();
    	}  
    }

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMenuItemActionPerformed
        if(evt.getSource().equals(loginMenuItem)) {
        	addScreen(LOGIN_SCREEN);
        } 
        
        if(evt.getSource().equals(logoutMenuItem)) {
        	removeAllFrames();
        	this.actionsMenu.removeAll();
        	this.actionsMenu.add(loginMenuItem);
        } 
        
        if(evt.getSource().equals(fundsTransferMenuItem)) {
        	addScreen(FUNDS_TRANSFER_SCREEN);
        } 
        
        if(evt.getSource().equals(customerDefaultMenuItem)) {
        	addScreen(CUSTOMER_SCREEN);
        } 
        
        if(evt.getSource().equals(depositMenuItem)) {
        	addScreen(DEPOSITS_SCREEN);
        } 
        
        if(evt.getSource().equals(withdrawlMenuItem)) {
        	addScreen(WITHDRAWLS_SCREEN);
        } 
        if(evt.getSource().equals(createUserMenuItem)) {
        	addScreen(ACCOUNT_CREATION_SCREEN);
        } 
    }
    
    private void removeAllFrames() {
    	removeScreen(LOGIN_SCREEN);
    	removeScreen(CUSTOMER_SCREEN);
    	removeScreen(WITHDRAWLS_SCREEN);
    	removeScreen(FUNDS_TRANSFER_SCREEN);
    	removeScreen(ACCOUNT_CREATION_SCREEN);
    	removeScreen(DEPOSITS_SCREEN);
    }
    
    Login loginScreen = null;
    CustomerScreen customerScreen = null;
    FundsTransferScreen fundsTransferScreen = null;
    DepositScreen depositScreen = null;
    WithdrawlScreen withdrawlScreen = null;
    UserAccntCreation accountCreationScreen = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane homeDesktop;
    private javax.swing.JMenu actionsMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem loginMenuItem;
    
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JMenuItem fundsTransferMenuItem;
    private javax.swing.JMenuItem customerDefaultMenuItem;
    private javax.swing.JMenuItem depositMenuItem;
    private javax.swing.JMenuItem withdrawlMenuItem;
    
    private javax.swing.JMenuItem createUserMenuItem;
    
    
    private static final int LOGIN_SCREEN = 1;
    private static final int CUSTOMER_SCREEN = 2;
    private static final int WITHDRAWLS_SCREEN = 3;
    private static final int FUNDS_TRANSFER_SCREEN = 4;
    private static final int ACCOUNT_CREATION_SCREEN = 5;
    private static final int DEPOSITS_SCREEN = 6;
    
    
    // End of variables declaration//GEN-END:variables
}
