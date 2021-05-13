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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SchedulePodRequest extends RpcAcsRequest<SchedulePodResponse> {
	   

	private String areaCodes;

	private String groupUuid;

	private String isps;

	private String tenant;

	private String workloadUuid;

	private String labels;

	private String regions;

	private String resourceAttribute;

	private Long aliUid;

	private String requirements;
	public SchedulePodRequest() {
		super("Ens", "2017-11-10", "SchedulePod", "ens");
		setMethod(MethodType.POST);
	}

	public String getAreaCodes() {
		return this.areaCodes;
	}

	public void setAreaCodes(String areaCodes) {
		this.areaCodes = areaCodes;
		if(areaCodes != null){
			putQueryParameter("AreaCodes", areaCodes);
		}
	}

	public String getGroupUuid() {
		return this.groupUuid;
	}

	public void setGroupUuid(String groupUuid) {
		this.groupUuid = groupUuid;
		if(groupUuid != null){
			putQueryParameter("GroupUuid", groupUuid);
		}
	}

	public String getIsps() {
		return this.isps;
	}

	public void setIsps(String isps) {
		this.isps = isps;
		if(isps != null){
			putQueryParameter("Isps", isps);
		}
	}

	public String getTenant() {
		return this.tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
		if(tenant != null){
			putQueryParameter("Tenant", tenant);
		}
	}

	public String getWorkloadUuid() {
		return this.workloadUuid;
	}

	public void setWorkloadUuid(String workloadUuid) {
		this.workloadUuid = workloadUuid;
		if(workloadUuid != null){
			putQueryParameter("WorkloadUuid", workloadUuid);
		}
	}

	public String getLabels() {
		return this.labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
		if(labels != null){
			putQueryParameter("Labels", labels);
		}
	}

	public String getRegions() {
		return this.regions;
	}

	public void setRegions(String regions) {
		this.regions = regions;
		if(regions != null){
			putQueryParameter("Regions", regions);
		}
	}

	public String getResourceAttribute() {
		return this.resourceAttribute;
	}

	public void setResourceAttribute(String resourceAttribute) {
		this.resourceAttribute = resourceAttribute;
		if(resourceAttribute != null){
			putBodyParameter("ResourceAttribute", resourceAttribute);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public String getRequirements() {
		return this.requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
		if(requirements != null){
			putBodyParameter("Requirements", requirements);
		}
	}

	@Override
	public Class<SchedulePodResponse> getResponseClass() {
		return SchedulePodResponse.class;
	}

}
