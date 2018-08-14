package componentes;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class MeuCampoTelefone extends MeuCampoFormatado {

    public MeuCampoTelefone() {
        super(9, "telefone", false, false);
        try {         //por causa do erro Unseption tem que criar esse try cath
            MaskFormatter mf = new MaskFormatter("(##)#####-####");
            mf.install(this); // metodo instals diga que o campo agora esta sendo comandado pela mascara
        } catch (ParseException e) {// nunca deixar o catch em branco
            JOptionPane.showMessageDialog(null, "Não Foi possivel criar o MeuCampoTelefone");
            e.printStackTrace();
        }
    }

    public MeuCampoTelefone(int colunas, String dica, boolean obrigatorio, boolean podeHabilitar) {
        super(9, dica, obrigatorio, podeHabilitar);
        try {         //por causa do erro Unseption tem que criar esse try cath
            MaskFormatter mf = new MaskFormatter("(##)######-####");
            mf.install(this); // metodo instals diga que o campo agora esta sendo comandado pela mascara
        } catch (ParseException e) {// nunca deixar o catch em branco
            JOptionPane.showMessageDialog(null, "Não Foi possivel criar o MeuCampoTelefone");
            e.printStackTrace();
        }
    }

    @Override
    public boolean eVazio() {
        return getText().equals("(  )     -    ");
    }

    @Override
    public boolean eValido() {
        return true;
    }
}
