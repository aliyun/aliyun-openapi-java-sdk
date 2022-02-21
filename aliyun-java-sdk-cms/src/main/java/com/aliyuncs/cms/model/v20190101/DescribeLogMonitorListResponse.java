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
import com.aliyuncs.cms.transform.v20190101.DescribeLogMonitorListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogMonitorListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer pageSize;

	private Integer pageNumber;

	private Long total;

	private List<LogMonitor> logMonitorList;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<LogMonitor> getLogMonitorList() {
		return this.logMonitorList;
	}

	public void setLogMonitorList(List<LogMonitor> logMonitorList) {
		this.logMonitorList = logMonitorList;
	}

	public static class LogMonitor {

		private String valueFilterRelation;

		private String slsLogstore;

		private String metricName;

		private Long groupId;

		private Long logId;

		private String slsRegionId;

		private Long gmtCreate;

		private String slsProject;

		private List<ValueFilterObject> valueFilter;

		public String getValueFilterRelation() {
			return this.valueFilterRelation;
		}

		public void setValueFilterRelation(String valueFilterRelation) {
			this.valueFilterRelation = valueFilterRelation;
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

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

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

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getSlsProject() {
			return this.slsProject;
		}

		public void setSlsProject(String slsProject) {
			this.slsProject = slsProject;
		}

		public List<ValueFilterObject> getValueFilter() {
			return this.valueFilter;
		}

		public void setValueFilter(List<ValueFilterObject> valueFilter) {
			this.valueFilter = valueFilter;
		}

		public static class ValueFilterObject {

			private String key;

			private String value;

			private String operator;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getOperator() {
				return this.operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}
		}
	}

	@Override
	public DescribeLogMonitorListResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogMonitorListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
