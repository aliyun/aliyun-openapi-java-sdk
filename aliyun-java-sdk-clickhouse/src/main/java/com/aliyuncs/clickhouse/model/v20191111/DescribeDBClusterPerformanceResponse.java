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

package com.aliyuncs.clickhouse.model.v20191111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.clickhouse.transform.v20191111.DescribeDBClusterPerformanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterPerformanceResponse extends AcsResponse {

	private String dBClusterId;

	private String endTime;

	private String requestId;

	private String startTime;

	private List<PerformanceItem> performances;

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
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

		private String name;

		private List<SeriesItem> series;

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

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<SeriesItem> getSeries() {
			return this.series;
		}

		public void setSeries(List<SeriesItem> series) {
			this.series = series;
		}

		public static class SeriesItem {

			private String name;

			private List<ValueItem> values;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<ValueItem> getValues() {
				return this.values;
			}

			public void setValues(List<ValueItem> values) {
				this.values = values;
			}

			public static class ValueItem {

				private List<String> point;

				public List<String> getPoint() {
					return this.point;
				}

				public void setPoint(List<String> point) {
					this.point = point;
				}
			}
		}
	}

	@Override
	public DescribeDBClusterPerformanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterPerformanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
