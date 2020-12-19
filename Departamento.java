import java.util.ArrayList;

/**
 * Classe abstrata Departamento - escreva a descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
public abstract class Departamento
{
    private String nomeDepartamento;
    private ArrayList<Funcionario> funcionarios;
    
    public Departamento(String nomeDepartamento)
    {
        this.nomeDepartamento = nomeDepartamento;
        this.funcionarios = new ArrayList<Funcionario>();
    }
    
    public double valorTotalSalarios() {
        double soma = 0;
        for (int x = 0; x < this.funcionarios.size(); x++) {
            soma += this.funcionarios.get(x).getSalario().getValorBruto();
        }
        System.out.print("Departamento: " + this.nomeDepartamento + " - Valor Total Salários (Bruto): ");
        System.out.println(soma);
        return soma;
    }
    
    public void listaDeSalarios() {
        System.out.println("Departamento: " + this.nomeDepartamento + " - Lista de Salários");
        for (int x = 0; x < this.funcionarios.size(); x++) {
            System.out.print("-> " + this.funcionarios.get(x).getNomeCompleto() + ", Salário Bruto: ");
            System.out.println(this.funcionarios.get(x).getSalario().getValorBruto());
        }
        System.out.println("");        
    }
    
    public void listaFuncionarios() {
        System.out.println("Departamento: " + this.nomeDepartamento + " - Lista de Funcionários");
        for (int x = 0; x < this.funcionarios.size(); x++) {
            System.out.println("-> " + this.funcionarios.get(x).getNomeCompleto() + ", documento: " + this.funcionarios.get(x).getDocumentoIdentificacao());
        }
        System.out.println("");
    }
    
    public void calcularSalarios()
    {
        System.out.println("Departamento: " + this.nomeDepartamento + " - Calculando Salários Líquidos");
        for (int x = 0; x < this.funcionarios.size(); x++) {
            System.out.print("-> " + this.funcionarios.get(x).getNomeCompleto() + " - Salário Líquido: ");
            System.out.println(this.funcionarios.get(x).getSalario().getValorLiquido());
        }
        System.out.println("");
    }
    
    public void adicionarFuncionario(Funcionario func) {
        this.funcionarios.add(func);
    }
    
    public void setNomeDepartamento(String value) {
       this.nomeDepartamento = value; 
    }
    
    public String getNomeDepartamento() {
        return this.nomeDepartamento;
    }
}
