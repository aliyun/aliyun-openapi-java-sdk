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
import com.aliyuncs.gpdb.transform.v20160503.DescribeModelOperatorUsageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeModelOperatorUsageResponse extends AcsResponse {

	private String requestId;

	private String endTime;

	private String startTime;

	private Integer period;

	private List<KeysItem> keys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public List<KeysItem> getKeys() {
		return this.keys;
	}

	public void setKeys(List<KeysItem> keys) {
		this.keys = keys;
	}

	public static class KeysItem {

		private String unit;

		private String name;

		private List<SeriesItem> series;

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

			private String role;

			private Integer apiKeyId;

			private String name;

			private List<ValuesItem> values;

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public Integer getApiKeyId() {
				return this.apiKeyId;
			}

			public void setApiKeyId(Integer apiKeyId) {
				this.apiKeyId = apiKeyId;
			}

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
	public DescribeModelOperatorUsageResponse getInstance(UnmarshallerContext context) {
		return	DescribeModelOperatorUsageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
