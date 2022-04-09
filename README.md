# jua
java 随机 useragent

目前仅支持pc端 chrome和firefox useragent随机

install:
- 直接使用jar包
  下载jar包，通过 add as library 导入项目

- 通过pom导入
  参考 https://www.cnblogs.com/zhaochi/p/12694275.html

use:
~~~ java  
java useragent

 JUA jua = new JUA();
 jua.getUserAgent();
 jua.getChromeUA();
 jua.getFirefoxUA();

java urljoin

 System.out.println(UrlParse.urlJoin("http://127.0.0.1:8080", "/12345/3423/443"));
