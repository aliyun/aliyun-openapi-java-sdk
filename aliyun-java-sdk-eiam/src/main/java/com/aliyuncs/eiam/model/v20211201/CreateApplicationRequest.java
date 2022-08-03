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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateApplicationRequest extends RpcAcsRequest<CreateApplicationResponse> {
	   

	private String description;

	private String applicationSourceType;

	private String logoUrl;

	private String applicationName;

	private String instanceId;

	private String ssoType;

	private String applicationTemplateId;
	public CreateApplicationRequest() {
		super("Eiam", "2021-12-01", "CreateApplication", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getApplicationSourceType() {
		return this.applicationSourceType;
	}

	public void setApplicationSourceType(String applicationSourceType) {
		this.applicationSourceType = applicationSourceType;
		if(applicationSourceType != null){
			putQueryParameter("ApplicationSourceType", applicationSourceType);
		}
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
		if(logoUrl != null){
			putQueryParameter("LogoUrl", logoUrl);
		}
	}

	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
		if(applicationName != null){
			putQueryParameter("ApplicationName", applicationName);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getSsoType() {
		return this.ssoType;
	}

	public void setSsoType(String ssoType) {
		this.ssoType = ssoType;
		if(ssoType != null){
			putQueryParameter("SsoType", ssoType);
		}
	}

	public String getApplicationTemplateId() {
		return this.applicationTemplateId;
	}

	public void setApplicationTemplateId(String applicationTemplateId) {
		this.applicationTemplateId = applicationTemplateId;
		if(applicationTemplateId != null){
			putQueryParameter("ApplicationTemplateId", applicationTemplateId);
		}
	}

	@Override
	public Class<CreateApplicationResponse> getResponseClass() {
		return CreateApplicationResponse.class;
	}

}
