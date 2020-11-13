package ec.edu.utpl.arqapl.o20f21.taller2.model;

public class Impuesto {

    public Double calcularproducto (double tasa ,producto producto){

        double impuesto;
        impuesto = producto.getValor() * tasa;
        return impuesto;

    }


}
