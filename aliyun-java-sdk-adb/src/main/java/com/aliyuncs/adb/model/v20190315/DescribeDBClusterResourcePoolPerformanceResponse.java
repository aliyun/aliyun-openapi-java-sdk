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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeDBClusterResourcePoolPerformanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterResourcePoolPerformanceResponse extends AcsResponse {

	private String requestId;

	private String dBClusterId;

	private String startTime;

	private String endTime;

	private List<PerformanceItem> performances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<PerformanceItem> getPerformances() {
		return this.performances;
	}

	public void setPerformances(List<PerformanceItem> performances) {
		this.performances = performances;
	}

	public static class PerformanceItem {

		private String key;

		private String unit;

		private List<ResourcePoolPerformancesItem> resourcePoolPerformances;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getUnit() {
			return this.unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public List<ResourcePoolPerformancesItem> getResourcePoolPerformances() {
			return this.resourcePoolPerformances;
		}

		public void setResourcePoolPerformances(List<ResourcePoolPerformancesItem> resourcePoolPerformances) {
			this.resourcePoolPerformances = resourcePoolPerformances;
		}

		public static class ResourcePoolPerformancesItem {

			private String resourcePoolName;

			private List<ResourcePoolSeriesItem> resourcePoolSeries;

			public String getResourcePoolName() {
				return this.resourcePoolName;
			}

			public void setResourcePoolName(String resourcePoolName) {
				this.resourcePoolName = resourcePoolName;
			}

			public List<ResourcePoolSeriesItem> getResourcePoolSeries() {
				return this.resourcePoolSeries;
			}

			public void setResourcePoolSeries(List<ResourcePoolSeriesItem> resourcePoolSeries) {
				this.resourcePoolSeries = resourcePoolSeries;
			}

			public static class ResourcePoolSeriesItem {

				private String name;

				private List<String> values;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public List<String> getValues() {
					return this.values;
				}

				public void setValues(List<String> values) {
					this.values = values;
				}
			}
		}
	}

	@Override
	public DescribeDBClusterResourcePoolPerformanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterResourcePoolPerformanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
