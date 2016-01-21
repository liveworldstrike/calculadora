
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {

    }

    /**
     * metodo que inprime los multiplos (5 primeros)entre 10-95 
     */
    public void multiplesOfFive()
    {
        int multi = 10;
        while(multi < 90){
            multi = multi + 5;
            System.out.println(multi);
        }
    }

    /**
     * metodo que imprime por pantalla la suma de los números comprendidos entre el 0 y el 10 (ambos incluidos)
     */
    public void sumValues()
    {
        int sum = 0;
        int cont = 0;
        while (cont < 10){
            cont = cont + 1 ;
            sum = sum + cont ;

        }
        System.out.println("la suma de los números comprendidos entre el 0 y el 10 (ambos incluidos)" + " = " + sum);
    }

    /**
     * metodo que devuelve la suma de los valores comprendidos entre dichos parámetros
     */
    public int sumValuesInterval(int a ,int b )
    {
        int sum ;
        if (a>=0 && b>=0){
            if (a > b){
                int almacenado = a;
                a = b;
                b = almacenado;
            }
            sum = a;
            while (a < b){
                a++;
                sum = sum + a ;
            }

        }
        else{
            System.out.println("numero mal introducido solo valores positivo" );
            sum = -1;
        }
        return sum;
    }

    /**
     * metodo que devuelve verdadero si el parámetro n es primo o falso en caso contrario
     */
    public boolean isPrime(int n)
    {
        boolean siPrimo = true;
        int num = 0;
        while(2 <=(n-(num+1))){
            num++;
            int divi =(n % (n-num));
            if (divi == 0){
                siPrimo = false;
            }
        
        }
        return (siPrimo);
    }

}
