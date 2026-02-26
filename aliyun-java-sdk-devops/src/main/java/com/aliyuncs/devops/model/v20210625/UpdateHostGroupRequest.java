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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateHostGroupRequest extends RoaAcsRequest<UpdateHostGroupResponse> {
	   

	private Long serviceConnectionId;

	private String machineInfos;

	private String tagIds;

	private String aliyunRegion;

	private String envId;

	private String type;

	private String organizationId;

	private String ecsLabelKey;

	private String name;

	private String ecsLabelValue;

	private Long id;

	private String ecsType;
	public UpdateHostGroupRequest() {
		super("devops", "2021-06-25", "UpdateHostGroup");
		setUriPattern("/organization/[organizationId]/hostGroups/[id]");
		setMethod(MethodType.PUT);
	}

	public Long getServiceConnectionId() {
		return this.serviceConnectionId;
	}

	public void setServiceConnectionId(Long serviceConnectionId) {
		this.serviceConnectionId = serviceConnectionId;
		if(serviceConnectionId != null){
			putBodyParameter("serviceConnectionId", serviceConnectionId.toString());
		}
	}

	public String getMachineInfos() {
		return this.machineInfos;
	}

	public void setMachineInfos(String machineInfos) {
		this.machineInfos = machineInfos;
		if(machineInfos != null){
			putBodyParameter("machineInfos", machineInfos);
		}
	}

	public String getTagIds() {
		return this.tagIds;
	}

	public void setTagIds(String tagIds) {
		this.tagIds = tagIds;
		if(tagIds != null){
			putBodyParameter("tagIds", tagIds);
		}
	}

	public String getAliyunRegion() {
		return this.aliyunRegion;
	}

	public void setAliyunRegion(String aliyunRegion) {
		this.aliyunRegion = aliyunRegion;
		if(aliyunRegion != null){
			putBodyParameter("aliyunRegion", aliyunRegion);
		}
	}

	public String getEnvId() {
		return this.envId;
	}

	public void setEnvId(String envId) {
		this.envId = envId;
		if(envId != null){
			putBodyParameter("envId", envId);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("type", type);
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public String getEcsLabelKey() {
		return this.ecsLabelKey;
	}

	public void setEcsLabelKey(String ecsLabelKey) {
		this.ecsLabelKey = ecsLabelKey;
		if(ecsLabelKey != null){
			putBodyParameter("ecsLabelKey", ecsLabelKey);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("name", name);
		}
	}

	public String getEcsLabelValue() {
		return this.ecsLabelValue;
	}

	public void setEcsLabelValue(String ecsLabelValue) {
		this.ecsLabelValue = ecsLabelValue;
		if(ecsLabelValue != null){
			putBodyParameter("ecsLabelValue", ecsLabelValue);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putPathParameter("id", id.toString());
		}
	}

	public String getEcsType() {
		return this.ecsType;
	}

	public void setEcsType(String ecsType) {
		this.ecsType = ecsType;
		if(ecsType != null){
			putBodyParameter("ecsType", ecsType);
		}
	}

	@Override
	public Class<UpdateHostGroupResponse> getResponseClass() {
		return UpdateHostGroupResponse.class;
	}

}
