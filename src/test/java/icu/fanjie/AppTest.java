package icu.fanjie;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        JUA jua = new JUA();
        System.out.println(jua.getUserAgent());
        System.out.println(jua.getChromeUA());
        System.out.println(jua.getFirefoxUA());
    }
}
