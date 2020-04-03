
/**
 * Escreva a descrição da classe IMC aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Pessoa
{
    double testealtura = 1.70;
    double testepeso = 70;
    double peso = testepeso;
    double altura = testealtura;
    
    public double calcImc(){
        double imc = this.peso/(this.altura*this.altura);
        if(imc < 18.5){
            System.out.println("Deficit de massa corporal");
        }
        if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Massa corporal normal");
        }
        if(imc >= 25.0 && imc <= 29.9){
            System.out.println("Sobrepeso");
        }
        if(imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade Leve");
        }
        if(imc >= 35.0 && imc <= 39.9){
            System.out.println("Obesidade média");
        }
        else{
            System.out.println("Obesidade morbida");
        }
        return imc;
    }
}