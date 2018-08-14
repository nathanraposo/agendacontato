package componentes;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFormattedTextField;
import javax.swing.border.LineBorder;

public class MeuCampoFormatado extends JFormattedTextField implements MeuComponente, FocusListener {    
    private boolean obrigatorio;
    private String dica;
    private boolean podeHabilitar;

    public MeuCampoFormatado(int colunas, String dica, boolean obrigatorio, boolean podeHabilitar) {
        setColumns(colunas);
        this.obrigatorio = obrigatorio;
        this.dica = dica;
        this.podeHabilitar = podeHabilitar;
        if (eObrigatorio()) {
           setBorder(new LineBorder(Color.GRAY));
        }
        addFocusListener(this);
    }

    @Override
    public String getDica() {
        return dica;
    }

    @Override
    public boolean eObrigatorio() {
         return obrigatorio;
    }

    @Override
    public boolean eValido() {
         return true;
    }

    @Override
    public boolean eVazio() {
        return getText().trim().isEmpty();
    }

    @Override
    public void habilitar(boolean status) {
        setEnabled(status && podeHabilitar);
    }

    @Override
    public void limpar() {
        setText("");
    }

    @Override
    public void focusGained(FocusEvent e) {
        setBorder(new LineBorder(Color.BLUE));
        setCaretPosition(0);
    }

    @Override
    public void focusLost(FocusEvent e) {
       if(obrigatorio && eValido() ){
           setBorder(new LineBorder(Color.GREEN));
        }else if(obrigatorio){
           setBorder(new LineBorder(Color.RED));
        }else{
            setBorder(new LineBorder(Color.GREEN));
        }
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