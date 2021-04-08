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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryTicketsRequest extends RpcAcsRequest<QueryTicketsResponse> {
	   

	private Long srType;

	private Long touchId;

	private Long dealId;

	private Integer currentPage;

	private Integer taskStatus;

	private String instanceId;

	private Long caseId;

	private String extra;

	private Integer channelType;

	private Integer pageSize;

	private Integer caseType;

	private Integer caseStatus;

	private String channelId;
	public QueryTicketsRequest() {
		super("aiccs", "2019-10-15", "QueryTickets");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getSrType() {
		return this.srType;
	}

	public void setSrType(Long srType) {
		this.srType = srType;
		if(srType != null){
			putBodyParameter("SrType", srType.toString());
		}
	}

	public Long getTouchId() {
		return this.touchId;
	}

	public void setTouchId(Long touchId) {
		this.touchId = touchId;
		if(touchId != null){
			putBodyParameter("TouchId", touchId.toString());
		}
	}

	public Long getDealId() {
		return this.dealId;
	}

	public void setDealId(Long dealId) {
		this.dealId = dealId;
		if(dealId != null){
			putBodyParameter("DealId", dealId.toString());
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public Integer getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(Integer taskStatus) {
		this.taskStatus = taskStatus;
		if(taskStatus != null){
			putBodyParameter("TaskStatus", taskStatus.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public Long getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Long caseId) {
		this.caseId = caseId;
		if(caseId != null){
			putBodyParameter("CaseId", caseId.toString());
		}
	}

	public String getExtra() {
		return this.extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
		if(extra != null){
			putBodyParameter("Extra", extra);
		}
	}

	public Integer getChannelType() {
		return this.channelType;
	}

	public void setChannelType(Integer channelType) {
		this.channelType = channelType;
		if(channelType != null){
			putBodyParameter("ChannelType", channelType.toString());
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

	public Integer getCaseType() {
		return this.caseType;
	}

	public void setCaseType(Integer caseType) {
		this.caseType = caseType;
		if(caseType != null){
			putBodyParameter("CaseType", caseType.toString());
		}
	}

	public Integer getCaseStatus() {
		return this.caseStatus;
	}

	public void setCaseStatus(Integer caseStatus) {
		this.caseStatus = caseStatus;
		if(caseStatus != null){
			putBodyParameter("CaseStatus", caseStatus.toString());
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putBodyParameter("ChannelId", channelId);
		}
	}

	@Override
	public Class<QueryTicketsResponse> getResponseClass() {
		return QueryTicketsResponse.class;
	}

}
