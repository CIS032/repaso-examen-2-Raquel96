/*
 * Crear un programa que permita implementar la lógica de un conjunto de 
 * figuras geométricas que se pueden dibujar sobre la pantalla del 
 * computador, tomando en cuenta que las coordenadas de la esquina superior 
 * izquierda son (0,0). Las figuras se deben representar concretamente con las 
 * coordenadas de sus vértices o centros y cada vez que se realice un movimiento 
 * se deberá grabar en un archivo de texto los datos de la figura a manera de
 * un registro histórico con el fin de que luego se puedan reconstruir o 
 * deshacer los cambios o movimientos previos.
 */

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Raquel
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion = 0;
        while (opcion != 5) {
            String menu = "1--> Crear Circulo \n "
                    + "2--> Crear Rectangulo \n "
                    + "3--> Crear Triangulo \n"
                    + "4--> Mover Figuras \n "
                    + "5--> Salir";
            opcion = Integer.parseInt(showInputDialog(
                    null, menu, "Movimientos de Figuras", JOptionPane.QUESTION_MESSAGE));
            switch (opcion) {
                case 1:
                    int xc = Integer.parseInt(showInputDialog(null, "Igrese X del centro", "Circulo"));
                    int yc = Integer.parseInt(showInputDialog(null, "Igrese Y del centro", "Circulo"));
                    double radio = Double.parseDouble(showInputDialog(null, "Igrese el radio del circulo", "Circulo"));

                    Circulo circulo = new Circulo();
                    circulo.radio = radio;
                    circulo.centro = new Punto(xc, yc);
                    Graficador.agregar(circulo);
                    break;
                case 2:
                    int xr1 = Integer.parseInt(showInputDialog(null, "Ingrese X del vertice 1", "Rectangulo"));
                    int yr1 = Integer.parseInt(showInputDialog(null, "Ingrese Y del vertice 1", "Rectangulo"));
                    int xr3 = Integer.parseInt(showInputDialog(null, "Ingrese X del vertice 3", "Rectangulo"));
                    int yr3 = Integer.parseInt(showInputDialog(null, "Ingrese Y del vertice 3", "Rectangulo"));
                    Cuadrado rectangulo = new Cuadrado(new Punto(xr1, yr1), new Punto(xr3, yr3));
                    Graficador.agregar(rectangulo);
                    break;
                case 3:
                    int xt1 = Integer.parseInt(showInputDialog(null, "Ingrese X del vertice 1", "Triangulo"));
                    int yt1 = Integer.parseInt(showInputDialog(null, "Ingrese Y del vertice 1", "Triangulo"));
                    int xt2 = Integer.parseInt(showInputDialog(null, "Ingrese X del vertice 2", "Triangulo"));
                    int yt2 = Integer.parseInt(showInputDialog(null, "Ingrese Y del vertice 2", "Triangulo"));
                    int xt3 = Integer.parseInt(showInputDialog(null, "Ingrese X del vertice 3", "Triangulo"));
                    int yt3 = Integer.parseInt(showInputDialog(null, "Ingrese Y del vertice 3", "Triangulo"));
                    Triangulo triangulo = new Triangulo(new Punto(xt1, yt1), new Punto(xt2, yt2), new Punto(xt3, yt3));
                    Graficador.agregar(triangulo);
                    break;
                case 4:
                    int dx = Integer.parseInt(showInputDialog(null, "Ingrese la distancia en X del movimiento", "Movimiento"));
                    int dy = Integer.parseInt(showInputDialog(null, "Ingrese la distancia en Y del movimiento", "Movimiento"));
                    Graficador.moverFiguras(dx, dy);
                    Graficador.grabar();
            }

        }
    }

}
