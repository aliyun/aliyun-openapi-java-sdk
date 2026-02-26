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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyApplicationWhitelistRequest extends RpcAcsRequest<ModifyApplicationWhitelistResponse> {
	   

	private String applicationId;

	private String securityIPArrayName;

	private String modifyMode;

	private String componentId;

	private String securityIPList;

	private String securityGroups;
	public ModifyApplicationWhitelistRequest() {
		super("polardb", "2017-08-01", "ModifyApplicationWhitelist", "polardb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putQueryParameter("ApplicationId", applicationId);
		}
	}

	public String getSecurityIPArrayName() {
		return this.securityIPArrayName;
	}

	public void setSecurityIPArrayName(String securityIPArrayName) {
		this.securityIPArrayName = securityIPArrayName;
		if(securityIPArrayName != null){
			putQueryParameter("SecurityIPArrayName", securityIPArrayName);
		}
	}

	public String getModifyMode() {
		return this.modifyMode;
	}

	public void setModifyMode(String modifyMode) {
		this.modifyMode = modifyMode;
		if(modifyMode != null){
			putQueryParameter("ModifyMode", modifyMode);
		}
	}

	public String getComponentId() {
		return this.componentId;
	}

	public void setComponentId(String componentId) {
		this.componentId = componentId;
		if(componentId != null){
			putQueryParameter("ComponentId", componentId);
		}
	}

	public String getSecurityIPList() {
		return this.securityIPList;
	}

	public void setSecurityIPList(String securityIPList) {
		this.securityIPList = securityIPList;
		if(securityIPList != null){
			putQueryParameter("SecurityIPList", securityIPList);
		}
	}

	public String getSecurityGroups() {
		return this.securityGroups;
	}

	public void setSecurityGroups(String securityGroups) {
		this.securityGroups = securityGroups;
		if(securityGroups != null){
			putQueryParameter("SecurityGroups", securityGroups);
		}
	}

	@Override
	public Class<ModifyApplicationWhitelistResponse> getResponseClass() {
		return ModifyApplicationWhitelistResponse.class;
	}

}
