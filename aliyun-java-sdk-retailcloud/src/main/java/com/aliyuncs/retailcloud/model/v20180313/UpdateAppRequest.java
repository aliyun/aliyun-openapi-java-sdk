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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateAppRequest extends RpcAcsRequest<UpdateAppResponse> {
	   

	private String bizTitle;

	private String serviceType;

	private Long appId;

	private String operatingSystem;

	private String description;

	private String language;
	public UpdateAppRequest() {
		super("retailcloud", "2018-03-13", "UpdateApp", "retailcloud");
		setMethod(MethodType.POST);
	}

	public String getBizTitle() {
		return this.bizTitle;
	}

	public void setBizTitle(String bizTitle) {
		this.bizTitle = bizTitle;
		if(bizTitle != null){
			putBodyParameter("BizTitle", bizTitle);
		}
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
		if(serviceType != null){
			putBodyParameter("ServiceType", serviceType);
		}
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId.toString());
		}
	}

	public String getOperatingSystem() {
		return this.operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
		if(operatingSystem != null){
			putBodyParameter("OperatingSystem", operatingSystem);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putBodyParameter("Language", language);
		}
	}

	@Override
	public Class<UpdateAppResponse> getResponseClass() {
		return UpdateAppResponse.class;
	}

}
