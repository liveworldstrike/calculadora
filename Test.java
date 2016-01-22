
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * An example of a method - replace this comment with your own
     */
    public void testIsPrime()
    {
        Calculadora calculadora = new Calculadora();
        boolean ultimaObcion = true;
        if( calculadora.isPrime(2)){

            System.out.println("Comprobando isPrime(2)... resultado correcto true / resultado metodo " + calculadora.isPrime(2)+ "... OK");
        }
        else {
            System.out.println("Comprobando isPrime(2)... resultado correcto true / resultado metodo " + calculadora.isPrime(2) + "... ERROR");
            ultimaObcion = false ;
        }
        if( calculadora.isPrime(4)){

            System.out.println("Comprobando isPrime(4)... resultado correcto true / resultado metodo " + calculadora.isPrime(4)+ "... OK");
        }
        else {
            System.out.println("Comprobando isPrime(4)... resultado correcto true / resultado metodo " + calculadora.isPrime(4) + "... ERROR");
            ultimaObcion = false ;
        }
        if( calculadora.isPrime(3)){

            System.out.println("Comprobando isPrime(3)... resultado correcto true / resultado metodo " + calculadora.isPrime(3)+ "... OK");
        }
        else {
            System.out.println("Comprobando isPrime(3)... resultado correcto true / resultado metodo " + calculadora.isPrime(3) + "... ERROR");
            ultimaObcion = false ;
        }
        if( calculadora.isPrime(5)){

            System.out.println("Comprobando isPrime(5)... resultado correcto true / resultado metodo " + calculadora.isPrime(5)+ "... OK");
        }
        else {
            System.out.println("Comprobando isPrime(5)... resultado correcto true / resultado metodo " + calculadora.isPrime(5) + "... ERROR");
            ultimaObcion = false ;
        }
        if( calculadora.isPrime(7)){

            System.out.println("Comprobando isPrime(7)... resultado correcto true / resultado metodo " + calculadora.isPrime(7)+ "... OK");
        }
        else {
            System.out.println("Comprobando isPrime(7)... resultado correcto true / resultado metodo " + calculadora.isPrime(7) + "... ERROR");
            ultimaObcion = false ;
        }

        if( calculadora.isPrime(10)){
            System.out.println("Comprobando isPrime(10)... resultado correcto false / resultado metodo " + calculadora.isPrime(10) + "... ERROR");
            ultimaObcion = false ;

        }
        else {
            System.out.println("Comprobando isPrime(10)... resultado correcto false / resultado metodo " + calculadora.isPrime(10)+ "... OK");
        }

        if( calculadora.isPrime(-1)){
            System.out.println("Comprobando isPrime(-1)... resultado correcto false / resultado metodo true... ERROR");
            ultimaObcion = false ;

        }
        else {
            System.out.println("Comprobando isPrime(-1)... resultado correcto false / resultado metodo false... OK");
        }

        if (ultimaObcion) {
            System.out.println("El método SI funciona correctamente");
        }
        else{
            System.out.println("El método NO funciona correctamente");
        }

    }

    /**
     * Método que prueba si el funcionamiento de sumValuesInterval es correcto.
     */
    public void testSumValuesInterval()
    {
        Calculadora calculadora = new Calculadora();
        boolean bien = true;
        if (calculadora.sumValuesInterval(1,25) == 325){
            System.out.println("Comprobando sumValuesInterval(1,25)...resultado correcto 325/ resultado metodo -1... OK");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(1,25)...resultado correcto 325 / resultado metodo " + calculadora.sumValuesInterval(1,25) + "... ERROR");
            bien = false;
        }

        if (calculadora.sumValuesInterval(-1,7) == -1){
            System.out.println("Comprobando sumValuesInterval(-1,7)...resultado correcto -1 / resultado metodo -1... OK");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(-1,7)...resultado correcto -1 / resultado metodo " + calculadora.sumValuesInterval(-1,7) + "... ERROR");
            bien = false;
        }

        if (calculadora.sumValuesInterval(1,7) == 28){
            System.out.println("Comprobando sumValuesInterval(1,7)...resultado correcto 28 / resultado metodo 28... OK");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(1,7)...resultado correcto 28 / resultado metodo " + calculadora.sumValuesInterval(1,7) + "... ERROR");
            bien = false;
        }

        if (calculadora.sumValuesInterval(1,-7) == -1){
            System.out.println("Comprobando sumValuesInterval(1,-7)...resultado correcto -1 / resultado metodo -1... OK");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(1,-7)...resultado correcto -1 / resultado metodo " + calculadora.sumValuesInterval(1,-8) + "... ERROR");
            bien = false;
        }

        if (calculadora.sumValuesInterval(7,1) == 28){
            System.out.println("Comprobando sumValuesInterval(7,1)...resultado correcto 28 / resultado metodo 28... OK");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(7,1)...resultado correcto 28 / resultado metodo " + calculadora.sumValuesInterval(7,1) + "... ERROR");
            bien = false;
        }

        if (calculadora.sumValuesInterval(-1,-7) == -1){
            System.out.println("Comprobando sumValuesInterval(-1,-7)...resultado correcto -1 / resultado metodo -1... OK");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(-1,-7)...resultado correcto -1 / resultado metodo " + calculadora.sumValuesInterval(-1,-7) + "... ERROR");
            bien = false;
        }
        
        if (calculadora.sumValuesInterval(5,5) == 5){
            System.out.println("Comprobando sumValuesInterval(5,5)...resultado correcto 5 / resultado metodo 5... OK");
        }
        else{
            System.out.println("Comprobando sumValuesInterval(5,5)...resultado correcto 5 / resultado metodo " + calculadora.sumValuesInterval(5,5) + "... ERROR");
            bien = false;
        }

        if (bien){
            System.out.println("El método SI funciona correctamente");
        }
        else{
            System.out.println("El método NO funciona correctamente");
        }
    }
}
