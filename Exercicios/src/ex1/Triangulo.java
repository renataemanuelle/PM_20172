package ex1;

/**
 *
 * @author Renata
 */
public class Triangulo {
    
    public enum TiposTriangulo {
        EQUILATERO,
        ISOSCELES,
        ESCALENO,
        NAOEHTRIANGULO;
    }
    
    /**
     * TESTA SE AS MEDIDAS REPRESENTAM UM TRIANGULO
     * @param lado1 MEDIDA DO PRIMEIRO LADO
     * @param lado2 MEDIDA DO SEGUNDO LADO
     * @param lado3 MEDIDA DO TERCEIRO LADO
     * @return SE AS MEDIDAS CORRESPONDEM A TRIANGULO OU NÃO
     */
    
    public boolean testaTriangulo(double lado1, double lado2, double lado3) {
        return lado1 <= (lado2 + lado3) && lado1 >= Math.abs(lado2 - lado3)
            && lado2 <= (lado1 + lado3) && lado2 >= Math.abs(lado1 - lado3)
            && lado3 <= (lado1 + lado2) && lado3 >= Math.abs(lado1 - lado2);
    }
    
    /**
     * RETORNA O TIPO DE TRIANGULO DE ACORDO COM AS MEDIDAS DOS LADOS
     * @param lado1 MEDIDA DO PRIMEIRO LADO
     * @param lado2 MEDIDA DO SEGUNDO LADO
     * @param lado3 MEDIDA DO TERCEIRO LADO
     * @return O TIPO DO TRIANGULO
     */
    public TiposTriangulo tipoTriangulo(double lado1, double lado2, double lado3) {
        if(testaTriangulo(lado1, lado2, lado3)) {
            if(lado1 == lado2 && lado1 == lado3) return TiposTriangulo.EQUILATERO;
            else if ((lado1 == lado2 && lado1 != lado3) ||
                     (lado1 == lado3 && lado1 != lado2) ||
                     (lado2 == lado3 && lado1 != lado2)) return TiposTriangulo.ISOSCELES;
            else return TiposTriangulo.ESCALENO;
        } else return TiposTriangulo.NAOEHTRIANGULO;
    }

}
