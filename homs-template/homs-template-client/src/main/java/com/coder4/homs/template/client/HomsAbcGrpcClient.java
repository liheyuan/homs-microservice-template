/**
 * @(#)HomsDemoClient.java, 8月 12, 2021.
 * <p>
 * Copyright 2021 coder4.com. All rights reserved.
 * CODER4.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.coder4.homs.template.client;

import com.coder4.homs.template.HomsTemplateGrpc;
import com.coder4.homs.template.HomsTemplateProto.AddRequest;
import com.coder4.homs.template.HomsTemplateProto.AddResponse;
import io.grpc.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;


/**
 * @author coder4
 */
public class HomsAbcGrpcClient extends HSGrpcClient {

    private Logger LOG = LoggerFactory.getLogger(HomsAbcGrpcClient.class);


    private HomsTemplateGrpc.HomsTemplateFutureStub futureStub;

    /**
     * Construct client for accessing HelloWorld server using the existing channel.
     */
    public HomsAbcGrpcClient(String ip, int port) {
        super(ip, port);
    }

    @Override
    protected void initSub(Channel channel) {
        futureStub = HomsTemplateGrpc.newFutureStub(channel);
    }

    public Optional<Integer> add(int val1, int val2) {
        AddRequest request = AddRequest.newBuilder().setVal1(val1).setVal2(val2).build();
        try {

            AddResponse response = futureStub.add(request).get();
            return Optional.ofNullable(response.getVal());
        } catch (Exception e) {
            LOG.error("grpc add exception", e);
            return Optional.empty();
        }
    }

    // Test
    public static void main(String[] args) throws InterruptedException {

        Logger LOG = LoggerFactory.getLogger(HomsAbcGrpcClient.class);

        try (HomsAbcGrpcClient client = new HomsAbcGrpcClient("127.0.0.1", 5000)) {
            client.init();
            System.out.println(client.add(1, 2));
        } catch (Exception e) {
            LOG.error("rpc call excepiton", e);
        }
    }

}