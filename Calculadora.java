
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    // instance variables - replace the example below with your own
    private int multi;

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
        multi = 10;
        while(multi < 90){
            multi = multi +5;
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
        while (cont<10){
            cont = cont+1 ;
            sum = sum + cont ;

        }
        System.out.println("la suma de los números comprendidos entre el 0 y el 10 (ambos incluidos)" + " = " + sum);
    }
}
