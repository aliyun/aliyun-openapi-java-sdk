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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateMonitorGroupByResourceGroupIdRequest extends RpcAcsRequest<CreateMonitorGroupByResourceGroupIdResponse> {
	   

	private String resourceGroupName;

	private Boolean enableSubscribeEvent;

	private String resourceGroupId;

	private Boolean enableInstallAgent;

	private List<String> contactGroupLists;
	public CreateMonitorGroupByResourceGroupIdRequest() {
		super("Cms", "2019-01-01", "CreateMonitorGroupByResourceGroupId", "cms");
		setMethod(MethodType.POST);
	}

	public String getResourceGroupName() {
		return this.resourceGroupName;
	}

	public void setResourceGroupName(String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
		if(resourceGroupName != null){
			putQueryParameter("ResourceGroupName", resourceGroupName);
		}
	}

	public Boolean getEnableSubscribeEvent() {
		return this.enableSubscribeEvent;
	}

	public void setEnableSubscribeEvent(Boolean enableSubscribeEvent) {
		this.enableSubscribeEvent = enableSubscribeEvent;
		if(enableSubscribeEvent != null){
			putQueryParameter("EnableSubscribeEvent", enableSubscribeEvent.toString());
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public Boolean getEnableInstallAgent() {
		return this.enableInstallAgent;
	}

	public void setEnableInstallAgent(Boolean enableInstallAgent) {
		this.enableInstallAgent = enableInstallAgent;
		if(enableInstallAgent != null){
			putQueryParameter("EnableInstallAgent", enableInstallAgent.toString());
		}
	}

	public List<String> getContactGroupLists() {
		return this.contactGroupLists;
	}

	public void setContactGroupLists(List<String> contactGroupLists) {
		this.contactGroupLists = contactGroupLists;	
		if (contactGroupLists != null) {
			for (int i = 0; i < contactGroupLists.size(); i++) {
				putQueryParameter("ContactGroupList." + (i + 1) , contactGroupLists.get(i));
			}
		}	
	}

	@Override
	public Class<CreateMonitorGroupByResourceGroupIdResponse> getResponseClass() {
		return CreateMonitorGroupByResourceGroupIdResponse.class;
	}

}
