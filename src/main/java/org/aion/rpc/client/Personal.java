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
public class Personal{

    private final Provider provider;
    private final IDGeneratorStrategy generator;

    public Personal(final Provider provider, IDGeneratorStrategy generator){
        this.provider = provider;
        this.generator = generator;
    }

    public final AionAddress ecRecover(ByteArray dataThatWasSigned,ByteArray signature){
        EcRecoverParams params= new EcRecoverParams(dataThatWasSigned ,signature);
        Request request = new Request(generator.generateID(), "personal_ecRecover", new ParamUnion(params), VersionType.Version2);

        return provider.execute(request, r->r.address);
    }

    public final <O> CompletableFuture<O> ecRecover(ByteArray dataThatWasSigned,ByteArray signature, BiFunction<AionAddress, RPCError, O> asyncTask){
        EcRecoverParams params= new EcRecoverParams(dataThatWasSigned ,signature);
        Request request = new Request(generator.generateID(), "personal_ecRecover", new ParamUnion(params), VersionType.Version2);

        return provider.executeAsync(request, r->r.address, asyncTask);
    }
}