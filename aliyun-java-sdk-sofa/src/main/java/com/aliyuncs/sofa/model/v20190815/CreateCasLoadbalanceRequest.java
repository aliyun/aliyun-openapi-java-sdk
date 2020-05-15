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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCasLoadbalanceRequest extends RpcAcsRequest<CreateCasLoadbalanceResponse> {
	   

	private String workspace;

	private Long instanceCount;

	private List<String> listenersRepeatLists;

	private String addressType;

	private String appServiceId;

	private String vSwitchId;

	private String internetChargeType;

	private String appId;

	private String name;

	private Boolean shareMode;
	public CreateCasLoadbalanceRequest() {
		super("SOFA", "2019-08-15", "CreateCasLoadbalance", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
		}
	}

	public Long getInstanceCount() {
		return this.instanceCount;
	}

	public void setInstanceCount(Long instanceCount) {
		this.instanceCount = instanceCount;
		if(instanceCount != null){
			putBodyParameter("InstanceCount", instanceCount.toString());
		}
	}

	public List<String> getListenersRepeatLists() {
		return this.listenersRepeatLists;
	}

	public void setListenersRepeatLists(List<String> listenersRepeatLists) {
		this.listenersRepeatLists = listenersRepeatLists;	
		if (listenersRepeatLists != null) {
			for (int i = 0; i < listenersRepeatLists.size(); i++) {
				putBodyParameter("ListenersRepeatList." + (i + 1) , listenersRepeatLists.get(i));
			}
		}	
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
		if(addressType != null){
			putBodyParameter("AddressType", addressType);
		}
	}

	public String getAppServiceId() {
		return this.appServiceId;
	}

	public void setAppServiceId(String appServiceId) {
		this.appServiceId = appServiceId;
		if(appServiceId != null){
			putBodyParameter("AppServiceId", appServiceId);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putBodyParameter("VSwitchId", vSwitchId);
		}
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		if(internetChargeType != null){
			putBodyParameter("InternetChargeType", internetChargeType);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public Boolean getShareMode() {
		return this.shareMode;
	}

	public void setShareMode(Boolean shareMode) {
		this.shareMode = shareMode;
		if(shareMode != null){
			putBodyParameter("ShareMode", shareMode.toString());
		}
	}

	@Override
	public Class<CreateCasLoadbalanceResponse> getResponseClass() {
		return CreateCasLoadbalanceResponse.class;
	}

}
