package servicetest.main;

import servicetest.handler.ServiceHandler;

public class ServiceMain {

  public static void main(String[] args) throws Exception {
    ServiceHandler handler = new ServiceHandler();

    long startTime = System.currentTimeMillis();

    for (int i = 0; i < 100000; i++) {
      handler.executeSubServiceByServiceLoader("servicetest.service.impl.SubService");
    }

    long endTime = System.currentTimeMillis();
    long time = endTime - startTime;
    System.out.println("Time is " + time + "ms");
  }
}
