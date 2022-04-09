package icu.fanjie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JUA {
    private Random random = new Random();
    private String[] userAgents = {
            "chrome", "firefox", "opera", "safari"
    };
    private String[] windowsPlatformTokens = {
            "Windows NT 6.0", "Windows NT 6.1",
            "Windows NT 6.2", "Windows NT 10.0",
    };
    private String[] linuxProcessors = {
            "i686", "x86_64"
    };
    private String[] macProcessors = {
            "Intel", "PPC"
    };
    private String[] androidVersions = {
            "1.0", "1.1", "1.5", "1.6", "2.0", "2.0.1", "2.1", "2.2", "2.2.1", "2.2.2", "2.2.3", "2.3", "2.3.1", "2.3.2",
            "2.3.3", "2.3.4", "2.3.5", "2.3.6", "2.3.7", "3.0", "3.1", "3.2", "3.2.1", "3.2.2", "3.2.3", "3.2.4", "3.2.5",
            "3.2.6", "4.0", "4.0.1", "4.0.2", "4.0.3", "4.0.4", "4.1", "4.1.1", "4.1.2", "4.2", "4.2.1", "4.2.2", "4.3",
            "4.3.1", "4.4", "4.4.1", "4.4.2", "4.4.3", "4.4.4", "5.0", "5.0.1", "5.0.2", "5.1", "5.1.1", "6.0", "6.0.1",
            "7.0", "7.1", "7.1.1", "7.1.2", "8.0.0", "8.1.0", "9", "10", "11",
    };
    private String[] appleDevices = {
            "iPhone", "iPad"
    };
    private String[] iosVersions = {
            "3.1.3", "4.2.1", "5.1.1", "6.1.6", "7.1.2", "9.3.5", "9.3.6", "10.3.3", "10.3.4", "12.4.8", "14.2", "14.2.1",
    };
    private String[] chromeVersions = {
            "70.0.3538.16",
            "70.0.3538.67",
            "70.0.3538.97",
            "71.0.3578.137",
            "71.0.3578.30",
            "71.0.3578.33",
            "71.0.3578.80",
            "72.0.3626.69",
            "72.0.3626.7",
            "73.0.3683.20",
            "73.0.3683.68",
            "74.0.3729.6",
            "75.0.3770.140",
            "75.0.3770.8",
            "75.0.3770.90",
            "76.0.3809.12",
            "76.0.3809.126",
            "76.0.3809.25",
            "76.0.3809.68",
            "77.0.3865.10",
            "77.0.3865.40",
            "78.0.3904.105",
            "78.0.3904.11",
            "78.0.3904.70",
            "79.0.3945.16",
            "79.0.3945.36",
            "80.0.3987.106",
            "80.0.3987.16",
            "81.0.4044.138",
            "81.0.4044.20",
            "81.0.4044.69",
            "83.0.4103.14",
            "83.0.4103.39",
            "84.0.4147.30",
            "85.0.4183.38",
            "85.0.4183.83",
            "85.0.4183.87",
            "86.0.4240.22",
            "87.0.4280.20",
            "87.0.4280.87",
            "87.0.4280.88",
            "88.0.4324.27",
            "88.0.4324.96",
            "89.0.4389.23",
            "90.0.4430.24",
            "91.0.4472.19"
    };

    public String getUserAgent() {
        String[] uas = {
                getChromeUA(), getFirefoxUA()
        };
        int i = new Random().nextInt(uas.length);
        return uas[i];
    }

    public String getFirefoxUA() {
        List<String> uas = new ArrayList<>();
        int version = 47 + random.nextInt(43);
        String windPlat = this.windowsPlatformTokens[random.nextInt(this.windowsPlatformTokens.length)];
        String ua = "Mozilla/5.0 (" + windPlat + "; Win64; x64; rv:" + (version + ".0") + ") Gecko/20100101 Firefox/" + (version + ".0");
        uas.add(ua);
        String macPlat = this.macProcessors[random.nextInt(this.macProcessors.length)];
        ua = "Mozilla/5.0 (Macintosh; " + macPlat + " Mac OS X x.y; rv:" + (version + ".0") + ") Gecko/20100101 Firefox/" + (version + ".0");
        uas.add(ua);
        String linuxPlat = this.linuxProcessors[random.nextInt(this.linuxProcessors.length)];
        ua = "Mozilla/5.0 (X11; Linux " + linuxPlat + "; rv:" + (version + ".0") + ") Gecko/20100101 Firefox/" + (version + ".0");
        uas.add(ua);
        return uas.get(random.nextInt(uas.size()));
    }

    public String getChromeUA() {
        List<String> uas = new ArrayList<>();
        String version = this.chromeVersions[random.nextInt(this.chromeVersions.length)];
        String windPlat = this.windowsPlatformTokens[random.nextInt(this.windowsPlatformTokens.length)];
        String ua = "Mozilla/5.0 (" + windPlat + "; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/" + version + " Safari/537.36";
        uas.add(ua);
        String macPlat = this.macProcessors[random.nextInt(this.macProcessors.length)];
        ua = "Mozilla/5.0 (Macintosh; " + macPlat + " Mac OS X 10_15_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/" + version + " Safari/537.36";
        uas.add(ua);
        String linuxPlat = this.linuxProcessors[random.nextInt(this.linuxProcessors.length)];
        ua = "Mozilla/5.0 (X11; Linux " + linuxPlat + ") AppleWebKit/537.36 (KHTML, like Gecko) Chrome/" + version + " Safari/537.36";
        uas.add(ua);
        return uas.get(random.nextInt(uas.size()));
    }


    public String getSafariUA() {
        return "";
    }

}
