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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ahas_openapi.transform.v20190901.DisableHotParamRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DisableHotParamRuleResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer paramIdx;

		private String namespace;

		private Long statDurationSec;

		private Integer burstCount;

		private Long ruleId;

		private String appName;

		private String resource;

		private Integer controlBehavior;

		private Integer maxQueueingTimeMs;

		private Integer metricType;

		private Float threshold;

		private Boolean enable;

		private List<ParamFlowItemListItem> paramFlowItemList;

		public Integer getParamIdx() {
			return this.paramIdx;
		}

		public void setParamIdx(Integer paramIdx) {
			this.paramIdx = paramIdx;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public Long getStatDurationSec() {
			return this.statDurationSec;
		}

		public void setStatDurationSec(Long statDurationSec) {
			this.statDurationSec = statDurationSec;
		}

		public Integer getBurstCount() {
			return this.burstCount;
		}

		public void setBurstCount(Integer burstCount) {
			this.burstCount = burstCount;
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

		public Integer getMetricType() {
			return this.metricType;
		}

		public void setMetricType(Integer metricType) {
			this.metricType = metricType;
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

		public List<ParamFlowItemListItem> getParamFlowItemList() {
			return this.paramFlowItemList;
		}

		public void setParamFlowItemList(List<ParamFlowItemListItem> paramFlowItemList) {
			this.paramFlowItemList = paramFlowItemList;
		}

		public static class ParamFlowItemListItem {

			private String itemValue;

			private Float threshold;

			private String itemType;

			public String getItemValue() {
				return this.itemValue;
			}

			public void setItemValue(String itemValue) {
				this.itemValue = itemValue;
			}

			public Float getThreshold() {
				return this.threshold;
			}

			public void setThreshold(Float threshold) {
				this.threshold = threshold;
			}

			public String getItemType() {
				return this.itemType;
			}

			public void setItemType(String itemType) {
				this.itemType = itemType;
			}
		}
	}

	@Override
	public DisableHotParamRuleResponse getInstance(UnmarshallerContext context) {
		return	DisableHotParamRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
