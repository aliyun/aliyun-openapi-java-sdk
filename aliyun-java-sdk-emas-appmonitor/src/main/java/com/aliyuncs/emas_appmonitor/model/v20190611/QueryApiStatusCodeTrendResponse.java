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
import com.aliyuncs.emas_appmonitor.transform.v20190611.QueryApiStatusCodeTrendResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryApiStatusCodeTrendResponse extends AcsResponse {

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

			private PointData pointData;

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}

			public PointData getPointData() {
				return this.pointData;
			}

			public void setPointData(PointData pointData) {
				this.pointData = pointData;
			}

			public static class PointData {

				private Long status4xxCount;

				private Float status4xxRatio;

				private Long status5xxCount;

				private Float status5xxRatio;

				private Long statusNormalCount;

				private Float statusNormalRatio;

				public Long getStatus4xxCount() {
					return this.status4xxCount;
				}

				public void setStatus4xxCount(Long status4xxCount) {
					this.status4xxCount = status4xxCount;
				}

				public Float getStatus4xxRatio() {
					return this.status4xxRatio;
				}

				public void setStatus4xxRatio(Float status4xxRatio) {
					this.status4xxRatio = status4xxRatio;
				}

				public Long getStatus5xxCount() {
					return this.status5xxCount;
				}

				public void setStatus5xxCount(Long status5xxCount) {
					this.status5xxCount = status5xxCount;
				}

				public Float getStatus5xxRatio() {
					return this.status5xxRatio;
				}

				public void setStatus5xxRatio(Float status5xxRatio) {
					this.status5xxRatio = status5xxRatio;
				}

				public Long getStatusNormalCount() {
					return this.statusNormalCount;
				}

				public void setStatusNormalCount(Long statusNormalCount) {
					this.statusNormalCount = statusNormalCount;
				}

				public Float getStatusNormalRatio() {
					return this.statusNormalRatio;
				}

				public void setStatusNormalRatio(Float statusNormalRatio) {
					this.statusNormalRatio = statusNormalRatio;
				}
			}
		}
	}

	@Override
	public QueryApiStatusCodeTrendResponse getInstance(UnmarshallerContext context) {
		return	QueryApiStatusCodeTrendResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
