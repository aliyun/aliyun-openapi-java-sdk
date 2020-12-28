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
public class QueryAccountTransactionDetailsRequest extends RpcAcsRequest<QueryAccountTransactionDetailsResponse> {
	   

	private String transactionType;

	private String createTimeEnd;

	private String recordID;

	private String nextToken;

	private Integer maxResults;

	private String transactionChannel;

	private String transactionChannelSN;

	private String createTimeStart;

	private String transactionNumber;
	public QueryAccountTransactionDetailsRequest() {
		super("BssOpenApi", "2017-12-14", "QueryAccountTransactionDetails");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
		if(transactionType != null){
			putQueryParameter("TransactionType", transactionType);
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getTransactionChannel() {
		return this.transactionChannel;
	}

	public void setTransactionChannel(String transactionChannel) {
		this.transactionChannel = transactionChannel;
		if(transactionChannel != null){
			putQueryParameter("TransactionChannel", transactionChannel);
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
	public Class<QueryAccountTransactionDetailsResponse> getResponseClass() {
		return QueryAccountTransactionDetailsResponse.class;
	}

}
