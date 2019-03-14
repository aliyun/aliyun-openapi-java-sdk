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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.QuerySlsMetricDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySlsMetricDataResponse extends AcsResponse {

	private String requestId;

	private List<SlsDataPoint> datapoints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SlsDataPoint> getDatapoints() {
		return this.datapoints;
	}

	public void setDatapoints(List<SlsDataPoint> datapoints) {
		this.datapoints = datapoints;
	}

	public static class SlsDataPoint {

		private String role;

		private String value;

		private Long timestamp;

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}
	}

	@Override
	public QuerySlsMetricDataResponse getInstance(UnmarshallerContext context) {
		return	QuerySlsMetricDataResponseUnmarshaller.unmarshall(this, context);
	}
}
