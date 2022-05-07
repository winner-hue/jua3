package icu.fanjie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JUA {
    private final Random random = new Random();
    private final String[] userAgents = {
            "chrome", "firefox", "opera", "safari"
    };
    private final String[] windowsPlatformTokens = {
            "Windows NT 6.0", "Windows NT 6.1",
            "Windows NT 6.2", "Windows NT 10.0",
    };
    private final String[] linuxProcessors = {
            "i686", "x86_64"
    };
    private final String[] macProcessors = {
            "Intel", "PPC"
    };
    private final String[] androidVersions = {
            "1.0", "1.1", "1.5", "1.6", "2.0", "2.0.1", "2.1", "2.2", "2.2.1", "2.2.2", "2.2.3", "2.3", "2.3.1", "2.3.2",
            "2.3.3", "2.3.4", "2.3.5", "2.3.6", "2.3.7", "3.0", "3.1", "3.2", "3.2.1", "3.2.2", "3.2.3", "3.2.4", "3.2.5",
            "3.2.6", "4.0", "4.0.1", "4.0.2", "4.0.3", "4.0.4", "4.1", "4.1.1", "4.1.2", "4.2", "4.2.1", "4.2.2", "4.3",
            "4.3.1", "4.4", "4.4.1", "4.4.2", "4.4.3", "4.4.4", "5.0", "5.0.1", "5.0.2", "5.1", "5.1.1", "6.0", "6.0.1",
            "7.0", "7.1", "7.1.1", "7.1.2", "8.0.0", "8.1.0", "9", "10", "11",
    };
    private final String[] appleDevices = {
            "iPhone", "iPad"
    };
    private final String[] iosVersions = {
            "3.1.3", "4.2.1", "5.1.1", "6.1.6", "7.1.2", "9.3.5", "9.3.6", "10.3.3", "10.3.4", "12.4.8", "14.2", "14.2.1",
    };
    private final String[] chromeVersion = {"98.0.4758.0"
            , "98.0.4757.1"
            , "98.0.4757.0"
            , "98.0.4756.1",
            "100.0.4896.60",
            "99.0.4844.82",
            "98.0.4758.102",
            "98.0.4758.81",
            "97.0.4692.71",
            "96.0.4664.93",
            "94.0.4606.81",
            "93.0.4577.63",
            "92.0.4515.131",
            "91.0.4472.164",
            "91.0.4472.114",
            "91.0.4472.77",
            "90.0.4430.85",
            "89.0.4389.114",
            "89.0.4389.82",
            "87.0.4280.88",
            "86.0.4240.198",
            "86.0.4240.75",
            "85.0.4183.102",
            "84.0.4147.135",
            "84.0.4147.105",
            "83.0.4103.116",
            "83.0.4103.97",
            "81.0.4044.138",
            "81.0.4044.122",
            "80.0.3987.163",
            "80.0.3987.132",
            "80.0.3987.116",
            "79.0.3945.130",
            "79.0.3945.88",
            "78.0.3904.108",
            "78.0.3904.87",
            "77.0.3865.120",
            "77.0.3865.75",
            "76.0.3809.100",
            "75.0.3770.100",
            "75.0.3770.80",
            "74.0.3729.159",
            "74.0.3729.108",
            "73.0.3683.88",
            "72.0.3626.121",
            "72.0.3626.96",
            "71.0.3578.98",
            "70.0.3538.110",
            "70.0.3538.77",
            "69.0.3497.100",
            "69.0.3497.81",
            "68.0.3440.75",
            "67.0.3396.87",
            "67.0.3396.62",
            "66.0.3359.170"
            , "66.0.3359"
            , "67.0.3396"
            , "68.0.3440"
            , "69.0.3497"
            , "70.0.3538"
            , "71.0.3578"
            , "72.0.3626"
            , "73.0.3683"
            , "74.0.3729"
            , "75.0.3770"
            , "76.0.3809"
            , "77.0.3865"
            , "78.0.3904"
            , "79.0.3945"
            , "80.0.3987"
            , "81.0.4044"
            , "83.0.4103"
            , "84.0.4147"
            , "85.0.4183"
            , "86.0.4240"
            , "87.0.4280"
            , "88.0.4324"
            , "89.0.4389"
            , "90.0.4430"
            , "91.0.4472"
            , "92.0.4515"
            , "93.0.4577"
            , "94.0.4606"
            , "95.0.4638"
            , "96.0.4664"
            , "97.0.4692"
            , "98.0.4758"
            , "99.0.4844"
            , "100.0"};
    private final String[] firefoxVersion = {"99.0",
            "98.0",
            "98.0.1",
            "98.0.2",
            "97.0",
            "97.0.1",
            "97.0.2",
            "96.0",
            "96.0.1",
            "96.0.2",
            "96.0.3",
            "95.0",
            "95.0.1",
            "95.0.2",
            "94.0",
            "94.0.1",
            "94.0.2",
            "93.0",
            "92.0",
            "92.0.1",
            "91.0",
            "91.0.1",
            "91.0.2",
            "91.1.0",
            "91.2.0",
            "91.3.0",
            "91.4.0",
            "91.4.1",
            "91.5.0",
            "91.5.1",
            "91.6.0",
            "91.6.1",
            "91.7.0",
            "91.7.1",
            "91.8.0",
            "90.0",
            "90.0.1",
            "90.0.2",
            "89.0",
            "89.0.1",
            "89.0.2",
            "88.0",
            "88.0.1",
            "87.0",
            "86.0",
            "86.0.1",
            "85.0",
            "85.0.1",
            "85.0.2",
            "84.0",
            "84.0.1",
            "84.0.2",
            "83.0",
            "82.0",
            "82.0.1",
            "82.0.2",
            "82.0.3",
            "81.0",
            "81.0.1",
            "81.0.2",
            "80.0",
            "80.0.1",
            "79.0",
            "78.0",
            "78.0.1",
            "78.0.2",
            "78.1.0",
            "78.2.0",
            "78.3.0",
            "78.3.1",
            "78.4.0",
            "78.4.1",
            "78.5.0",
            "78.6.0",
            "78.6.1",
            "78.7.0",
            "78.7.1",
            "78.8.0",
            "78.9.0",
            "78.10.0",
            "78.10.1",
            "78.11.0",
            "78.12.0",
            "78.13.0",
            "78.14.0",
            "78.15.0",
            "77.0",
            "77.0.1",
            "76.0",
            "76.0.1",
            "75.0",
            "74.0",
            "74.0.1",
            "73.0",
            "73.0.1",
            "72.0",
            "72.0.1",
            "72.0.2",
            "71.0",
            "70.0",
            "70.0.1",
            "69.0",
            "69.0.1",
            "69.0.2",
            "69.0.3",
            "68.0",
            "68.0.1",
            "68.0.2",
            "68.1.0",
            "68.2.0",
            "68.3.0",
            "68.4.0",
            "68.4.1",
            "68.4.2",
            "68.5.0",
            "68.6.0",
            "68.6.1",
            "68.7.0",
            "68.8.0",
            "68.9.0",
            "68.10.0",
            "68.11.0",
            "68.12.0",
            "67.0",
            "67.0.1",
            "67.0.2",
            "67.0.3",
            "67.0.4",
            "66.0"};

    private final String[] chromeVersions = {
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

    public static void main(String[] args) {
        System.out.println(new JUA().getChromeUA());
    }
}
