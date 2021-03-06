package pro.tools.http.pojo;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created on 17/9/3 15:19 星期日.
 *
 * @author sd
 */
public class HttpDefaultHeaders {
    private final static Map<String, Object> defaultHeaders;

    static {
        defaultHeaders = Maps.newHashMap();
        init();
    }

    private static void init() {
        defaultHeaders.put("connection", "keep-alive");
        defaultHeaders.put("accept-encoding", "gzip,deflate");
        // defaultHeaders.put("user-agent", "Mozilla/5.0 (compatible; Baiduspider/2.0; +http://www.baidu.com/search/spider.html)");
        defaultHeaders.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3191.0 Safari/537.36");
        defaultHeaders.put("DNT", 1);
        defaultHeaders.put("cache-control", "max-age=0");
    }

    public static Map<String, Object> getDefaultHeaders() {
        return defaultHeaders;
    }
}
