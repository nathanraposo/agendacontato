package componentes;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class MeuCampoJTextField extends JTextField implements MeuComponente, FocusListener {

    private String dica;
    private boolean obrigatorio;
    private boolean podeHabilitar;

    //metodo construtor
    public MeuCampoJTextField(int colunas, String dica, boolean obrigatorio, boolean podeHabilitar) {
        super(colunas);
        this.dica = dica;
        this.obrigatorio = obrigatorio;
        this.podeHabilitar = podeHabilitar;
        addFocusListener(this);// add um ouvinte e quem vai ouvir é a propria classe
        if (obrigatorio) {
            setBorder(new LineBorder(Color.GRAY));
        }
    }

    @Override
    public String getDica() {
        return dica;
    }

    //quando vc ganha o foco quando vc entra no campo
    @Override
    public void focusGained(FocusEvent fe) {
        setBorder(new LineBorder(Color.BLUE));
    }

    // qunado vc sai do campo perde o foco
    @Override
    public void focusLost(FocusEvent fe) {
        if (obrigatorio && eValido()) {
            setBorder(new LineBorder(Color.GREEN));
        } else if (obrigatorio) {
            setBorder(new LineBorder(Color.RED));
        } else {
            setBorder(new LineBorder(Color.GREEN));
        }
    }

    @Override
    public boolean eObrigatorio() {
        return obrigatorio;
    }

    @Override
    public void habilitar(boolean status) {
        setEnabled(podeHabilitar && status);
        setBorder(new LineBorder(Color.GRAY));
    }

    @Override
    public void limpar() {
        setText("");
    }

    @Override
    public boolean eVazio() {
        return getText().trim().isEmpty();
    }

    @Override
    public boolean eValido() {
        return true;
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
