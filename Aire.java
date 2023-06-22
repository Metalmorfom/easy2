/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.beam.examples;

/**
 *
 * @author Gado
 */
public class Aire {
    
    private String id;    
private String version;
private String autor;
private String codigo;
private String nombre;
private String unidad_medida;

//serie
private String fecha;
private String valor;


    public Aire() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    
    
   @Override
    public String toString() {
         return "Monedas{" + "id=" + id + ", version=" + version + ", autor=" + autor + ", codigo=" + codigo
                 + ", nombre=" + nombre + ", unidad_medida=" + unidad_medida + ", fecha=" + fecha+", valor="+ valor +'}';}



public String toCSV() {
    return String.format("%s,%s,%s,%s,%s,%s,%s,%s", id, version, autor, codigo, nombre, unidad_medida, fecha, valor);
}



}//Aire
