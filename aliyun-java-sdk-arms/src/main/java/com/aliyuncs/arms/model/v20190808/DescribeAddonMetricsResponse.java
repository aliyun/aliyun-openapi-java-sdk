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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.DescribeAddonMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAddonMetricsResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Boolean success;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String group;

		private List<LabelsItem> labels;

		private List<Labels> metrics;

		public String getGroup() {
			return this.group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public List<LabelsItem> getLabels() {
			return this.labels;
		}

		public void setLabels(List<LabelsItem> labels) {
			this.labels = labels;
		}

		public List<Labels> getMetrics() {
			return this.metrics;
		}

		public void setMetrics(List<Labels> metrics) {
			this.metrics = metrics;
		}

		public static class LabelsItem {

			private String description;

			private String key;

			private String source;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}
		}

		public static class Labels {

			private String description;

			private String type;

			private String unit;

			private String metric;

			private List<LabelsItem2> labels1;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getUnit() {
				return this.unit;
			}

			public void setUnit(String unit) {
				this.unit = unit;
			}

			public String getMetric() {
				return this.metric;
			}

			public void setMetric(String metric) {
				this.metric = metric;
			}

			public List<LabelsItem2> getLabels1() {
				return this.labels1;
			}

			public void setLabels1(List<LabelsItem2> labels1) {
				this.labels1 = labels1;
			}

			public static class LabelsItem2 {

				private String description;

				private String key;

				private String source;

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getSource() {
					return this.source;
				}

				public void setSource(String source) {
					this.source = source;
				}
			}
		}
	}

	@Override
	public DescribeAddonMetricsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAddonMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
