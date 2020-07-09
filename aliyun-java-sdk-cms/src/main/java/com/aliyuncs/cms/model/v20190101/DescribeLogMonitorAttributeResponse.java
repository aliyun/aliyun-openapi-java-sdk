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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeLogMonitorAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogMonitorAttributeResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String message;

	private String requestId;

	private LogMonitor logMonitor;

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

	public LogMonitor getLogMonitor() {
		return this.logMonitor;
	}

	public void setLogMonitor(LogMonitor logMonitor) {
		this.logMonitor = logMonitor;
	}

	public static class LogMonitor {

		private Long logId;

		private String slsRegionId;

		private String slsProject;

		private String slsLogstore;

		private String metricName;

		private String metricExpress;

		private Long gmtCreate;

		private String valueFilterRelation;

		private Long groupId;

		private List<Aggregate> aggregates;

		private List<ValueFilterObject> valueFilter;

		private List<String> tumblingwindows;

		private List<String> groupbys;

		public Long getLogId() {
			return this.logId;
		}

		public void setLogId(Long logId) {
			this.logId = logId;
		}

		public String getSlsRegionId() {
			return this.slsRegionId;
		}

		public void setSlsRegionId(String slsRegionId) {
			this.slsRegionId = slsRegionId;
		}

		public String getSlsProject() {
			return this.slsProject;
		}

		public void setSlsProject(String slsProject) {
			this.slsProject = slsProject;
		}

		public String getSlsLogstore() {
			return this.slsLogstore;
		}

		public void setSlsLogstore(String slsLogstore) {
			this.slsLogstore = slsLogstore;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getMetricExpress() {
			return this.metricExpress;
		}

		public void setMetricExpress(String metricExpress) {
			this.metricExpress = metricExpress;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getValueFilterRelation() {
			return this.valueFilterRelation;
		}

		public void setValueFilterRelation(String valueFilterRelation) {
			this.valueFilterRelation = valueFilterRelation;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public List<Aggregate> getAggregates() {
			return this.aggregates;
		}

		public void setAggregates(List<Aggregate> aggregates) {
			this.aggregates = aggregates;
		}

		public List<ValueFilterObject> getValueFilter() {
			return this.valueFilter;
		}

		public void setValueFilter(List<ValueFilterObject> valueFilter) {
			this.valueFilter = valueFilter;
		}

		public List<String> getTumblingwindows() {
			return this.tumblingwindows;
		}

		public void setTumblingwindows(List<String> tumblingwindows) {
			this.tumblingwindows = tumblingwindows;
		}

		public List<String> getGroupbys() {
			return this.groupbys;
		}

		public void setGroupbys(List<String> groupbys) {
			this.groupbys = groupbys;
		}

		public static class Aggregate {

			private String alias;

			private String fieldName;

			private String function;

			private String min;

			private String max;

			public String getAlias() {
				return this.alias;
			}

			public void setAlias(String alias) {
				this.alias = alias;
			}

			public String getFieldName() {
				return this.fieldName;
			}

			public void setFieldName(String fieldName) {
				this.fieldName = fieldName;
			}

			public String getFunction() {
				return this.function;
			}

			public void setFunction(String function) {
				this.function = function;
			}

			public String getMin() {
				return this.min;
			}

			public void setMin(String min) {
				this.min = min;
			}

			public String getMax() {
				return this.max;
			}

			public void setMax(String max) {
				this.max = max;
			}
		}

		public static class ValueFilterObject {

			private String key;

			private String operator;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getOperator() {
				return this.operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public DescribeLogMonitorAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogMonitorAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
