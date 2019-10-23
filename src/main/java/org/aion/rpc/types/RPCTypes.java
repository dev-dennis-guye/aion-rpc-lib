package org.aion.rpc.types;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import org.aion.rpc.errors.RPCExceptions.*;
import org.aion.types.AionAddress;
import org.aion.util.bytes.ByteUtil;
/******************************************************************************
*
* AUTO-GENERATED SOURCE FILE.  DO NOT EDIT MANUALLY -- YOUR CHANGES WILL
* BE WIPED OUT WHEN THIS FILE GETS RE-GENERATED OR UPDATED.
*
*****************************************************************************/
public class RPCTypes{

    public static final class ByteArray{
        private final byte[] bytes;

        public ByteArray(byte[] bytes) {
            if (bytes == null) {
                throw new NullPointerException("Byte array is null");
            }
            this.bytes = bytes;
        }

        public byte[] toBytes(){
            return Arrays.copyOf(bytes, bytes.length);
        }

        @Override
        public String toString() {
            return "0x"+ ByteUtil.toHexString(bytes);
        }

        @Override
        public boolean equals(Object that){
            if (that==null || !(that instanceof ByteArray) )return false;
            else return Arrays.equals(this.bytes, ((ByteArray)that).bytes);
        }

        public static ByteArray wrap(byte[] bytes){
            return new ByteArray(bytes);
        }
    }

    /**
    * This is the standard request body for a JSON RPC Request
    */
    public static final class Request {
        public final Integer id;
        public final String method;
        public final Object params;
        public final VersionType jsonrpc;

        public Request(Integer id ,String method ,Object params ,VersionType jsonrpc ){
            this.id=id;
            if(method==null) throw ParseErrorRPCException.INSTANCE;
            this.method=method;
            if(params==null) throw ParseErrorRPCException.INSTANCE;
            this.params=params;
            this.jsonrpc=jsonrpc;
        }
    }
    /**
    * This is the standard response body for a JSON RPC Request
    */
    public static final class Response {
        public final Integer id;
        public final Object result;
        public final RPCError error;
        public final VersionType jsonrpc;

        public Response(Integer id ,Object result ,RPCError error ,VersionType jsonrpc ){
            this.id=id;
            this.result=result;
            this.error=error;
            if(jsonrpc==null) throw ParseErrorRPCException.INSTANCE;
            this.jsonrpc=jsonrpc;
        }
    }
    /**
    * Contains the error messages for failed JSON RPC Requests
    */
    public static final class RPCError {
        public final Integer code;
        public final String message;

        public RPCError(Integer code ,String message ){
            if(code==null) throw ParseErrorRPCException.INSTANCE;
            this.code=code;
            if(message==null) throw ParseErrorRPCException.INSTANCE;
            this.message=message;
        }
    }
    public static final class TxLogDetails {
        public final AionAddress address;
        public final Integer transactionIndex;
        public final ByteArray data;
        public final List<ByteArray> topics;
        public final Long blockNumber;

        public TxLogDetails(AionAddress address ,Integer transactionIndex ,ByteArray data ,List<ByteArray> topics ,Long blockNumber ){
            if(address==null) throw ParseErrorRPCException.INSTANCE;
            this.address=address;
            if(transactionIndex==null) throw ParseErrorRPCException.INSTANCE;
            this.transactionIndex=transactionIndex;
            if(data==null) throw ParseErrorRPCException.INSTANCE;
            this.data=data;
            if(topics==null) throw ParseErrorRPCException.INSTANCE;
            this.topics=topics;
            if(blockNumber==null) throw ParseErrorRPCException.INSTANCE;
            this.blockNumber=blockNumber;
        }
    }
    public static final class TransactionDetails {
        public final AionAddress contractAddress;
        public final ByteArray hash;
        public final Integer transactionIndex;
        public final BigInteger value;
        public final Long nrg;
        public final Long nrgPrice;
        public final Long gas;
        public final Long gasPrice;
        public final ByteArray nonce;
        public final AionAddress from;
        public final AionAddress to;
        public final Long timestamp;
        public final ByteArray input;
        public final Long blockNumber;
        public final ByteArray blockHash;
        public final String error;
        public final Byte type;
        public final Long nrgUsed;
        public final Long gasUsed;
        public final Boolean hasInternalTransactions;
        public final List<TxLogDetails> logs;

