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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRAMDirectoryRequest extends RpcAcsRequest<CreateRAMDirectoryResponse> {
	   

	private String desktopAccessType;

	private Boolean enableInternetAccess;

	private String directoryName;

	private List<String> vSwitchIds;

	private Boolean enableAdminAccess;
	public CreateRAMDirectoryRequest() {
		super("ecd", "2020-09-30", "CreateRAMDirectory");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDesktopAccessType() {
		return this.desktopAccessType;
	}

	public void setDesktopAccessType(String desktopAccessType) {
		this.desktopAccessType = desktopAccessType;
		if(desktopAccessType != null){
			putQueryParameter("DesktopAccessType", desktopAccessType);
		}
	}

	public Boolean getEnableInternetAccess() {
		return this.enableInternetAccess;
	}

	public void setEnableInternetAccess(Boolean enableInternetAccess) {
		this.enableInternetAccess = enableInternetAccess;
		if(enableInternetAccess != null){
			putQueryParameter("EnableInternetAccess", enableInternetAccess.toString());
		}
	}

	public String getDirectoryName() {
		return this.directoryName;
	}

	public void setDirectoryName(String directoryName) {
		this.directoryName = directoryName;
		if(directoryName != null){
			putQueryParameter("DirectoryName", directoryName);
		}
	}

	public List<String> getVSwitchIds() {
		return this.vSwitchIds;
	}

	public void setVSwitchIds(List<String> vSwitchIds) {
		this.vSwitchIds = vSwitchIds;	
		if (vSwitchIds != null) {
			for (int i = 0; i < vSwitchIds.size(); i++) {
				putQueryParameter("VSwitchId." + (i + 1) , vSwitchIds.get(i));
			}
		}	
	}

	public Boolean getEnableAdminAccess() {
		return this.enableAdminAccess;
	}

	public void setEnableAdminAccess(Boolean enableAdminAccess) {
		this.enableAdminAccess = enableAdminAccess;
		if(enableAdminAccess != null){
			putQueryParameter("EnableAdminAccess", enableAdminAccess.toString());
		}
	}

	@Override
	public Class<CreateRAMDirectoryResponse> getResponseClass() {
		return CreateRAMDirectoryResponse.class;
	}

}
