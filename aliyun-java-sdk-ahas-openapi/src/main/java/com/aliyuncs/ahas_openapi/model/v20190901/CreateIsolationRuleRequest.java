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

package com.aliyuncs.ahas_openapi.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ahas_openapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateIsolationRuleRequest extends RpcAcsRequest<CreateIsolationRuleResponse> {
	   

	private String refResource;

	private String resource;

	private Float threshold;

	private String limitOrigin;

	private String appName;

	private Boolean enable;

	private String namespace;

	private Integer relationStrategy;
	public CreateIsolationRuleRequest() {
		super("ahas-openapi", "2019-09-01", "CreateIsolationRule", "ahas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRefResource() {
		return this.refResource;
	}

	public void setRefResource(String refResource) {
		this.refResource = refResource;
		if(refResource != null){
			putQueryParameter("RefResource", refResource);
		}
	}

	public String getResource() {
		return this.resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
		if(resource != null){
			putQueryParameter("Resource", resource);
		}
	}

	public Float getThreshold() {
		return this.threshold;
	}

	public void setThreshold(Float threshold) {
		this.threshold = threshold;
		if(threshold != null){
			putQueryParameter("Threshold", threshold.toString());
		}
	}

	public String getLimitOrigin() {
		return this.limitOrigin;
	}

	public void setLimitOrigin(String limitOrigin) {
		this.limitOrigin = limitOrigin;
		if(limitOrigin != null){
			putQueryParameter("LimitOrigin", limitOrigin);
		}
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

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
		if(enable != null){
			putQueryParameter("Enable", enable.toString());
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public Integer getRelationStrategy() {
		return this.relationStrategy;
	}

	public void setRelationStrategy(Integer relationStrategy) {
		this.relationStrategy = relationStrategy;
		if(relationStrategy != null){
			putQueryParameter("RelationStrategy", relationStrategy.toString());
		}
	}

	@Override
	public Class<CreateIsolationRuleResponse> getResponseClass() {
		return CreateIsolationRuleResponse.class;
	}

}
