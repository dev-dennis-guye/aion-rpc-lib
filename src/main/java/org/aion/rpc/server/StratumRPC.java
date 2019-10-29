package org.aion.rpc.server;

import static org.aion.rpc.errors.RPCExceptions.InternalErrorRPCException;
import static org.aion.rpc.errors.RPCExceptions.InvalidParamsRPCException;
import static org.aion.rpc.errors.RPCExceptions.InvalidRequestRPCException;
import static org.aion.rpc.errors.RPCExceptions.MethodNotFoundRPCException;
import static org.aion.rpc.errors.RPCExceptions.ParseErrorRPCException;

import java.util.Set;
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
public interface StratumRPC extends RPC{

    default ResultUnion execute(Request request){
        ResultUnion res;
        try{
            //check that the request can be fulfilled by this class
            if(request.method.equals("stratum_getSeed")){
                VoidParams params=request.params.voidParams;
                if (params==null) throw InvalidParamsRPCException.INSTANCE;
                ByteArray result = this.stratum_getSeed();
                res = result == null ? null : new ResultUnion(result);
            }else
            if(request.method.equals("stratum_submitSeed")){
                submitSeedParams params=request.params.submitSeedParams;
                if (params==null) throw InvalidParamsRPCException.INSTANCE;
                ByteArray result = this.stratum_submitSeed(params.newSeed,params.signingPublicKey,params.coinbase);
                res = result == null ? null : new ResultUnion(result);
            }else
            if(request.method.equals("stratum_submitSignature")){
                submitSignatureParams params=request.params.submitSignatureParams;
                if (params==null) throw InvalidParamsRPCException.INSTANCE;
                Boolean result = this.stratum_submitSignature(params.signature,params.sealHash);
                res = result == null ? null : new ResultUnion(result);
            }else
                throw MethodNotFoundRPCException.INSTANCE;
        }
        catch(InvalidRequestRPCException |ParseErrorRPCException |MethodNotFoundRPCException |InvalidParamsRPCException |InternalErrorRPCException e){
            throw e;
        }
        catch(Exception e){
            throw InternalErrorRPCException.INSTANCE;
        }
        return res;
    }

    default Set<String> listMethods(){
        return Set.of( "stratum_getSeed", "stratum_submitSeed", "stratum_submitSignature");
    }

    ByteArray stratum_getSeed();
    ByteArray stratum_submitSeed(ByteArray newSeed, ByteArray signingPublicKey,
        AionAddress coinbase);
    Boolean stratum_submitSignature(ByteArray signature, ByteArray sealHash);
}
