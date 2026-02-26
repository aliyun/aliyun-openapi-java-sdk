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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListAppInstancesRequest extends RpcAcsRequest<ListAppInstancesResponse> {
	   

	@SerializedName("statusList")
	private List<String> statusList;

	private Integer pageNum;

	private String orderColumn;

	private String nextToken;

	private Integer pageSize;

	private String endTimeBegin;

	private String query;

	private String extend;

	private String endTimeEnd;

	private String bizId;

	private Integer maxResults;

	private String orderType;
	public ListAppInstancesRequest() {
		super("WebsiteBuild", "2025-04-29", "ListAppInstances");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getStatusList() {
		return this.statusList;
	}

	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;	
		if (statusList != null) {
			putQueryParameter("StatusList" , new Gson().toJson(statusList));
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

	public String getOrderColumn() {
		return this.orderColumn;
	}

	public void setOrderColumn(String orderColumn) {
		this.orderColumn = orderColumn;
		if(orderColumn != null){
			putQueryParameter("OrderColumn", orderColumn);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getEndTimeBegin() {
		return this.endTimeBegin;
	}

	public void setEndTimeBegin(String endTimeBegin) {
		this.endTimeBegin = endTimeBegin;
		if(endTimeBegin != null){
			putQueryParameter("EndTimeBegin", endTimeBegin);
		}
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
		if(query != null){
			putQueryParameter("Query", query);
		}
	}

	public String getExtend() {
		return this.extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
		if(extend != null){
			putQueryParameter("Extend", extend);
		}
	}

	public String getEndTimeEnd() {
		return this.endTimeEnd;
	}

	public void setEndTimeEnd(String endTimeEnd) {
		this.endTimeEnd = endTimeEnd;
		if(endTimeEnd != null){
			putQueryParameter("EndTimeEnd", endTimeEnd);
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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	@Override
	public Class<ListAppInstancesResponse> getResponseClass() {
		return ListAppInstancesResponse.class;
	}

}
