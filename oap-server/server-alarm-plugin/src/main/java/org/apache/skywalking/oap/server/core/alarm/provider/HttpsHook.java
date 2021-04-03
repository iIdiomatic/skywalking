package org.apache.skywalking.oap.server.core.alarm.provider;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class HttpsHook {
    private String url;
    private String keyStorePath;
    private String keyStorePass;
    private String keyPass;
    private String keyStoreInstanceType;
}
