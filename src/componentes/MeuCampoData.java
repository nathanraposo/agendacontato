package componentes;

import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentListener;
import javax.swing.text.MaskFormatter;

public class MeuCampoData extends MeuCampoFormatado {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private boolean dataDoDia;

    public MeuCampoData(int colunas, boolean obrigatorio, String dica, boolean podeHabilitar, boolean dataDoDia) {
        super(colunas, dica, obrigatorio, podeHabilitar);
        sdf.setLenient(false);
        this.dataDoDia = dataDoDia;
        try {
            MaskFormatter mf = new MaskFormatter("##/##/####");
            mf.install(this);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível iniciar MeuCampoData \n" + e);
        }
    }

    public MeuCampoData() {
        super(8, "data", true, false);
        sdf.setLenient(false);
        this.dataDoDia = dataDoDia;
        setEditable(false);
        try {
            MaskFormatter mf = new MaskFormatter("##/##/####");
            mf.install(this);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível iniciar MeuCampoData \n" + e);
        }
    }

    public void setDataDia(boolean dataDoDia) {
        if (dataDoDia) {
            setValor(new Date());
        }
    }

    public void focusGained(FocusEvent e) {
        super.focusGained(e);
        if (dataDoDia) {
            setValor(new Date());
        }
    }

    public boolean verificaVencimento(Date emissao, Date vencimento) {
        boolean data;
        if (emissao.before(vencimento)) {
            setToolTipText("");
            data = true;
        } else if (emissao.after(vencimento)) {
            setToolTipText("Data de Nascimento incorreta \n não pode ser data Futura!");
            data = false;
        } else {
            setToolTipText("");
            data = true;
        }
        if (emissao.equals(vencimento)) {
            return false;
        }
        return data;
    }

    @Override
    public boolean eVazio() {
        return getText().replace("/", "").trim().isEmpty();
    }

    @Override
    public boolean eValido() {
        try {
            if (!verificaVencimento(sdf.parse(getText()), new Date())) {
                return false;
            }
            sdf.parse(getText());
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    @Override
    public void limpar() {
        setText("");

    }

    @Override
    public void setValor(Object valor) {
        setText(sdf.format((Date) valor));
    }

    @Override
    public Object getValor() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            if (getText().equals("  /  /    ")) {
                return null;
            } else {
                return sdf.parse(getText());
            }

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível obter a data \n"+ e);
            return null;
        }
    }
}
