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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.GetNamespaceStatisticsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNamespaceStatisticsDataResponse extends AcsResponse {

	private String requestId;

	private Statistics statistics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Statistics getStatistics() {
		return this.statistics;
	}

	public void setStatistics(Statistics statistics) {
		this.statistics = statistics;
	}

	public static class Statistics {

		private List<SeriesItem> series;

		private List<String> categories;

		public List<SeriesItem> getSeries() {
			return this.series;
		}

		public void setSeries(List<SeriesItem> series) {
			this.series = series;
		}

		public List<String> getCategories() {
			return this.categories;
		}

		public void setCategories(List<String> categories) {
			this.categories = categories;
		}

		public static class SeriesItem {

			private String name;

			private List<String> data;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<String> getData() {
				return this.data;
			}

			public void setData(List<String> data) {
				this.data = data;
			}
		}
	}

	@Override
	public GetNamespaceStatisticsDataResponse getInstance(UnmarshallerContext context) {
		return	GetNamespaceStatisticsDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
