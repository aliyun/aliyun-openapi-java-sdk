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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListBaselineStatusesRequest extends RpcAcsRequest<ListBaselineStatusesResponse> {
	   

	private String searchText;

	private String owner;

	private String priority;

	private Integer pageNumber;

	private Long topicId;

	private String bizdate;

	private String finishStatus;

	private Integer pageSize;

	private String baselineTypes;

	private String status;
	public ListBaselineStatusesRequest() {
		super("dataworks-public", "2020-05-18", "ListBaselineStatuses");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSearchText() {
		return this.searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
		if(searchText != null){
			putBodyParameter("SearchText", searchText);
		}
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
		if(owner != null){
			putBodyParameter("Owner", owner);
		}
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
		if(priority != null){
			putBodyParameter("Priority", priority);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public Long getTopicId() {
		return this.topicId;
	}

	public void setTopicId(Long topicId) {
		this.topicId = topicId;
		if(topicId != null){
			putBodyParameter("TopicId", topicId.toString());
		}
	}

	public String getBizdate() {
		return this.bizdate;
	}

	public void setBizdate(String bizdate) {
		this.bizdate = bizdate;
		if(bizdate != null){
			putBodyParameter("Bizdate", bizdate);
		}
	}

	public String getFinishStatus() {
		return this.finishStatus;
	}

	public void setFinishStatus(String finishStatus) {
		this.finishStatus = finishStatus;
		if(finishStatus != null){
			putBodyParameter("FinishStatus", finishStatus);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getBaselineTypes() {
		return this.baselineTypes;
	}

	public void setBaselineTypes(String baselineTypes) {
		this.baselineTypes = baselineTypes;
		if(baselineTypes != null){
			putBodyParameter("BaselineTypes", baselineTypes);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<ListBaselineStatusesResponse> getResponseClass() {
		return ListBaselineStatusesResponse.class;
	}

}
