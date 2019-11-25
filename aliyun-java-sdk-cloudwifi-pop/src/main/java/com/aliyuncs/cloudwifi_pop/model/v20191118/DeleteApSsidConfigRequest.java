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

package com.aliyuncs.cloudwifi_pop.model.v20191118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteApSsidConfigRequest extends RpcAcsRequest<DeleteApSsidConfigResponse> {
	   

	private String appName;

	private String appCode;

	private String apMac;

	private String radioIndex;

	private String ssid;
	public DeleteApSsidConfigRequest() {
		super("cloudwifi-pop", "2019-11-18", "DeleteApSsidConfig", "cloudap");
		setMethod(MethodType.POST);
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
		if(appCode != null){
			putQueryParameter("AppCode", appCode);
		}
	}

	public String getApMac() {
		return this.apMac;
	}

	public void setApMac(String apMac) {
		this.apMac = apMac;
		if(apMac != null){
			putQueryParameter("ApMac", apMac);
		}
	}

	public String getRadioIndex() {
		return this.radioIndex;
	}

	public void setRadioIndex(String radioIndex) {
		this.radioIndex = radioIndex;
		if(radioIndex != null){
			putQueryParameter("RadioIndex", radioIndex);
		}
	}

	public String getSsid() {
		return this.ssid;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
		if(ssid != null){
			putQueryParameter("Ssid", ssid);
		}
	}

	@Override
	public Class<DeleteApSsidConfigResponse> getResponseClass() {
		return DeleteApSsidConfigResponse.class;
	}

}
