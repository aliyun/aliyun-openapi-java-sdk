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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ahas_openapi.transform.v20190901.DisableDegradeRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DisableDegradeRuleResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer slowRtMs;

		private Integer halfOpenRecoveryStepNum;

		private String namespace;

		private Integer statDurationMs;

		private Long ruleId;

		private Integer strategy;

		private String resource;

		private String appName;

		private Integer halfOpenBaseAmountPerStep;

		private Integer recoveryTimeoutMs;

		private Integer minRequestAmount;

		private Float threshold;

		private Boolean enable;

		public Integer getSlowRtMs() {
			return this.slowRtMs;
		}

		public void setSlowRtMs(Integer slowRtMs) {
			this.slowRtMs = slowRtMs;
		}

		public Integer getHalfOpenRecoveryStepNum() {
			return this.halfOpenRecoveryStepNum;
		}

		public void setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
			this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public Integer getStatDurationMs() {
			return this.statDurationMs;
		}

		public void setStatDurationMs(Integer statDurationMs) {
			this.statDurationMs = statDurationMs;
		}

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public Integer getStrategy() {
			return this.strategy;
		}

		public void setStrategy(Integer strategy) {
			this.strategy = strategy;
		}

		public String getResource() {
			return this.resource;
		}

		public void setResource(String resource) {
			this.resource = resource;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Integer getHalfOpenBaseAmountPerStep() {
			return this.halfOpenBaseAmountPerStep;
		}

		public void setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
			this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
		}

		public Integer getRecoveryTimeoutMs() {
			return this.recoveryTimeoutMs;
		}

		public void setRecoveryTimeoutMs(Integer recoveryTimeoutMs) {
			this.recoveryTimeoutMs = recoveryTimeoutMs;
		}

		public Integer getMinRequestAmount() {
			return this.minRequestAmount;
		}

		public void setMinRequestAmount(Integer minRequestAmount) {
			this.minRequestAmount = minRequestAmount;
		}

		public Float getThreshold() {
			return this.threshold;
		}

		public void setThreshold(Float threshold) {
			this.threshold = threshold;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}
	}

	@Override
	public DisableDegradeRuleResponse getInstance(UnmarshallerContext context) {
		return	DisableDegradeRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
