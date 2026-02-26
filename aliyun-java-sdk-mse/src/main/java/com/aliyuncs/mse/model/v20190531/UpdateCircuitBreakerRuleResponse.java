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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.UpdateCircuitBreakerRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateCircuitBreakerRuleResponse extends AcsResponse {

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

		private String namespace;

		private Long id;

		private String appName;

		private String resource;

		private Integer strategy;

		private Float threshold;

		private Boolean enable;

		private Integer retryTimeoutMs;

		private Integer statIntervalMs;

		private String appId;

		private Integer maxAllowedRtMs;

		private Integer minRequestAmount;

		private Integer halfOpenBaseAmountPerStep;

		private Integer halfOpenRecoveryStepNum;

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getResource() {
			return this.resource;
		}

		public void setResource(String resource) {
			this.resource = resource;
		}

		public Integer getStrategy() {
			return this.strategy;
		}

		public void setStrategy(Integer strategy) {
			this.strategy = strategy;
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

		public Integer getRetryTimeoutMs() {
			return this.retryTimeoutMs;
		}

		public void setRetryTimeoutMs(Integer retryTimeoutMs) {
			this.retryTimeoutMs = retryTimeoutMs;
		}

		public Integer getStatIntervalMs() {
			return this.statIntervalMs;
		}

		public void setStatIntervalMs(Integer statIntervalMs) {
			this.statIntervalMs = statIntervalMs;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public Integer getMaxAllowedRtMs() {
			return this.maxAllowedRtMs;
		}

		public void setMaxAllowedRtMs(Integer maxAllowedRtMs) {
			this.maxAllowedRtMs = maxAllowedRtMs;
		}

		public Integer getMinRequestAmount() {
			return this.minRequestAmount;
		}

		public void setMinRequestAmount(Integer minRequestAmount) {
			this.minRequestAmount = minRequestAmount;
		}

		public Integer getHalfOpenBaseAmountPerStep() {
			return this.halfOpenBaseAmountPerStep;
		}

		public void setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
			this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
		}

		public Integer getHalfOpenRecoveryStepNum() {
			return this.halfOpenRecoveryStepNum;
		}

		public void setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
			this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
		}
	}

	@Override
	public UpdateCircuitBreakerRuleResponse getInstance(UnmarshallerContext context) {
		return	UpdateCircuitBreakerRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
