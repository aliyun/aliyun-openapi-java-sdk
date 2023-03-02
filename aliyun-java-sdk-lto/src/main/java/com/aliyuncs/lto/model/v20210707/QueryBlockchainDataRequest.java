/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.lto.model.v20210707;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryBlockchainDataRequest extends RpcAcsRequest<QueryBlockchainDataResponse> {
	   

	private String contractName;

	private String bizChainId;

	private String transactionId;

	private String invokeType;

	private String iotDataDID;
	public QueryBlockchainDataRequest() {
		super("lto", "2021-07-07", "QueryBlockchainData");
		setMethod(MethodType.POST);
	}

	public String getContractName() {
		return this.contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
		if(contractName != null){
			putQueryParameter("ContractName", contractName);
		}
	}

	public String getBizChainId() {
		return this.bizChainId;
	}

	public void setBizChainId(String bizChainId) {
		this.bizChainId = bizChainId;
		if(bizChainId != null){
			putQueryParameter("BizChainId", bizChainId);
		}
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
		if(transactionId != null){
			putQueryParameter("TransactionId", transactionId);
		}
	}

	public String getInvokeType() {
		return this.invokeType;
	}

	public void setInvokeType(String invokeType) {
		this.invokeType = invokeType;
		if(invokeType != null){
			putQueryParameter("InvokeType", invokeType);
		}
	}

	public String getIotDataDID() {
		return this.iotDataDID;
	}

	public void setIotDataDID(String iotDataDID) {
		this.iotDataDID = iotDataDID;
		if(iotDataDID != null){
			putQueryParameter("IotDataDID", iotDataDID);
		}
	}

	@Override
	public Class<QueryBlockchainDataResponse> getResponseClass() {
		return QueryBlockchainDataResponse.class;
	}

}
