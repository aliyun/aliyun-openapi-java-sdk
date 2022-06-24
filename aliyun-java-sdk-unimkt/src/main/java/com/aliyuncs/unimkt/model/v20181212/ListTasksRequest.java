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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTasksRequest extends RpcAcsRequest<ListTasksResponse> {
	   

	private String taskType;

	private String taskName;

	private String endTime;

	private String brandUserNick;

	private String startTime;

	private Integer marketingType;

	private Long currencyType;

	private Long pageSize;

	private Long pageIndex;

	private String proxyUserNick;

	private Long taskId;

	private Integer status;
	public ListTasksRequest() {
		super("UniMkt", "2018-12-12", "ListTasks", "1.0.0");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putBodyParameter("TaskType", taskType);
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putBodyParameter("TaskName", taskName);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime);
		}
	}

	public String getBrandUserNick() {
		return this.brandUserNick;
	}

	public void setBrandUserNick(String brandUserNick) {
		this.brandUserNick = brandUserNick;
		if(brandUserNick != null){
			putBodyParameter("BrandUserNick", brandUserNick);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime);
		}
	}

	public Integer getMarketingType() {
		return this.marketingType;
	}

	public void setMarketingType(Integer marketingType) {
		this.marketingType = marketingType;
		if(marketingType != null){
			putBodyParameter("MarketingType", marketingType.toString());
		}
	}

	public Long getCurrencyType() {
		return this.currencyType;
	}

	public void setCurrencyType(Long currencyType) {
		this.currencyType = currencyType;
		if(currencyType != null){
			putBodyParameter("CurrencyType", currencyType.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putBodyParameter("PageIndex", pageIndex.toString());
		}
	}

	public String getProxyUserNick() {
		return this.proxyUserNick;
	}

	public void setProxyUserNick(String proxyUserNick) {
		this.proxyUserNick = proxyUserNick;
		if(proxyUserNick != null){
			putBodyParameter("ProxyUserNick", proxyUserNick);
		}
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("TaskId", taskId.toString());
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	@Override
	public Class<ListTasksResponse> getResponseClass() {
		return ListTasksResponse.class;
	}

}
