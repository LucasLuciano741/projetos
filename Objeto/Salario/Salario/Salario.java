
/**
 * Escreva a descrição da classe Salario aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Salario
{
    double testehorasTrabalhadas = 45.9;
    double testesalarioHora = 100.50;
    int testenDependentes = 2;
    double horasTrabalhadas = testehorasTrabalhadas;
    double salarioHora = testesalarioHora;
    int nDependentes = testenDependentes;
    public double calcSalBruto(){
        double salBruto = this.horasTrabalhadas*this.salarioHora+(50*this.nDependentes);
        return salBruto;
    }
    public double calcDescInss(){
        double descInss;
        double salarioBruto = this.calcSalBruto();
        if(salarioBruto <= 1000){
            descInss = salarioBruto * 8.5/100;
            return descInss;
        }else{
            descInss = salarioBruto * 9/100;
            return descInss;
        }
        }
    public double calDescIR(){
        double salBruto = this.calcSalBruto();
        double descIR;
        if(salBruto <= 500){
            descIR = 0.0;
            return descIR;
        }else if(salBruto > 500 && salBruto <= 1000){
            descIR = salBruto * 5/100;
            return descIR;
        }else{
            descIR = salBruto * 7/100;
            return descIR;
        }
    }
    public double calSalLiquido(){
        double salLiquido;
        salLiquido = this.calcSalBruto()-this.calcDescInss()-this.calDescIR();
        return salLiquido;
    }
}