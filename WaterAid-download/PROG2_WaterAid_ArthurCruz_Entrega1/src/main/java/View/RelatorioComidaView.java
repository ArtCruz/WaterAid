/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CadastroComidaController;
import Controller.CadastroPessoaController;
import Controller.DietaCalcularController;
import Controller.DietaVisualizarController;
import Controller.ImpactoCalcularController;
import Controller.ImpactoVisualizarController;
import Controller.RankingGeralController;
import Controller.RefeicaoHistoricoController;
import Controller.RefeicaoNovaController;
import Controller.RefeicaoRemoverController;
import Controller.RelatorioComidaController;
import Controller.RelatorioPessoaController;
import java.awt.Color;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuário
 */
public class RelatorioComidaView extends javax.swing.JFrame {

    /**
     * Creates new form ExemploMenu
     */
    public RelatorioComidaView() {
        initComponents();
        Color backGroundColor=  new Color(221,221,221);
        this.getContentPane().setBackground(backGroundColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        taRelCom = new javax.swing.JTextArea();
        btnRelatorioLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbRelCom = new javax.swing.JComboBox<>();
        btnRetComOrd = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCadastro8 = new javax.swing.JMenu();
        btnCadastroPessoa5 = new javax.swing.JMenuItem();
        btnCadastroComida8 = new javax.swing.JMenuItem();
        btnRefeicao8 = new javax.swing.JMenu();
        miRefNovaView1 = new javax.swing.JMenuItem();
        btnRefeicaoHistoricoView1 = new javax.swing.JMenuItem();
        miRemRefeicaoView1 = new javax.swing.JMenuItem();
        btnRelatório8 = new javax.swing.JMenu();
        btnRelatorioPessoasView1 = new javax.swing.JMenuItem();
        btnRelatorioComidaView1 = new javax.swing.JMenuItem();
        miCalcularImpacto3 = new javax.swing.JMenu();
        miCalcImpacView1 = new javax.swing.JMenuItem();
        miVisualizarImpactoView1 = new javax.swing.JMenuItem();
        miCalcularDieta4 = new javax.swing.JMenu();
        miCalcularDietaView1 = new javax.swing.JMenuItem();
        miVisualizarDietaView1 = new javax.swing.JMenuItem();
        miRankingGeral4 = new javax.swing.JMenu();
        miRankingGeralView1 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taRelCom.setColumns(20);
        taRelCom.setRows(5);
        jScrollPane1.setViewportView(taRelCom);

        btnRelatorioLimpar.setText("Limpar");
        btnRelatorioLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioLimparActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Relatório Comidas");

        cmbRelCom.setBackground(new java.awt.Color(37, 201, 228));
        cmbRelCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carnes", "Grãos", "Vegetais" }));
        cmbRelCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRelComActionPerformed(evt);
            }
        });

        btnRetComOrd.setText("Retornar Comidas Ordenadas");
        btnRetComOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetComOrdActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(42, 187, 242));

        mnCadastro8.setText("Cadastro");
        mnCadastro8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastro8ActionPerformed(evt);
            }
        });

        btnCadastroPessoa5.setText("Cadastro Pessoa");
        btnCadastroPessoa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroPessoa5ActionPerformed(evt);
            }
        });
        mnCadastro8.add(btnCadastroPessoa5);

        btnCadastroComida8.setText("Cadastro Comida");
        btnCadastroComida8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroComida8ActionPerformed(evt);
            }
        });
        mnCadastro8.add(btnCadastroComida8);

        jMenuBar1.add(mnCadastro8);

        btnRefeicao8.setText("Refeição");
        btnRefeicao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeicao8ActionPerformed(evt);
            }
        });

        miRefNovaView1.setText("Nova Refeição");
        miRefNovaView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRefNovaView1ActionPerformed(evt);
            }
        });
        btnRefeicao8.add(miRefNovaView1);

        btnRefeicaoHistoricoView1.setText("Histórico Refeição");
        btnRefeicaoHistoricoView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeicaoHistoricoView1ActionPerformed(evt);
            }
        });
        btnRefeicao8.add(btnRefeicaoHistoricoView1);

        miRemRefeicaoView1.setText("Remover Refeição");
        miRemRefeicaoView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRemRefeicaoView1ActionPerformed(evt);
            }
        });
        btnRefeicao8.add(miRemRefeicaoView1);

        jMenuBar1.add(btnRefeicao8);

        btnRelatório8.setText("Relatório");

        btnRelatorioPessoasView1.setText("Pessoas");
        btnRelatorioPessoasView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioPessoasView1ActionPerformed(evt);
            }
        });
        btnRelatório8.add(btnRelatorioPessoasView1);

        btnRelatorioComidaView1.setText("Comida");
        btnRelatorioComidaView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioComidaView1ActionPerformed(evt);
            }
        });
        btnRelatório8.add(btnRelatorioComidaView1);

        jMenuBar1.add(btnRelatório8);

        miCalcularImpacto3.setText("Impacto");

        miCalcImpacView1.setText("Calcular Impacto");
        miCalcImpacView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCalcImpacView1ActionPerformed(evt);
            }
        });
        miCalcularImpacto3.add(miCalcImpacView1);

        miVisualizarImpactoView1.setText("Visualizar Impacto");
        miVisualizarImpactoView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVisualizarImpactoView1ActionPerformed(evt);
            }
        });
        miCalcularImpacto3.add(miVisualizarImpactoView1);

        jMenuBar1.add(miCalcularImpacto3);

        miCalcularDieta4.setText("Dieta");
        miCalcularDieta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCalcularDieta4ActionPerformed(evt);
            }
        });

        miCalcularDietaView1.setText("Calcular Dieta");
        miCalcularDietaView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCalcularDietaView1ActionPerformed(evt);
            }
        });
        miCalcularDieta4.add(miCalcularDietaView1);

        miVisualizarDietaView1.setText("Visualizar Dieta");
        miVisualizarDietaView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVisualizarDietaView1ActionPerformed(evt);
            }
        });
        miCalcularDieta4.add(miVisualizarDietaView1);

        jMenuBar1.add(miCalcularDieta4);

        miRankingGeral4.setText("Ranking");

        miRankingGeralView1.setText("Ranking Geral");
        miRankingGeralView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRankingGeralView1ActionPerformed(evt);
            }
        });
        miRankingGeral4.add(miRankingGeralView1);

        jMenuBar1.add(miRankingGeral4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbRelCom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRelatorioLimpar)
                        .addGap(14, 14, 14))))
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRetComOrd)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRelCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelatorioLimpar)
                    .addComponent(btnRetComOrd))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void exibirTela(){
        setVisible(true);
    }
    
    public void limparTextArea(){
        taRelCom.setText("");
    }
    
    public String getTipoCarne(){
        return cmbRelCom.getSelectedItem().toString();
    }
    
    public void adicionarAcaoRetornarTodasRelatorioComida(ActionListener acao){
        btnRetComOrd.addActionListener(acao);
    }
    
    public void adicionarAcaoLimpar(ActionListener acao){
        btnRelatorioLimpar.addActionListener(acao);
    }
    
    public void adicionarAcaoCMBComidas(ActionListener acao){
        cmbRelCom.addActionListener(acao);
    }
    
    public void preencherTextArea(String txt){
        taRelCom.append(txt);
    }
    
    private void cmbRelComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRelComActionPerformed
        
    }//GEN-LAST:event_cmbRelComActionPerformed

    private void btnRelatorioLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioLimparActionPerformed

    }//GEN-LAST:event_btnRelatorioLimparActionPerformed

    private void btnRetComOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetComOrdActionPerformed
       
    }//GEN-LAST:event_btnRetComOrdActionPerformed

    private void btnCadastroPessoa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroPessoa5ActionPerformed
        CadastroPessoaController cadPessoaController = new CadastroPessoaController(new CadastroPessoaView());
        cadPessoaController.exibirTela();
        dispose();
    }//GEN-LAST:event_btnCadastroPessoa5ActionPerformed

    private void btnCadastroComida8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroComida8ActionPerformed
        CadastroComidaController cadComidaController = new CadastroComidaController(new CadastroComidaView());
        cadComidaController.exibirTela();
        dispose();
    }//GEN-LAST:event_btnCadastroComida8ActionPerformed

    private void mnCadastro8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastro8ActionPerformed
        //Nada
    }//GEN-LAST:event_mnCadastro8ActionPerformed

    private void miRefNovaView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRefNovaView1ActionPerformed
        RefeicaoNovaController refNovaController = new RefeicaoNovaController(new RefeicaoNovaView());
        refNovaController.exibirTela();
        dispose();
    }//GEN-LAST:event_miRefNovaView1ActionPerformed

    private void btnRefeicaoHistoricoView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeicaoHistoricoView1ActionPerformed
        RefeicaoHistoricoController refHistController = new RefeicaoHistoricoController(new RefeicaoHistoricoView());
        refHistController.exibirTela();
        dispose();
    }//GEN-LAST:event_btnRefeicaoHistoricoView1ActionPerformed

    private void miRemRefeicaoView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRemRefeicaoView1ActionPerformed
        RefeicaoRemoverController refRemController = new RefeicaoRemoverController(new RefeicaoRemoverView());
        refRemController.exibirTela();
        dispose();
    }//GEN-LAST:event_miRemRefeicaoView1ActionPerformed

    private void btnRefeicao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeicao8ActionPerformed
        //Nada
    }//GEN-LAST:event_btnRefeicao8ActionPerformed

    private void btnRelatorioPessoasView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioPessoasView1ActionPerformed
        RelatorioPessoaController relComidaController = new RelatorioPessoaController(new RelatorioPessoaView());
        relComidaController.exibeTela();
        dispose();
    }//GEN-LAST:event_btnRelatorioPessoasView1ActionPerformed

    private void btnRelatorioComidaView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioComidaView1ActionPerformed
        RelatorioComidaController relComidaController = new RelatorioComidaController(new RelatorioComidaView());
        relComidaController.exibirTela();
        dispose();
    }//GEN-LAST:event_btnRelatorioComidaView1ActionPerformed

    private void miCalcImpacView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCalcImpacView1ActionPerformed
        ImpactoCalcularController impacCalcController = new ImpactoCalcularController(new ImpactoCalcularView());
        impacCalcController.exibirTela();
        dispose();
    }//GEN-LAST:event_miCalcImpacView1ActionPerformed

    private void miVisualizarImpactoView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVisualizarImpactoView1ActionPerformed
        ImpactoVisualizarController impacVisuController = new ImpactoVisualizarController(new ImpactoVisualizarView());
        impacVisuController.exibirTela();
        dispose();
    }//GEN-LAST:event_miVisualizarImpactoView1ActionPerformed

    private void miCalcularDietaView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCalcularDietaView1ActionPerformed
        DietaCalcularController dietaCalcularController = new DietaCalcularController(new DietaCalcularView());
        dietaCalcularController.exibirTela();
        dispose();
    }//GEN-LAST:event_miCalcularDietaView1ActionPerformed

    private void miVisualizarDietaView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVisualizarDietaView1ActionPerformed
        DietaVisualizarController dietaVisualizarController = new DietaVisualizarController(new DietaVisualizarView());
        dietaVisualizarController.exibirTela();
        dispose();
    }//GEN-LAST:event_miVisualizarDietaView1ActionPerformed

    private void miCalcularDieta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCalcularDieta4ActionPerformed
        //Nada
    }//GEN-LAST:event_miCalcularDieta4ActionPerformed

    private void miRankingGeralView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRankingGeralView1ActionPerformed
        RankingGeralController rankingGeralController = new RankingGeralController(new RankingGeralView());
        rankingGeralController.exibirTela();
        dispose();
    }//GEN-LAST:event_miRankingGeralView1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCadastroComida8;
    private javax.swing.JMenuItem btnCadastroPessoa5;
    private javax.swing.JMenu btnRefeicao8;
    private javax.swing.JMenuItem btnRefeicaoHistoricoView1;
    private javax.swing.JMenuItem btnRelatorioComidaView1;
    private javax.swing.JButton btnRelatorioLimpar;
    private javax.swing.JMenuItem btnRelatorioPessoasView1;
    private javax.swing.JMenu btnRelatório8;
    private javax.swing.JButton btnRetComOrd;
    private javax.swing.JComboBox<String> cmbRelCom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem miCalcImpacView1;
    private javax.swing.JMenu miCalcularDieta4;
    private javax.swing.JMenuItem miCalcularDietaView1;
    private javax.swing.JMenu miCalcularImpacto3;
    private javax.swing.JMenu miRankingGeral4;
    private javax.swing.JMenuItem miRankingGeralView1;
    private javax.swing.JMenuItem miRefNovaView1;
    private javax.swing.JMenuItem miRemRefeicaoView1;
    private javax.swing.JMenuItem miVisualizarDietaView1;
    private javax.swing.JMenuItem miVisualizarImpactoView1;
    private javax.swing.JMenu mnCadastro8;
    private javax.swing.JTextArea taRelCom;
    // End of variables declaration//GEN-END:variables
}
