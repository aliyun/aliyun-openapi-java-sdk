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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateMonitorGroupRequest extends RpcAcsRequest<CreateMonitorGroupResponse> {
	   

	private String contactGroups;

	private String groupName;
	public CreateMonitorGroupRequest() {
		super("Cms", "2019-01-01", "CreateMonitorGroup", "Cms");
		setMethod(MethodType.POST);
	}

	public String getContactGroups() {
		return this.contactGroups;
	}

	public void setContactGroups(String contactGroups) {
		this.contactGroups = contactGroups;
		if(contactGroups != null){
			putQueryParameter("ContactGroups", contactGroups);
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

	@Override
	public Class<CreateMonitorGroupResponse> getResponseClass() {
		return CreateMonitorGroupResponse.class;
	}

}
