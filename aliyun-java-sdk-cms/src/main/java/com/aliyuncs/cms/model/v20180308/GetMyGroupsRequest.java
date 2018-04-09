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

package com.aliyuncs.cms.model.v20180308;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetMyGroupsRequest extends RpcAcsRequest<GetMyGroupsResponse> {
	
	public GetMyGroupsRequest() {
		super("Cms", "2018-03-08", "GetMyGroups", "cms");
	}

	private Boolean selectContactGroups;

	private String instanceId;

	private Long groupId;

	private String type;

	private String groupName;

	private String bindUrl;

	public Boolean getSelectContactGroups() {
		return this.selectContactGroups;
	}

	public void setSelectContactGroups(Boolean selectContactGroups) {
		this.selectContactGroups = selectContactGroups;
		if(selectContactGroups != null){
			putQueryParameter("SelectContactGroups", selectContactGroups.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	public String getBindUrl() {
		return this.bindUrl;
	}

	public void setBindUrl(String bindUrl) {
		this.bindUrl = bindUrl;
		if(bindUrl != null){
			putQueryParameter("BindUrl", bindUrl);
		}
	}

	@Override
	public Class<GetMyGroupsResponse> getResponseClass() {
		return GetMyGroupsResponse.class;
	}

}
