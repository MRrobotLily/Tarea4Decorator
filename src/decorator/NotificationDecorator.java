/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author niza
 */
public abstract class NotificationDecorator implements Notificacion{
    protected Notificacion notificacion;
    
   public NotificationDecorator (Notificacion notificacion){
       this.notificacion = notificacion;
   }
    
    @Override
    public void enviar (String mensaje){
        notificacion.enviar (mensaje);
    }
}
