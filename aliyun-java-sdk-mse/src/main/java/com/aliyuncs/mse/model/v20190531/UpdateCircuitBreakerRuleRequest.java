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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateCircuitBreakerRuleRequest extends RpcAcsRequest<UpdateCircuitBreakerRuleResponse> {
	   

	private Float threshold;

	private Integer retryTimeoutMs;

	private String appName;

	private Boolean enable;

	private Integer minRequestAmount;

	private Integer maxAllowedRtMs;

	private Long ruleId;

	private Integer halfOpenBaseAmountPerStep;

	private Integer statIntervalMs;

	private String appId;

	private String namespace;

	private Integer halfOpenRecoveryStepNum;

	private String acceptLanguage;

	private Integer strategy;
	public UpdateCircuitBreakerRuleRequest() {
		super("mse", "2019-05-31", "UpdateCircuitBreakerRule", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getRetryTimeoutMs() {
		return this.retryTimeoutMs;
	}

	public void setRetryTimeoutMs(Integer retryTimeoutMs) {
		this.retryTimeoutMs = retryTimeoutMs;
		if(retryTimeoutMs != null){
			putQueryParameter("RetryTimeoutMs", retryTimeoutMs.toString());
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

	public Integer getMinRequestAmount() {
		return this.minRequestAmount;
	}

	public void setMinRequestAmount(Integer minRequestAmount) {
		this.minRequestAmount = minRequestAmount;
		if(minRequestAmount != null){
			putQueryParameter("MinRequestAmount", minRequestAmount.toString());
		}
	}

	public Integer getMaxAllowedRtMs() {
		return this.maxAllowedRtMs;
	}

	public void setMaxAllowedRtMs(Integer maxAllowedRtMs) {
		this.maxAllowedRtMs = maxAllowedRtMs;
		if(maxAllowedRtMs != null){
			putQueryParameter("MaxAllowedRtMs", maxAllowedRtMs.toString());
		}
	}

	public Long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId.toString());
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

	public Integer getStatIntervalMs() {
		return this.statIntervalMs;
	}

	public void setStatIntervalMs(Integer statIntervalMs) {
		this.statIntervalMs = statIntervalMs;
		if(statIntervalMs != null){
			putQueryParameter("StatIntervalMs", statIntervalMs.toString());
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

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
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

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
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

	@Override
	public Class<UpdateCircuitBreakerRuleResponse> getResponseClass() {
		return UpdateCircuitBreakerRuleResponse.class;
	}

}
