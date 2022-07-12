package locator;

import service.MessagingService;

import java.util.ArrayList;
import java.util.List;
/*
Последний компонент, который нам понадобится перед сборкой объекта локатора сервисов, — это кеш.
В нашем примере это простой класс со свойством List :
 */

public class Cache {
    private List<MessagingService> services = new ArrayList<>();

    public MessagingService getService(String serviceName) {
        MessagingService m = null;
        for (MessagingService s : services) {
            if (s.getServiceName().equals(serviceName)) {
                m = s;
            }
        }
        return m;
    }

    public void addService(MessagingService newService) {
        boolean exists = false;
        for (MessagingService service : services) {
            if (service.getServiceName().equalsIgnoreCase(newService.getServiceName())) {
                exists = true;
            }
        }
        if (!exists) {
            services.add(newService);
        }
    }
}