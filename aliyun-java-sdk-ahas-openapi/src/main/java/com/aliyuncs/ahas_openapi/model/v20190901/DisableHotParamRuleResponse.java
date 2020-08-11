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

		private String appName;

		private Integer burstCount;

		private Integer controlBehavior;

		private Boolean enable;

		private Integer maxQueueingTimeMs;

		private Integer metricType;

		private String namespace;

		private Integer paramIdx;

		private String resource;

		private Long ruleId;

		private Long statDurationSec;

		private Float threshold;

		private List<ParamFlowItemListItem> paramFlowItemList;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Integer getBurstCount() {
			return this.burstCount;
		}

		public void setBurstCount(Integer burstCount) {
			this.burstCount = burstCount;
		}

		public Integer getControlBehavior() {
			return this.controlBehavior;
		}

		public void setControlBehavior(Integer controlBehavior) {
			this.controlBehavior = controlBehavior;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
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

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public Integer getParamIdx() {
			return this.paramIdx;
		}

		public void setParamIdx(Integer paramIdx) {
			this.paramIdx = paramIdx;
		}

		public String getResource() {
			return this.resource;
		}

		public void setResource(String resource) {
			this.resource = resource;
		}

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public Long getStatDurationSec() {
			return this.statDurationSec;
		}

		public void setStatDurationSec(Long statDurationSec) {
			this.statDurationSec = statDurationSec;
		}

		public Float getThreshold() {
			return this.threshold;
		}

		public void setThreshold(Float threshold) {
			this.threshold = threshold;
		}

		public List<ParamFlowItemListItem> getParamFlowItemList() {
			return this.paramFlowItemList;
		}

		public void setParamFlowItemList(List<ParamFlowItemListItem> paramFlowItemList) {
			this.paramFlowItemList = paramFlowItemList;
		}

		public static class ParamFlowItemListItem {

			private String itemType;

			private String itemValue;

			private Float threshold;

			public String getItemType() {
				return this.itemType;
			}

			public void setItemType(String itemType) {
				this.itemType = itemType;
			}

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
