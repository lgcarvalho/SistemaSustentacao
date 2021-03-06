/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import model.Analista;
import model.Data;
import dao.AnalistaDAO;
import dao.ProdutividadeDAO;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carvalui
 */
public class ConProdutividadeGUI extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = -8921613945046731171L;

    /**
     * Creates new form ConsultaProdutividadeGUI
     */
    public ConProdutividadeGUI() {
        initComponents();

        configuraTabela();
        configuraComboData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutividade = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        botaoFechar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboMes = new javax.swing.JComboBox<>();
        botaoSetaDireita = new javax.swing.JButton();
        botaoSetaEsquerda = new javax.swing.JButton();
        comboAno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoTotalEmails = new javax.swing.JTextField();

        setTitle("SiASu - Sistema de Apoio a Sustentação");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeGUI.jpg"))); // NOI18N

        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_pesquisa.png"))); // NOI18N
        botaoPesquisar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        botaoPesquisar.setFocusPainted(false);
        botaoPesquisar.setFocusable(false);
        botaoPesquisar.setPreferredSize(new java.awt.Dimension(40, 40));
        botaoPesquisar.setRequestFocusEnabled(false);
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        tabelaProdutividade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Analista", "E-mails", "Produtividade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaProdutividade);

        botaoFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_fechar.png"))); // NOI18N
        botaoFechar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        botaoFechar.setFocusPainted(false);
        botaoFechar.setFocusable(false);
        botaoFechar.setPreferredSize(new java.awt.Dimension(40, 40));
        botaoFechar.setRequestFocusEnabled(false);
        botaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));

        jLabel2.setText("Mês:");

        comboMes.setFocusable(false);
        comboMes.setPreferredSize(new java.awt.Dimension(50, 20));

        botaoSetaDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_seta_direita.jpg"))); // NOI18N
        botaoSetaDireita.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        botaoSetaDireita.setFocusPainted(false);
        botaoSetaDireita.setFocusable(false);
        botaoSetaDireita.setPreferredSize(new java.awt.Dimension(20, 20));
        botaoSetaDireita.setRequestFocusEnabled(false);
        botaoSetaDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSetaDireitaActionPerformed(evt);
            }
        });

        botaoSetaEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_seta_esquerda.jpg"))); // NOI18N
        botaoSetaEsquerda.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        botaoSetaEsquerda.setFocusPainted(false);
        botaoSetaEsquerda.setFocusable(false);
        botaoSetaEsquerda.setPreferredSize(new java.awt.Dimension(20, 20));
        botaoSetaEsquerda.setRequestFocusEnabled(false);
        botaoSetaEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSetaEsquerdaActionPerformed(evt);
            }
        });

        comboAno.setFocusable(false);
        comboAno.setPreferredSize(new java.awt.Dimension(50, 20));

        jLabel3.setText("Ano:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoSetaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSetaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botaoSetaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSetaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Total de e-mails do mês:");

        campoTotalEmails.setEditable(false);
        campoTotalEmails.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTotalEmails, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoTotalEmails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoFecharActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        int mes = comboMes.getSelectedIndex() + 1;
        int ano = Integer.parseInt((String) comboAno.getSelectedItem());
        int totalEmails = 0;

        Data data = new Data();

        Date dataInicial = null;
        Date dataFinal = null;

        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, mes - 1);
        c.set(Calendar.YEAR, ano);
        int ultimoDia = c.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println(ultimoDia);

        try {
            dataInicial = data.formaData(1, mes, ano);
            dataFinal = data.formaData(ultimoDia, mes, ano);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

        DefaultTableModel model = (DefaultTableModel) tabelaProdutividade.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            Long id = (Long) model.getValueAt(i, 0);

            ProdutividadeDAO dao = new ProdutividadeDAO();
            Long emails = dao.consultarMes(id, dataInicial, dataFinal);

            model.setValueAt(emails, i, 2);

            totalEmails += emails;
        }

        tabelaProdutividade.setModel(model);

        campoTotalEmails.setText(Integer.toString(totalEmails));
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoSetaEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSetaEsquerdaActionPerformed
        int indice = comboMes.getSelectedIndex();

        indice -= 1;

        if (!(indice < 0)) {
            comboMes.setSelectedIndex(indice);
        }

    }//GEN-LAST:event_botaoSetaEsquerdaActionPerformed

    private void botaoSetaDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSetaDireitaActionPerformed
        int tamanho = comboMes.getItemCount();
        int indice = comboMes.getSelectedIndex();

        indice += 1;

        if (!(indice >= tamanho)) {
            comboMes.setSelectedIndex(indice);
        }
    }//GEN-LAST:event_botaoSetaDireitaActionPerformed

    private void configuraTabela() {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();

        rightRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        tabelaProdutividade.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
        tabelaProdutividade.getColumnModel().getColumn(0).setMaxWidth(50);
        tabelaProdutividade.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        tabelaProdutividade.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        tabelaProdutividade.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tabelaProdutividade.getTableHeader().setReorderingAllowed(false);
        tabelaProdutividade.getTableHeader().setResizingAllowed(false);

        Data data = new Data();
        data.setDataAtual();

        AnalistaDAO dao = new AnalistaDAO();
        List<Analista> lista = dao.consultaTodosAnalistas();

        DefaultTableModel model = (DefaultTableModel) tabelaProdutividade.getModel();
        model.setRowCount(0);
        for (Analista analista : lista) {
            if (analista.isDesligado() == false) {
                model.addRow(new Object[]{analista.getId(), analista.getNome(), "", ""});
            }
        }

        tabelaProdutividade.setModel(model);
    }

    private void configuraComboData() {
        Data data = new Data();
        data.setListaDeDatas();

        for (String mes : data.getMes()) {
            comboMes.addItem(mes);
        }

        for (String ano : data.getAno()) {
            comboAno.addItem(ano);
        }

        data.setDiaMesAno();
        comboMes.setSelectedIndex(data.getMesHoje());
        comboAno.setSelectedItem(Integer.toString(data.getAnoHoje()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoFechar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSetaDireita;
    private javax.swing.JButton botaoSetaEsquerda;
    private javax.swing.JTextField campoTotalEmails;
    private javax.swing.JComboBox<String> comboAno;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabelaProdutividade;
    // End of variables declaration//GEN-END:variables
}