        public TransactionDetails(AionAddress contractAddress ,ByteArray hash ,Integer transactionIndex ,BigInteger value ,Long nrg ,Long nrgPrice ,Long gas ,Long gasPrice ,ByteArray nonce ,AionAddress from ,AionAddress to ,Long timestamp ,ByteArray input ,Long blockNumber ,ByteArray blockHash ,String error ,Byte type ,Long nrgUsed ,Long gasUsed ,Boolean hasInternalTransactions ,List<TxLogDetails> logs ){
            this.contractAddress=contractAddress;
            if(hash==null) throw ParseErrorRPCException.INSTANCE;
            this.hash=hash;
            if(transactionIndex==null) throw ParseErrorRPCException.INSTANCE;
            this.transactionIndex=transactionIndex;
            if(value==null) throw ParseErrorRPCException.INSTANCE;
            this.value=value;
            if(nrg==null) throw ParseErrorRPCException.INSTANCE;
            this.nrg=nrg;
            if(nrgPrice==null) throw ParseErrorRPCException.INSTANCE;
            this.nrgPrice=nrgPrice;
            if(gas==null) throw ParseErrorRPCException.INSTANCE;
            this.gas=gas;
            if(gasPrice==null) throw ParseErrorRPCException.INSTANCE;
            this.gasPrice=gasPrice;
            if(nonce==null) throw ParseErrorRPCException.INSTANCE;
            this.nonce=nonce;
            if(from==null) throw ParseErrorRPCException.INSTANCE;
            this.from=from;
            this.to=to;
            if(timestamp==null) throw ParseErrorRPCException.INSTANCE;
            this.timestamp=timestamp;
            if(input==null) throw ParseErrorRPCException.INSTANCE;
            this.input=input;
            if(blockNumber==null) throw ParseErrorRPCException.INSTANCE;
            this.blockNumber=blockNumber;
            if(blockHash==null) throw ParseErrorRPCException.INSTANCE;
            this.blockHash=blockHash;
            if(error==null) throw ParseErrorRPCException.INSTANCE;
            this.error=error;
            if(type==null) throw ParseErrorRPCException.INSTANCE;
            this.type=type;
            if(nrgUsed==null) throw ParseErrorRPCException.INSTANCE;
            this.nrgUsed=nrgUsed;
            if(gasUsed==null) throw ParseErrorRPCException.INSTANCE;
            this.gasUsed=gasUsed;
            if(hasInternalTransactions==null) throw ParseErrorRPCException.INSTANCE;
            this.hasInternalTransactions=hasInternalTransactions;
            if(logs==null) throw ParseErrorRPCException.INSTANCE;
            this.logs=logs;
        }
    }
    public static final class BlockDetails {
        public final Long number;
        public final ByteArray hash;
        public final ByteArray parentHash;
        public final ByteArray logsBloom;
        public final ByteArray transactionsRoot;
        public final ByteArray statesRoot;
        public final ByteArray receiptsRoot;
        public final Long difficulty;
        public final BigInteger totalDifficulty;
        public final AionAddress miner;
        public final Long timestamp;
        public final Long gasUsed;
        public final Long gasLimit;
        public final Long nrgUsed;
        public final Long nrgLimit;
        public final Byte sealType;
        public final Boolean mainChain;
        public final ByteArray antiParentHash;
        public final ByteArray extraData;
        public final Integer size;
        public final Integer numTransactions;
        public final ByteArray txTrieRoot;
        public final BigInteger blockReward;
        public final List<TransactionDetails> transactions;
        public final ByteArray nonce;
        public final ByteArray solution;
        public final ByteArray seed;
        public final ByteArray signature;
        public final ByteArray publicKey;
        public final Integer blockTime;

