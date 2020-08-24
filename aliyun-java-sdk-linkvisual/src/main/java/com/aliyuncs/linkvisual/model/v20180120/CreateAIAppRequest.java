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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAIAppRequest extends RpcAcsRequest<CreateAIAppResponse> {
	   

	private String description;

	private String appTemplateId;

	private Integer level;

	private String appTemplateVersion;

	private String name;
	public CreateAIAppRequest() {
		super("Linkvisual", "2018-01-20", "CreateAIApp", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getAppTemplateId() {
		return this.appTemplateId;
	}

	public void setAppTemplateId(String appTemplateId) {
		this.appTemplateId = appTemplateId;
		if(appTemplateId != null){
			putQueryParameter("AppTemplateId", appTemplateId);
		}
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level.toString());
		}
	}

	public String getAppTemplateVersion() {
		return this.appTemplateVersion;
	}

	public void setAppTemplateVersion(String appTemplateVersion) {
		this.appTemplateVersion = appTemplateVersion;
		if(appTemplateVersion != null){
			putQueryParameter("AppTemplateVersion", appTemplateVersion);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<CreateAIAppResponse> getResponseClass() {
		return CreateAIAppResponse.class;
	}

}
