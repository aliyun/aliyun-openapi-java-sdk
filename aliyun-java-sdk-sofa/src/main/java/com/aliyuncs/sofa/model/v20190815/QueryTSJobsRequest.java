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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryTSJobsRequest extends RpcAcsRequest<QueryTSJobsResponse> {
	   

	private String triggerTypes;

	private String priorities;

	private String zoneMode;

	private Long pageSize;

	private Long excludedGroupId;

	private String apps;

	private String types;

	private Long currentPage;

	private String instanceId;

	private String invokeType;

	private String groupIds;

	private String name;

	private String jobOriginZones;
	public QueryTSJobsRequest() {
		super("SOFA", "2019-08-15", "QueryTSJobs", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTriggerTypes() {
		return this.triggerTypes;
	}

	public void setTriggerTypes(String triggerTypes) {
		this.triggerTypes = triggerTypes;
		if(triggerTypes != null){
			putBodyParameter("TriggerTypes", triggerTypes);
		}
	}

	public String getPriorities() {
		return this.priorities;
	}

	public void setPriorities(String priorities) {
		this.priorities = priorities;
		if(priorities != null){
			putBodyParameter("Priorities", priorities);
		}
	}

	public String getZoneMode() {
		return this.zoneMode;
	}

	public void setZoneMode(String zoneMode) {
		this.zoneMode = zoneMode;
		if(zoneMode != null){
			putBodyParameter("ZoneMode", zoneMode);
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

	public Long getExcludedGroupId() {
		return this.excludedGroupId;
	}

	public void setExcludedGroupId(Long excludedGroupId) {
		this.excludedGroupId = excludedGroupId;
		if(excludedGroupId != null){
			putBodyParameter("ExcludedGroupId", excludedGroupId.toString());
		}
	}

	public String getApps() {
		return this.apps;
	}

	public void setApps(String apps) {
		this.apps = apps;
		if(apps != null){
			putBodyParameter("Apps", apps);
		}
	}

	public String getTypes() {
		return this.types;
	}

	public void setTypes(String types) {
		this.types = types;
		if(types != null){
			putBodyParameter("Types", types);
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
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

	public String getInvokeType() {
		return this.invokeType;
	}

	public void setInvokeType(String invokeType) {
		this.invokeType = invokeType;
		if(invokeType != null){
			putBodyParameter("InvokeType", invokeType);
		}
	}

	public String getGroupIds() {
		return this.groupIds;
	}

	public void setGroupIds(String groupIds) {
		this.groupIds = groupIds;
		if(groupIds != null){
			putBodyParameter("GroupIds", groupIds);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getJobOriginZones() {
		return this.jobOriginZones;
	}

	public void setJobOriginZones(String jobOriginZones) {
		this.jobOriginZones = jobOriginZones;
		if(jobOriginZones != null){
			putBodyParameter("JobOriginZones", jobOriginZones);
		}
	}

	@Override
	public Class<QueryTSJobsResponse> getResponseClass() {
		return QueryTSJobsResponse.class;
	}

}
