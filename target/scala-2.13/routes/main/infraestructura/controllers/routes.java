// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Workspace/Java/Play/play-java-clean-master/conf/routes
// @DATE:Wed Oct 09 15:23:52 COT 2019

package infraestructura.controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final infraestructura.controllers.ReverseHomeController HomeController = new infraestructura.controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final infraestructura.controllers.javascript.ReverseHomeController HomeController = new infraestructura.controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
  }

}
