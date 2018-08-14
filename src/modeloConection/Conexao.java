package modeloConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

public class Conexao {

    public static Connection conn = null;
    public static Statement stm;
    public ResultSet rs;
    public PreparedStatement prep;

    public static void conexaoDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            //conn = DriverManager.getConnection("jdbc:sqlite:C:\\AgendaContato\\banco\\\\agendadb.sqlite");
            conn = DriverManager.getConnection("jdbc:sqlite://home/nathan/NetBeansProjects/agendacontato/banco/agendadb.sqlite");

            //JOptionPane.showMessageDialog(null, "Banco Conectado Com sucesso! ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar com o banco sqlite " + e);
        }

    }

    public void exec(String sql) throws Exception {
        rs = stm.executeQuery(sql);
    }

//    public static Connection conexaoDB() {
//        try {
//            Class.forName("org.sqlite.JDBC");
//            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\app agenda\\agendadb.sqlite");
//            JOptionPane.showMessageDialog(null, "Banco Conectado Com sucesso! ");
//            return conn;
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Não foi possivel conectar com o banco sqlite " + e);
//            return null;
//        }
//    }
    public static void desconecta() {
        boolean result = true;
        try {
            if (conn != null) {
                conn.close();
                //JOptionPane.showMessageDialog(null, "banco fechado");
            }
        } catch (SQLException fecha) {
            JOptionPane.showMessageDialog(null, "Não foi possivel "
                    + "fechar o banco de dados: " + fecha);
            result = false;
        }
    }

    public static java.sql.Date dataParaBanco(Date data) {
        return new java.sql.Date(data.getTime());
    }

    public static Date dataDoBanco(java.sql.Date data) {
        return new Date(data.getTime());
    }

    public void executaSql(String sql) {
        try {
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql no metodo executaSQL \n " + e);
        }

    }
}
