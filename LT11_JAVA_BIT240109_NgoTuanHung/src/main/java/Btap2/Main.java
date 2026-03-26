/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btap2;

/**
 *
 * @author Hungg
 */
public class Main {

    public static void main(String[] args) {

        Notification notification = new Notification();

        MessageService email = new EmailService();
        notification.setMessageService(email);
        notification.notifyUser("Hello Email!");

        MessageService sms = new SMSService();
        notification.setMessageService(sms);
        notification.notifyUser("Hello SMS!");
    }
}
