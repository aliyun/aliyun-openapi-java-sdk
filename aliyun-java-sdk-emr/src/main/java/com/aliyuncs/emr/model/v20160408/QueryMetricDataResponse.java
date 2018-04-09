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
import com.aliyuncs.emr.transform.v20160408.QueryMetricDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMetricDataResponse extends AcsResponse {

	private String requestId;

	private List<CmsDataPoint> datapoints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CmsDataPoint> getDatapoints() {
		return this.datapoints;
	}

	public void setDatapoints(List<CmsDataPoint> datapoints) {
		this.datapoints = datapoints;
	}

	public static class CmsDataPoint {

		private String role;

		private Float maximum;

		private Float minimum;

		private Float average;

		private Long timestamp;

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public Float getMaximum() {
			return this.maximum;
		}

		public void setMaximum(Float maximum) {
			this.maximum = maximum;
		}

		public Float getMinimum() {
			return this.minimum;
		}

		public void setMinimum(Float minimum) {
			this.minimum = minimum;
		}

		public Float getAverage() {
			return this.average;
		}

		public void setAverage(Float average) {
			this.average = average;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}
	}

	@Override
	public QueryMetricDataResponse getInstance(UnmarshallerContext context) {
		return	QueryMetricDataResponseUnmarshaller.unmarshall(this, context);
	}
}
