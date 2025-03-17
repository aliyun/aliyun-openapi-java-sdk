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

package com.aliyuncs.config.model.v20200907;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EvaluatePreConfigRulesRequest extends RpcAcsRequest<EvaluatePreConfigRulesResponse> {
	   

	private Boolean enableManagedRules;

	private String resourceEvaluateItems;

	private String resourceTypeFormat;
	public EvaluatePreConfigRulesRequest() {
		super("Config", "2020-09-07", "EvaluatePreConfigRules", "config");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getEnableManagedRules() {
		return this.enableManagedRules;
	}

	public void setEnableManagedRules(Boolean enableManagedRules) {
		this.enableManagedRules = enableManagedRules;
		if(enableManagedRules != null){
			putBodyParameter("EnableManagedRules", enableManagedRules.toString());
		}
	}

	public String getResourceEvaluateItems() {
		return this.resourceEvaluateItems;
	}

	public void setResourceEvaluateItems(String resourceEvaluateItems) {
		this.resourceEvaluateItems = resourceEvaluateItems;
		if(resourceEvaluateItems != null){
			putBodyParameter("ResourceEvaluateItems", resourceEvaluateItems);
		}
	}

	public String getResourceTypeFormat() {
		return this.resourceTypeFormat;
	}

	public void setResourceTypeFormat(String resourceTypeFormat) {
		this.resourceTypeFormat = resourceTypeFormat;
		if(resourceTypeFormat != null){
			putBodyParameter("ResourceTypeFormat", resourceTypeFormat);
		}
	}

	@Override
	public Class<EvaluatePreConfigRulesResponse> getResponseClass() {
		return EvaluatePreConfigRulesResponse.class;
	}

}
