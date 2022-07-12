package service;

import service.MessagingService;

/*
Реализация интерфейса отправки сообщений
 */
public class EmailServiceImpl implements MessagingService {

    public String getMessageBody() {
        return "email message";
    }

    public String getServiceName() {
        return "service.EmailServiceImpl";
    }
}