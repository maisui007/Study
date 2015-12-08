package ex02.pyrmont;

import java.io.File;

public class Constants {
  public static final String WEB_ROOT =
    System.getProperty("user.dir") + File.separator  + "webroot";
  public static final String SERVERT_PATH = WEB_ROOT+File.separator +"classes";
}