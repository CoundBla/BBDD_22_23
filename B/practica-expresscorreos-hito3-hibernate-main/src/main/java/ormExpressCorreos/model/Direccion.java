package ormExpressCorreos.model;

// @TODO completar las anotaciones de la clase
public class Direccion {

    // @TODO completar las anotaciones de todos los atributos

    public Direccion(Integer numero, Integer piso, String letra, String portal, ...) {  // @TODO: completar
        // @TODO completar el constructor de la clase.
        //  Para ello son necesarios dos enteros con el número y el piso, y dos strings
        // con la letra y el portal
        //  Cree e inicialice el resto de atributos a los valores que considere oportunos
    }

    public Integer getNumero() {
        return this.numero;
    }

    public Integer getPiso() {
        return this.piso;
    }

    public String getLetra() {
        return this.letra;
    }

    public String getPortal() {
        return this.portal;
    }

    public String getDireccionCompleta() {
        // @TODO completar para que devuelva la dirección completa de un usuario
        return direccionCompleta;
    }
}