        public BlockDetails(Long number ,ByteArray hash ,ByteArray parentHash ,ByteArray logsBloom ,ByteArray transactionsRoot ,ByteArray statesRoot ,ByteArray receiptsRoot ,Long difficulty ,BigInteger totalDifficulty ,AionAddress miner ,Long timestamp ,Long gasUsed ,Long gasLimit ,Long nrgUsed ,Long nrgLimit ,Byte sealType ,Boolean mainChain ,ByteArray antiParentHash ,ByteArray extraData ,Integer size ,Integer numTransactions ,ByteArray txTrieRoot ,BigInteger blockReward ,List<TransactionDetails> transactions ,ByteArray nonce ,ByteArray solution ,ByteArray seed ,ByteArray signature ,ByteArray publicKey ,Integer blockTime ){
            if(number==null) throw ParseErrorRPCException.INSTANCE;
            this.number=number;
            if(hash==null) throw ParseErrorRPCException.INSTANCE;
            this.hash=hash;
            if(parentHash==null) throw ParseErrorRPCException.INSTANCE;
            this.parentHash=parentHash;
            if(logsBloom==null) throw ParseErrorRPCException.INSTANCE;
            this.logsBloom=logsBloom;
            if(transactionsRoot==null) throw ParseErrorRPCException.INSTANCE;
            this.transactionsRoot=transactionsRoot;
            if(statesRoot==null) throw ParseErrorRPCException.INSTANCE;
            this.statesRoot=statesRoot;
            if(receiptsRoot==null) throw ParseErrorRPCException.INSTANCE;
            this.receiptsRoot=receiptsRoot;
            if(difficulty==null) throw ParseErrorRPCException.INSTANCE;
            this.difficulty=difficulty;
            if(totalDifficulty==null) throw ParseErrorRPCException.INSTANCE;
            this.totalDifficulty=totalDifficulty;
            if(miner==null) throw ParseErrorRPCException.INSTANCE;
            this.miner=miner;
            if(timestamp==null) throw ParseErrorRPCException.INSTANCE;
            this.timestamp=timestamp;
            if(gasUsed==null) throw ParseErrorRPCException.INSTANCE;
            this.gasUsed=gasUsed;
            if(gasLimit==null) throw ParseErrorRPCException.INSTANCE;
            this.gasLimit=gasLimit;
            if(nrgUsed==null) throw ParseErrorRPCException.INSTANCE;
            this.nrgUsed=nrgUsed;
            if(nrgLimit==null) throw ParseErrorRPCException.INSTANCE;
            this.nrgLimit=nrgLimit;
            if(sealType==null) throw ParseErrorRPCException.INSTANCE;
            this.sealType=sealType;
            if(mainChain==null) throw ParseErrorRPCException.INSTANCE;
            this.mainChain=mainChain;
            if(antiParentHash==null) throw ParseErrorRPCException.INSTANCE;
            this.antiParentHash=antiParentHash;
            if(extraData==null) throw ParseErrorRPCException.INSTANCE;
            this.extraData=extraData;
            if(size==null) throw ParseErrorRPCException.INSTANCE;
            this.size=size;
            if(numTransactions==null) throw ParseErrorRPCException.INSTANCE;
            this.numTransactions=numTransactions;
            if(txTrieRoot==null) throw ParseErrorRPCException.INSTANCE;
            this.txTrieRoot=txTrieRoot;
            if(blockReward==null) throw ParseErrorRPCException.INSTANCE;
            this.blockReward=blockReward;
            if(transactions==null) throw ParseErrorRPCException.INSTANCE;
            this.transactions=transactions;
            this.nonce=nonce;
            this.solution=solution;
            this.seed=seed;
            this.signature=signature;
            this.publicKey=publicKey;
            this.blockTime=blockTime;
        }
    }

    public enum VersionType{
        Version2("2.0");
        public final String x;
        VersionType(String x){
            this.x = x;
        }

        public static VersionType fromString(String x){
            if(x==null) throw ParseErrorRPCException.INSTANCE;
            if(x.equals("2.0")){
                return Version2;
            }else
                throw ParseErrorRPCException.INSTANCE;
        }
    }
    public enum BlockEnum{
        LATEST("latest");
        public final String x;
        BlockEnum(String x){
            this.x = x;
        }

        public static BlockEnum fromString(String x){
            if(x==null) throw ParseErrorRPCException.INSTANCE;
            if(x.equals("latest")){
                return LATEST;
            }else
                throw ParseErrorRPCException.INSTANCE;
        }
    }

    public static final class EcRecoverParams {
        public final ByteArray dataThatWasSigned;
        public final ByteArray signature;

        public EcRecoverParams(ByteArray dataThatWasSigned ,ByteArray signature ){
            if(dataThatWasSigned==null) throw ParseErrorRPCException.INSTANCE;
            this.dataThatWasSigned=dataThatWasSigned;
            if(signature==null) throw ParseErrorRPCException.INSTANCE;
            this.signature=signature;
        }
    }
    public static final class BlockByNumberParams {
        public final Long block;

        public BlockByNumberParams(Long block ){
            this.block=block;
        }
    }
    public static final class BlockByEnumParams {
        public final BlockEnum block;

        public BlockByEnumParams(BlockEnum block ){
            this.block=block;
        }
    }
    public static final class BlockByHashParams {
        public final ByteArray block;

        public BlockByHashParams(ByteArray block ){
            this.block=block;
        }
    }
}
