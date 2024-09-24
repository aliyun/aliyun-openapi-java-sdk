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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListWebApplicationInstancesRequest extends RoaAcsRequest<ListWebApplicationInstancesResponse> {
	   

	private String namespaceId;

	private String instanceIds;

	private String limit;

	private String versionIds;

	private String statuses;

	private Long endTime;

	private Long startTime;

	private String applicationId;
	public ListWebApplicationInstancesRequest() {
		super("sae", "2019-05-06", "ListWebApplicationInstances", "serverless");
		setUriPattern("/pop/v2/api/web/applications-observability/[ApplicationId]/instances");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNamespaceId() {
		return this.namespaceId;
	}

	public void setNamespaceId(String namespaceId) {
		this.namespaceId = namespaceId;
		if(namespaceId != null){
			putQueryParameter("NamespaceId", namespaceId);
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
		}
	}

	public String getLimit() {
		return this.limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit);
		}
	}

	public String getVersionIds() {
		return this.versionIds;
	}

	public void setVersionIds(String versionIds) {
		this.versionIds = versionIds;
		if(versionIds != null){
			putQueryParameter("VersionIds", versionIds);
		}
	}

	public String getStatuses() {
		return this.statuses;
	}

	public void setStatuses(String statuses) {
		this.statuses = statuses;
		if(statuses != null){
			putQueryParameter("Statuses", statuses);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putPathParameter("ApplicationId", applicationId);
		}
	}

	@Override
	public Class<ListWebApplicationInstancesResponse> getResponseClass() {
		return ListWebApplicationInstancesResponse.class;
	}

}
