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
import com.aliyuncs.adb.transform.v20190315.DescribePatternPerformanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePatternPerformanceResponse extends AcsResponse {

	private String endTime;

	private String requestId;

	private String startTime;

	private String accessIp;

	private Long failedCount;

	private Long queryCount;

	private String sQLPattern;

	private String tables;

	private String user;

	private List<PerformanceItem> performances;

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

	public String getAccessIp() {
		return this.accessIp;
	}

	public void setAccessIp(String accessIp) {
		this.accessIp = accessIp;
	}

	public Long getFailedCount() {
		return this.failedCount;
	}

	public void setFailedCount(Long failedCount) {
		this.failedCount = failedCount;
	}

	public Long getQueryCount() {
		return this.queryCount;
	}

	public void setQueryCount(Long queryCount) {
		this.queryCount = queryCount;
	}

	public String getSQLPattern() {
		return this.sQLPattern;
	}

	public void setSQLPattern(String sQLPattern) {
		this.sQLPattern = sQLPattern;
	}

	public String getTables() {
		return this.tables;
	}

	public void setTables(String tables) {
		this.tables = tables;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
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

		public List<SeriesItem> getSeries() {
			return this.series;
		}

		public void setSeries(List<SeriesItem> series) {
			this.series = series;
		}

		public static class SeriesItem {

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

	@Override
	public DescribePatternPerformanceResponse getInstance(UnmarshallerContext context) {
		return	DescribePatternPerformanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
