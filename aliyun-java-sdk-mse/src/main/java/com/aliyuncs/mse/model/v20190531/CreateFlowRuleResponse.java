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
import com.aliyuncs.mse.transform.v20190531.CreateFlowRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateFlowRuleResponse extends AcsResponse {

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

		private Integer controlBehavior;

		private Integer maxQueueingTimeMs;

		private Float threshold;

		private Boolean enable;

		private String appId;

		private String regionId;

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

		public Integer getControlBehavior() {
			return this.controlBehavior;
		}

		public void setControlBehavior(Integer controlBehavior) {
			this.controlBehavior = controlBehavior;
		}

		public Integer getMaxQueueingTimeMs() {
			return this.maxQueueingTimeMs;
		}

		public void setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
			this.maxQueueingTimeMs = maxQueueingTimeMs;
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

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public CreateFlowRuleResponse getInstance(UnmarshallerContext context) {
		return	CreateFlowRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
