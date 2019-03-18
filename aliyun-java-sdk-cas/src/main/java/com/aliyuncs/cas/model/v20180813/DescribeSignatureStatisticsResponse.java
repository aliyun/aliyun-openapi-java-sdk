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

package com.aliyuncs.cas.model.v20180813;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20180813.DescribeSignatureStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSignatureStatisticsResponse extends AcsResponse {

	private String requestId;

	private Integer unSignCount;

	private Integer signCount;

	private Integer failCount;

	private List<DayData> dayDataList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getUnSignCount() {
		return this.unSignCount;
	}

	public void setUnSignCount(Integer unSignCount) {
		this.unSignCount = unSignCount;
	}

	public Integer getSignCount() {
		return this.signCount;
	}

	public void setSignCount(Integer signCount) {
		this.signCount = signCount;
	}

	public Integer getFailCount() {
		return this.failCount;
	}

	public void setFailCount(Integer failCount) {
		this.failCount = failCount;
	}

	public List<DayData> getDayDataList() {
		return this.dayDataList;
	}

	public void setDayDataList(List<DayData> dayDataList) {
		this.dayDataList = dayDataList;
	}

	public static class DayData {

		private String date;

		private Integer unSignCount;

		private Integer signCount;

		private Integer failCount;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public Integer getUnSignCount() {
			return this.unSignCount;
		}

		public void setUnSignCount(Integer unSignCount) {
			this.unSignCount = unSignCount;
		}

		public Integer getSignCount() {
			return this.signCount;
		}

		public void setSignCount(Integer signCount) {
			this.signCount = signCount;
		}

		public Integer getFailCount() {
			return this.failCount;
		}

		public void setFailCount(Integer failCount) {
			this.failCount = failCount;
		}
	}

	@Override
	public DescribeSignatureStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSignatureStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
