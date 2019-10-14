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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20190301.GetRentedJoinPermissionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRentedJoinPermissionResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String joinPermissionId;

		private String joinEui;

		private Long freqBandPlanGroupId;

		private String classMode;

		private String type;

		private Boolean enabled;

		private Long rxDailySum;

		private Long rxMonthSum;

		private Long txDailySum;

		private Long txMonthSum;

		private Long createMillis;

		private Long nodesCnt;

		private String joinPermissionName;

		private String boundNodeGroupId;

		private String boundNodeGroupName;

		private Long rxDelay;

		private Long dataRate;

		public String getJoinPermissionId() {
			return this.joinPermissionId;
		}

		public void setJoinPermissionId(String joinPermissionId) {
			this.joinPermissionId = joinPermissionId;
		}

		public String getJoinEui() {
			return this.joinEui;
		}

		public void setJoinEui(String joinEui) {
			this.joinEui = joinEui;
		}

		public Long getFreqBandPlanGroupId() {
			return this.freqBandPlanGroupId;
		}

		public void setFreqBandPlanGroupId(Long freqBandPlanGroupId) {
			this.freqBandPlanGroupId = freqBandPlanGroupId;
		}

		public String getClassMode() {
			return this.classMode;
		}

		public void setClassMode(String classMode) {
			this.classMode = classMode;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public Long getRxDailySum() {
			return this.rxDailySum;
		}

		public void setRxDailySum(Long rxDailySum) {
			this.rxDailySum = rxDailySum;
		}

		public Long getRxMonthSum() {
			return this.rxMonthSum;
		}

		public void setRxMonthSum(Long rxMonthSum) {
			this.rxMonthSum = rxMonthSum;
		}

		public Long getTxDailySum() {
			return this.txDailySum;
		}

		public void setTxDailySum(Long txDailySum) {
			this.txDailySum = txDailySum;
		}

		public Long getTxMonthSum() {
			return this.txMonthSum;
		}

		public void setTxMonthSum(Long txMonthSum) {
			this.txMonthSum = txMonthSum;
		}

		public Long getCreateMillis() {
			return this.createMillis;
		}

		public void setCreateMillis(Long createMillis) {
			this.createMillis = createMillis;
		}

		public Long getNodesCnt() {
			return this.nodesCnt;
		}

		public void setNodesCnt(Long nodesCnt) {
			this.nodesCnt = nodesCnt;
		}

		public String getJoinPermissionName() {
			return this.joinPermissionName;
		}

		public void setJoinPermissionName(String joinPermissionName) {
			this.joinPermissionName = joinPermissionName;
		}

		public String getBoundNodeGroupId() {
			return this.boundNodeGroupId;
		}

		public void setBoundNodeGroupId(String boundNodeGroupId) {
			this.boundNodeGroupId = boundNodeGroupId;
		}

		public String getBoundNodeGroupName() {
			return this.boundNodeGroupName;
		}

		public void setBoundNodeGroupName(String boundNodeGroupName) {
			this.boundNodeGroupName = boundNodeGroupName;
		}

		public Long getRxDelay() {
			return this.rxDelay;
		}

		public void setRxDelay(Long rxDelay) {
			this.rxDelay = rxDelay;
		}

		public Long getDataRate() {
			return this.dataRate;
		}

		public void setDataRate(Long dataRate) {
			this.dataRate = dataRate;
		}
	}

	@Override
	public GetRentedJoinPermissionResponse getInstance(UnmarshallerContext context) {
		return	GetRentedJoinPermissionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
