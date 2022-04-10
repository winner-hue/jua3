package icu.fanjie;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        JUA jua = new JUA();
        System.out.println(jua.getUserAgent());
        System.out.println(jua.getChromeUA());
        System.out.println(jua.getFirefoxUA());
    }

    @Test
    public void test() throws Exception {
        Headers headers = new Headers("user-agent:Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36");
        Response response = Requests.request("get", "https://www.baidu.com", null, null, headers, 10000, true, null, null);
        System.out.println(response.getHtml());
        System.out.println(response.getStatusCode());
        System.out.println(response.getCookie());
        System.out.println(response.response);
    }
}
