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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListSuccessInstanceAmountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSuccessInstanceAmountResponse extends AcsResponse {

	private String requestId;

	private InstanceStatusTrend instanceStatusTrend;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public InstanceStatusTrend getInstanceStatusTrend() {
		return this.instanceStatusTrend;
	}

	public void setInstanceStatusTrend(InstanceStatusTrend instanceStatusTrend) {
		this.instanceStatusTrend = instanceStatusTrend;
	}

	public static class InstanceStatusTrend {

		private List<TodayTrendItem> todayTrend;

		private List<YesterdayTrendItem> yesterdayTrend;

		private List<AvgTrendItem> avgTrend;

		public List<TodayTrendItem> getTodayTrend() {
			return this.todayTrend;
		}

		public void setTodayTrend(List<TodayTrendItem> todayTrend) {
			this.todayTrend = todayTrend;
		}

		public List<YesterdayTrendItem> getYesterdayTrend() {
			return this.yesterdayTrend;
		}

		public void setYesterdayTrend(List<YesterdayTrendItem> yesterdayTrend) {
			this.yesterdayTrend = yesterdayTrend;
		}

		public List<AvgTrendItem> getAvgTrend() {
			return this.avgTrend;
		}

		public void setAvgTrend(List<AvgTrendItem> avgTrend) {
			this.avgTrend = avgTrend;
		}

		public static class TodayTrendItem {

			private Integer count;

			private String timePoint;

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public String getTimePoint() {
				return this.timePoint;
			}

			public void setTimePoint(String timePoint) {
				this.timePoint = timePoint;
			}
		}

		public static class YesterdayTrendItem {

			private Integer count;

			private String timePoint;

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public String getTimePoint() {
				return this.timePoint;
			}

			public void setTimePoint(String timePoint) {
				this.timePoint = timePoint;
			}
		}

		public static class AvgTrendItem {

			private Integer count;

			private String timePoint;

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public String getTimePoint() {
				return this.timePoint;
			}

			public void setTimePoint(String timePoint) {
				this.timePoint = timePoint;
			}
		}
	}

	@Override
	public ListSuccessInstanceAmountResponse getInstance(UnmarshallerContext context) {
		return	ListSuccessInstanceAmountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
