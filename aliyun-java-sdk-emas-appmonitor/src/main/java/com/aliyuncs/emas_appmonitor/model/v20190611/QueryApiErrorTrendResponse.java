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

package com.aliyuncs.emas_appmonitor.model.v20190611;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emas_appmonitor.transform.v20190611.QueryApiErrorTrendResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryApiErrorTrendResponse extends AcsResponse {

	private String requestId;

	private List<MetricResultItem> metricResultList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MetricResultItem> getMetricResultList() {
		return this.metricResultList;
	}

	public void setMetricResultList(List<MetricResultItem> metricResultList) {
		this.metricResultList = metricResultList;
	}

	public static class MetricResultItem {

		private Map<Object,Object> tags;

		private List<Point> data;

		public Map<Object,Object> getTags() {
			return this.tags;
		}

		public void setTags(Map<Object,Object> tags) {
			this.tags = tags;
		}

		public List<Point> getData() {
			return this.data;
		}

		public void setData(List<Point> data) {
			this.data = data;
		}

		public static class Point {

			private Long time;

			private ErrorInfo errorInfo;

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}

			public ErrorInfo getErrorInfo() {
				return this.errorInfo;
			}

			public void setErrorInfo(ErrorInfo errorInfo) {
				this.errorInfo = errorInfo;
			}

			public static class ErrorInfo {

				private Long errorCount;

				private Float errorRatio;

				public Long getErrorCount() {
					return this.errorCount;
				}

				public void setErrorCount(Long errorCount) {
					this.errorCount = errorCount;
				}

				public Float getErrorRatio() {
					return this.errorRatio;
				}

				public void setErrorRatio(Float errorRatio) {
					this.errorRatio = errorRatio;
				}
			}
		}
	}

	@Override
	public QueryApiErrorTrendResponse getInstance(UnmarshallerContext context) {
		return	QueryApiErrorTrendResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
