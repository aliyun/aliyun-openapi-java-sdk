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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeContainerStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeContainerStatisticsResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalAlarmCount;

		private Integer remindAlarmCount;

		private Integer suspiciousAlarmCount;

		private Integer seriousAlarmCount;

		private Integer totalNode;

		private Integer hasRiskNode;

		public Integer getTotalAlarmCount() {
			return this.totalAlarmCount;
		}

		public void setTotalAlarmCount(Integer totalAlarmCount) {
			this.totalAlarmCount = totalAlarmCount;
		}

		public Integer getRemindAlarmCount() {
			return this.remindAlarmCount;
		}

		public void setRemindAlarmCount(Integer remindAlarmCount) {
			this.remindAlarmCount = remindAlarmCount;
		}

		public Integer getSuspiciousAlarmCount() {
			return this.suspiciousAlarmCount;
		}

		public void setSuspiciousAlarmCount(Integer suspiciousAlarmCount) {
			this.suspiciousAlarmCount = suspiciousAlarmCount;
		}

		public Integer getSeriousAlarmCount() {
			return this.seriousAlarmCount;
		}

		public void setSeriousAlarmCount(Integer seriousAlarmCount) {
			this.seriousAlarmCount = seriousAlarmCount;
		}

		public Integer getTotalNode() {
			return this.totalNode;
		}

		public void setTotalNode(Integer totalNode) {
			this.totalNode = totalNode;
		}

		public Integer getHasRiskNode() {
			return this.hasRiskNode;
		}

		public void setHasRiskNode(Integer hasRiskNode) {
			this.hasRiskNode = hasRiskNode;
		}
	}

	@Override
	public DescribeContainerStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeContainerStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
