import org.jetbrains.annotations.NotNull;
import service.EmailServiceImpl;
import service.SmsServiceImpl;

/*
После определения двух сервисов мы должны определить логику для их инициализации:
 */
public class InitialContext {
    public Object lookup(@NotNull String serviceName) {
        if (serviceName.equalsIgnoreCase("EmailService")) {
            return new EmailServiceImpl();
        } else if (serviceName.equalsIgnoreCase("SMSService")) {
            return new SmsServiceImpl();
        }
        return null;
    }
}