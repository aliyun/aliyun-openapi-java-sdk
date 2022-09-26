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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeDataSharePerformanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataSharePerformanceResponse extends AcsResponse {

	private String endTime;

	private String requestId;

	private String startTime;

	private String dBClusterId;

	private List<PerformanceItem> performanceKeys;

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

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public List<PerformanceItem> getPerformanceKeys() {
		return this.performanceKeys;
	}

	public void setPerformanceKeys(List<PerformanceItem> performanceKeys) {
		this.performanceKeys = performanceKeys;
	}

	public static class PerformanceItem {

		private String name;

		private String unit;

		private List<SeriesItem> series;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUnit() {
			return this.unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public List<SeriesItem> getSeries() {
			return this.series;
		}

		public void setSeries(List<SeriesItem> series) {
			this.series = series;
		}

		public static class SeriesItem {

			private String name;

			private List<ValuesItem> values;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<ValuesItem> getValues() {
				return this.values;
			}

			public void setValues(List<ValuesItem> values) {
				this.values = values;
			}

			public static class ValuesItem {

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
	public DescribeDataSharePerformanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataSharePerformanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
