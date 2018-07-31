/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import model.Analista;
import model.Data;
import model.Produtividade;
import dao.AnalistaDAO;
import dao.ProdutividadeDAO;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author carvalui
 */
public class AttProdutividadeGUI extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = -7148834044855526193L;

    private DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form AtProdutividadeGUI
     *
     */
    public AttProdutividadeGUI() {
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

        botaoSalvar = new javax.swing.JButton();
        botaoFechar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProdutividade = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        botaoAtualizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboDia = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboMes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboAno = new javax.swing.JComboBox<>();
        botaoPesquisar = new javax.swing.JButton();
        botaoSetaDireita = new javax.swing.JButton();
        botaoSetaEsquerda = new javax.swing.JButton();
        botaoExportar = new javax.swing.JButton();

        setTitle("SiASu - Sistema de Apoio a Sustentação");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeGUI.jpg"))); // NOI18N

        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_salvar.jpg"))); // NOI18N
        botaoSalvar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        botaoSalvar.setFocusPainted(false);
        botaoSalvar.setFocusable(false);
        botaoSalvar.setPreferredSize(new java.awt.Dimension(40, 40));
        botaoSalvar.setRequestFocusEnabled(false);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

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

        tabelaProdutividade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelaProdutividade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Analista", "Qtd. E-mails", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutividade.setCellSelectionEnabled(true);
        tabelaProdutividade.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tabelaProdutividade);

        botaoAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_alterar.jpg"))); // NOI18N
        botaoAtualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        botaoAtualizar.setEnabled(false);
        botaoAtualizar.setFocusPainted(false);
        botaoAtualizar.setFocusable(false);
        botaoAtualizar.setPreferredSize(new java.awt.Dimension(40, 40));
        botaoAtualizar.setRequestFocusEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));

        jLabel1.setText("Dia:");

        comboDia.setFocusable(false);
        comboDia.setPreferredSize(new java.awt.Dimension(50, 20));

        jLabel2.setText("Mês:");

        comboMes.setFocusable(false);
        comboMes.setPreferredSize(new java.awt.Dimension(50, 20));

        jLabel3.setText("Ano:");

        comboAno.setFocusable(false);
        comboAno.setPreferredSize(new java.awt.Dimension(50, 20));

        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_pesquisa_menor.png"))); // NOI18N
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

        botaoExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_excel.png"))); // NOI18N
        botaoExportar.setFocusPainted(false);
        botaoExportar.setFocusable(false);
        botaoExportar.setPreferredSize(new java.awt.Dimension(20, 20));
        botaoExportar.setRequestFocusEnabled(false);
        botaoExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoSetaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSetaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoSetaEsquerda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSetaDireita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(comboAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 488, 294);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoFecharActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        Data data = new Data();
        String dataDia = null;
        int sucesso = 0;

        model = (DefaultTableModel) tabelaProdutividade.getModel();
        for (int l = 0; l < model.getRowCount(); l++) {
            Long idAnalista = (Long) model.getValueAt(l, 0);
            int qtdEmail = (int) model.getValueAt(l, 2);
            dataDia = (String) model.getValueAt(l, 3);
            Date dataFormatada = null;

            try {
                dataFormatada = data.formataDataParaDate(dataDia);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }

            Produtividade produtividade = new Produtividade(qtdEmail, dataFormatada, idAnalista);

            ProdutividadeDAO dao = new ProdutividadeDAO();

            try {
                dao.salvar(produtividade);
                sucesso++;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }

        if (sucesso == model.getRowCount()) {
            data.setDataAtual();
            JOptionPane.showMessageDialog(this, "Produtividade do dia " + dataDia + " salvo com sucesso!!");
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoSetaEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSetaEsquerdaActionPerformed
        Data data = new Data();
        int indice = comboDia.getSelectedIndex() - 1;

        Date dataAnterior = pegaDataAnterior(indice);

        while (data.verificaFinalSemana(dataAnterior) == true) {
            indice--;
            dataAnterior = pegaDataAnterior(indice);
        }

        comboDia.setSelectedIndex(indice);

        populaTabela(indice);
    }//GEN-LAST:event_botaoSetaEsquerdaActionPerformed

    private void botaoSetaDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSetaDireitaActionPerformed
        Data data = new Data();
        int indice = comboDia.getSelectedIndex() + 1;

        Date dataSeguinte = pegaDataSeguinte(indice);

        while (data.verificaFinalSemana(dataSeguinte) == true) {
            indice++;
            dataSeguinte = pegaDataSeguinte(indice);
        }

        comboDia.setSelectedIndex(indice);

        populaTabela(indice);
    }//GEN-LAST:event_botaoSetaDireitaActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        int indice = comboDia.getSelectedIndex();

        populaTabela(indice);
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExportarActionPerformed
        escreverParaExcel();
    }//GEN-LAST:event_botaoExportarActionPerformed

    //Pegar dados da JTable
    private String getCellVal(int x, int y) {
        return model.getValueAt(x, y).toString();
    }

    //Excrever para Excel
    private void escreverParaExcel() {
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet ws = wb.createSheet();

        //Carregar data para TreeMap
        TreeMap<String, Object[]> data = new TreeMap<>();
        data.put("0", new Object[]{model.getColumnName(1), model.getColumnName(2), model.getColumnName(3)});
        for (int i = 0; i < model.getRowCount(); i++) {
            data.put(Integer.toString(i + 1), new Object[]{getCellVal(i, 1), getCellVal(i, 2), getCellVal(i, 3)});
        }

        //Escrever para sheet
        Set<String> ids = data.keySet();
        XSSFRow row;
        int rowID = 0;

        for (String key : ids) {
            row = ws.createRow(rowID++);

            //Pegar Data
            Object[] values = data.get(key);

            int cellID = 0;

            for (Object o : values) {
                Cell cell = row.createCell(cellID++);
                cell.setCellValue(o.toString());
            }
        }

        //Escrever excel para arquivo de sistema
        try {
            int dia = Integer.parseInt((String) comboDia.getSelectedItem());
            int mes = comboMes.getSelectedIndex() + 1;
            int ano = Integer.parseInt((String) comboAno.getSelectedItem());

            String textoData = dia + "-" + mes + "-" + ano + ".xlsx";
            
            try (FileOutputStream fos = new FileOutputStream(new File("C:/Excel/" + textoData))) {
                wb.write(fos);
            }
            
            JOptionPane.showMessageDialog(this, "Arquivo " + textoData + " exportado com sucesso!!");
        } catch (HeadlessException | IOException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    private Date pegaDataSeguinte(int indice) {
        Data data = new Data();
        Date dataSeguinte = null;

        if (indice <= 31) {
            comboDia.setSelectedIndex(indice);

            int dia = Integer.parseInt((String) comboDia.getSelectedItem());
            int mes = comboMes.getSelectedIndex() + 1;
            int ano = Integer.parseInt((String) comboAno.getSelectedItem());

            try {
                dataSeguinte = data.formaData(dia, mes, ano);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }

        return dataSeguinte;
    }

    private Date pegaDataAnterior(int indice) {
        Data data = new Data();
        Date dataAnterior = null;

        if (indice > -1) {
            comboDia.setSelectedIndex(indice);

            int dia = Integer.parseInt((String) comboDia.getSelectedItem());
            int mes = comboMes.getSelectedIndex() + 1;
            int ano = Integer.parseInt((String) comboAno.getSelectedItem());

            try {
                dataAnterior = data.formaData(dia, mes, ano);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }

        return dataAnterior;
    }

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

        model = (DefaultTableModel) tabelaProdutividade.getModel();
        model.setRowCount(0);
        for (Analista analista : lista) {
            if (analista.isDesligado() == false) {
                model.addRow(new Object[]{analista.getId(), analista.getNome(), "", data.getDataHoje()});
            }
        }

        tabelaProdutividade.setModel(model);
    }

    private void populaTabela(int indice) {
        Data data = new Data();

        comboDia.setSelectedIndex(indice);
        int dia = Integer.parseInt((String) comboDia.getSelectedItem());
        int mes = comboMes.getSelectedIndex() + 1;
        int ano = Integer.parseInt((String) comboAno.getSelectedItem());

        Date dataFormada = null;

        try {
            dataFormada = data.formaData(dia, mes, ano);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

        System.out.println(dataFormada);

        model = (DefaultTableModel) tabelaProdutividade.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            Long id = (Long) model.getValueAt(i, 0);

            Produtividade produtividade = new Produtividade();
            produtividade.setIdAnalista(id);
            produtividade.setDataProdutividade(dataFormada);

            ProdutividadeDAO dao = new ProdutividadeDAO();

            produtividade.setQtdEmail(dao.consultarPorDataEId(produtividade));

            if (!(produtividade.getQtdEmails() == 0)) {
                model.setValueAt(produtividade.getQtdEmails(), i, 2);
            } else {
                model.setValueAt("", i, 2);
            }

            String dataFormatada = null;
            try {
                dataFormatada = data.formataDataParaString(dataFormada);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }

            model.setValueAt("", i, 3);
            model.setValueAt(dataFormatada, i, 3);
        }

        tabelaProdutividade.setModel(model);
    }

    private void configuraComboData() {
        Data data = new Data();
        data.setListaDeDatas();

        for (String dia : data.getDia()) {
            comboDia.addItem(dia);
        }

        for (String mes : data.getMes()) {
            comboMes.addItem(mes);
        }

        for (String ano : data.getAno()) {
            comboAno.addItem(ano);
        }

        data.setDiaMesAno();
        comboDia.setSelectedItem(Integer.toString(data.getDiaHoje()));
        comboMes.setSelectedIndex(data.getMesHoje());
        comboAno.setSelectedItem(Integer.toString(data.getAnoHoje()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoExportar;
    private javax.swing.JButton botaoFechar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoSetaDireita;
    private javax.swing.JButton botaoSetaEsquerda;
    private javax.swing.JComboBox<String> comboAno;
    private javax.swing.JComboBox<String> comboDia;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tabelaProdutividade;
    // End of variables declaration//GEN-END:variables

}