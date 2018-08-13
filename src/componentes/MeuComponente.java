package componentes;
public interface MeuComponente {
    public String getDica();
    public boolean eObrigatorio();
    public boolean eValido();
    public boolean eVazio();
    public void habilitar(boolean status);
    public void limpar();
    public void setValor(Object valor);
    public Object getValor();
}
