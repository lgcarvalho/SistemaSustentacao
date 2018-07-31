/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Toolkit;
import javax.swing.UIManager;

/**
 *
 * @author carvalui
 */
public class PrincipalGUI extends javax.swing.JFrame {
    private static final long serialVersionUID = 3284288548071551856L;

    /**
     * Creates new form TelaPrincipalGUI
     */
    public PrincipalGUI() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        textoUsuario = new javax.swing.JLabel();
        jdpPrincipal = new javax.swing.JDesktopPane();
        menuPrincipal = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuFechar = new javax.swing.JMenuItem();
        menuProdutividade = new javax.swing.JMenu();
        menuAtualizarProdutividade = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuConsultaProdutividade = new javax.swing.JMenuItem();
        menuAnalista = new javax.swing.JMenu();
        itemCadAnalista = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemConAnalista = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SiASu - Sistema de Apoio a Sustentação");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);
        setSize(new java.awt.Dimension(584, 516));

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        textoUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jToolBar1.add(textoUsuario);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_END);

        jdpPrincipal.setBackground(new java.awt.Color(153, 153, 153));
        jdpPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jdpPrincipal.setEnabled(false);
        jdpPrincipal.setFocusCycleRoot(false);
        jdpPrincipal.setFocusable(false);
        jdpPrincipal.setRequestFocusEnabled(false);
        jdpPrincipal.setVerifyInputWhenFocusTarget(false);
        jdpPrincipal.setLayout(new java.awt.GridBagLayout());
        getContentPane().add(jdpPrincipal, java.awt.BorderLayout.CENTER);

        menuPrincipal.setRequestFocusEnabled(false);

        menuArquivo.setText("Arquivo");

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_cadeado_fechado.jpg"))); // NOI18N
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuSair);
        menuArquivo.add(jSeparator1);

        menuFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_sair.jpg"))); // NOI18N
        menuFechar.setText("Fechar");
        menuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFecharActionPerformed(evt);
            }
        });
        menuArquivo.add(menuFechar);

        menuPrincipal.add(menuArquivo);

        menuProdutividade.setText("Produtividade");

        menuAtualizarProdutividade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_produtividade.png"))); // NOI18N
        menuAtualizarProdutividade.setText("Atualizar a Produtividade");
        menuAtualizarProdutividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAtualizarProdutividadeActionPerformed(evt);
            }
        });
        menuProdutividade.add(menuAtualizarProdutividade);
        menuProdutividade.add(jSeparator3);

        menuConsultaProdutividade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_con_produtividade.jpg"))); // NOI18N
        menuConsultaProdutividade.setText("Consulta da Produtividade");
        menuConsultaProdutividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaProdutividadeActionPerformed(evt);
            }
        });
        menuProdutividade.add(menuConsultaProdutividade);

        menuPrincipal.add(menuProdutividade);

        menuAnalista.setText("Analista");

        itemCadAnalista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones_analista.jpg"))); // NOI18N
        itemCadAnalista.setText("Cadastrar analista");
        itemCadAnalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadAnalistaActionPerformed(evt);
            }
        });
        menuAnalista.add(itemCadAnalista);
        menuAnalista.add(jSeparator2);

        itemConAnalista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_analistas.png"))); // NOI18N
        itemConAnalista.setText("Consultar analista");
        itemConAnalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConAnalistaActionPerformed(evt);
            }
        });
        menuAnalista.add(itemConAnalista);

        menuPrincipal.add(menuAnalista);

        menuAjuda.setText("Ajuda");

        menuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_ajuda.jpg"))); // NOI18N
        menuSobre.setText("Sobre o sistema");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuSobre);

        menuPrincipal.add(menuAjuda);

        setJMenuBar(menuPrincipal);

        setSize(new java.awt.Dimension(602, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/iconeGUI.jpg")));
    }
    
    private void menuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuFecharActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        LoginGUI telaLogin = new LoginGUI();

        telaLogin.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuAtualizarProdutividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAtualizarProdutividadeActionPerformed
        AttProdutividadeGUI telaAtProdutividade = new AttProdutividadeGUI();
        
        jdpPrincipal.removeAll();
        jdpPrincipal.updateUI();
        jdpPrincipal.add(telaAtProdutividade);
        telaAtProdutividade.setVisible(true);
    }//GEN-LAST:event_menuAtualizarProdutividadeActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        SobreGUI telaSobre = new SobreGUI();
        
        jdpPrincipal.removeAll();
        jdpPrincipal.updateUI();
        jdpPrincipal.add(telaSobre);
        telaSobre.setVisible(true);
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuConsultaProdutividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaProdutividadeActionPerformed
        ConProdutividadeGUI telaConsulta = new ConProdutividadeGUI();
        
        jdpPrincipal.removeAll();
        jdpPrincipal.updateUI();
        jdpPrincipal.add(telaConsulta);
        telaConsulta.setVisible(true);
    }//GEN-LAST:event_menuConsultaProdutividadeActionPerformed

    private void itemCadAnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadAnalistaActionPerformed
        CadAnalistaGUI cadAnalista = new CadAnalistaGUI();
        
        jdpPrincipal.removeAll();
        jdpPrincipal.updateUI();
        jdpPrincipal.add(cadAnalista);
        cadAnalista.setVisible(true);
    }//GEN-LAST:event_itemCadAnalistaActionPerformed

    private void itemConAnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConAnalistaActionPerformed
        ConAnalistaGUI conAnalista = new ConAnalistaGUI();
        
        jdpPrincipal.removeAll();
        jdpPrincipal.updateUI();
        jdpPrincipal.add(conAnalista);
        conAnalista.setVisible(true);
    }//GEN-LAST:event_itemConAnalistaActionPerformed

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
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCadAnalista;
    private javax.swing.JMenuItem itemConAnalista;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuAnalista;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuAtualizarProdutividade;
    private javax.swing.JMenuItem menuConsultaProdutividade;
    private javax.swing.JMenuItem menuFechar;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenu menuProdutividade;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSobre;
    public javax.swing.JLabel textoUsuario;
    // End of variables declaration//GEN-END:variables

}