/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Raquel
 */
public class Graficador {

    static ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();

    public static void agregar(FiguraGeometrica f) {
        figuras.add(f);
    }

    public static void moverFiguras(int dx, int dy) {
        for (FiguraGeometrica figura : figuras) {
            figura.mover(dx, dy);
        }
    }

    public static void grabar() {
        PrintWriter pw = null;
        try {

            FileWriter fw = new FileWriter("Documento.txt", true);
            pw = new PrintWriter(fw);
        } catch (IOException ex) {
            System.out.println("Error al abrir archivos " + ex);
        }
        for (FiguraGeometrica figura : figuras) {
            if (figura instanceof Circulo) {
                Circulo c = (Circulo) figura;
                String linea = "Nombre: "
                        + c.getNombre() + "Radio:"
                        + c.getRadio() + " Centro"
                        + c.getCentro();
                pw.println(linea);
            }
            if (figura instanceof Cuadrado) {
                Cuadrado r = (Cuadrado) figura;
                String linea = "Nombre" + r.nombre
                        + " V1 " + r.getV1() + " V2 " + r.getV2() + " V3 " + r.getV3() + " V4 " + r.getV4();
                pw.println(linea);
            }
            if (figura instanceof Triangulo) {
                Triangulo t = (Triangulo) figura;
                String linea = "Nombre" + t.nombre
                        + " V1 " + t.getV1() + " V2 " + t.getV2() + " V3 " + t.getV3();
                pw.println(linea);
            }
        }
        pw.close();
    }

    public static String leer() {
        String temp = "";
        String aux;
        try {
            BufferedReader leer = new BufferedReader(new FileReader("Documento.txt"));

            while ((aux = leer.readLine()) != null) {
                temp += aux + "\n";

            }
            System.out.println("Figuras:\n" + temp);

        } catch (Exception e) {
        }
        return temp;
    }

}
