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
import com.aliyuncs.emr.transform.v20160408.GetClusterStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClusterStatusResponse extends AcsResponse {

	private String requestId;

	private List<Status> statusList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Status> getStatusList() {
		return this.statusList;
	}

	public void setStatusList(List<Status> statusList) {
		this.statusList = statusList;
	}

	public static class Status {

		private String name;

		private String legend;

		private String unit;

		private List<SeriesInfo> series;

		private List<String> lineNames;

		private List<String> times;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLegend() {
			return this.legend;
		}

		public void setLegend(String legend) {
			this.legend = legend;
		}

		public String getUnit() {
			return this.unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public List<SeriesInfo> getSeries() {
			return this.series;
		}

		public void setSeries(List<SeriesInfo> series) {
			this.series = series;
		}

		public List<String> getLineNames() {
			return this.lineNames;
		}

		public void setLineNames(List<String> lineNames) {
			this.lineNames = lineNames;
		}

		public List<String> getTimes() {
			return this.times;
		}

		public void setTimes(List<String> times) {
			this.times = times;
		}

		public static class SeriesInfo {

			private List<SeriesItem> seriesItems;

			public List<SeriesItem> getSeriesItems() {
				return this.seriesItems;
			}

			public void setSeriesItems(List<SeriesItem> seriesItems) {
				this.seriesItems = seriesItems;
			}

			public static class SeriesItem {

				private Float seriesValue;

				public Float getSeriesValue() {
					return this.seriesValue;
				}

				public void setSeriesValue(Float seriesValue) {
					this.seriesValue = seriesValue;
				}
			}
		}
	}

	@Override
	public GetClusterStatusResponse getInstance(UnmarshallerContext context) {
		return	GetClusterStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
