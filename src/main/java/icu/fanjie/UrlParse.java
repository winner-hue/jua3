package icu.fanjie;

import java.net.URL;

public class UrlParse {
    public static String urlJoin(String baseUrl, String url) {
        if (baseUrl == null || baseUrl.equals("")) {
            return "";
        }
        if (url == null || url.equals("")) {
            return "";
        }
        try {
            if (url.startsWith("http")) {
                return url;
            } else {
                URL baseUrlPath = new URL(baseUrl);
                String host = baseUrlPath.getHost();
                int port = baseUrlPath.getPort();
                String path = baseUrlPath.getPath();
                String protocol = baseUrlPath.getProtocol();
                if (url.startsWith("/")) {
                    if (port == -1) {
                        return protocol + "://" + host + url;
                    } else {
                        return protocol + "://" + host + ":" + port + url;
                    }
                } else {
                    final String s = baseUrl.endsWith("/") ? baseUrl : baseUrl + "/";
                    if (url.startsWith("./")) {
                        return s + url.replace("./", "");
                    } else if (url.startsWith("../")) {
                        int length = url.split("\\.\\./").length - 1;
                        String[] pathSplit = path.split("/");
                        for (int i = 1; i <= length; i++) {
                            path = path.replace(path.endsWith("/") ? (pathSplit[pathSplit.length - i] + "/") : pathSplit[pathSplit.length - i], "");
                        }
                        final String s1 = path.startsWith("/") ? path : "/" + path;
                        if (port == -1) {
                            return protocol + "://" + host + s1 + url.replace("../", "");
                        } else {
                            return protocol + "://" + host + ":" + port + s1 + url.replace("../", "");
                        }
                    } else {
                        return s + url;
                    }
                }
            }
        } catch (Exception ignore) {
        }
        return "";
    }
}
