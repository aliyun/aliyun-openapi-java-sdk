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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryAccountTransactionsRequest extends RpcAcsRequest<QueryAccountTransactionsResponse> {
	
	public QueryAccountTransactionsRequest() {
		super("BssOpenApi", "2017-12-14", "QueryAccountTransactions", "bssopenapi");
		setSysMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Integer pageNum;

	private String createTimeEnd;

	private String recordID;

	private Integer pageSize;

	private String transactionChannelSN;

	private String createTimeStart;

	private String transactionNumber;

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getCreateTimeEnd() {
		return this.createTimeEnd;
	}

	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
		if(createTimeEnd != null){
			putQueryParameter("CreateTimeEnd", createTimeEnd);
		}
	}

	public String getRecordID() {
		return this.recordID;
	}

	public void setRecordID(String recordID) {
		this.recordID = recordID;
		if(recordID != null){
			putQueryParameter("RecordID", recordID);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getTransactionChannelSN() {
		return this.transactionChannelSN;
	}

	public void setTransactionChannelSN(String transactionChannelSN) {
		this.transactionChannelSN = transactionChannelSN;
		if(transactionChannelSN != null){
			putQueryParameter("TransactionChannelSN", transactionChannelSN);
		}
	}

	public String getCreateTimeStart() {
		return this.createTimeStart;
	}

	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart;
		if(createTimeStart != null){
			putQueryParameter("CreateTimeStart", createTimeStart);
		}
	}

	public String getTransactionNumber() {
		return this.transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
		if(transactionNumber != null){
			putQueryParameter("TransactionNumber", transactionNumber);
		}
	}

	@Override
	public Class<QueryAccountTransactionsResponse> getResponseClass() {
		return QueryAccountTransactionsResponse.class;
	}

}
