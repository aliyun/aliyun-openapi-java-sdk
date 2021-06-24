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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsBatchCheckMachineHealthResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsBatchCheckMachineHealthResponse extends AcsResponse {

	private String status;

	private Boolean finished;

	private String checkTime;

	private String requestId;

	private String token;

	private List<MachineHealthInfo> machineHealthInfos;

	private List<String> machineIds;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getFinished() {
		return this.finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}

	public String getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<MachineHealthInfo> getMachineHealthInfos() {
		return this.machineHealthInfos;
	}

	public void setMachineHealthInfos(List<MachineHealthInfo> machineHealthInfos) {
		this.machineHealthInfos = machineHealthInfos;
	}

	public List<String> getMachineIds() {
		return this.machineIds;
	}

	public void setMachineIds(List<String> machineIds) {
		this.machineIds = machineIds;
	}

	public static class MachineHealthInfo {

		private String machineId;

		private List<HealthInfo> healthInfos;

		public String getMachineId() {
			return this.machineId;
		}

		public void setMachineId(String machineId) {
			this.machineId = machineId;
		}

		public List<HealthInfo> getHealthInfos() {
			return this.healthInfos;
		}

		public void setHealthInfos(List<HealthInfo> healthInfos) {
			this.healthInfos = healthInfos;
		}

		public static class HealthInfo {

			private String detailInfo;

			private String checkItem;

			private String machineId;

			private List<ResultInfo> resultInfos;

			public String getDetailInfo() {
				return this.detailInfo;
			}

			public void setDetailInfo(String detailInfo) {
				this.detailInfo = detailInfo;
			}

			public String getCheckItem() {
				return this.checkItem;
			}

			public void setCheckItem(String checkItem) {
				this.checkItem = checkItem;
			}

			public String getMachineId() {
				return this.machineId;
			}

			public void setMachineId(String machineId) {
				this.machineId = machineId;
			}

			public List<ResultInfo> getResultInfos() {
				return this.resultInfos;
			}

			public void setResultInfos(List<ResultInfo> resultInfos) {
				this.resultInfos = resultInfos;
			}

			public static class ResultInfo {

				private String resultValue;

				private String resultKey;

				private String resultMsg;

				public String getResultValue() {
					return this.resultValue;
				}

				public void setResultValue(String resultValue) {
					this.resultValue = resultValue;
				}

				public String getResultKey() {
					return this.resultKey;
				}

				public void setResultKey(String resultKey) {
					this.resultKey = resultKey;
				}

				public String getResultMsg() {
					return this.resultMsg;
				}

				public void setResultMsg(String resultMsg) {
					this.resultMsg = resultMsg;
				}
			}
		}
	}

	@Override
	public OpsBatchCheckMachineHealthResponse getInstance(UnmarshallerContext context) {
		return	OpsBatchCheckMachineHealthResponseUnmarshaller.unmarshall(this, context);
	}
}
