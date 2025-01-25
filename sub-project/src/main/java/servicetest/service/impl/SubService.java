package servicetest.service.impl;

import com.google.auto.service.AutoService;
import servicetest.service.IService;

@AutoService(IService.class)
public class SubService implements IService {

  int i = 0;

  @Override
  public void execute() {
    //    System.out.println(i);
    //    i++;
  }

  @Override
  public IService newInstance() {
    return new SubService();
    //    return this;
  }
}
