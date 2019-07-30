package com.example.client.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Chofer {

    @JsonProperty("Rut")
    private String Rut;
    @JsonProperty("Razon")
    private String Razon;
    @JsonProperty("Sucursal")
    private String Sucursal;
    @JsonProperty("RutTransporte")
    private String RutTransporte;
    @JsonProperty("Ok")
    private boolean Ok;
    @JsonProperty("Existe")
    private boolean Existe;
    @JsonProperty("Mensaje")
    private String Mensaje;

    public Chofer(){

    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String rut) {
        Rut = rut;
    }

    public String getRazon() {
        return Razon;
    }

    public void setRazon(String razon) {
        Razon = razon;
    }

    public String getSucursal() {
        return Sucursal;
    }

    public void setSucursal(String sucursal) {
        Sucursal = sucursal;
    }

    public String getRutTransporte() {
        return RutTransporte;
    }

    public void setRutTransporte(String rutTransporte) {
        RutTransporte = rutTransporte;
    }

    public boolean isOk() {
        return Ok;
    }

    public void setOk(boolean ok) {
        Ok = ok;
    }

    public boolean isExiste() {
        return Existe;
    }

    public void setExiste(boolean existe) {
        Existe = existe;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Chofer{" +
                "Rut='" + Rut + '\'' +
                ", Razon='" + Razon + '\'' +
                ", Sucursal='" + Sucursal + '\'' +
                ", RutTransporte='" + RutTransporte + '\'' +
                ", Ok=" + Ok +
                ", Existe=" + Existe +
                ", Mensaje='" + Mensaje + '\'' +
                '}';
    }
}
