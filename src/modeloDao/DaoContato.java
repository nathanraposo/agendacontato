package modeloDao;

import modeloConection.Conexao;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import modeloBeans.BeansContato;

public class DaoContato {

    BeansContato modContato = new BeansContato();
    Conexao conexao = new Conexao();
    private final String INSERIRSQL = "INSERT INTO CONTATO(nome,telefoneResi,telefoneComer,telefoneMovel,empresa,email,dataCadastro,dataAlteracao,endereco,bairro,complemento,cep,cidade,obs,dataUltimaVisita) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private final String CONSULTASQL = "SELECT * FROM CONTATO WHERE NOME LIKE '%" + modContato.getPesquisa() + "%'";
    private final String CONSULTASQLTABELA = "SELECT * FROM CONTATO ORDER BY NOME";
    private final String ALTERARSQL = "UPDATE CONTATO SET nome =?,telefoneResi =?,telefoneComer =?,telefoneMovel =?,empresa =?,email =?,dataAlteracao =?,endereco =?,bairro =?,complemento=?,cep=?,cidade =?,obs=?,dataUltimaVisita=? where id =?";

    public void incluir(BeansContato modContato) {
        conexao.conexaoDB();
        try {
            PreparedStatement ps = conexao.conn.prepareStatement(INSERIRSQL);
            ps.setString(1, modContato.getNome());
            ps.setString(2, modContato.getTelefoneResidencial());
            ps.setString(3, modContato.getTelefoneComercial());
            ps.setString(4, modContato.getTelefoneCelular());
            ps.setString(5, modContato.getEmpresa());
            ps.setString(6, modContato.getEmail());
            ps.setDate(7, Conexao.dataParaBanco(modContato.getDataCadastro()));
            ps.setDate(8, Conexao.dataParaBanco(modContato.getDataAlteracao()));
            ps.setString(9, modContato.getEndereco());
            ps.setString(10, modContato.getBairro());
            ps.setString(11, modContato.getComplemento());
            ps.setString(12, modContato.getCep());
            ps.setString(13, modContato.getCidade());
            ps.setString(14, modContato.getObs());
            if (modContato.getDataUltimaVisita() == null) {
                ps.setDate(15, null);
            } else {
                ps.setDate(15, Conexao.dataParaBanco(modContato.getDataUltimaVisita()));
            }
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!", "Sucesso.", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar Incluir!\n" + e, "Atenção", 0);
            return;
        }
        conexao.desconecta();
    }

    public void alterar(BeansContato modContato) {
        try {
            conexao.conexaoDB();
            PreparedStatement ps = conexao.conn.prepareStatement(ALTERARSQL);
            ps.setString(1, modContato.getNome());
            ps.setString(2, modContato.getTelefoneResidencial());
            ps.setString(3, modContato.getTelefoneComercial());
            ps.setString(4, modContato.getTelefoneCelular());
            ps.setString(5, modContato.getEmpresa());
            ps.setString(6, modContato.getEmail());
            ps.setDate(7, Conexao.dataParaBanco(new Date()));
            ps.setString(8, modContato.getEndereco());
            ps.setString(9, modContato.getBairro());
            ps.setString(10, modContato.getComplemento());
            ps.setString(11, modContato.getCep());
            ps.setString(12, modContato.getCidade());
            ps.setString(13, modContato.getObs());
            if (modContato.getDataUltimaVisita() == null) {
                ps.setDate(14, null);
            } else {
                ps.setDate(14, Conexao.dataParaBanco(modContato.getDataUltimaVisita()));
            }
            ps.setInt(15, modContato.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!", "Sucesso.", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar!\n" + e, "Atenção", 0);
            return;
        }
        conexao.desconecta();
    }

    public void excluir(BeansContato modContato) {
        try {
            conexao.conexaoDB();
            PreparedStatement ps = conexao.conn.prepareStatement("DELETE FROM CONTATO WHERE ID = ?");
            ps.setInt(1, modContato.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!", "Sucesso.", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + e, "Atenção", 0);
            return;
        }
        conexao.desconecta();
    }

    public List<BeansContato> preencheTabela(String sql) {
        List<BeansContato> listContatos = new ArrayList<BeansContato>();
        conexao.conexaoDB();
        conexao.executaSql(sql);
        try {
            while (conexao.rs.next()) {
                BeansContato bean = new BeansContato();
                bean.setId(conexao.rs.getInt("id"));
                bean.setNome(conexao.rs.getString("nome"));
                bean.setTelefoneResidencial(conexao.rs.getString("telefoneResi"));
                bean.setTelefoneComercial(conexao.rs.getString("telefoneComer"));
                bean.setTelefoneCelular(conexao.rs.getString("telefoneMovel"));
                bean.setEmpresa(conexao.rs.getString("empresa"));
                bean.setEmail(conexao.rs.getString("email"));
                bean.setDataCadastro(conexao.dataDoBanco(conexao.rs.getDate("dataCadastro")));
                bean.setDataAlteracao(conexao.dataDoBanco(conexao.rs.getDate("dataAlteracao")));
                bean.setEndereco(conexao.rs.getString("endereco"));
                bean.setCidade(conexao.rs.getString("cidade"));
                listContatos.add(bean);
            }
        } catch (Exception e) {
        }
        return listContatos;
    }

    public String proximoContato() {
        try {
            Conexao.conexaoDB();
            conexao.executaSql("SELECT * FROM CONTATO ORDER BY ID DESC LIMIT 1");
            if (conexao.rs.next()) {
                return (Integer.parseInt(conexao.rs.getString("id")) + 1) + "";
            } else {
                return "";
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Impossivel Cadastrar", "ERRO de sql", 0);
        }
        Conexao.desconecta();
        return "0";
    }
}