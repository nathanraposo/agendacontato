
package componentes;

import javax.swing.text.AttributeSet;
import javax.swing.text.PlainDocument;


public class MeuCampoTexto extends MeuCampoJTextField{
    private int minimoCaracteres ;

    public MeuCampoTexto(int colunas,int qtdCaracter, int minimoCaracteres, String dica, boolean obrigatorio,boolean podehabilitar) {
        super(colunas, dica,obrigatorio,podehabilitar);
        this.minimoCaracteres = minimoCaracteres;
        setDocument(new MeuDocument(qtdCaracter));
    }
    
    public MeuCampoTexto() {
        super(50, "campo texto",true,true);
        this.minimoCaracteres = minimoCaracteres;
        setDocument(new MeuDocument(50));
    }
    
    public boolean eValido(){
        return getText().trim().length() >= minimoCaracteres;
    }
    
    @Override
    public Object getValor() {
       return getText();
    }
    
    class MeuDocument extends PlainDocument{
        private int qtdCaracter;
        
        public MeuDocument(int qtdCaracter){
            this.qtdCaracter = qtdCaracter;
        }
        public void insertString(int offs, String str, AttributeSet a){
            try {
                if(getLength() < qtdCaracter){
                   super.insertString(offs, str.toUpperCase(), a);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
