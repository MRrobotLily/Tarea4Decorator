/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author niza
 */
public class NotificacionCorreo extends NotificationDecorator {
    public NotificacionCorreo(Notificacion notificacion) {
        super(notificacion);
    }
    @Override
    public void enviar(String mensaje){
        super.enviar(mensaje);
        System.out.println("Enviando notificacion por correo " + mensaje);
    }
}
