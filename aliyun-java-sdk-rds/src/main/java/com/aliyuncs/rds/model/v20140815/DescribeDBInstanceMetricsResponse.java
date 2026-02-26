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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceMetricsResponse extends AcsResponse {

	private String dBInstanceName;

	private String requestId;

	private Integer totalRecordCount;

	private List<Metrics> items;

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<Metrics> getItems() {
		return this.items;
	}

	public void setItems(List<Metrics> items) {
		this.items = items;
	}

	public static class Metrics {

		private String dbType;

		private String description;

		private String dimension;

		private String groupKey;

		private String groupKeyType;

		private String method;

		private String metricsKey;

		private String metricsKeyAlias;

		private Integer sortRule;

		private String unit;

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDimension() {
			return this.dimension;
		}

		public void setDimension(String dimension) {
			this.dimension = dimension;
		}

		public String getGroupKey() {
			return this.groupKey;
		}

		public void setGroupKey(String groupKey) {
			this.groupKey = groupKey;
		}

		public String getGroupKeyType() {
			return this.groupKeyType;
		}

		public void setGroupKeyType(String groupKeyType) {
			this.groupKeyType = groupKeyType;
		}

		public String getBizMethod() {
			return this.method;
		}

		public void setBizMethod(String method) {
			this.method = method;
		}

		public String getMetricsKey() {
			return this.metricsKey;
		}

		public void setMetricsKey(String metricsKey) {
			this.metricsKey = metricsKey;
		}

		public String getMetricsKeyAlias() {
			return this.metricsKeyAlias;
		}

		public void setMetricsKeyAlias(String metricsKeyAlias) {
			this.metricsKeyAlias = metricsKeyAlias;
		}

		public Integer getSortRule() {
			return this.sortRule;
		}

		public void setSortRule(Integer sortRule) {
			this.sortRule = sortRule;
		}

		public String getUnit() {
			return this.unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}
	}

	@Override
	public DescribeDBInstanceMetricsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
