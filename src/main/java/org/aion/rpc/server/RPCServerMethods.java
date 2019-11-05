package org.aion.rpc.server;

import static org.aion.rpc.errors.RPCExceptions.*;

import java.math.BigInteger;
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
public interface RPCServerMethods extends RPC{

    default ResultUnion execute(Request request){
        ResultUnion res;
            //check that the request can be fulfilled by this class
            if(request.method.equals("personal_ecRecover")){
                EcRecoverParams params=request.params.ecRecoverParams;
                if (params==null) throw InvalidParamsRPCException.INSTANCE;
                AionAddress result = this.personal_ecRecover(params.dataThatWasSigned,params.signature);
                res = result == null ? null : new ResultUnion(result);
            }else
            if(request.method.equals("getseed")){
                VoidParams params=request.params.voidParams;
                if (params==null) throw InvalidParamsRPCException.INSTANCE;
                ByteArray result = this.getseed();
                res = result == null ? null : new ResultUnion(result);
            }else
            if(request.method.equals("submitseed")){
                SubmitSeedParams params=request.params.submitSeedParams;
                if (params==null) throw InvalidParamsRPCException.INSTANCE;
                ByteArray result = this.submitseed(params.newSeed,params.signingPublicKey,params.coinbase);
                res = result == null ? null : new ResultUnion(result);
            }else
            if(request.method.equals("submitsignature")){
                SubmitSignatureParams params=request.params.submitSignatureParams;
                if (params==null) throw InvalidParamsRPCException.INSTANCE;
                Boolean result = this.submitsignature(params.signature,params.sealHash);
                res = result == null ? null : new ResultUnion(result);
            }else
            if(request.method.equals("ops_getBlockDetails")){
                BlockSpecifier params=request.params.blockSpecifier;
                if (params==null) throw InvalidParamsRPCException.INSTANCE;
                BlockDetails result = this.ops_getBlockDetails(params.block);
                res = result == null ? null : new ResultUnion(result);
            }else
            if(request.method.equals("getblocktemplate")){
                VoidParams params=request.params.voidParams;
                if (params==null) throw InvalidParamsRPCException.INSTANCE;
                BlockTemplate result = this.getblocktemplate();
                res = result == null ? null : new ResultUnion(result);
            }else
            if(request.method.equals("submitblock")){
                SubmitBlockParams params=request.params.submitBlockParams;
                if (params==null) throw InvalidParamsRPCException.INSTANCE;
                SubmissionResult result = this.submitblock(params.nonce,params.solution,params.headerHash);
                res = result == null ? null : new ResultUnion(result);
            }else
            if(request.method.equals("validateaddress")){
                AddressParams params=request.params.addressParams;
                if (params==null) throw InvalidParamsRPCException.INSTANCE;
                ValidateAddressResult result = this.validateaddress(params.address);
                res = result == null ? null : new ResultUnion(result);
            }else
            if(request.method.equals("getDifficulty")){
                VoidParams params=request.params.voidParams;
                if (params==null) throw InvalidParamsRPCException.INSTANCE;
                BigInteger result = this.getDifficulty();
                res = result == null ? null : new ResultUnion(result);
            }else
            if(request.method.equals("getMinerStats")){
                AddressParams params=request.params.addressParams;
                if (params==null) throw InvalidParamsRPCException.INSTANCE;
                MinerStats result = this.getMinerStats(params.address);
                res = result == null ? null : new ResultUnion(result);
            }else
                throw MethodNotFoundRPCException.INSTANCE;
        return res;
    }

    default Set<String> listMethods(){
        return Set.of( "personal_ecRecover", "getseed", "submitseed", "submitsignature", "ops_getBlockDetails", "getblocktemplate", "submitblock", "validateaddress", "getDifficulty", "getMinerStats");
    }

    AionAddress personal_ecRecover(ByteArray dataThatWasSigned, ByteArray signature);
    ByteArray getseed();
    ByteArray submitseed(ByteArray newSeed, ByteArray signingPublicKey, AionAddress coinbase);
    Boolean submitsignature(ByteArray signature, ByteArray sealHash);
    BlockDetails ops_getBlockDetails(BlockSpecifierUnion block);
    BlockTemplate getblocktemplate();
    SubmissionResult submitblock(ByteArray nonce, ByteArray solution, ByteArray headerHash);
    ValidateAddressResult validateaddress(AionAddress address);
    BigInteger getDifficulty();
    MinerStats getMinerStats(AionAddress address);
}
