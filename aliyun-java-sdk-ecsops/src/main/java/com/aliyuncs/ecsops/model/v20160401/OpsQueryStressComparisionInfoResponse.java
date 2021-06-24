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

	private String machineId;

	private String requestId;

	private List<SnNodeInfo> snNodeInfoList;

	private List<DimensionInfo> dimensionInfoList;

	public String getMachineId() {
		return this.machineId;
	}

	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SnNodeInfo> getSnNodeInfoList() {
		return this.snNodeInfoList;
	}

	public void setSnNodeInfoList(List<SnNodeInfo> snNodeInfoList) {
		this.snNodeInfoList = snNodeInfoList;
	}

	public List<DimensionInfo> getDimensionInfoList() {
		return this.dimensionInfoList;
	}

	public void setDimensionInfoList(List<DimensionInfo> dimensionInfoList) {
		this.dimensionInfoList = dimensionInfoList;
	}

	public static class SnNodeInfo {

		private String ncId;

		private String stressComparisionResult;

		private String stressComparisionStartTime;

		private String stressComparisionState;

		private String riskTag;

		private Integer stressComparisionTime;

		private String cnSn;

		public String getNcId() {
			return this.ncId;
		}

		public void setNcId(String ncId) {
			this.ncId = ncId;
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

		public String getStressComparisionState() {
			return this.stressComparisionState;
		}

		public void setStressComparisionState(String stressComparisionState) {
			this.stressComparisionState = stressComparisionState;
		}

		public String getRiskTag() {
			return this.riskTag;
		}

		public void setRiskTag(String riskTag) {
			this.riskTag = riskTag;
		}

		public Integer getStressComparisionTime() {
			return this.stressComparisionTime;
		}

		public void setStressComparisionTime(Integer stressComparisionTime) {
			this.stressComparisionTime = stressComparisionTime;
		}

		public String getCnSn() {
			return this.cnSn;
		}

		public void setCnSn(String cnSn) {
			this.cnSn = cnSn;
		}
	}

	public static class DimensionInfo {

		private String dimensionValue;

		private String userInputTargetId;

		private List<String> relatedTargetIds;

		public String getDimensionValue() {
			return this.dimensionValue;
		}

		public void setDimensionValue(String dimensionValue) {
			this.dimensionValue = dimensionValue;
		}

		public String getUserInputTargetId() {
			return this.userInputTargetId;
		}

		public void setUserInputTargetId(String userInputTargetId) {
			this.userInputTargetId = userInputTargetId;
		}

		public List<String> getRelatedTargetIds() {
			return this.relatedTargetIds;
		}

		public void setRelatedTargetIds(List<String> relatedTargetIds) {
			this.relatedTargetIds = relatedTargetIds;
		}
	}

	@Override
	public OpsQueryStressComparisionInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryStressComparisionInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
