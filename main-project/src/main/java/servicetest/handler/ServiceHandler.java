package servicetest.handler;

import java.lang.reflect.InvocationTargetException;
import servicetest.service.IService;
import servicetest.service.ServiceFactory;

public class ServiceHandler {

  public ServiceHandler() {
    super();
  }

  public void executeSubServiceByReflection(String serviceClassName) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException {
    Class<?> clazz = Class.forName(serviceClassName);
    IService service = IService.class.cast(clazz.getConstructors()[0].newInstance());
    service.execute();
  }

  public void executeSubServiceByServiceLoader(String serviceClassName) {
    IService service = ServiceFactory.getService(serviceClassName);
    service.execute();
  }
}
