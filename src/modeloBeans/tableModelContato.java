package modeloBeans;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class tableModelContato extends AbstractTableModel {

    private List<BeansContato> dados = new ArrayList();
    private String[] colunas = {"Cod", "Nome", "Telefone Residencial", "Telefone Comercial", "Telefone Celular", "Endereço", "Cidade"};

    public tableModelContato() {
        this.dados = new ArrayList<>();
    }

    public void addContato(BeansContato contato) {
        dados.add(contato);
        int numeroLinha = dados.size() - 1;
        fireTableRowsInserted(numeroLinha, numeroLinha);
    }

    public void removerContato(int linhaSelecionada) {
        if (linhaSelecionada >= 0) {
            dados.remove(linhaSelecionada);
            fireTableDataChanged();
        } else if (dados.size() > 0) {
            JOptionPane.showMessageDialog(null, "Selecione a linha a ser removida");
        } else {
            JOptionPane.showMessageDialog(null, "Nao existe linha para remover");
        }
    }

    public BeansContato getContato(int linhaSelecionada) {
        return this.dados.get(linhaSelecionada);
    }

    @Override
    public int getRowCount() {
        return this.dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    public void setDados(List<BeansContato> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }

    public List<BeansContato> getDados() {
        return dados;
    }

    public void removeRow(int row) {
        getLinhas().remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void limpaTabela() {
        getLinhas().clear();
        fireTableDataChanged();
    }

    public List getLinhas() {
        return dados;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dados.get(linha).getId();
            case 1:
                return dados.get(linha).getNome();
            case 2:
                return dados.get(linha).getTelefoneResidencial();
            case 3:
                return dados.get(linha).getTelefoneComercial();
            case 4:
                return dados.get(linha).getTelefoneCelular();
            case 5:
                return dados.get(linha).getEndereco();
            case 6:
                return dados.get(linha).getCidade();
            default:
                JOptionPane.showMessageDialog(null, "Não existe tratamento para a coluna " + coluna + " na tabela de Contatos (get)");
                return "";
        }
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0:
                dados.get(linha).setId((Integer) valor);
                break;
            case 1:
                dados.get(linha).setNome("" + valor);
                break;
            case 2:
                dados.get(linha).setTelefoneResidencial("" + valor);
                break;
            case 3:
                dados.get(linha).setTelefoneComercial("" + valor);
                break;
            case 4:
                dados.get(linha).setTelefoneCelular("" + valor);
                break;
            case 5:
                dados.get(linha).setEmpresa("" + valor);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Não existe tratamento para a coluna " + coluna + " na tabela de Contatos. (set)");
        }
        fireTableCellUpdated(linha, coluna);
    }

    @Override
    public String getColumnName(int coluna) {
        return this.colunas[coluna];
    }
}