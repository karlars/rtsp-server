package cn.las.rtsp;

import cn.las.client.AbstractClient;
import io.netty.handler.codec.http.HttpRequest;

import java.util.concurrent.Callable;

/**
 * @version 1.0
 * @Description
 * @Author：andy
 * @CreateDate：2016/3/22
 */
public class TeardownRequest implements Callable<HttpRequest> {

    private AbstractClient client;

    @Override
    public HttpRequest call() throws Exception {
        return null;
    }
}
