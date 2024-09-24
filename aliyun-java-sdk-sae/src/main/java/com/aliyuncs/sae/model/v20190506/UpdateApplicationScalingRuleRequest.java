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
public class UpdateApplicationScalingRuleRequest extends RoaAcsRequest<UpdateApplicationScalingRuleResponse> {
	   

	private String scalingRuleName;

	private Integer minReadyInstances;

	private String scalingRuleTimer;

	private String scalingRuleMetric;

	private Boolean enableIdle;

	private String appId;

	private Integer minReadyInstanceRatio;
	public UpdateApplicationScalingRuleRequest() {
		super("sae", "2019-05-06", "UpdateApplicationScalingRule", "serverless");
		setUriPattern("/pop/v1/sam/scale/applicationScalingRule");
		setMethod(MethodType.PUT);
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

	public Integer getMinReadyInstances() {
		return this.minReadyInstances;
	}

	public void setMinReadyInstances(Integer minReadyInstances) {
		this.minReadyInstances = minReadyInstances;
		if(minReadyInstances != null){
			putQueryParameter("MinReadyInstances", minReadyInstances.toString());
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

	public Boolean getEnableIdle() {
		return this.enableIdle;
	}

	public void setEnableIdle(Boolean enableIdle) {
		this.enableIdle = enableIdle;
		if(enableIdle != null){
			putQueryParameter("EnableIdle", enableIdle.toString());
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

	public Integer getMinReadyInstanceRatio() {
		return this.minReadyInstanceRatio;
	}

	public void setMinReadyInstanceRatio(Integer minReadyInstanceRatio) {
		this.minReadyInstanceRatio = minReadyInstanceRatio;
		if(minReadyInstanceRatio != null){
			putQueryParameter("MinReadyInstanceRatio", minReadyInstanceRatio.toString());
		}
	}

	@Override
	public Class<UpdateApplicationScalingRuleResponse> getResponseClass() {
		return UpdateApplicationScalingRuleResponse.class;
	}

}
