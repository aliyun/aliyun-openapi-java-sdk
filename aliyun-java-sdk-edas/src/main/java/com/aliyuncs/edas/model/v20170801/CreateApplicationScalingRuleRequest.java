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
public class CreateApplicationScalingRuleRequest extends RoaAcsRequest<CreateApplicationScalingRuleResponse> {
	   

	private String scalingRuleName;

	private Boolean scalingRuleEnable;

	private String scalingRuleTimer;

	private String scalingRuleMetric;

	private String appId;

	private String scalingRuleTrigger;

	private String scalingRuleType;
	public CreateApplicationScalingRuleRequest() {
		super("Edas", "2017-08-01", "CreateApplicationScalingRule", "Edas");
		setUriPattern("/pop/v1/eam/scale/application_scaling_rule");
		setMethod(MethodType.POST);
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

	public Boolean getScalingRuleEnable() {
		return this.scalingRuleEnable;
	}

	public void setScalingRuleEnable(Boolean scalingRuleEnable) {
		this.scalingRuleEnable = scalingRuleEnable;
		if(scalingRuleEnable != null){
			putQueryParameter("ScalingRuleEnable", scalingRuleEnable.toString());
		}
	}

	public String getScalingRuleTimer() {
		return this.scalingRuleTimer;
	}

	public void setScalingRuleTimer(String scalingRuleTimer) {
		this.scalingRuleTimer = scalingRuleTimer;
		if(scalingRuleTimer != null){
			putQueryParameter("ScalingRuleTimer", scalingRuleTimer);
		}
	}

	public String getScalingRuleMetric() {
		return this.scalingRuleMetric;
	}

	public void setScalingRuleMetric(String scalingRuleMetric) {
		this.scalingRuleMetric = scalingRuleMetric;
		if(scalingRuleMetric != null){
			putQueryParameter("ScalingRuleMetric", scalingRuleMetric);
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

	public String getScalingRuleTrigger() {
		return this.scalingRuleTrigger;
	}

	public void setScalingRuleTrigger(String scalingRuleTrigger) {
		this.scalingRuleTrigger = scalingRuleTrigger;
		if(scalingRuleTrigger != null){
			putQueryParameter("ScalingRuleTrigger", scalingRuleTrigger);
		}
	}

	public String getScalingRuleType() {
		return this.scalingRuleType;
	}

	public void setScalingRuleType(String scalingRuleType) {
		this.scalingRuleType = scalingRuleType;
		if(scalingRuleType != null){
			putQueryParameter("ScalingRuleType", scalingRuleType);
		}
	}

	@Override
	public Class<CreateApplicationScalingRuleResponse> getResponseClass() {
		return CreateApplicationScalingRuleResponse.class;
	}

}
