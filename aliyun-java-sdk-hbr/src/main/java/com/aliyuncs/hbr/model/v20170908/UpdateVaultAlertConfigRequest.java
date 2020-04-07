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
public class UpdateVaultAlertConfigRequest extends RpcAcsRequest<UpdateVaultAlertConfigResponse> {
	   

	private String vaultId;

	private String contactIds;

	private String alertSetting;

	private String contactGroupIds;
	public UpdateVaultAlertConfigRequest() {
		super("hbr", "2017-09-08", "UpdateVaultAlertConfig", "hbr");
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

	public String getContactIds() {
		return this.contactIds;
	}

	public void setContactIds(String contactIds) {
		this.contactIds = contactIds;
		if(contactIds != null){
			putQueryParameter("ContactIds", contactIds);
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

	public String getContactGroupIds() {
		return this.contactGroupIds;
	}

	public void setContactGroupIds(String contactGroupIds) {
		this.contactGroupIds = contactGroupIds;
		if(contactGroupIds != null){
			putQueryParameter("ContactGroupIds", contactGroupIds);
		}
	}

	@Override
	public Class<UpdateVaultAlertConfigResponse> getResponseClass() {
		return UpdateVaultAlertConfigResponse.class;
	}

}
