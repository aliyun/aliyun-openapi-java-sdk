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

package com.aliyuncs.drds.model.v20171016;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20171016.DescribeDrdsInstanceMonitorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDrdsInstanceMonitorResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<PartialPerformanceData> data;

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

	public List<PartialPerformanceData> getData() {
		return this.data;
	}

	public void setData(List<PartialPerformanceData> data) {
		this.data = data;
	}

	public static class PartialPerformanceData {

		private String key;

		private String unit;

		private List<PerformanceValue> values;

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

		public List<PerformanceValue> getValues() {
			return this.values;
		}

		public void setValues(List<PerformanceValue> values) {
			this.values = values;
		}

		public static class PerformanceValue {

			private Long date;

			private String value;

			public Long getDate() {
				return this.date;
			}

			public void setDate(Long date) {
				this.date = date;
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
	public DescribeDrdsInstanceMonitorResponse getInstance(UnmarshallerContext context) {
		return	DescribeDrdsInstanceMonitorResponseUnmarshaller.unmarshall(this, context);
	}
}
