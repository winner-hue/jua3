# jua
java 随机 useragent

目前仅支持pc端 chrome和firefox useragent随机

install:
- 直接使用jar包
  下载jar包，通过 add as library 导入项目

- 通过pom导入
    ```maven
    
     <repositories>
        <repository>
            <id>icu-fanjie-repo</id>
            <url>https://raw.githubusercontent.com/winner-hue/mvn-repo/master/</url>
        </repository>
    </repositories>
  
      <dependency>
          <groupId>icu.fanjie</groupId>
          <artifactId>jua3</artifactId>
          <version>1.3</version>
      </dependency>
  
  如果遇到  Cannot resolve 请求的名称有效，但是找不到请求的类型的数据。 (raw.githubusercontent.com)错误，请在hosts文件夹下添加：199.232.68.133 raw.githubusercontent.com
  windows的hosts地址为：C:\Windows\System32\drivers\etc\hosts
  linux/mac的hosts地址为：/etc/hosts
  ```
- jar包引入
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
