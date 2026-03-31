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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateClientsRequest extends RpcAcsRequest<CreateClientsResponse> {
	   

	private String vaultId;

	private String clientInfo;

	private String crossAccountType;

	private String crossAccountRoleName;

	private String alertSetting;

	private String resourceGroupId;

	private Boolean useHttps;

	private Long crossAccountUserId;
	public CreateClientsRequest() {
		super("hbr", "2017-09-08", "CreateClients", "hbr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVaultId() {
		return this.vaultId;
	}

	public void setVaultId(String vaultId) {
		this.vaultId = vaultId;
		if(vaultId != null){
			putQueryParameter("VaultId", vaultId);
		}
	}

	public String getClientInfo() {
		return this.clientInfo;
	}

	public void setClientInfo(String clientInfo) {
		this.clientInfo = clientInfo;
		if(clientInfo != null){
			putQueryParameter("ClientInfo", clientInfo);
		}
	}

	public String getCrossAccountType() {
		return this.crossAccountType;
	}

	public void setCrossAccountType(String crossAccountType) {
		this.crossAccountType = crossAccountType;
		if(crossAccountType != null){
			putQueryParameter("CrossAccountType", crossAccountType);
		}
	}

	public String getCrossAccountRoleName() {
		return this.crossAccountRoleName;
	}

	public void setCrossAccountRoleName(String crossAccountRoleName) {
		this.crossAccountRoleName = crossAccountRoleName;
		if(crossAccountRoleName != null){
			putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
		}
	}

	public String getAlertSetting() {
		return this.alertSetting;
	}

	public void setAlertSetting(String alertSetting) {
		this.alertSetting = alertSetting;
		if(alertSetting != null){
			putQueryParameter("AlertSetting", alertSetting);
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

	public Boolean getUseHttps() {
		return this.useHttps;
	}

	public void setUseHttps(Boolean useHttps) {
		this.useHttps = useHttps;
		if(useHttps != null){
			putQueryParameter("UseHttps", useHttps.toString());
		}
	}

	public Long getCrossAccountUserId() {
		return this.crossAccountUserId;
	}

	public void setCrossAccountUserId(Long crossAccountUserId) {
		this.crossAccountUserId = crossAccountUserId;
		if(crossAccountUserId != null){
			putQueryParameter("CrossAccountUserId", crossAccountUserId.toString());
		}
	}

	@Override
	public Class<CreateClientsResponse> getResponseClass() {
		return CreateClientsResponse.class;
	}

}
