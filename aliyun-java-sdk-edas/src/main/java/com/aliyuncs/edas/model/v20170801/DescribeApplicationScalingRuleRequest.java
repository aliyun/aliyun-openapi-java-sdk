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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeApplicationScalingRuleRequest extends RoaAcsRequest<DescribeApplicationScalingRuleResponse> {
	   

	private String scalingRuleName;

	private String appId;
	public DescribeApplicationScalingRuleRequest() {
		super("Edas", "2017-08-01", "DescribeApplicationScalingRule", "Edas");
		setUriPattern("/pop/v1/eam/scale/application_scaling_rule");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScalingRuleName() {
		return this.scalingRuleName;
	}

	public void setScalingRuleName(String scalingRuleName) {
		this.scalingRuleName = scalingRuleName;
		if(scalingRuleName != null){
			putQueryParameter("ScalingRuleName", scalingRuleName);
		}
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

	@Override
	public Class<DescribeApplicationScalingRuleResponse> getResponseClass() {
		return DescribeApplicationScalingRuleResponse.class;
	}

}
