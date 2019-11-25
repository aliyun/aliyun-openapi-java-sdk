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
public class GetApDetailStatusRequest extends RpcAcsRequest<GetApDetailStatusResponse> {
	   

	private String appName;

	private Boolean needApgroupInfo;

	private Boolean needRadioStatus;

	private String appCode;

	private String mac;
	public GetApDetailStatusRequest() {
		super("cloudwifi-pop", "2019-11-18", "GetApDetailStatus", "cloudap");
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

	public Boolean getNeedApgroupInfo() {
		return this.needApgroupInfo;
	}

	public void setNeedApgroupInfo(Boolean needApgroupInfo) {
		this.needApgroupInfo = needApgroupInfo;
		if(needApgroupInfo != null){
			putQueryParameter("NeedApgroupInfo", needApgroupInfo.toString());
		}
	}

	public Boolean getNeedRadioStatus() {
		return this.needRadioStatus;
	}

	public void setNeedRadioStatus(Boolean needRadioStatus) {
		this.needRadioStatus = needRadioStatus;
		if(needRadioStatus != null){
			putQueryParameter("NeedRadioStatus", needRadioStatus.toString());
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

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
		if(mac != null){
			putQueryParameter("Mac", mac);
		}
	}

	@Override
	public Class<GetApDetailStatusResponse> getResponseClass() {
		return GetApDetailStatusResponse.class;
	}

}
