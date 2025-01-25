package servicetest.main;

import servicetest.service.IService;
import servicetest.service.ServiceFactory;

public class Main {

  public static void main(String[] args) throws Exception {
    
    IService service1 = ServiceFactory.getService("servicetest.service.impl.SubService");
    service1.execute();
    
    Class<?> clazz = Class.forName("servicetest.service.impl.SubService");
    IService service2 = IService.class.cast(clazz.getConstructors()[0].newInstance());
    service2.execute();
  }
}
