package org.apache.skywalking.oap.server.core.alarm.provider;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
@ToString
public class Webhooks {
    private volatile List<String> httpHooks = new ArrayList<>();
    private volatile List<HttpsHook> httpsHooks = new ArrayList<>();

}
