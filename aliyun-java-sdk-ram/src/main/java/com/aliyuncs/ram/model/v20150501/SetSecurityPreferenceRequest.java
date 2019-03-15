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

package com.aliyuncs.ram.model.v20150501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class SetSecurityPreferenceRequest extends RpcAcsRequest<SetSecurityPreferenceResponse> {
	
	public SetSecurityPreferenceRequest() {
		super("Ram", "2015-05-01", "SetSecurityPreference", "ram");
		setProtocol(ProtocolType.HTTPS);
	}

	private Boolean allowUserToManageAccessKeys;

	private Boolean allowUserToManageMFADevices;

	private Boolean allowUserToManagePublicKeys;

	private Boolean enableSaveMFATicket;

	private String loginNetworkMasks;

	private Boolean allowUserToChangePassword;

	private Integer loginSessionDuration;

	public Boolean getAllowUserToManageAccessKeys() {
		return this.allowUserToManageAccessKeys;
	}

	public void setAllowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
		this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
		if(allowUserToManageAccessKeys != null){
			putQueryParameter("AllowUserToManageAccessKeys", allowUserToManageAccessKeys.toString());
		}
	}

	public Boolean getAllowUserToManageMFADevices() {
		return this.allowUserToManageMFADevices;
	}

	public void setAllowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
		this.allowUserToManageMFADevices = allowUserToManageMFADevices;
		if(allowUserToManageMFADevices != null){
			putQueryParameter("AllowUserToManageMFADevices", allowUserToManageMFADevices.toString());
		}
	}

	public Boolean getAllowUserToManagePublicKeys() {
		return this.allowUserToManagePublicKeys;
	}

	public void setAllowUserToManagePublicKeys(Boolean allowUserToManagePublicKeys) {
		this.allowUserToManagePublicKeys = allowUserToManagePublicKeys;
		if(allowUserToManagePublicKeys != null){
			putQueryParameter("AllowUserToManagePublicKeys", allowUserToManagePublicKeys.toString());
		}
	}

	public Boolean getEnableSaveMFATicket() {
		return this.enableSaveMFATicket;
	}

	public void setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
		this.enableSaveMFATicket = enableSaveMFATicket;
		if(enableSaveMFATicket != null){
			putQueryParameter("EnableSaveMFATicket", enableSaveMFATicket.toString());
		}
	}

	public String getLoginNetworkMasks() {
		return this.loginNetworkMasks;
	}

	public void setLoginNetworkMasks(String loginNetworkMasks) {
		this.loginNetworkMasks = loginNetworkMasks;
		if(loginNetworkMasks != null){
			putQueryParameter("LoginNetworkMasks", loginNetworkMasks);
		}
	}

	public Boolean getAllowUserToChangePassword() {
		return this.allowUserToChangePassword;
	}

	public void setAllowUserToChangePassword(Boolean allowUserToChangePassword) {
		this.allowUserToChangePassword = allowUserToChangePassword;
		if(allowUserToChangePassword != null){
			putQueryParameter("AllowUserToChangePassword", allowUserToChangePassword.toString());
		}
	}

	public Integer getLoginSessionDuration() {
		return this.loginSessionDuration;
	}

	public void setLoginSessionDuration(Integer loginSessionDuration) {
		this.loginSessionDuration = loginSessionDuration;
		if(loginSessionDuration != null){
			putQueryParameter("LoginSessionDuration", loginSessionDuration.toString());
		}
	}

	@Override
	public Class<SetSecurityPreferenceResponse> getResponseClass() {
		return SetSecurityPreferenceResponse.class;
	}

}
