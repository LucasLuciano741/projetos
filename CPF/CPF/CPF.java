
/**
 * Escreva a descrição da classe CPF aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class CPF
{
        int num1 = 5;
        int num2 = 2;
        int num3 = 9;
        int num4 = 9;
        int num5 = 8;
        int num6 = 2;
        int num7 = 2;
        int num8 = 4;
        int num9 = 7;
        int num10 = 2;
        int num11 = 5;
        int soma1;
        int soma2;
        int resto1;
        int resto2;
        int valido;
    public int checagemCpf(){
        if((num1==num2)&&(num2==num3)&&(num3==num4)&&(num4==num5)&&(num5==num6)&&(num6==num7)&&(num7==num8)&&(num8==num9)&&(num9==num10)&&(num10==num11)){
            valido = 0;
        }
        else{
            soma1=num1*10+num2*9+num3*8+num4*7+num5*6+num6*5+num7*4+num8*3+num9*2;
            resto1=(soma1*10)/11;
            if(resto1==10){
                resto1=0;
            }
        }
        if((num1==num2)&&(num2==num3)&&(num3==num4)&&(num4==num5)&&(num5==num6)&&(num6==num7)&&(num7==num8)&&(num8==num9)&&(num9==num10)&&(num10==num11)){
            return 0;
        }
        else{
            soma2=num1*11+num2*10+num3*9+num4*8+num5*7+num6*6+num7*5+num8*4+num9*3+num10*2;
            resto2=(soma2*10)/11;
            if(resto2==10){
                resto2=0;
            }
        }
        if(resto1==num10 && resto2==num11){
            System.out.println("CPF valido");
        }
        else{
            System.out.println("CPF invalido");
        }
        return 0;
    }
}