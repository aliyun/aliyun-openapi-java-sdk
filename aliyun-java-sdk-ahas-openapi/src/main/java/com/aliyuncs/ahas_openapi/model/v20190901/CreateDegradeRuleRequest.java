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
public class CreateDegradeRuleRequest extends RpcAcsRequest<CreateDegradeRuleResponse> {
	   

	private Integer recoveryTimeoutMs;

	private String resource;

	private Float threshold;

	private Integer halfOpenBaseAmountPerStep;

	private String appName;

	private Boolean enable;

	private Integer statDurationMs;

	private String namespace;

	private Integer minRequestAmount;

	private Integer halfOpenRecoveryStepNum;

	private Integer strategy;

	private Integer slowRtMs;
	public CreateDegradeRuleRequest() {
		super("ahas-openapi", "2019-09-01", "CreateDegradeRule", "ahas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getRecoveryTimeoutMs() {
		return this.recoveryTimeoutMs;
	}

	public void setRecoveryTimeoutMs(Integer recoveryTimeoutMs) {
		this.recoveryTimeoutMs = recoveryTimeoutMs;
		if(recoveryTimeoutMs != null){
			putQueryParameter("RecoveryTimeoutMs", recoveryTimeoutMs.toString());
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

	public Integer getHalfOpenBaseAmountPerStep() {
		return this.halfOpenBaseAmountPerStep;
	}

	public void setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
		this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
		if(halfOpenBaseAmountPerStep != null){
			putQueryParameter("HalfOpenBaseAmountPerStep", halfOpenBaseAmountPerStep.toString());
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

	public Integer getStatDurationMs() {
		return this.statDurationMs;
	}

	public void setStatDurationMs(Integer statDurationMs) {
		this.statDurationMs = statDurationMs;
		if(statDurationMs != null){
			putQueryParameter("StatDurationMs", statDurationMs.toString());
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

	public Integer getMinRequestAmount() {
		return this.minRequestAmount;
	}

	public void setMinRequestAmount(Integer minRequestAmount) {
		this.minRequestAmount = minRequestAmount;
		if(minRequestAmount != null){
			putQueryParameter("MinRequestAmount", minRequestAmount.toString());
		}
	}

	public Integer getHalfOpenRecoveryStepNum() {
		return this.halfOpenRecoveryStepNum;
	}

	public void setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
		this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
		if(halfOpenRecoveryStepNum != null){
			putQueryParameter("HalfOpenRecoveryStepNum", halfOpenRecoveryStepNum.toString());
		}
	}

	public Integer getStrategy() {
		return this.strategy;
	}

	public void setStrategy(Integer strategy) {
		this.strategy = strategy;
		if(strategy != null){
			putQueryParameter("Strategy", strategy.toString());
		}
	}

	public Integer getSlowRtMs() {
		return this.slowRtMs;
	}

	public void setSlowRtMs(Integer slowRtMs) {
		this.slowRtMs = slowRtMs;
		if(slowRtMs != null){
			putQueryParameter("SlowRtMs", slowRtMs.toString());
		}
	}

	@Override
	public Class<CreateDegradeRuleResponse> getResponseClass() {
		return CreateDegradeRuleResponse.class;
	}

}
