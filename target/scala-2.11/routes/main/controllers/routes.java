
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/j/2015_10/zvenigorod/conf/routes
// @DATE:Sun Mar 06 01:05:16 MSK 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWebJarAssets WebJarAssets = new controllers.ReverseWebJarAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAdminsPosts AdminsPosts = new controllers.ReverseAdminsPosts(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSignup Signup = new controllers.ReverseSignup(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAccount Account = new controllers.ReverseAccount(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWebJarAssets WebJarAssets = new controllers.javascript.ReverseWebJarAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAdminsPosts AdminsPosts = new controllers.javascript.ReverseAdminsPosts(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSignup Signup = new controllers.javascript.ReverseSignup(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAccount Account = new controllers.javascript.ReverseAccount(RoutesPrefix.byNamePrefix());
  }

}
