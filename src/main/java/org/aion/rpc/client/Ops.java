package org.aion.rpc.client;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import org.aion.rpc.types.RPCTypes.*;
import org.aion.rpc.types.RPCTypesConverter.*;
import org.aion.types.AionAddress;
import org.aion.util.types.ByteArrayWrapper;

/******************************************************************************
*
* AUTO-GENERATED SOURCE FILE.  DO NOT EDIT MANUALLY -- YOUR CHANGES WILL
* BE WIPED OUT WHEN THIS FILE GETS RE-GENERATED OR UPDATED.
*
*****************************************************************************/
public class Ops{

    private final Provider provider;

    public Ops(final Provider provider){
        this.provider = provider;
    }
    public final BlockDetails getBlockDetailsByNumber(Long block){
        BlockByNumberParams params= new BlockByNumberParams(block);
        Request request = new Request(0, "ops_getBlockDetailsByNumber", BlockByNumberParamsConverter.encode(params), VersionType.Version2);

        return provider.execute(request, BlockDetailsConverter::decode);
    }
    public final BlockDetails getBlockDetailsByNumber(BlockEnum block){
        BlockByEnumParams params= new BlockByEnumParams(block);
        Request request = new Request(0, "ops_getBlockDetailsByNumber", BlockByEnumParamsConverter.encode(params), VersionType.Version2);

        return provider.execute(request, BlockDetailsConverter::decode);
    }
    public final BlockDetails getBlockDetailsByHash(ByteArray block){
        BlockByHashParams params= new BlockByHashParams(block);
        Request request = new Request(0, "ops_getBlockDetailsByHash", BlockByHashParamsConverter.encode(params), VersionType.Version2);

        return provider.execute(request, BlockDetailsConverter::decode);
    }
    public final <O> CompletableFuture<O> getBlockDetailsByNumber(Long block, BiFunction<BlockDetails, RPCError, O> asyncTask){
        BlockByNumberParams params= new BlockByNumberParams(block);
        Request request = new Request(0, "ops_getBlockDetailsByNumber", BlockByNumberParamsConverter.encode(params), VersionType.Version2);

        return provider.executeAsync(request, BlockDetailsConverter::decode, asyncTask);
    }
    public final <O> CompletableFuture<O> getBlockDetailsByNumber(BlockEnum block, BiFunction<BlockDetails, RPCError, O> asyncTask){
        BlockByEnumParams params= new BlockByEnumParams(block);
        Request request = new Request(0, "ops_getBlockDetailsByNumber", BlockByEnumParamsConverter.encode(params), VersionType.Version2);

        return provider.executeAsync(request, BlockDetailsConverter::decode, asyncTask);
    }
    public final <O> CompletableFuture<O> getBlockDetailsByHash(ByteArray block, BiFunction<BlockDetails, RPCError, O> asyncTask){
        BlockByHashParams params= new BlockByHashParams(block);
        Request request = new Request(0, "ops_getBlockDetailsByHash", BlockByHashParamsConverter.encode(params), VersionType.Version2);

        return provider.executeAsync(request, BlockDetailsConverter::decode, asyncTask);
    }
}