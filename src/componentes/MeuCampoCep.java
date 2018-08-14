package componentes;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class MeuCampoCep extends MeuCampoFormatado {

    public MeuCampoCep(int colunas, String dica, boolean obrigatorio, boolean podeHabilitar) {
        super(colunas, dica, obrigatorio, podeHabilitar);
        try {
            MaskFormatter mf = new MaskFormatter("#####-###");
            mf.install(this);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível iniciar MeuCampoCEP \n" + e);
        }
    }

    public MeuCampoCep() {
        super(8, "", false, true);
        try {
            MaskFormatter mf = new MaskFormatter("#####-###");
            mf.install(this);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível iniciar MeuCampoCEP \n" + e);
        }
    }

    @Override
    public boolean eVazio() {
        return getText().replace("-", "").trim().isEmpty();
    }

    @Override
    public boolean eValido() {
        return true;
    }

    @Override
    public void limpar() {
        setText("");

    }

    @Override
    public void setValor(Object valor) {
        setText((String) valor);
    }

    @Override
    public Object getValor() {
        return getText();
    }
}
