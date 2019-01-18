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

package com.aliyuncs.linkwan.model.v20181230;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.GetOwnedJoinPermissionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOwnedJoinPermissionResponse extends AcsResponse {

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

		private String renterAliyunId;

		private String joinEui;

		private Long freqBandPlanGroupId;

		private String classMode;

		private String authState;

		private Boolean enabled;

		private Long nodesCnt;

		private String dataDispatchDestination;

		private Long rxDailySum;

		private Long rxMonthSum;

		private Long txDailySum;

		private Long txMonthSum;

		private Long createMillis;

		private String nodeGroupId;

		public String getJoinPermissionId() {
			return this.joinPermissionId;
		}

		public void setJoinPermissionId(String joinPermissionId) {
			this.joinPermissionId = joinPermissionId;
		}

		public String getRenterAliyunId() {
			return this.renterAliyunId;
		}

		public void setRenterAliyunId(String renterAliyunId) {
			this.renterAliyunId = renterAliyunId;
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

		public String getAuthState() {
			return this.authState;
		}

		public void setAuthState(String authState) {
			this.authState = authState;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public Long getNodesCnt() {
			return this.nodesCnt;
		}

		public void setNodesCnt(Long nodesCnt) {
			this.nodesCnt = nodesCnt;
		}

		public String getDataDispatchDestination() {
			return this.dataDispatchDestination;
		}

		public void setDataDispatchDestination(String dataDispatchDestination) {
			this.dataDispatchDestination = dataDispatchDestination;
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

		public String getNodeGroupId() {
			return this.nodeGroupId;
		}

		public void setNodeGroupId(String nodeGroupId) {
			this.nodeGroupId = nodeGroupId;
		}
	}

	@Override
	public GetOwnedJoinPermissionResponse getInstance(UnmarshallerContext context) {
		return	GetOwnedJoinPermissionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
