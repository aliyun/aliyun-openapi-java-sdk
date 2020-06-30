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
import com.aliyuncs.airec.transform.v20181012.ListDashboardDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDashboardDetailsResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String traceId;

		private String sceneId;

		private MetricRes metricRes;

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

		public MetricRes getMetricRes() {
			return this.metricRes;
		}

		public void setMetricRes(MetricRes metricRes) {
			this.metricRes = metricRes;
		}

		public static class MetricRes {

			private Map<Object,Object> total;

			private Map<Object,Object> detail;

			public Map<Object,Object> getTotal() {
				return this.total;
			}

			public void setTotal(Map<Object,Object> total) {
				this.total = total;
			}

			public Map<Object,Object> getDetail() {
				return this.detail;
			}

			public void setDetail(Map<Object,Object> detail) {
				this.detail = detail;
			}
		}
	}

	@Override
	public ListDashboardDetailsResponse getInstance(UnmarshallerContext context) {
		return	ListDashboardDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
