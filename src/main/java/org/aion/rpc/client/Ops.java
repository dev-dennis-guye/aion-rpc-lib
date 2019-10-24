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

    public final BlockDetails getBlockDetails(BlockSpecifierUnion block){
        BlockSpecifier params= new BlockSpecifier(block);
        Request request = new Request(0, "ops_getBlockDetails", BlockSpecifierConverter.encode(params), VersionType.Version2);

        return provider.execute(request, BlockDetailsConverter::decode);
    }

    public final <O> CompletableFuture<O> getBlockDetails(BlockSpecifierUnion block, BiFunction<BlockDetails, RPCError, O> asyncTask){
        BlockSpecifier params= new BlockSpecifier(block);
        Request request = new Request(0, "ops_getBlockDetails", BlockSpecifierConverter.encode(params), VersionType.Version2);

        return provider.executeAsync(request, BlockDetailsConverter::decode, asyncTask);
    }
}