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
    private final IDGeneratorStrategy generator;

    public Ops(final Provider provider, IDGeneratorStrategy generator){
        this.provider = provider;
        this.generator = generator;
    }

    public final BlockDetails getBlockDetails(BlockSpecifierUnion block){
        BlockSpecifier params= new BlockSpecifier(block);
        Request request = new Request(generator.generateID(), "ops_getBlockDetails", new ParamUnion(params), VersionType.Version2);

        return provider.execute(request, r->r.blockDetails);
    }

    public final <O> CompletableFuture<O> getBlockDetails(BlockSpecifierUnion block, BiFunction<BlockDetails, RPCError, O> asyncTask){
        BlockSpecifier params= new BlockSpecifier(block);
        Request request = new Request(generator.generateID(), "ops_getBlockDetails", new ParamUnion(params), VersionType.Version2);

        return provider.executeAsync(request, r->r.blockDetails, asyncTask);
    }
}