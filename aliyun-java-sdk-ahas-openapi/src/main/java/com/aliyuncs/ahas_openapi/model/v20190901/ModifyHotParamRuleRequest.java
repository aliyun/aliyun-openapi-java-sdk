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
public class ModifyHotParamRuleRequest extends RpcAcsRequest<ModifyHotParamRuleResponse> {
	   

	private Integer metricType;

	private Integer paramIdx;

	private Integer controlBehavior;

	private Float threshold;

	private String ahasRegionId;

	private Boolean enable;

	private Integer maxQueueingTimeMs;

	private Long ruleId;

	private Long statDurationSec;

	private Integer burstCount;
	public ModifyHotParamRuleRequest() {
		super("ahas-openapi", "2019-09-01", "ModifyHotParamRule", "ahas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getMetricType() {
		return this.metricType;
	}

	public void setMetricType(Integer metricType) {
		this.metricType = metricType;
		if(metricType != null){
			putQueryParameter("MetricType", metricType.toString());
		}
	}

	public Integer getParamIdx() {
		return this.paramIdx;
	}

	public void setParamIdx(Integer paramIdx) {
		this.paramIdx = paramIdx;
		if(paramIdx != null){
			putQueryParameter("ParamIdx", paramIdx.toString());
		}
	}

	public Integer getControlBehavior() {
		return this.controlBehavior;
	}

	public void setControlBehavior(Integer controlBehavior) {
		this.controlBehavior = controlBehavior;
		if(controlBehavior != null){
			putQueryParameter("ControlBehavior", controlBehavior.toString());
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

	public String getAhasRegionId() {
		return this.ahasRegionId;
	}

	public void setAhasRegionId(String ahasRegionId) {
		this.ahasRegionId = ahasRegionId;
		if(ahasRegionId != null){
			putQueryParameter("AhasRegionId", ahasRegionId);
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

	public Integer getMaxQueueingTimeMs() {
		return this.maxQueueingTimeMs;
	}

	public void setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
		this.maxQueueingTimeMs = maxQueueingTimeMs;
		if(maxQueueingTimeMs != null){
			putQueryParameter("MaxQueueingTimeMs", maxQueueingTimeMs.toString());
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

	public Long getStatDurationSec() {
		return this.statDurationSec;
	}

	public void setStatDurationSec(Long statDurationSec) {
		this.statDurationSec = statDurationSec;
		if(statDurationSec != null){
			putQueryParameter("StatDurationSec", statDurationSec.toString());
		}
	}

	public Integer getBurstCount() {
		return this.burstCount;
	}

	public void setBurstCount(Integer burstCount) {
		this.burstCount = burstCount;
		if(burstCount != null){
			putQueryParameter("BurstCount", burstCount.toString());
		}
	}

	@Override
	public Class<ModifyHotParamRuleResponse> getResponseClass() {
		return ModifyHotParamRuleResponse.class;
	}

}
