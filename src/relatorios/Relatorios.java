//package relatorios;
//
//import java.util.HashMap;
//import javax.swing.JOptionPane;
//import modeloConection.Conexao;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//
//public class Relatorios {
//
//    public JasperPrint relat;
//    Conexao conexao = new Conexao();
//
//    public JasperPrint gerarRelatorio() {
//        try {
//            HashMap map = new HashMap();
//            String arquivo = "C:\\AgendaContato\\src\\MyReports\\relatorioContatoCorreto.jasper";
//            relat = JasperFillManager.fillReport(arquivo, map, conexao.conn);
//        } catch (Exception e) { 
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Impossivel abrir relatorio\n" + e);
//        }
//        return relat;
//    }
//
//}
