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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryStressComparisionInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryStressComparisionInfoResponse extends AcsResponse {

	private String requestId;

	private String machineId;

	private List<SnNodeInfo> snNodeInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMachineId() {
		return this.machineId;
	}

	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}

	public List<SnNodeInfo> getSnNodeInfoList() {
		return this.snNodeInfoList;
	}

	public void setSnNodeInfoList(List<SnNodeInfo> snNodeInfoList) {
		this.snNodeInfoList = snNodeInfoList;
	}

	public static class SnNodeInfo {

		private String ncId;

		private String cnSn;

		private String stressComparisionState;

		private String stressComparisionResult;

		private String stressComparisionStartTime;

		private Integer stressComparisionTime;

		private String riskTag;

		public String getNcId() {
			return this.ncId;
		}

		public void setNcId(String ncId) {
			this.ncId = ncId;
		}

		public String getCnSn() {
			return this.cnSn;
		}

		public void setCnSn(String cnSn) {
			this.cnSn = cnSn;
		}

		public String getStressComparisionState() {
			return this.stressComparisionState;
		}

		public void setStressComparisionState(String stressComparisionState) {
			this.stressComparisionState = stressComparisionState;
		}

		public String getStressComparisionResult() {
			return this.stressComparisionResult;
		}

		public void setStressComparisionResult(String stressComparisionResult) {
			this.stressComparisionResult = stressComparisionResult;
		}

		public String getStressComparisionStartTime() {
			return this.stressComparisionStartTime;
		}

		public void setStressComparisionStartTime(String stressComparisionStartTime) {
			this.stressComparisionStartTime = stressComparisionStartTime;
		}

		public Integer getStressComparisionTime() {
			return this.stressComparisionTime;
		}

		public void setStressComparisionTime(Integer stressComparisionTime) {
			this.stressComparisionTime = stressComparisionTime;
		}

		public String getRiskTag() {
			return this.riskTag;
		}

		public void setRiskTag(String riskTag) {
			this.riskTag = riskTag;
		}
	}

	@Override
	public OpsQueryStressComparisionInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryStressComparisionInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
