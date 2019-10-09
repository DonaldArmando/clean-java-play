// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Workspace/Java/Play/play-java-clean-master/conf/posts.routes
// @DATE:Wed Oct 09 09:29:29 COT 2019

package v1.post;

import posts.RoutesPrefix;

public class routes {
  
  public static final v1.post.ReversePostController PostController = new v1.post.ReversePostController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final v1.post.javascript.ReversePostController PostController = new v1.post.javascript.ReversePostController(RoutesPrefix.byNamePrefix());
  }

}
