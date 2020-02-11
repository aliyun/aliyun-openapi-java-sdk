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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryTradeProduceListRequest extends RpcAcsRequest<QueryTradeProduceListResponse> {
	   

	private Integer buyerStatus;

	private Integer pageNum;

	private String sortFiled;

	private Integer pageSize;

	private String preOrderId;

	private String bizId;

	private String sortOrder;

	private String registerNumber;
	public QueryTradeProduceListRequest() {
		super("Trademark", "2018-07-24", "QueryTradeProduceList");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getBuyerStatus() {
		return this.buyerStatus;
	}

	public void setBuyerStatus(Integer buyerStatus) {
		this.buyerStatus = buyerStatus;
		if(buyerStatus != null){
			putQueryParameter("BuyerStatus", buyerStatus.toString());
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getSortFiled() {
		return this.sortFiled;
	}

	public void setSortFiled(String sortFiled) {
		this.sortFiled = sortFiled;
		if(sortFiled != null){
			putQueryParameter("SortFiled", sortFiled);
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

	public String getPreOrderId() {
		return this.preOrderId;
	}

	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
		if(preOrderId != null){
			putQueryParameter("PreOrderId", preOrderId);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
		if(sortOrder != null){
			putQueryParameter("SortOrder", sortOrder);
		}
	}

	public String getRegisterNumber() {
		return this.registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
		if(registerNumber != null){
			putQueryParameter("RegisterNumber", registerNumber);
		}
	}

	@Override
	public Class<QueryTradeProduceListResponse> getResponseClass() {
		return QueryTradeProduceListResponse.class;
	}

}
