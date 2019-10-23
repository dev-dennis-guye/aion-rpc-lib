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

    public final BlockDetails getBlockDetails(Long blockNumber,BlockEnum blockEnum,ByteArray blockHash){
        blockSpecifier params= new blockSpecifier(blockNumber ,blockEnum ,blockHash);
        Request request = new Request(0, "ops_getBlockDetails", blockSpecifierConverter.encode(params), VersionType.Version2);

        return provider.execute(request, BlockDetailsConverter::decode);
    }

    public final <O> CompletableFuture<O> getBlockDetails(Long blockNumber,BlockEnum blockEnum,ByteArray blockHash, BiFunction<BlockDetails, RPCError, O> asyncTask){
        blockSpecifier params= new blockSpecifier(blockNumber ,blockEnum ,blockHash);
        Request request = new Request(0, "ops_getBlockDetails", blockSpecifierConverter.encode(params), VersionType.Version2);

        return provider.executeAsync(request, BlockDetailsConverter::decode, asyncTask);
    }
}