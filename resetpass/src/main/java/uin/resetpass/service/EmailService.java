package uin.resetpass.service;

import uin.resetpass.entity.Mail;

public interface EmailService {
    void send(Mail mail);
}
