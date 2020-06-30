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

package com.aliyuncs.airec.model.v20181012;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20181012.ListDashboardDetailsFlowsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDashboardDetailsFlowsResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String metricType;

		private List<MetricDataItem> metricData;

		public String getMetricType() {
			return this.metricType;
		}

		public void setMetricType(String metricType) {
			this.metricType = metricType;
		}

		public List<MetricDataItem> getMetricData() {
			return this.metricData;
		}

		public void setMetricData(List<MetricDataItem> metricData) {
			this.metricData = metricData;
		}

		public static class MetricDataItem {

			private String traceId;

			private String sceneId;

			private Map<Object,Object> metricRes;

			public String getTraceId() {
				return this.traceId;
			}

			public void setTraceId(String traceId) {
				this.traceId = traceId;
			}

			public String getSceneId() {
				return this.sceneId;
			}

			public void setSceneId(String sceneId) {
				this.sceneId = sceneId;
			}

			public Map<Object,Object> getMetricRes() {
				return this.metricRes;
			}

			public void setMetricRes(Map<Object,Object> metricRes) {
				this.metricRes = metricRes;
			}
		}
	}

	@Override
	public ListDashboardDetailsFlowsResponse getInstance(UnmarshallerContext context) {
		return	ListDashboardDetailsFlowsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
