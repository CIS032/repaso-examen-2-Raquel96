/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raquel
 */
public class Triangulo extends FiguraGeometrica {

    private Punto v1;
    private Punto v2;
    private Punto v3;

    public Triangulo(Punto v1, Punto v2, Punto v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Triangulo() {
    }

    @Override
    public void mover(int dx, int dy) {
        this.v1.setX(this.v1.getX() + dx);
        this.v1.setY(this.v1.getY() + dy);
        this.v2.setX(this.v2.getX() + dx);
        this.v2.setY(this.v2.getY() + dy);
        this.v3.setX(this.v3.getX() + dx);
        this.v3.setY(this.v3.getY() + dy);

    }

    public Punto getV1() {
        return v1;
    }

    public void setV1(Punto v1) {
        this.v1 = v1;
    }

    public Punto getV2() {
        return v2;
    }

    public void setV2(Punto v2) {
        this.v2 = v2;
    }

    public Punto getV3() {
        return v3;
    }

    public void setV3(Punto v3) {
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "- v1 " + v1 + "- v2 " + v2 + "- v3 " + v3;
    }
}
