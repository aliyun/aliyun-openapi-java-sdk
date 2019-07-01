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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateOssCallbackSettingRequest extends RpcAcsRequest<UpdateOssCallbackSettingResponse> {
	
	public UpdateOssCallbackSettingRequest() {
		super("Green", "2017-08-23", "UpdateOssCallbackSetting", "green");
	}

	private Boolean scanCallback;

	private String scanCallbackSuggestions;

	private String callbackSeed;

	private Boolean auditCallback;

	private String callbackUrl;

	private String serviceModules;

	public Boolean getScanCallback() {
		return this.scanCallback;
	}

	public void setScanCallback(Boolean scanCallback) {
		this.scanCallback = scanCallback;
		if(scanCallback != null){
			putQueryParameter("ScanCallback", scanCallback.toString());
		}
	}

	public String getScanCallbackSuggestions() {
		return this.scanCallbackSuggestions;
	}

	public void setScanCallbackSuggestions(String scanCallbackSuggestions) {
		this.scanCallbackSuggestions = scanCallbackSuggestions;
		if(scanCallbackSuggestions != null){
			putQueryParameter("ScanCallbackSuggestions", scanCallbackSuggestions);
		}
	}

	public String getCallbackSeed() {
		return this.callbackSeed;
	}

	public void setCallbackSeed(String callbackSeed) {
		this.callbackSeed = callbackSeed;
		if(callbackSeed != null){
			putQueryParameter("CallbackSeed", callbackSeed);
		}
	}

	public Boolean getAuditCallback() {
		return this.auditCallback;
	}

	public void setAuditCallback(Boolean auditCallback) {
		this.auditCallback = auditCallback;
		if(auditCallback != null){
			putQueryParameter("AuditCallback", auditCallback.toString());
		}
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
		if(callbackUrl != null){
			putQueryParameter("CallbackUrl", callbackUrl);
		}
	}

	public String getServiceModules() {
		return this.serviceModules;
	}

	public void setServiceModules(String serviceModules) {
		this.serviceModules = serviceModules;
		if(serviceModules != null){
			putQueryParameter("ServiceModules", serviceModules);
		}
	}

	@Override
	public Class<UpdateOssCallbackSettingResponse> getResponseClass() {
		return UpdateOssCallbackSettingResponse.class;
	}

}
