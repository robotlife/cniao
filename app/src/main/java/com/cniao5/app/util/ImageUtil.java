package com.cniao5.app.util;

public class ImageUtil {
    /**
     * 进行图片地址截断  这边按照!号分隔
     *
     * @param pUrl
     * @return
     */
    public static String getCutImageUrl(String pUrl) {
        if (pUrl.contains("!")) {
            String[] urlsStrings = pUrl.split("!");
            return urlsStrings[0];
        }
        return pUrl;
    }
}
