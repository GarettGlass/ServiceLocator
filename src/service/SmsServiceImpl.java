package service;/*
Реализация интерфейса отправки сообщений
 */

import service.MessagingService;

public class SmsServiceImpl implements MessagingService {

    public String getMessageBody() {
        return "sms message";
    }

    public String getServiceName() {
        return "service.SmsServiceImpl";
    }
}