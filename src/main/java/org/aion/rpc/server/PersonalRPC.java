package org.aion.rpc.server;

import static org.aion.rpc.errors.RPCExceptions.InternalErrorRPCException;
import static org.aion.rpc.errors.RPCExceptions.InvalidParamsRPCException;
import static org.aion.rpc.errors.RPCExceptions.InvalidRequestRPCException;
import static org.aion.rpc.errors.RPCExceptions.MethodNotFoundRPCException;
import static org.aion.rpc.errors.RPCExceptions.ParseErrorRPCException;

import java.util.Set;
import org.aion.rpc.types.RPCTypes.EcRecoverParams;
import org.aion.rpc.types.RPCTypes.Request;
import org.aion.rpc.types.RPCTypesConverter.AionAddressConverter;
import org.aion.rpc.types.RPCTypesConverter.EcRecoverParamsConverter;
import org.aion.types.AionAddress;
import org.aion.util.types.ByteArrayWrapper;
/******************************************************************************
*
* AUTO-GENERATED SOURCE FILE.  DO NOT EDIT MANUALLY -- YOUR CHANGES WILL
* BE WIPED OUT WHEN THIS FILE GETS RE-GENERATED OR UPDATED.
*
*****************************************************************************/
public interface PersonalRPC{

    default Object execute(Request request){
        Object res;
        try{
            //check that the request can be fulfilled by this class
            if(request.method.equals("personal_ecRecover")){
                EcRecoverParams params;
                params=EcRecoverParamsConverter.decode(request.params);
                AionAddress result = this.personal_ecRecover(params.dataThatWasSigned,params.signature);
                res = AionAddressConverter.encode(result);
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

    boolean isExecutable(String method);

    default Set<String> listMethods(){
        return Set.of( "personal_ecRecover");
    }

    AionAddress personal_ecRecover(ByteArrayWrapper dataThatWasSigned, ByteArrayWrapper signature);
}
