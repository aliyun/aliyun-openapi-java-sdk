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
public class ListNotaryOrdersRequest extends RpcAcsRequest<ListNotaryOrdersResponse> {
	   

	private Long startOrderDate;

	private Integer notaryType;

	private Integer pageNum;

	private Integer sortKeyType;

	private String sortByType;

	private Integer pageSize;

	private String bizId;

	private Long endOrderDate;

	private String aliyunOrderId;

	private Integer notaryStatus;
	public ListNotaryOrdersRequest() {
		super("Trademark", "2018-07-24", "ListNotaryOrders");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getStartOrderDate() {
		return this.startOrderDate;
	}

	public void setStartOrderDate(Long startOrderDate) {
		this.startOrderDate = startOrderDate;
		if(startOrderDate != null){
			putQueryParameter("StartOrderDate", startOrderDate.toString());
		}
	}

	public Integer getNotaryType() {
		return this.notaryType;
	}

	public void setNotaryType(Integer notaryType) {
		this.notaryType = notaryType;
		if(notaryType != null){
			putQueryParameter("NotaryType", notaryType.toString());
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

	public Integer getSortKeyType() {
		return this.sortKeyType;
	}

	public void setSortKeyType(Integer sortKeyType) {
		this.sortKeyType = sortKeyType;
		if(sortKeyType != null){
			putQueryParameter("SortKeyType", sortKeyType.toString());
		}
	}

	public String getSortByType() {
		return this.sortByType;
	}

	public void setSortByType(String sortByType) {
		this.sortByType = sortByType;
		if(sortByType != null){
			putQueryParameter("SortByType", sortByType);
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

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public Long getEndOrderDate() {
		return this.endOrderDate;
	}

	public void setEndOrderDate(Long endOrderDate) {
		this.endOrderDate = endOrderDate;
		if(endOrderDate != null){
			putQueryParameter("EndOrderDate", endOrderDate.toString());
		}
	}

	public String getAliyunOrderId() {
		return this.aliyunOrderId;
	}

	public void setAliyunOrderId(String aliyunOrderId) {
		this.aliyunOrderId = aliyunOrderId;
		if(aliyunOrderId != null){
			putQueryParameter("AliyunOrderId", aliyunOrderId);
		}
	}

	public Integer getNotaryStatus() {
		return this.notaryStatus;
	}

	public void setNotaryStatus(Integer notaryStatus) {
		this.notaryStatus = notaryStatus;
		if(notaryStatus != null){
			putQueryParameter("NotaryStatus", notaryStatus.toString());
		}
	}

	@Override
	public Class<ListNotaryOrdersResponse> getResponseClass() {
		return ListNotaryOrdersResponse.class;
	}

}
