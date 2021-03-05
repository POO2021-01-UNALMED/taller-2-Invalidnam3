package test;

import java.util.Arrays;

public class Asiento {
  String color;
  int precio;
  int registro;
  
  public void cambiarColor(String color) {
    String[] coloresPermitidos = {"rojo", "verde", "amarillo", "negro", "blanco"};
    if (!Arrays.asList(coloresPermitidos).contains(color)) {
      System.out.println("Color no permitido");
    } else {
      this.color = color;
    }
  } 
}
