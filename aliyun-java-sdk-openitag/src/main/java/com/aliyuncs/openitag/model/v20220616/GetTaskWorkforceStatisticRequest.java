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

package com.aliyuncs.openitag.model.v20220616;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetTaskWorkforceStatisticRequest extends RoaAcsRequest<GetTaskWorkforceStatisticResponse> {
	   

	private String statType;

	private String tenantId;

	private Integer pageSize;

	private Long taskId;

	private Integer pageNumber;
	public GetTaskWorkforceStatisticRequest() {
		super("OpenITag", "2022-06-16", "GetTaskWorkforceStatistic");
		setUriPattern("/openapi/api/v1/tenants/[TenantId]/tasks/[TaskId]/workforce/statistic");
		setMethod(MethodType.GET);
	}

	public String getStatType() {
		return this.statType;
	}

	public void setStatType(String statType) {
		this.statType = statType;
		if(statType != null){
			putQueryParameter("StatType", statType);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putPathParameter("TenantId", tenantId);
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

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putPathParameter("TaskId", taskId.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<GetTaskWorkforceStatisticResponse> getResponseClass() {
		return GetTaskWorkforceStatisticResponse.class;
	}

}
