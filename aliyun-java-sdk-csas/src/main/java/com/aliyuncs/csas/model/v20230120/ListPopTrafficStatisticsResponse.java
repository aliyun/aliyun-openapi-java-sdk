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

package com.aliyuncs.csas.model.v20230120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csas.transform.v20230120.ListPopTrafficStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPopTrafficStatisticsResponse extends AcsResponse {

	private String requestId;

	private List<Data> trafficData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getTrafficData() {
		return this.trafficData;
	}

	public void setTrafficData(List<Data> trafficData) {
		this.trafficData = trafficData;
	}

	public static class Data {

		private String metricName;

		private List<Point> datapoints;

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public List<Point> getDatapoints() {
			return this.datapoints;
		}

		public void setDatapoints(List<Point> datapoints) {
			this.datapoints = datapoints;
		}

		public static class Point {

			private String dateTime;

			private Double average;

			public String getDateTime() {
				return this.dateTime;
			}

			public void setDateTime(String dateTime) {
				this.dateTime = dateTime;
			}

			public Double getAverage() {
				return this.average;
			}

			public void setAverage(Double average) {
				this.average = average;
			}
		}
	}

	@Override
	public ListPopTrafficStatisticsResponse getInstance(UnmarshallerContext context) {
		return	ListPopTrafficStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
