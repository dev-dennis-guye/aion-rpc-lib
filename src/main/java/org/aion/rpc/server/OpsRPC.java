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
        try{
            //check that the request can be fulfilled by this class
            if(request.method.equals("ops_getBlockDetailsByNumber")){
                try{
                BlockByNumberParams params;
                params=BlockByNumberParamsConverter.decode(request.params);
                BlockDetails result = this.ops_getBlockDetailsByNumber(params.block);
                return BlockDetailsConverter.encode(result);
                }catch(Exception e){/*Do nothing and attempt the next param*/}
                BlockByEnumParams params;
                params=BlockByEnumParamsConverter.decode(request.params);
                BlockDetails result = this.ops_getBlockDetailsByNumber(params.block);
                return BlockDetailsConverter.encode(result);
                
            }else
            if(request.method.equals("ops_getBlockDetailsByHash")){
                
                BlockByHashParams params;
                params=BlockByHashParamsConverter.decode(request.params);
                BlockDetails result = this.ops_getBlockDetailsByHash(params.block);
                return BlockDetailsConverter.encode(result);
                
            }else
                throw MethodNotFoundRPCException.INSTANCE;
        }
        catch(InvalidRequestRPCException |ParseErrorRPCException |MethodNotFoundRPCException |InvalidParamsRPCException |InternalErrorRPCException e){
            throw e;
        }
        catch(Exception e){
            throw InternalErrorRPCException.INSTANCE;
        }
    }

    default Set<String> listMethods(){
        return Set.of( "ops_getBlockDetailsByNumber", "ops_getBlockDetailsByHash");
    }

    BlockDetails ops_getBlockDetailsByNumber(Long block);
    BlockDetails ops_getBlockDetailsByNumber(BlockEnum block);
    BlockDetails ops_getBlockDetailsByHash(ByteArray block);
}
