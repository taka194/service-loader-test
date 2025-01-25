package servicetest.service;

import java.util.ServiceLoader;

public class ServiceFactory {

  private static ServiceLoader<IService> loader;

  static {
    loader = ServiceLoader.load(IService.class);
  }

  public static IService getService(String serviceName) {
    for (IService service : loader) {
      if (service.getClass().getName().equals(serviceName)) {
        return service.newInstance();
      }
    }
    throw new IllegalArgumentException();
  }
}
