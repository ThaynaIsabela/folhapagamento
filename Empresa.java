
/**
 * Escreva a descrição da classe Empresa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Empresa
{
    private java.util.ArrayList<Departamento> departamentos;

    /**
     * COnstrutor para objetos da classe Empresa
     */
    public Empresa()
    {
        this.departamentos = new java.util.ArrayList<Departamento>();
    }

    public void adicionarDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }
    
    public void listaFuncionarios() {
        for (int x = 0; x < this.departamentos.size(); x++) {
            this.departamentos.get(x).listaFuncionarios();
        }
    }
    
    public void valorTotalSalarios() {
        double soma = 0;
        for (int x = 0; x < this.departamentos.size(); x++) {
            soma += this.departamentos.get(x).valorTotalSalarios();
        }
        System.out.print("Valor total de salários da empresa: ");
        System.out.println(soma);
        System.out.println("");
    }    
    
    public void listaDeSalarios() {
        for (int x = 0; x < this.departamentos.size(); x++) {
            this.departamentos.get(x).listaDeSalarios();
        }
    }         
    
    public void calcularSalarios() {
        for (int x = 0; x < this.departamentos.size(); x++) {
            this.departamentos.get(x).calcularSalarios();
        }
    }        
    
    public static void main(String [] args) { 
        Empresa empresa = new Empresa();
        
        Departamento financeiro = new Financeiro();
        financeiro.adicionarFuncionario(new Administrativo("Joao das Flores", "12.123.123-12", "123.123.123-12", new SalarioCLT(1200, 0, 0)));
        financeiro.adicionarFuncionario(new Administrativo("Jose dos Ramos", "45.456.456-45", "456.456.456-45", new SalarioCLT(1350, 0, 0)));
        empresa.adicionarDepartamento(financeiro);
        
        Departamento ensino = new Ensino();
        ensino.adicionarFuncionario(new Professor("Tony Stark", "67.678.678-67", "678.678.678-67", new SalarioCLT(6500, 0, 1250)));
        ensino.adicionarFuncionario(new Professor("Flash", "89.890.890-89", "890.890.890-89", new SalarioCLT(4200, 0, 300)));        
        empresa.adicionarDepartamento(ensino);
        
        Departamento servicosGerais = new ServicosGerais();
        servicosGerais.adicionarFuncionario(new Motorista("Urso Pardo", "74.741.741-74", "741.741.741-74", new SalarioCLT(2300, 450, 0)));
        servicosGerais.adicionarFuncionario(new Motorista("Urso Branco", "85.852.852-85", "852.852.852-85", new SalarioCLT(2800, 550, 0)));        
        empresa.adicionarDepartamento(servicosGerais);
        
        empresa.listaFuncionarios();
        empresa.listaDeSalarios();
        empresa.valorTotalSalarios();
        empresa.calcularSalarios();
    }
    
}
