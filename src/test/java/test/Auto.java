package test;

public class Auto {
  String modelo;
  int precio;
  Asiento[] asientos;
  String marca;
  Motor motor;
  int registro;
  static int cantidadCreados;

  public int cantidadAsientos() {
    int c = 0;
    for (Asiento asiento : asientos)
      if (asiento != null)
        c++;
    return c;
  }

  public String verificarIntegridad() {
    String falloVerificacion = "Las piezas no son originales";
    if (this.registro != this.motor.registro)
      return falloVerificacion;
    for (Asiento asiento : asientos) {
      if (asiento != null && asiento.registro != this.registro)
        return falloVerificacion;
    }
    return "Auto original";
  }
}
