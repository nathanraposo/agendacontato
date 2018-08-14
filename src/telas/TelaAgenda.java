package telas;

import java.awt.Component;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.text.SimpleDateFormat;
import modeloDao.DaoContato;
import java.util.Date;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableRowSorter;
import modeloBeans.BeansContato;
import modeloBeans.tableModelContato;
import modeloConection.Conexao;

public class TelaAgenda extends javax.swing.JFrame {

    BeansContato modContato = new BeansContato();
    DaoContato daoContato = new DaoContato();
    Conexao conexao = new Conexao();
    public tableModelContato modelContato;

    public boolean temDadosnaTela = false;
    public final int PADRAO = 0;
    public final int INCLUINDO = 1;
    public final int ALTERANDO = 2;
    public final int EXCLUINDO = 3;
    public final int CONSULTANDO = 4;
    public int estadoTela = PADRAO;
    public List dadoTabela;

    URL url = this.getClass().getResource("/imagens/iconAgenda.png");
    Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);

    public TelaAgenda() {
        initComponents();
        this.modelContato = new tableModelContato();
        this.jTableContato.setModel(modelContato);
        preparaTabela();
        pesquisaPreencheTabela("SELECT * FROM CONTATO ORDER BY NOME");
        this.setIconImage(imagemTitulo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpComponentes = new javax.swing.JPanel();
        jtTelResidencial = new componentes.MeuCampoTelefone();
        jtNome = new componentes.MeuCampoTexto();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtTelComercial = new componentes.MeuCampoTelefone();
        jLabel3 = new javax.swing.JLabel();
        jtTelCelular = new componentes.MeuCampoTelefone();
        jLabel4 = new javax.swing.JLabel();
        jtEmpresa = new componentes.MeuCampoTexto();
        jLabel5 = new javax.swing.JLabel();
        jtEmail = new componentes.MeuCampoTexto();
        jLabel6 = new javax.swing.JLabel();
        meuCampoDataCadastro = new componentes.MeuCampoData();
        jLabel7 = new javax.swing.JLabel();
        meuCampoDataAlteracao = new componentes.MeuCampoData();
        jLabel8 = new javax.swing.JLabel();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jtCodigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jtPesquisa = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableContato = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jlTabela = new javax.swing.JLabel();
        jtRelatorio = new javax.swing.JButton();
        jtBairro = new componentes.MeuCampoTexto();
        jtEndereco = new componentes.MeuCampoTexto();
        jtComplemento = new componentes.MeuCampoTexto();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtCidade = new componentes.MeuCampoTexto();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtObs = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jtDataUltimaVisita = new componentes.MeuCampoData();
        jLabel16 = new javax.swing.JLabel();
        jtCep = new componentes.MeuCampoCep();
        jrButon = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Contatos V.1.5 NathanRaposo");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(0));

        jpComponentes.setBorder(new javax.swing.border.SoftBevelBorder(0));

        jtTelResidencial.setEnabled(false);

        jtNome.setEnabled(false);

        jLabel1.setText("Nome:");

        jLabel2.setText("Telefone Residencial:");

        jtTelComercial.setEnabled(false);

        jLabel3.setText("Telefone Comercial:");

        jtTelCelular.setEnabled(false);

        jLabel4.setText("Telefone Celular:");

        jtEmpresa.setEnabled(false);

        jLabel5.setText("Empresa:");

        jtEmail.setEnabled(false);

        jLabel6.setText("Email:");

        meuCampoDataCadastro.setEnabled(false);

        jLabel7.setText("Data Cadastro:");

        meuCampoDataAlteracao.setEnabled(false);

        jLabel8.setText("Data Ultima Alteração:");

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.setEnabled(false);
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jtCodigo.setForeground(new java.awt.Color(51, 51, 255));
        jtCodigo.setEnabled(false);

        jLabel9.setText("Código:");

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyPressed(evt);
            }
        });

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jTableContato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableContato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableContatoMouseClicked(evt);
            }
        });
        jTableContato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableContatoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTableContato);

        jlTabela.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(749, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTabela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jtRelatorio.setText("Relatorio");
        jtRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtRelatorioActionPerformed(evt);
            }
        });

        jtBairro.setEnabled(false);

        jtEndereco.setEnabled(false);

        jtComplemento.setEnabled(false);

        jLabel10.setText("Endereço:");

        jLabel11.setText("Bairro:");

        jLabel12.setText("Complemento");

        jLabel13.setText("CEP:");

        jtCidade.setEnabled(false);

        jLabel14.setText("Cidade:");

        jtObs.setColumns(20);
        jtObs.setRows(5);
        jtObs.setEnabled(false);
        jScrollPane1.setViewportView(jtObs);

        jLabel15.setText("Observação:");

        jtDataUltimaVisita.setEnabled(false);
        jtDataUltimaVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDataUltimaVisitaActionPerformed(evt);
            }
        });

        jLabel16.setText("Data Ultima Visita:");

        jtCep.setEnabled(false);

        jrButon.setText("Hoje");
        jrButon.setEnabled(false);
        jrButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpComponentesLayout = new javax.swing.GroupLayout(jpComponentes);
        jpComponentes.setLayout(jpComponentesLayout);
        jpComponentesLayout.setHorizontalGroup(
            jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComponentesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpComponentesLayout.createSequentialGroup()
                        .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComponentesLayout.createSequentialGroup()
                        .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpComponentesLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComponentesLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(meuCampoDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(meuCampoDataAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpComponentesLayout.createSequentialGroup()
                        .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpComponentesLayout.createSequentialGroup()
                                .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpComponentesLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(183, 183, 183))
                                    .addGroup(jpComponentesLayout.createSequentialGroup()
                                        .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGap(8, 8, 8)))
                                .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jpComponentesLayout.createSequentialGroup()
                                .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpComponentesLayout.createSequentialGroup()
                                        .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jtTelResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jtTelComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jtTelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpComponentesLayout.createSequentialGroup()
                                        .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                                .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))))
                        .addContainerGap())
                    .addGroup(jpComponentesLayout.createSequentialGroup()
                        .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpComponentesLayout.createSequentialGroup()
                                .addComponent(jtDataUltimaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrButon))
                            .addComponent(jLabel16))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 941, Short.MAX_VALUE)
        );
        jpComponentesLayout.setVerticalGroup(
            jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComponentesLayout.createSequentialGroup()
                .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpComponentesLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addComponent(jLabel9)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jpComponentesLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(1, 1, 1)
                            .addComponent(meuCampoDataAlteracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jpComponentesLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(1, 1, 1)
                            .addComponent(meuCampoDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpComponentesLayout.createSequentialGroup()
                        .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jpComponentesLayout.createSequentialGroup()
                                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpComponentesLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpComponentesLayout.createSequentialGroup()
                                        .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComponentesLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtTelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jpComponentesLayout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtTelResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jpComponentesLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtTelComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpComponentesLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(2, 2, 2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComponentesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addGap(10, 10, 10)))
                .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDataUltimaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrButon))
                .addGap(18, 18, 18)
                .addGroup(jpComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpComponentes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpComponentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(963, 706));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        novoContato();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        salvarContato();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        pesquisaPreencheTabela("SELECT * FROM CONTATO WHERE NOME LIKE '%" + jtPesquisa.getText() + "%'");
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        alterarContato();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jTableContatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableContatoMouseClicked
        setComponentes();
        habilitaBotoes();
    }//GEN-LAST:event_jTableContatoMouseClicked

    private void jTableContatoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableContatoKeyReleased
        setComponentes();
        habilitaBotoes();
    }//GEN-LAST:event_jTableContatoKeyReleased

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir ?", "Confirmação de exclusão", JOptionPane.YES_NO_OPTION, 0);
        if (opcao == JOptionPane.YES_OPTION) {
            excluirContato();
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jbPesquisar.doClick();
        }
    }//GEN-LAST:event_jtPesquisaKeyPressed

    private void jtRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtRelatorioActionPerformed
