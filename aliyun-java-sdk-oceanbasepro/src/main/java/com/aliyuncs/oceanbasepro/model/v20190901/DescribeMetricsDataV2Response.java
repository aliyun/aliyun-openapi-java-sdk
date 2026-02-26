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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeMetricsDataV2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMetricsDataV2Response extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Map<Object,Object> labels;

		private List<DataItem2> data1;

		public Map<Object,Object> getLabels() {
			return this.labels;
		}

		public void setLabels(Map<Object,Object> labels) {
			this.labels = labels;
		}

		public List<DataItem2> getData1() {
			return this.data1;
		}

		public void setData1(List<DataItem2> data1) {
			this.data1 = data1;
		}

		public static class DataItem2 {

			private Map<Object,Object> metricValue;

			private Long timestamp;

			public Map<Object,Object> getMetricValue() {
				return this.metricValue;
			}

			public void setMetricValue(Map<Object,Object> metricValue) {
				this.metricValue = metricValue;
			}

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}
		}
	}

	@Override
	public DescribeMetricsDataV2Response getInstance(UnmarshallerContext context) {
		return	DescribeMetricsDataV2ResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
