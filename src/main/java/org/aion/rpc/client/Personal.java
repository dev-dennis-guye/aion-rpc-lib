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

    public Personal(final Provider provider){
        this.provider = provider;
    }

    public final AionAddress ecRecover(ByteArray dataThatWasSigned,ByteArray signature){
        EcRecoverParams params= new EcRecoverParams(dataThatWasSigned ,signature);
        Request request = new Request(0, "personal_ecRecover", EcRecoverParamsConverter.encode(params), VersionType.Version2);

        return provider.execute(request, AionAddressConverter::decode);
    }

    public final <O> CompletableFuture<O> ecRecover(ByteArray dataThatWasSigned,ByteArray signature, BiFunction<AionAddress, RPCError, O> asyncTask){
        EcRecoverParams params= new EcRecoverParams(dataThatWasSigned ,signature);
        Request request = new Request(0, "personal_ecRecover", EcRecoverParamsConverter.encode(params), VersionType.Version2);

        return provider.executeAsync(request, AionAddressConverter::decode, asyncTask);
    }
}