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
public class Stratum{

    private final Provider provider;
    private final IDGeneratorStrategy generator;

    public Stratum(final Provider provider, IDGeneratorStrategy generator){
        this.provider = provider;
        this.generator = generator;
    }

    public final ByteArray getSeed(){
        VoidParams params= new VoidParams();
        Request request = new Request(generator.generateID(), "stratum_getSeed", new ParamUnion(params), VersionType.Version2);

        return provider.execute(request, r->r.byteArray);
    }

    public final ByteArray submitSeed(ByteArray newSeed,ByteArray signingPublicKey,AionAddress coinbase){
        submitSeedParams params= new submitSeedParams(newSeed ,signingPublicKey ,coinbase);
        Request request = new Request(generator.generateID(), "stratum_submitSeed", new ParamUnion(params), VersionType.Version2);

        return provider.execute(request, r->r.byteArray);
    }

    public final Boolean submitSignature(ByteArray signature,ByteArray sealHash){
        submitSignatureParams params= new submitSignatureParams(signature ,sealHash);
        Request request = new Request(generator.generateID(), "stratum_submitSignature", new ParamUnion(params), VersionType.Version2);

        return provider.execute(request, r->r.bool);
    }

    public final <O> CompletableFuture<O> getSeed( BiFunction<ByteArray, RPCError, O> asyncTask){
        VoidParams params= new VoidParams();
        Request request = new Request(generator.generateID(), "stratum_getSeed", new ParamUnion(params), VersionType.Version2);

        return provider.executeAsync(request, r->r.byteArray, asyncTask);
    }

    public final <O> CompletableFuture<O> submitSeed(ByteArray newSeed,ByteArray signingPublicKey,AionAddress coinbase, BiFunction<ByteArray, RPCError, O> asyncTask){
        submitSeedParams params= new submitSeedParams(newSeed ,signingPublicKey ,coinbase);
        Request request = new Request(generator.generateID(), "stratum_submitSeed", new ParamUnion(params), VersionType.Version2);

        return provider.executeAsync(request, r->r.byteArray, asyncTask);
    }

    public final <O> CompletableFuture<O> submitSignature(ByteArray signature,ByteArray sealHash, BiFunction<Boolean, RPCError, O> asyncTask){
        submitSignatureParams params= new submitSignatureParams(signature ,sealHash);
        Request request = new Request(generator.generateID(), "stratum_submitSignature", new ParamUnion(params), VersionType.Version2);

        return provider.executeAsync(request, r->r.bool, asyncTask);
    }
}