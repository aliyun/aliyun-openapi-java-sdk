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
import com.aliyuncs.rds.transform.v20140815.DescribeAvailableMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableMetricsResponse extends AcsResponse {

	private Integer totalRecordCount;

	private String requestId;

	private List<Metrics> items;

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Metrics> getItems() {
		return this.items;
	}

	public void setItems(List<Metrics> items) {
		this.items = items;
	}

	public static class Metrics {

		private String groupKey;

		private Integer sortRule;

		private String description;

		private String unit;

		private String dbType;

		private String metricsKey;

		private String groupKeyType;

		private String metricsKeyAlias;

		private String method;

		private String dimension;

		public String getGroupKey() {
			return this.groupKey;
		}

		public void setGroupKey(String groupKey) {
			this.groupKey = groupKey;
		}

		public Integer getSortRule() {
			return this.sortRule;
		}

		public void setSortRule(Integer sortRule) {
			this.sortRule = sortRule;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getUnit() {
			return this.unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

		public String getMetricsKey() {
			return this.metricsKey;
		}

		public void setMetricsKey(String metricsKey) {
			this.metricsKey = metricsKey;
		}

		public String getGroupKeyType() {
			return this.groupKeyType;
		}

		public void setGroupKeyType(String groupKeyType) {
			this.groupKeyType = groupKeyType;
		}

		public String getMetricsKeyAlias() {
			return this.metricsKeyAlias;
		}

		public void setMetricsKeyAlias(String metricsKeyAlias) {
			this.metricsKeyAlias = metricsKeyAlias;
		}

		public String getBizMethod() {
			return this.method;
		}

		public void setBizMethod(String method) {
			this.method = method;
		}

		public String getDimension() {
			return this.dimension;
		}

		public void setDimension(String dimension) {
			this.dimension = dimension;
		}
	}

	@Override
	public DescribeAvailableMetricsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAvailableMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
