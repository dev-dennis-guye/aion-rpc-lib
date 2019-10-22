package org.aion.rpc.client;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.aion.rpc.types.RPCTypes.Request;
import org.aion.rpc.types.RPCTypes.RPCError;

public interface Provider {

    <R> R execute(Request request, Function<Object, R> resultConverter);

    <R, O> CompletableFuture<O> executeAsync(Request request,
        Function<Object, R> resultConverter,
        BiFunction<R, RPCError, O> asyncTask);
}
