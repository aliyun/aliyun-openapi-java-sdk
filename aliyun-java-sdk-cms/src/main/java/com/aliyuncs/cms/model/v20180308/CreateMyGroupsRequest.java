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
public class CreateMyGroupsRequest extends RpcAcsRequest<CreateMyGroupsResponse> {
	
	public CreateMyGroupsRequest() {
		super("Cms", "2018-03-08", "CreateMyGroups", "cms");
	}

	private String contactGroups;

	private String options;

	private Long serviceId;

	private String type;

	private String groupName;

	private String bindUrl;

	public String getContactGroups() {
		return this.contactGroups;
	}

	public void setContactGroups(String contactGroups) {
		this.contactGroups = contactGroups;
		if(contactGroups != null){
			putQueryParameter("ContactGroups", contactGroups);
		}
	}

	public String getOptions() {
		return this.options;
	}

	public void setOptions(String options) {
		this.options = options;
		if(options != null){
			putQueryParameter("Options", options);
		}
	}

	public Long getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId.toString());
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
	public Class<CreateMyGroupsResponse> getResponseClass() {
		return CreateMyGroupsResponse.class;
	}

}
