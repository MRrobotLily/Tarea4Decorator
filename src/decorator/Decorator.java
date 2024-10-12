/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator;

/**
 *
 * @author niza
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notificacion notificacion = new NotificacionBasica();
        
        //para que envie un correo electronico
        Notificacion notificacionCorreo = new NotificacionCorreo(notificacion);
        notificacionCorreo.enviar("Tu pedido ha sido enviado");
        
    }
    
}
