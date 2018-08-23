package modeloBeans;

import java.util.Date;

@Entity
public class Contato {

    @id
    @Column
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String nome;
    private String telefoneResidencial;
    private String telefoneComercial;
    private String telefoneCelular;
    private String empresa;
    private String email;
    private Date dataCadastro;
    private Date dataAlteracao;
    private String endereco;
    private String bairro;
    private String complemento;
    private String cep;
    private String cidade;
    private String obs;
    private Date dataUltimaVisita;
    String pesquisa;

    public Contato(int id, String nome, String telefoneResidencial, String telefoneComercial, String telefoneCelular, String empresa, String email, Date dataCadastro, Date dataAlteracao) {
        this.id = id;
        this.nome = nome;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneComercial = telefoneComercial;
        this.telefoneCelular = telefoneCelular;
        this.empresa = empresa;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.dataAlteracao = dataAlteracao;
    }

    public Contato() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Date getDataUltimaVisita() {
        return dataUltimaVisita;
    }

    public void setDataUltimaVisita(Date dataUltimaVisita) {
        this.dataUltimaVisita = dataUltimaVisita;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
}
