/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento.parkings;

import javax.swing.JDialog;

/**
 *
 * @author david
 */
public interface Parking {
    public abstract void activarBoton();
    public abstract void activarSombra(JDialog j);
    public abstract void parar();
}
