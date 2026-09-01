package com.bistro.notifications.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class NotificationService {

    private final JavaMailSender mailSender;

    public void notifyConfirmed(String to, String reservationCode, String tableNumber){

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(to);
        msg.setSubject("Tu reserva " + reservationCode + " está confirmada");
        msg.setText("Te asignamos la mesa " + tableNumber + ". ¡Te esperamos!");

        mailSender.send(msg);

        log.info("Aviso de CONFIRMACIÓN enviado a {} (reserva {})", to, reservationCode);
    }

    public void notifyRejected(String to, String reservationCode, String reason){

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(to);
        msg.setSubject("Tu reserva " + reservationCode + " no pudo confirmarse");
        msg.setText("Motivo: " + reason);

        mailSender.send(msg);

        log.info("Aviso de RECHAZO enviado a {} (reserva {})", to, reservationCode);
    }

}















