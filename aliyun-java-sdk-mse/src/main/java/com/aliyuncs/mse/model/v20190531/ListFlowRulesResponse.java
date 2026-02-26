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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.ListFlowRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFlowRulesResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalSize;

		private List<ResultItem> result;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Integer totalSize) {
			this.totalSize = totalSize;
		}

		public List<ResultItem> getResult() {
			return this.result;
		}

		public void setResult(List<ResultItem> result) {
			this.result = result;
		}

		public static class ResultItem {

			private String namespace;

			private Long ruleId;

			private String appName;

			private String resource;

			private Integer controlBehavior;

			private Integer maxQueueingTimeMs;

			private Float threshold;

			private Boolean enable;

			private String appId;

			private String regionId;

			private String fallbackObject;

			private Integer metricType;

			private Map<Object,Object> trafficTags;

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public Long getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(Long ruleId) {
				this.ruleId = ruleId;
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

			public String getFallbackObject() {
				return this.fallbackObject;
			}

			public void setFallbackObject(String fallbackObject) {
				this.fallbackObject = fallbackObject;
			}

			public Integer getMetricType() {
				return this.metricType;
			}

			public void setMetricType(Integer metricType) {
				this.metricType = metricType;
			}

			public Map<Object,Object> getTrafficTags() {
				return this.trafficTags;
			}

			public void setTrafficTags(Map<Object,Object> trafficTags) {
				this.trafficTags = trafficTags;
			}
		}
	}

	@Override
	public ListFlowRulesResponse getInstance(UnmarshallerContext context) {
		return	ListFlowRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
