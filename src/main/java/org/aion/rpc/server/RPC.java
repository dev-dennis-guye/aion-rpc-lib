package org.aion.rpc.server;

import org.aion.rpc.types.RPCTypes.Request;

public interface RPC {
    Object execute(Request request);
    boolean isExecutable(String method);
}
