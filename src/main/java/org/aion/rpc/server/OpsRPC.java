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
public interface OpsRPC extends RPC{

    default Object execute(Request request){
        Object res;
        try{
            //check that the request can be fulfilled by this class
            if(request.method.equals("ops_getBlockDetails")){
                blockSpecifier params;
                params=blockSpecifierConverter.decode(request.params);
                BlockDetails result = this.ops_getBlockDetails(params.blockNumber,params.blockEnum,params.blockHash);
                res = BlockDetailsConverter.encode(result);
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
        return Set.of( "ops_getBlockDetails");
    }

    BlockDetails ops_getBlockDetails(Long blockNumber, BlockEnum blockEnum, ByteArray blockHash);
}
