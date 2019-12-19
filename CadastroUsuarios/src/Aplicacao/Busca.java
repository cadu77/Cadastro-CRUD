package Aplicacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Busca extends javax.swing.JFrame {

    public Busca() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPane = new javax.swing.JPanel();
        opcaoBusca = new javax.swing.JComboBox<>();
        entBusca = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        saidaNome = new javax.swing.JTextField();
        saidaCidade = new javax.swing.JTextField();
        saidaRua = new javax.swing.JTextField();
        saidaBairro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        saidaNumero = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        saidaCodigo = new javax.swing.JTextField();
        saidaEstado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        saidaCPF = new javax.swing.JFormattedTextField();
        saidaTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPane.setBackground(new java.awt.Color(204, 204, 255));
        contentPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contentPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contentPane.setRequestFocusEnabled(false);
        contentPane.setVerifyInputWhenFocusTarget(false);

        opcaoBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opções de Busca", "Código", "CPF", "Todos" }));
        opcaoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoBuscaActionPerformed(evt);
            }
        });

        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Cidade:");

        jLabel5.setText("Rua:");

        jLabel6.setText("Bairro:");

        jLabel7.setText("Telefone:");

        jLabel9.setText("Nº:");

        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(null);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel8.setText("Estado:");

        try {
            saidaCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            saidaTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(opcaoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(entBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnBusca))
                    .addComponent(jLabel2)
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(23, 23, 23)
                        .addComponent(saidaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saidaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32)
                        .addComponent(saidaRua, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saidaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saidaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saidaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(saidaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(saidaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saidaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcaoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusca))
                .addGap(42, 42, 42)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(saidaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(saidaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(saidaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(saidaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(saidaRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(saidaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(saidaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(saidaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(saidaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar)
                    .addComponent(btnLimpar)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcaoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoBuscaActionPerformed
        desativaCampos();

        if (opcaoBusca.getSelectedIndex() == 1) {
            limpar();
            entBusca.enable(true);

        }
        if (opcaoBusca.getSelectedIndex() == 2) {
            limpar();

        }
        if (opcaoBusca.getSelectedIndex() == 3) {
            BuscaTodos busca = new BuscaTodos();
            busca.setVisible(true);
            limpar();
        }
    }//GEN-LAST:event_opcaoBuscaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        sair();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        ativarCampos();
        BuscaDados();
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AlterarDados();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ExcluirDados();
    }//GEN-LAST:event_btnExcluirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        // Mudar o layout
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busca().setVisible(true);
            }
        });
    }

    public void limpar() {
        entBusca.setText("");
        saidaCodigo.setText("");
        saidaNome.setText("");
        saidaCPF.setText("");
        saidaTelefone.setText("");
        saidaRua.setText("");
        saidaNumero.setText("");
        saidaBairro.setText("");
        saidaCidade.setText("");
        saidaEstado.setText("");
    }

    public static void sair() {
        System.exit(0);
    }

    public void desativaCampos() {
        saidaCodigo.setEnabled(false);
        saidaNome.setEnabled(false);
        saidaCPF.setEnabled(false);
        saidaTelefone.setEnabled(false);
        saidaRua.setEnabled(false);
        saidaNumero.setEnabled(false);
        saidaBairro.setEnabled(false);
        saidaCidade.setEnabled(false);
        saidaEstado.setEnabled(false);
    }

    public void ativarCampos() {
        entBusca.setEnabled(true);
        saidaCodigo.setEnabled(false);
        saidaNome.setEnabled(true);
        saidaCPF.setEnabled(true);
        saidaTelefone.setEnabled(true);
        saidaRua.setEnabled(true);
        saidaNumero.setEnabled(true);
        saidaBairro.setEnabled(true);
        saidaCidade.setEnabled(true);
        saidaEstado.setEnabled(true);
    }

    public void BuscaDados() {
        boolean consulta = true;

        try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bdcadastro", "root", "");

            Statement stmt = con.createStatement();

            // Entrada de dados no campo codigo do formulário.
            double BuscaCodigo = Double.parseDouble(entBusca.getText());

            String BuscaCpf = (entBusca.getText());

            ResultSet RS = null;

            // Escolha a Opção de Busca.
            if (opcaoBusca.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null,
                        "Escolha uma Opção de Busca!");

            } else if (opcaoBusca.getSelectedIndex() == 1) {
                RS = stmt.executeQuery("Select * from tabficha where Matricula = " + BuscaCodigo);

                while (RS.next()) {

                    int Mat = RS.getInt("Matricula");

                    saidaCodigo.setText(String.valueOf(Mat));

                    // Pega os demais.
                    saidaNome.setText(RS.getString("Nome"));
                    saidaCPF.setText(RS.getString("CPF"));
                    saidaTelefone.setText(RS.getString("Telefone"));
                    saidaRua.setText(RS.getString("Rua"));
                    saidaNumero.setText(RS.getString("Numero"));
                    saidaBairro.setText(RS.getString("Bairro"));
                    saidaCidade.setText(RS.getString("Cidade"));
                    saidaEstado.setText(RS.getString("Estado"));

                    consulta = false;
                    JOptionPane.showMessageDialog(null, "Dados Encontrado!");

                }

            } else if (opcaoBusca.getSelectedIndex() == 2) {
                RS = stmt.executeQuery("Select * from tabficha where CPF = " + BuscaCpf);

                while (RS.next()) {

                    int CPF = RS.getInt("Matricula");
                    

                    saidaCodigo.setText(String.valueOf(CPF));

                    // Exibe os valore retornados na consulta.
                    saidaCodigo.setText(RS.getString("Matricula"));
                    saidaNome.setText(RS.getString("Nome"));
                    saidaCPF.setText(RS.getNString("CPF"));
                    saidaTelefone.setText(RS.getString("Telefone"));
                    saidaRua.setText(RS.getString("Rua"));
                    saidaNumero.setText(RS.getString("Numero"));
                    saidaBairro.setText(RS.getString("Bairro"));
                    saidaCidade.setText(RS.getString("Cidade"));
                    saidaEstado.setText(RS.getString("Estado"));

                    consulta = false;
                    JOptionPane.showMessageDialog(null, "Dados Encontrado!");

                }

            }

            if (consulta) {
                JOptionPane.showMessageDialog(null, "Dados não Encontrados!");

            }
            RS.close();
            stmt.close();

            con.close();

        } catch (SQLException Erro) {
            JOptionPane.showMessageDialog(null, "Erro Comando SQL" + Erro.getMessage());

        } catch (ClassNotFoundException Erro) {
            JOptionPane.showMessageDialog(null, "Driver não Encontrado!");

        }
    }

    //Altera os dados no BD
    public void AlterarDados() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/BDCadastro", "root", "");

            Statement stmt = con.createStatement();

            // Opção de Entrada para Alterar.
            int consMatricula = Integer.parseInt(entBusca.getText());
            String consCPF = entBusca.getText();

            // Pega os dados no formulário.
            int cadMat = Integer.parseInt(saidaCodigo.getText());
            String cadNome = saidaNome.getText();
            String cadCPF = saidaCPF.getText();
            String cadTelefone = saidaTelefone.getText();
            String cadRua = saidaRua.getText();
            String cadNumero = (saidaNumero.getText());
            String cadBairro = saidaBairro.getText();
            String cadCidade = saidaCidade.getText();
            String cadEstado = saidaEstado.getText();

            // Escolha a Opção de Busca.
            if (opcaoBusca.getSelectedIndex() == 1) {
                int registro = stmt.executeUpdate("update TabFicha set "
                        + "Nome='" + cadNome + "',CPF='" + cadCPF
                        + "',Telefone='" + cadTelefone + "',Rua='"
                        + cadRua + "',Numero='" + cadNumero
                        + "',Bairro='" + cadBairro + "',Cidade='" + cadCidade
                        + "',Estado='" + cadEstado + "', Matricula=" + cadMat
                        + " where Matricula=" + consMatricula);

                if (registro != 0) {
                    JOptionPane.showMessageDialog(null, "Dados Alterados!");
                } else {
                    JOptionPane.showMessageDialog(null, "Dados Não Alterados!");
                }
                stmt.close();

                con.close();

            } else if (opcaoBusca.getSelectedIndex() == 2) {
                int registro = stmt.executeUpdate("update TabFicha set "
                        + "Matricula='" + cadMat + "',Nome='" + cadNome
                        + "',Telefone='" + cadTelefone + "',Rua='"
                        + cadRua + "',Numero='" + cadNumero
                        + "',Bairro='" + cadBairro + "',Cidade='" + cadCidade
                        + "',Estado='" + cadEstado + "',CPF=" + cadCPF
                        + "where CPF=" + consCPF);

                if (registro != 0) {
                    JOptionPane.showMessageDialog(null, "Dados Alterados!");
                } else {
                    JOptionPane.showMessageDialog(null, "Dados Não Alterados!");
                }
                stmt.close();

                con.close();
            }

        } catch (SQLException Erro) {
            JOptionPane.showMessageDialog(null, "Erro Comando SQL" + Erro.getMessage());

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado");
        }
    }

    // Exclui dados no BD
    public void ExcluirDados() {
        try {

            Class.forName("com.mysql.jdbc.Driver");

            try (
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/BDCadastro", "root", "")) {
                Statement stmt = con.createStatement();

                int excluirMatricula = Integer.parseInt(entBusca.getText());
                int registro = stmt.executeUpdate("delete from TabFicha where Matricula=" + excluirMatricula);

                if (registro != 0) {
                    JOptionPane.showMessageDialog(null, "Dados Excluídos!");
                    limpar();

                } else {
                    JOptionPane.showMessageDialog(null, "Dados não Excluídos!");
                }
                stmt.close();

                limpar();
            }

        } catch (SQLException Erro) {
            JOptionPane.showMessageDialog(null, "Erro Comando SQL" + Erro.getMessage());

        } catch (ClassNotFoundException Erro) {
            JOptionPane.showMessageDialog(null, "Driver não Encontrado!");

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel contentPane;
    private javax.swing.JTextField entBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> opcaoBusca;
    private javax.swing.JTextField saidaBairro;
    private javax.swing.JFormattedTextField saidaCPF;
    private javax.swing.JTextField saidaCidade;
    private javax.swing.JTextField saidaCodigo;
    private javax.swing.JTextField saidaEstado;
    private javax.swing.JTextField saidaNome;
    private javax.swing.JTextField saidaNumero;
    private javax.swing.JTextField saidaRua;
    private javax.swing.JFormattedTextField saidaTelefone;
    // End of variables declaration//GEN-END:variables
}
