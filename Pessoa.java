
/**
 * Classe abstrata Pessoa - escreva a descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
public abstract class Pessoa
{
    private String nome;
    private String rg;
    private String cpf;
    
    public void setNome(String value) {
        this.nome = value;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setRG(String value) {
        this.rg = value;
    }
    
    public String getRG() {
        return this.rg;
    }
    
    public void setCPF(String value) {
        this.cpf = value;
    }
    
    public String getCPF() {
        return this.cpf;
    }
}