//        Relatorios rel = new Relatorios();
//        try {
//            JasperViewer.viewReport(rel.gerarRelatorio(), false);
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_jtRelatorioActionPerformed

    private void jrButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrButonActionPerformed
        if (jrButon.isSelected()) {
            jtDataUltimaVisita.setDataDia(true);
        } else if (!jrButon.isSelected()) {
            jtDataUltimaVisita.limpar();
        }
    }//GEN-LAST:event_jrButonActionPerformed

    private void jtDataUltimaVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDataUltimaVisitaActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String data = sdf.format(new Date());
        System.out.println("teste entrou");
        if (jtDataUltimaVisita.getValor() == data) {
            System.out.println("entrou dentro");
            jrButon.setSelected(true);
        }
    }//GEN-LAST:event_jtDataUltimaVisitaActionPerformed

    private void novoContato() {
        estadoTela = INCLUINDO;
        limparCampos(jpComponentes);
        jtCodigo.setText(daoContato.proximoContato());
        Conexao.desconecta();
        habilitaBotoes();
        habilitarCampos(jpComponentes, true);
        meuCampoDataCadastro.setDataDia(true);
        meuCampoDataAlteracao.setDataDia(true);
        jtNome.requestFocus();
        jTableContato.setEnabled(false);
        jtDataUltimaVisita.setDataDia(true);
    }

    private boolean salvarContato() throws HeadlessException, NumberFormatException {
        if (jtNome.eVazio()) {
            JOptionPane.showMessageDialog(null, "Campo nome é obrigatorio!", "Atenção", 0);
            jtNome.requestFocus();
            return true;
        }
        if (estadoTela == INCLUINDO) {
            temDadosnaTela = false;
            setPersistencia(modContato);
            daoContato.incluir(modContato);
            pesquisaPreencheTabela("SELECT * FROM CONTATO ORDER BY NOME");
            limparCampos(jpComponentes);
            habilitaBotoes();
            habilitarCampos(jpComponentes, false);
            jbCancelar.doClick();
        } else if (estadoTela == ALTERANDO) {
            temDadosnaTela = false;
            setPersistencia(modContato);
            modContato.setId(Integer.parseInt(jtCodigo.getText()));
            daoContato.alterar(modContato);
            pesquisaPreencheTabela("SELECT * FROM CONTATO ORDER BY NOME");
            limparCampos(jpComponentes);
            habilitaBotoes();
            habilitarCampos(jpComponentes, false);
            jbCancelar.doClick();
        }
        return false;
    }

    private void cancelar() {
        estadoTela = PADRAO;
        temDadosnaTela = false;
        limparCampos(jpComponentes);
        habilitaBotoes();
        habilitarCampos(jpComponentes, false);
    }

    private void alterarContato() {
        estadoTela = ALTERANDO;
        jtNome.requestFocus();
        habilitaBotoes();
        habilitarCampos(jpComponentes, true);
    }

    private void excluirContato() throws NumberFormatException {
        modContato.setId(Integer.parseInt(jtCodigo.getText()));
        daoContato.excluir(modContato);
        pesquisaPreencheTabela("SELECT * FROM CONTATO ORDER BY NOME");
        limparCampos(jpComponentes);
        temDadosnaTela = false;
        habilitaBotoes();
    }

    public void habilitarCampos(Container container, boolean acao) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                ((JTextField) component).setEnabled(acao);
                jtObs.setEnabled(acao);
                jtCodigo.setEnabled(false);
                jTableContato.setEnabled(true);
                jtDataUltimaVisita.setEditable(true);
                jrButon.setEnabled(acao);
            }
        }
    }

    public void habilitaBotoes() {
        jbNovo.setEnabled(estadoTela == PADRAO);
        jbAlterar.setEnabled(estadoTela == PADRAO && temDadosnaTela);
        jbExcluir.setEnabled(estadoTela == PADRAO && temDadosnaTela);
        jbSalvar.setEnabled(estadoTela == INCLUINDO || estadoTela == ALTERANDO || estadoTela == EXCLUINDO);
        jbCancelar.setEnabled(estadoTela == INCLUINDO || estadoTela == ALTERANDO || estadoTela == EXCLUINDO);
    }

    public void limparCampos(Container container) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText(null);
                jtObs.setText("");
                jlTabela.setText("");
                jrButon.setSelected(false);
            } else if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                field.setText("");
            }
        }
    }

    public void setGui(BeansContato modConsultaContato) {
        jtCodigo.setText("" + modConsultaContato.getId());
        jtNome.setText(modConsultaContato.getNome());
        jtTelResidencial.setText(modConsultaContato.getTelefoneResidencial());
        jtTelComercial.setText(modConsultaContato.getTelefoneComercial());
        jtTelCelular.setText(modConsultaContato.getTelefoneCelular());
        jtEmpresa.setText(modConsultaContato.getEmpresa());
        jtEmail.setText(modConsultaContato.getEmail());
        meuCampoDataCadastro.setText("" + modConsultaContato.getDataCadastro());
        meuCampoDataAlteracao.setText("" + modConsultaContato.getDataAlteracao());
        jtEndereco.setText(modConsultaContato.getEndereco());
        jtBairro.setText(modConsultaContato.getBairro());
        jtComplemento.setText(modConsultaContato.getComplemento());
        jtCep.setText(modConsultaContato.getCep());
        jtCidade.setText(modConsultaContato.getCidade());
        jtObs.setText(modConsultaContato.getObs());
        jtDataUltimaVisita.setText("" + modConsultaContato.getDataUltimaVisita());
    }

    public void setPersistencia(BeansContato modContato) {
        modContato.setNome("" + jtNome.getValor());
        modContato.setTelefoneResidencial(jtTelResidencial.getText());
        modContato.setTelefoneComercial(jtTelComercial.getText());
        modContato.setTelefoneCelular(jtTelCelular.getText());
        modContato.setEmpresa(jtEmpresa.getText());
        modContato.setEmail(jtEmail.getText());
        modContato.setDataCadastro((Date) meuCampoDataCadastro.getValor());
        modContato.setDataAlteracao((Date) meuCampoDataAlteracao.getValor());
        modContato.setEndereco(jtEndereco.getText());
        modContato.setBairro(jtBairro.getText());
        modContato.setComplemento(jtComplemento.getText());
        modContato.setCep(jtCep.getText());
        modContato.setCidade(jtCidade.getText());
        modContato.setObs(jtObs.getText());
        modContato.setDataUltimaVisita((Date) jtDataUltimaVisita.getValor());
    }

    public void setComponentes() {
        limparCampos(jpComponentes);
        temDadosnaTela = true;
        try {
            Conexao.conexaoDB();
            conexao.executaSql("select * from contato where id ='" + jTableContato.getValueAt(jTableContato.getSelectedRow(), 0) + "'");

            //Campos de Texto
            jtEndereco.setText(conexao.rs.getString("endereco"));
            jtBairro.setText(conexao.rs.getString("bairro"));
            jtComplemento.setText(conexao.rs.getString("complemento"));
            jtCep.setText(conexao.rs.getString("cep"));
            jtCidade.setText(conexao.rs.getString("cidade"));
            jtObs.setText(conexao.rs.getString("obs"));
            jtEmpresa.setText(conexao.rs.getString("empresa"));
            jtEmail.setText(conexao.rs.getString("email"));

            //Campos de Datas
            meuCampoDataCadastro.setValor(Conexao.dataDoBanco(conexao.rs.getDate("dataCadastro")));
            meuCampoDataAlteracao.setValor(Conexao.dataDoBanco(conexao.rs.getDate("dataAlteracao")));
            jtDataUltimaVisita.setValor(Conexao.dataDoBanco(conexao.rs.getDate("dataUltimaVisita")));

        } catch (Exception e) {
            e.printStackTrace();
        }
        Conexao.desconecta();

        jlTabela.setText("" + jTableContato.getValueAt(jTableContato.getSelectedRow(), 1));
        jtCodigo.setText("" + jTableContato.getValueAt(jTableContato.getSelectedRow(), 0));
        jtNome.setText("" + jTableContato.getValueAt(jTableContato.getSelectedRow(), 1));
        jtTelResidencial.setText("" + jTableContato.getValueAt(jTableContato.getSelectedRow(), 2));
        jtTelComercial.setText("" + jTableContato.getValueAt(jTableContato.getSelectedRow(), 3));
        jtTelCelular.setText("" + jTableContato.getValueAt(jTableContato.getSelectedRow(), 4));
    }

    public void pesquisaPreencheTabela(String sql) {
        if (daoContato.preencheTabela(sql).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Contato não Encontrado!");
        } else {
            modelContato.setDados(daoContato.preencheTabela(sql));
        }
    }

    public void preparaTabela() {
        jTableContato.getColumnModel().getColumn(0).setPreferredWidth(35);
        jTableContato.getColumnModel().getColumn(0).setResizable(false);

        jTableContato.getColumnModel().getColumn(1).setPreferredWidth(180);
        jTableContato.getColumnModel().getColumn(1).setResizable(false);

        jTableContato.getColumnModel().getColumn(2).setPreferredWidth(130);
        jTableContato.getColumnModel().getColumn(2).setResizable(false);

        jTableContato.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTableContato.getColumnModel().getColumn(3).setResizable(false);

        jTableContato.getColumnModel().getColumn(4).setPreferredWidth(105);
        jTableContato.getColumnModel().getColumn(4).setResizable(false);

        jTableContato.getColumnModel().getColumn(5).setPreferredWidth(180);
        jTableContato.getColumnModel().getColumn(5).setResizable(false);

        jTableContato.getColumnModel().getColumn(6).setPreferredWidth(150);
        jTableContato.getColumnModel().getColumn(6).setResizable(false);

        jTableContato.getTableHeader().setReorderingAllowed(false);
        jTableContato.setAutoResizeMode(jTableContato.AUTO_RESIZE_OFF);
        jTableContato.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTableContato.setRowSorter(new TableRowSorter(modelContato));
    }

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
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAgenda().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableContato;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlTabela;
    private javax.swing.JPanel jpComponentes;
    private javax.swing.JRadioButton jrButon;
    private componentes.MeuCampoTexto jtBairro;
    private componentes.MeuCampoCep jtCep;
    private componentes.MeuCampoTexto jtCidade;
    private javax.swing.JTextField jtCodigo;
    private componentes.MeuCampoTexto jtComplemento;
    private componentes.MeuCampoData jtDataUltimaVisita;
    private componentes.MeuCampoTexto jtEmail;
    private componentes.MeuCampoTexto jtEmpresa;
    private componentes.MeuCampoTexto jtEndereco;
    private componentes.MeuCampoTexto jtNome;
    private javax.swing.JTextArea jtObs;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JButton jtRelatorio;
    private componentes.MeuCampoTelefone jtTelCelular;
    private componentes.MeuCampoTelefone jtTelComercial;
    private componentes.MeuCampoTelefone jtTelResidencial;
    private componentes.MeuCampoData meuCampoDataAlteracao;
    private componentes.MeuCampoData meuCampoDataCadastro;
    // End of variables declaration//GEN-END:variables
}
