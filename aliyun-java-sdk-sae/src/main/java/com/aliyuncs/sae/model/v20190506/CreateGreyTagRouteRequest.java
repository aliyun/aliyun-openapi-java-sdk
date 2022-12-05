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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateGreyTagRouteRequest extends RoaAcsRequest<CreateGreyTagRouteResponse> {
	   

	private String appId;

	private String name;

	private String description;

	private String dubboRules;

	private String scRules;
	public CreateGreyTagRouteRequest() {
		super("sae", "2019-05-06", "CreateGreyTagRoute", "serverless");
		setUriPattern("/pop/v1/sam/tagroute/greyTagRoute");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getDubboRules() {
		return this.dubboRules;
	}

	public void setDubboRules(String dubboRules) {
		this.dubboRules = dubboRules;
		if(dubboRules != null){
			putQueryParameter("DubboRules", dubboRules);
		}
	}

	public String getScRules() {
		return this.scRules;
	}

	public void setScRules(String scRules) {
		this.scRules = scRules;
		if(scRules != null){
			putQueryParameter("ScRules", scRules);
		}
	}

	@Override
	public Class<CreateGreyTagRouteResponse> getResponseClass() {
		return CreateGreyTagRouteResponse.class;
	}

}
