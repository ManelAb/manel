/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manel Muñoz Forte
 */
public class Persona {

    private String nom;
    private int edat;
    private double altura;
    private double pes;

    public void PosarNom(String nom){
        this.nom=nom;
    }
    public void PosarEdat(int edat){
        this.edat=edat;
    }
    public void PosarAltura(double altura){
        this.altura=altura;
    }
    public void PosarPes(double pes){
        this.pes=pes;
    }
}
