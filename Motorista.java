
/**
 * Escreva a descrição da classe Motorista aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Motorista extends Pessoa implements Funcionario
{
    private Salario salario;
    
    /**
     * COnstrutor para objetos da classe Professor
     */
    public Motorista(String nomeCompleto, String rg, String cpf, Salario salario)
    {
        super();
        this.setNome(nomeCompleto);
        this.setRG(rg);
        this.setCPF(cpf);
        this.salario = salario;
    }
    
    
    public String getNomeCompleto() {
        return this.getNome();
    }
    
    public String getDocumentoIdentificacao() {
        if (this.getCPF() == null)
            return this.getRG();
        return this.getCPF();
    }
    
    public void setSalario(Salario salario) {
        this.salario = salario;
    }
    
    public Salario getSalario() {
        return this.salario;
    }
}
