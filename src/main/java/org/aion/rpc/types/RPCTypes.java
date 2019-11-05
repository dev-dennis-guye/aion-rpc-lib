package org.aion.rpc.types;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import org.aion.rpc.errors.RPCExceptions.*;
import org.aion.rpc.types.RPCTypesConverter.*;
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

        public ByteArray(String hexString){
            if (hexString == null) throw new NullPointerException("Hex String is null");
            this.bytes = ByteUtil.hexStringToBytes(hexString);
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

        public int hashCode(){
            return Arrays.hashCode(this.bytes);
        }

        public static ByteArray wrap(byte[] bytes){
            return new ByteArray(bytes);
        }

        public static ByteArray wrap(String hexString){
            return new ByteArray(hexString);
        }
    }

    /**
    * Specifies a block
    */
    public static final class BlockSpecifierUnion{
        public final ByteArray hash;
        public final Long blockNumber;
        public final BlockEnum blockEnum;
        private BlockSpecifierUnion(ByteArray hash ,Long blockNumber ,BlockEnum blockEnum ){
            this.hash=hash;
            this.blockNumber=blockNumber;
            this.blockEnum=blockEnum;
        }

        public BlockSpecifierUnion(ByteArray hash){
            this(hash,null,null);
            if(hash == null) throw ParseErrorRPCException.INSTANCE;
        }
        public BlockSpecifierUnion(Long blockNumber){
            this(null,blockNumber,null);
            if(blockNumber == null) throw ParseErrorRPCException.INSTANCE;
        }
        public BlockSpecifierUnion(BlockEnum blockEnum){
            this(null,null,blockEnum);
            if(blockEnum == null) throw ParseErrorRPCException.INSTANCE;
        }

        public static BlockSpecifierUnion wrap(ByteArray hash){
            if(hash == null) throw ParseErrorRPCException.INSTANCE;
            else return new BlockSpecifierUnion(hash);
        }
        public static BlockSpecifierUnion wrap(Long blockNumber){
            if(blockNumber == null) throw ParseErrorRPCException.INSTANCE;
            else return new BlockSpecifierUnion(blockNumber);
        }
        public static BlockSpecifierUnion wrap(BlockEnum blockEnum){
            if(blockEnum == null) throw ParseErrorRPCException.INSTANCE;
            else return new BlockSpecifierUnion(blockEnum);
        }

        public Object encode(){
            if(this.hash != null) return ByteArrayConverter.encode(hash);
            if(this.blockNumber != null) return LongConverter.encode(blockNumber);
            if(this.blockEnum != null) return BlockEnumConverter.encode(blockEnum);
            throw ParseErrorRPCException.INSTANCE;
        }

        public static BlockSpecifierUnion decode(Object object){
            try{
                return new BlockSpecifierUnion(ByteArrayConverter.decode(object));
            }catch(Exception e){}
            try{
                return new BlockSpecifierUnion(LongConverter.decode(object));
            }catch(Exception e){}
            try{
                return new BlockSpecifierUnion(BlockEnumConverter.decode(object));
            }catch(Exception e){}
            throw ParseErrorRPCException.INSTANCE;
        }
    }

    /**
    * Ensures that the result is type safe
    */
    public static final class ResultUnion{
        public final BlockDetails blockDetails;
        public final AionAddress address;
        public final ByteArray byteArray;
        public final Boolean bool;
        public final BlockTemplate blockTemplate;
        public final SubmissionResult submissionResult;
        public final ValidateAddressResult validateAddressResult;
        public final BigInteger bigInt;
        public final MinerStats minerStats;
        private ResultUnion(BlockDetails blockDetails ,AionAddress address ,ByteArray byteArray ,Boolean bool ,BlockTemplate blockTemplate ,SubmissionResult submissionResult ,ValidateAddressResult validateAddressResult ,BigInteger bigInt ,MinerStats minerStats ){
            this.blockDetails=blockDetails;
            this.address=address;
            this.byteArray=byteArray;
            this.bool=bool;
            this.blockTemplate=blockTemplate;
            this.submissionResult=submissionResult;
            this.validateAddressResult=validateAddressResult;
            this.bigInt=bigInt;
            this.minerStats=minerStats;
        }

        public ResultUnion(BlockDetails blockDetails){
            this(blockDetails,null,null,null,null,null,null,null,null);
            if(blockDetails == null) throw ParseErrorRPCException.INSTANCE;
        }
        public ResultUnion(AionAddress address){
            this(null,address,null,null,null,null,null,null,null);
            if(address == null) throw ParseErrorRPCException.INSTANCE;
        }
        public ResultUnion(ByteArray byteArray){
            this(null,null,byteArray,null,null,null,null,null,null);
            if(byteArray == null) throw ParseErrorRPCException.INSTANCE;
        }
        public ResultUnion(Boolean bool){
            this(null,null,null,bool,null,null,null,null,null);
            if(bool == null) throw ParseErrorRPCException.INSTANCE;
        }
        public ResultUnion(BlockTemplate blockTemplate){
            this(null,null,null,null,blockTemplate,null,null,null,null);
            if(blockTemplate == null) throw ParseErrorRPCException.INSTANCE;
        }
        public ResultUnion(SubmissionResult submissionResult){
            this(null,null,null,null,null,submissionResult,null,null,null);
            if(submissionResult == null) throw ParseErrorRPCException.INSTANCE;
        }
        public ResultUnion(ValidateAddressResult validateAddressResult){
            this(null,null,null,null,null,null,validateAddressResult,null,null);
            if(validateAddressResult == null) throw ParseErrorRPCException.INSTANCE;
        }
        public ResultUnion(BigInteger bigInt){
            this(null,null,null,null,null,null,null,bigInt,null);
            if(bigInt == null) throw ParseErrorRPCException.INSTANCE;
        }
        public ResultUnion(MinerStats minerStats){
            this(null,null,null,null,null,null,null,null,minerStats);
            if(minerStats == null) throw ParseErrorRPCException.INSTANCE;
        }

        public static ResultUnion wrap(BlockDetails blockDetails){
            if(blockDetails == null) throw ParseErrorRPCException.INSTANCE;
            else return new ResultUnion(blockDetails);
        }
        public static ResultUnion wrap(AionAddress address){
            if(address == null) throw ParseErrorRPCException.INSTANCE;
            else return new ResultUnion(address);
        }
        public static ResultUnion wrap(ByteArray byteArray){
            if(byteArray == null) throw ParseErrorRPCException.INSTANCE;
            else return new ResultUnion(byteArray);
        }
        public static ResultUnion wrap(Boolean bool){
            if(bool == null) throw ParseErrorRPCException.INSTANCE;
            else return new ResultUnion(bool);
        }
        public static ResultUnion wrap(BlockTemplate blockTemplate){
            if(blockTemplate == null) throw ParseErrorRPCException.INSTANCE;
            else return new ResultUnion(blockTemplate);
        }
        public static ResultUnion wrap(SubmissionResult submissionResult){
            if(submissionResult == null) throw ParseErrorRPCException.INSTANCE;
            else return new ResultUnion(submissionResult);
        }
        public static ResultUnion wrap(ValidateAddressResult validateAddressResult){
            if(validateAddressResult == null) throw ParseErrorRPCException.INSTANCE;
            else return new ResultUnion(validateAddressResult);
        }
        public static ResultUnion wrap(BigInteger bigInt){
            if(bigInt == null) throw ParseErrorRPCException.INSTANCE;
            else return new ResultUnion(bigInt);
        }
        public static ResultUnion wrap(MinerStats minerStats){
            if(minerStats == null) throw ParseErrorRPCException.INSTANCE;
            else return new ResultUnion(minerStats);
        }

        public Object encode(){
            if(this.blockDetails != null) return BlockDetailsConverter.encode(blockDetails);
            if(this.address != null) return AionAddressConverter.encode(address);
            if(this.byteArray != null) return ByteArrayConverter.encode(byteArray);
            if(this.bool != null) return BooleanConverter.encode(bool);
            if(this.blockTemplate != null) return BlockTemplateConverter.encode(blockTemplate);
            if(this.submissionResult != null) return SubmissionResultConverter.encode(submissionResult);
            if(this.validateAddressResult != null) return ValidateAddressResultConverter.encode(validateAddressResult);
            if(this.bigInt != null) return BigIntegerHexStringConverter.encode(bigInt);
            if(this.minerStats != null) return MinerStatsConverter.encode(minerStats);
            throw ParseErrorRPCException.INSTANCE;
        }

        public static ResultUnion decode(Object object){
            try{
                return new ResultUnion(BlockDetailsConverter.decode(object));
            }catch(Exception e){}
            try{
                return new ResultUnion(AionAddressConverter.decode(object));
            }catch(Exception e){}
            try{
                return new ResultUnion(ByteArrayConverter.decode(object));
            }catch(Exception e){}
            try{
                return new ResultUnion(BooleanConverter.decode(object));
            }catch(Exception e){}
            try{
                return new ResultUnion(BlockTemplateConverter.decode(object));
            }catch(Exception e){}
            try{
                return new ResultUnion(SubmissionResultConverter.decode(object));
            }catch(Exception e){}
            try{
                return new ResultUnion(ValidateAddressResultConverter.decode(object));
            }catch(Exception e){}
            try{
                return new ResultUnion(BigIntegerHexStringConverter.decode(object));
            }catch(Exception e){}
            try{
                return new ResultUnion(MinerStatsConverter.decode(object));
            }catch(Exception e){}
            throw ParseErrorRPCException.INSTANCE;
        }
    }

    /**
    * Ensures that the request is type safe
    */
    public static final class ParamUnion{
        public final EcRecoverParams ecRecoverParams;
        public final BlockSpecifier blockSpecifier;
        public final VoidParams voidParams;
        public final SubmitSeedParams submitSeedParams;
        public final SubmitSignatureParams submitSignatureParams;
        public final SubmitBlockParams submitBlockParams;
        public final AddressParams addressParams;
        private ParamUnion(EcRecoverParams ecRecoverParams ,BlockSpecifier blockSpecifier ,VoidParams voidParams ,SubmitSeedParams submitSeedParams ,SubmitSignatureParams submitSignatureParams ,SubmitBlockParams submitBlockParams ,AddressParams addressParams ){
            this.ecRecoverParams=ecRecoverParams;
            this.blockSpecifier=blockSpecifier;
            this.voidParams=voidParams;
            this.submitSeedParams=submitSeedParams;
            this.submitSignatureParams=submitSignatureParams;
            this.submitBlockParams=submitBlockParams;
            this.addressParams=addressParams;
        }

        public ParamUnion(EcRecoverParams ecRecoverParams){
            this(ecRecoverParams,null,null,null,null,null,null);
            if(ecRecoverParams == null) throw ParseErrorRPCException.INSTANCE;
        }
        public ParamUnion(BlockSpecifier blockSpecifier){
            this(null,blockSpecifier,null,null,null,null,null);
            if(blockSpecifier == null) throw ParseErrorRPCException.INSTANCE;
        }
        public ParamUnion(VoidParams voidParams){
            this(null,null,voidParams,null,null,null,null);
            if(voidParams == null) throw ParseErrorRPCException.INSTANCE;
        }
        public ParamUnion(SubmitSeedParams submitSeedParams){
            this(null,null,null,submitSeedParams,null,null,null);
            if(submitSeedParams == null) throw ParseErrorRPCException.INSTANCE;
        }
        public ParamUnion(SubmitSignatureParams submitSignatureParams){
            this(null,null,null,null,submitSignatureParams,null,null);
            if(submitSignatureParams == null) throw ParseErrorRPCException.INSTANCE;
        }
        public ParamUnion(SubmitBlockParams submitBlockParams){
            this(null,null,null,null,null,submitBlockParams,null);
            if(submitBlockParams == null) throw ParseErrorRPCException.INSTANCE;
        }
        public ParamUnion(AddressParams addressParams){
            this(null,null,null,null,null,null,addressParams);
            if(addressParams == null) throw ParseErrorRPCException.INSTANCE;
        }

        public static ParamUnion wrap(EcRecoverParams ecRecoverParams){
            if(ecRecoverParams == null) throw ParseErrorRPCException.INSTANCE;
            else return new ParamUnion(ecRecoverParams);
        }
        public static ParamUnion wrap(BlockSpecifier blockSpecifier){
            if(blockSpecifier == null) throw ParseErrorRPCException.INSTANCE;
            else return new ParamUnion(blockSpecifier);
        }
        public static ParamUnion wrap(VoidParams voidParams){
            if(voidParams == null) throw ParseErrorRPCException.INSTANCE;
            else return new ParamUnion(voidParams);
        }
        public static ParamUnion wrap(SubmitSeedParams submitSeedParams){
            if(submitSeedParams == null) throw ParseErrorRPCException.INSTANCE;
            else return new ParamUnion(submitSeedParams);
        }
        public static ParamUnion wrap(SubmitSignatureParams submitSignatureParams){
            if(submitSignatureParams == null) throw ParseErrorRPCException.INSTANCE;
            else return new ParamUnion(submitSignatureParams);
        }
        public static ParamUnion wrap(SubmitBlockParams submitBlockParams){
            if(submitBlockParams == null) throw ParseErrorRPCException.INSTANCE;
            else return new ParamUnion(submitBlockParams);
        }
        public static ParamUnion wrap(AddressParams addressParams){
            if(addressParams == null) throw ParseErrorRPCException.INSTANCE;
            else return new ParamUnion(addressParams);
        }

        public Object encode(){
            if(this.ecRecoverParams != null) return EcRecoverParamsConverter.encode(ecRecoverParams);
            if(this.blockSpecifier != null) return BlockSpecifierConverter.encode(blockSpecifier);
            if(this.voidParams != null) return VoidParamsConverter.encode(voidParams);
            if(this.submitSeedParams != null) return SubmitSeedParamsConverter.encode(submitSeedParams);
            if(this.submitSignatureParams != null) return SubmitSignatureParamsConverter.encode(submitSignatureParams);
            if(this.submitBlockParams != null) return SubmitBlockParamsConverter.encode(submitBlockParams);
            if(this.addressParams != null) return AddressParamsConverter.encode(addressParams);
            throw ParseErrorRPCException.INSTANCE;
        }

        public static ParamUnion decode(Object object){
            try{
                return new ParamUnion(EcRecoverParamsConverter.decode(object));
            }catch(Exception e){}
            try{
                return new ParamUnion(BlockSpecifierConverter.decode(object));
            }catch(Exception e){}
            try{
                return new ParamUnion(VoidParamsConverter.decode(object));
            }catch(Exception e){}
            try{
                return new ParamUnion(SubmitSeedParamsConverter.decode(object));
            }catch(Exception e){}
            try{
                return new ParamUnion(SubmitSignatureParamsConverter.decode(object));
            }catch(Exception e){}
            try{
                return new ParamUnion(SubmitBlockParamsConverter.decode(object));
            }catch(Exception e){}
            try{
                return new ParamUnion(AddressParamsConverter.decode(object));
            }catch(Exception e){}
            throw ParseErrorRPCException.INSTANCE;
        }
    }

    /**
    * This is the standard request body for a JSON RPC Request
    */
    public static final class Request {
        public final Integer id;
        public final String method;
        public final ParamUnion params;
        public final VersionType jsonrpc;

        public Request(Integer id ,String method ,ParamUnion params ,VersionType jsonrpc ){
            this.id=id;
            if(method==null) throw ParseErrorRPCException.INSTANCE;
            this.method=method;
            this.params=params;
            this.jsonrpc=jsonrpc;
        }
    }
    /**
    * This is the standard response body for a JSON RPC Request
    */
    public static final class Response {
        public final Integer id;
        public final ResultUnion result;
        public final RPCError error;
        public final VersionType jsonrpc;

        public Response(Integer id ,ResultUnion result ,RPCError error ,VersionType jsonrpc ){
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
        public final ByteArray beaconHash;

        public TransactionDetails(AionAddress contractAddress ,ByteArray hash ,Integer transactionIndex ,BigInteger value ,Long nrg ,Long nrgPrice ,Long gas ,Long gasPrice ,ByteArray nonce ,AionAddress from ,AionAddress to ,Long timestamp ,ByteArray input ,Long blockNumber ,ByteArray blockHash ,String error ,Byte type ,Long nrgUsed ,Long gasUsed ,Boolean hasInternalTransactions ,List<TxLogDetails> logs ,ByteArray beaconHash ){
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
            this.beaconHash=beaconHash;
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
        public final BigInteger difficulty;
        public final BigInteger totalDifficulty;
        public final AionAddress miner;
        public final Long timestamp;
        public final Long gasUsed;
        public final Long gasLimit;
        public final Long nrgUsed;
        public final Long nrgLimit;
        public final Byte sealType;
        public final Boolean mainChain;
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

        public BlockDetails(Long number ,ByteArray hash ,ByteArray parentHash ,ByteArray logsBloom ,ByteArray transactionsRoot ,ByteArray statesRoot ,ByteArray receiptsRoot ,BigInteger difficulty ,BigInteger totalDifficulty ,AionAddress miner ,Long timestamp ,Long gasUsed ,Long gasLimit ,Long nrgUsed ,Long nrgLimit ,Byte sealType ,Boolean mainChain ,ByteArray extraData ,Integer size ,Integer numTransactions ,ByteArray txTrieRoot ,BigInteger blockReward ,List<TransactionDetails> transactions ,ByteArray nonce ,ByteArray solution ,ByteArray seed ,ByteArray signature ,ByteArray publicKey ,Integer blockTime ){
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
    public static final class BlockTemplate {
        public final ByteArray previousblockhash;
        public final Long height;
        public final BigInteger target;
        public final ByteArray headerHash;
        public final BigInteger blockBaseReward;
        public final BigInteger blockTxFee;

        public BlockTemplate(ByteArray previousblockhash ,Long height ,BigInteger target ,ByteArray headerHash ,BigInteger blockBaseReward ,BigInteger blockTxFee ){
            if(previousblockhash==null) throw ParseErrorRPCException.INSTANCE;
            this.previousblockhash=previousblockhash;
            if(height==null) throw ParseErrorRPCException.INSTANCE;
            this.height=height;
            if(target==null) throw ParseErrorRPCException.INSTANCE;
            this.target=target;
            if(headerHash==null) throw ParseErrorRPCException.INSTANCE;
            this.headerHash=headerHash;
            if(blockBaseReward==null) throw ParseErrorRPCException.INSTANCE;
            this.blockBaseReward=blockBaseReward;
            if(blockTxFee==null) throw ParseErrorRPCException.INSTANCE;
            this.blockTxFee=blockTxFee;
        }
    }
    public static final class SubmissionResult {
        public final Boolean result;

        public SubmissionResult(Boolean result ){
            if(result==null) throw ParseErrorRPCException.INSTANCE;
            this.result=result;
        }
    }
    public static final class ValidateAddressResult {
        public final Boolean isvalid;
        public final AionAddress address;
        public final Boolean ismine;

        public ValidateAddressResult(Boolean isvalid ,AionAddress address ,Boolean ismine ){
            if(isvalid==null) throw ParseErrorRPCException.INSTANCE;
            this.isvalid=isvalid;
            if(address==null) throw ParseErrorRPCException.INSTANCE;
            this.address=address;
            if(ismine==null) throw ParseErrorRPCException.INSTANCE;
            this.ismine=ismine;
        }
    }
    public static final class MinerStats {
        public final String networkHashRate;
        public final String minerHashrate;
        public final String minerHashrateShare;

        public MinerStats(String networkHashRate ,String minerHashrate ,String minerHashrateShare ){
            if(networkHashRate==null) throw ParseErrorRPCException.INSTANCE;
            this.networkHashRate=networkHashRate;
            if(minerHashrate==null) throw ParseErrorRPCException.INSTANCE;
            this.minerHashrate=minerHashrate;
            if(minerHashrateShare==null) throw ParseErrorRPCException.INSTANCE;
            this.minerHashrateShare=minerHashrateShare;
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
    public static final class BlockSpecifier {
        public final BlockSpecifierUnion block;

        public BlockSpecifier(BlockSpecifierUnion block ){
            if(block==null) throw ParseErrorRPCException.INSTANCE;
            this.block=block;
        }
    }
    public static final class SubmitSeedParams {
        public final ByteArray newSeed;
        public final ByteArray signingPublicKey;
        public final AionAddress coinbase;

        public SubmitSeedParams(ByteArray newSeed ,ByteArray signingPublicKey ,AionAddress coinbase ){
            if(newSeed==null) throw ParseErrorRPCException.INSTANCE;
            this.newSeed=newSeed;
            if(signingPublicKey==null) throw ParseErrorRPCException.INSTANCE;
            this.signingPublicKey=signingPublicKey;
            if(coinbase==null) throw ParseErrorRPCException.INSTANCE;
            this.coinbase=coinbase;
        }
    }
    public static final class SubmitSignatureParams {
        public final ByteArray signature;
        public final ByteArray sealHash;

        public SubmitSignatureParams(ByteArray signature ,ByteArray sealHash ){
            if(signature==null) throw ParseErrorRPCException.INSTANCE;
            this.signature=signature;
            if(sealHash==null) throw ParseErrorRPCException.INSTANCE;
            this.sealHash=sealHash;
        }
    }
    public static final class VoidParams {

        public VoidParams(){
        }
    }
    public static final class SubmitBlockParams {
        public final ByteArray nonce;
        public final ByteArray solution;
        public final ByteArray headerHash;

        public SubmitBlockParams(ByteArray nonce ,ByteArray solution ,ByteArray headerHash ){
            if(nonce==null) throw ParseErrorRPCException.INSTANCE;
            this.nonce=nonce;
            if(solution==null) throw ParseErrorRPCException.INSTANCE;
            this.solution=solution;
            if(headerHash==null) throw ParseErrorRPCException.INSTANCE;
            this.headerHash=headerHash;
        }
    }
    public static final class AddressParams {
        public final AionAddress address;

        public AddressParams(AionAddress address ){
            if(address==null) throw ParseErrorRPCException.INSTANCE;
            this.address=address;
        }
    }
}
