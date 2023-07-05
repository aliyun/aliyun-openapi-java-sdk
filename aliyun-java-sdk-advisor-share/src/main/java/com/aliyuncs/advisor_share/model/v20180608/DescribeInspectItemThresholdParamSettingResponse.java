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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.DescribeInspectItemThresholdParamSettingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInspectItemThresholdParamSettingResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String inspectName;

		private String code;

		private String tips;

		private String description;

		private String category;

		private List<IndicatorItem> indicator;

		public String getInspectName() {
			return this.inspectName;
		}

		public void setInspectName(String inspectName) {
			this.inspectName = inspectName;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getTips() {
			return this.tips;
		}

		public void setTips(String tips) {
			this.tips = tips;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public List<IndicatorItem> getIndicator() {
			return this.indicator;
		}

		public void setIndicator(List<IndicatorItem> indicator) {
			this.indicator = indicator;
		}

		public static class IndicatorItem {

			private String group;

			private String groupKey;

			private Long order;

			private List<ThresholdItem> threshold;

			public String getGroup() {
				return this.group;
			}

			public void setGroup(String group) {
				this.group = group;
			}

			public String getGroupKey() {
				return this.groupKey;
			}

			public void setGroupKey(String groupKey) {
				this.groupKey = groupKey;
			}

			public Long getOrder() {
				return this.order;
			}

			public void setOrder(Long order) {
				this.order = order;
			}

			public List<ThresholdItem> getThreshold() {
				return this.threshold;
			}

			public void setThreshold(List<ThresholdItem> threshold) {
				this.threshold = threshold;
			}

			public static class ThresholdItem {

				private Long max;

				private Long min;

				private String key;

				private String name;

				private Long order;

				private Long value;

				private Long defaultValue;

				private String unit;

				public Long getMax() {
					return this.max;
				}

				public void setMax(Long max) {
					this.max = max;
				}

				public Long getMin() {
					return this.min;
				}

				public void setMin(Long min) {
					this.min = min;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Long getOrder() {
					return this.order;
				}

				public void setOrder(Long order) {
					this.order = order;
				}

				public Long getValue() {
					return this.value;
				}

				public void setValue(Long value) {
					this.value = value;
				}

				public Long getDefaultValue() {
					return this.defaultValue;
				}

				public void setDefaultValue(Long defaultValue) {
					this.defaultValue = defaultValue;
				}

				public String getUnit() {
					return this.unit;
				}

				public void setUnit(String unit) {
					this.unit = unit;
				}
			}
		}
	}

	@Override
	public DescribeInspectItemThresholdParamSettingResponse getInstance(UnmarshallerContext context) {
		return	DescribeInspectItemThresholdParamSettingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
