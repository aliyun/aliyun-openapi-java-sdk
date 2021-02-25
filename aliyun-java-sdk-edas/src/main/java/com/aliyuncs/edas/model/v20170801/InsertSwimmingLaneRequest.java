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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InsertSwimmingLaneRequest extends RoaAcsRequest<InsertSwimmingLaneResponse> {
	   

	private String appInfos;

	private String entryRules;

	private String logicalRegionId;

	private Boolean enableRules;

	private Long groupId;

	private String name;

	private String tag;
	public InsertSwimmingLaneRequest() {
		super("Edas", "2017-08-01", "InsertSwimmingLane", "edas");
		setUriPattern("/pop/v5/trafficmgnt/swimming_lanes");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppInfos() {
		return this.appInfos;
	}

	public void setAppInfos(String appInfos) {
		this.appInfos = appInfos;
		if(appInfos != null){
			putQueryParameter("AppInfos", appInfos);
		}
	}

	public String getEntryRules() {
		return this.entryRules;
	}

	public void setEntryRules(String entryRules) {
		this.entryRules = entryRules;
		if(entryRules != null){
			putQueryParameter("EntryRules", entryRules);
		}
	}

	public String getLogicalRegionId() {
		return this.logicalRegionId;
	}

	public void setLogicalRegionId(String logicalRegionId) {
		this.logicalRegionId = logicalRegionId;
		if(logicalRegionId != null){
			putQueryParameter("LogicalRegionId", logicalRegionId);
		}
	}

	public Boolean getEnableRules() {
		return this.enableRules;
	}

	public void setEnableRules(Boolean enableRules) {
		this.enableRules = enableRules;
		if(enableRules != null){
			putQueryParameter("EnableRules", enableRules.toString());
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putQueryParameter("Tag", tag);
		}
	}

	@Override
	public Class<InsertSwimmingLaneResponse> getResponseClass() {
		return InsertSwimmingLaneResponse.class;
	}

}
