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

package com.aliyuncs.ims.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ims.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetSecurityPreferenceRequest extends RpcAcsRequest<SetSecurityPreferenceResponse> {
	   

	private Boolean enableSaveMFATicket;

	private String loginNetworkMasks;

	private Boolean allowUserToChangePassword;

	private Integer loginSessionDuration;

	@SerializedName("verificationTypes")
	private List<String> verificationTypes;

	private Boolean allowUserToManageAccessKeys;

	private Boolean allowUserToManageMFADevices;

	private String operationForRiskLogin;

	private String mFAOperationForLogin;

	private Boolean allowUserToManagePersonalDingTalk;
	public SetSecurityPreferenceRequest() {
		super("Ims", "2019-08-15", "SetSecurityPreference");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getVerificationTypes() {
		return this.verificationTypes;
	}

	public void setVerificationTypes(List<String> verificationTypes) {
		this.verificationTypes = verificationTypes;	
		if (verificationTypes != null) {
			putQueryParameter("VerificationTypes" , new Gson().toJson(verificationTypes));
		}	
	}

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

	public String getOperationForRiskLogin() {
		return this.operationForRiskLogin;
	}

	public void setOperationForRiskLogin(String operationForRiskLogin) {
		this.operationForRiskLogin = operationForRiskLogin;
		if(operationForRiskLogin != null){
			putQueryParameter("OperationForRiskLogin", operationForRiskLogin);
		}
	}

	public String getMFAOperationForLogin() {
		return this.mFAOperationForLogin;
	}

	public void setMFAOperationForLogin(String mFAOperationForLogin) {
		this.mFAOperationForLogin = mFAOperationForLogin;
		if(mFAOperationForLogin != null){
			putQueryParameter("MFAOperationForLogin", mFAOperationForLogin);
		}
	}

	public Boolean getAllowUserToManagePersonalDingTalk() {
		return this.allowUserToManagePersonalDingTalk;
	}

	public void setAllowUserToManagePersonalDingTalk(Boolean allowUserToManagePersonalDingTalk) {
		this.allowUserToManagePersonalDingTalk = allowUserToManagePersonalDingTalk;
		if(allowUserToManagePersonalDingTalk != null){
			putQueryParameter("AllowUserToManagePersonalDingTalk", allowUserToManagePersonalDingTalk.toString());
		}
	}

	@Override
	public Class<SetSecurityPreferenceResponse> getResponseClass() {
		return SetSecurityPreferenceResponse.class;
	}

}
