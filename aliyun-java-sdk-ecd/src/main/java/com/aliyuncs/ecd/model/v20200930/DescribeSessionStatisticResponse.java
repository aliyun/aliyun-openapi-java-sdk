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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeSessionStatisticResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSessionStatisticResponse extends AcsResponse {

	private String totalCount;

	private String requestId;

	private List<StatisticItem> statistic;

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StatisticItem> getStatistic() {
		return this.statistic;
	}

	public void setStatistic(List<StatisticItem> statistic) {
		this.statistic = statistic;
	}

	public static class StatisticItem {

		private Long timePoint;

		private Long count;

		public Long getTimePoint() {
			return this.timePoint;
		}

		public void setTimePoint(Long timePoint) {
			this.timePoint = timePoint;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}
	}

	@Override
	public DescribeSessionStatisticResponse getInstance(UnmarshallerContext context) {
		return	DescribeSessionStatisticResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
