
/**
 * Escreva a descrição da classe SalarioCLT aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class SalarioCLT implements Salario
{

    private double bonus;
    private double valorBruto;
    
    /**
     * COnstrutor para objetos da classe SalarioCLT
     */
    public SalarioCLT(double valorBruto, double bonusPericulosidade, double bonusComissao)
    {
        this.bonus = bonusPericulosidade + bonusComissao;
        this.valorBruto = valorBruto;
    }
    
    public double getValorLiquido() {
        return (this.valorBruto + this.bonus) - this.getDescontoSalario();
    }
    
    public double getValorBruto() {
        return this.valorBruto;
    }
    
    public double getDescontoSalario() {
        double valorTotal = this.valorBruto + this.bonus;
        if (valorTotal < 1045.0) {
            return valorTotal * (7.5 / 100.0);
        } else if (valorTotal < 2089.6) {
            return valorTotal * (9 / 100.0);
        } else if (valorTotal < 3134.4) {
            return valorTotal * (12 / 100.0);
        } else if (valorTotal < 6101.06) {
            return valorTotal * (14 / 100.0);
        } else
            return valorTotal * (27 / 100.0);
    }
    
}
