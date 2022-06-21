public class Quadrado {
    public static double area(double lado){
        if (lado >= 0){
            double resultado = lado * lado;
        return resultado;
        }else {
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
        }
    }
}
