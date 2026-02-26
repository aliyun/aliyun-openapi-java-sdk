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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeDiagnosisSQLInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiagnosisSQLInfoResponse extends AcsResponse {

	private String diagnosisSQLInfo;

	private String requestId;

	private List<StageInfosItem> stageInfos;

	public String getDiagnosisSQLInfo() {
		return this.diagnosisSQLInfo;
	}

	public void setDiagnosisSQLInfo(String diagnosisSQLInfo) {
		this.diagnosisSQLInfo = diagnosisSQLInfo;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StageInfosItem> getStageInfos() {
		return this.stageInfos;
	}

	public void setStageInfos(List<StageInfosItem> stageInfos) {
		this.stageInfos = stageInfos;
	}

	public static class StageInfosItem {

		private Long inputRows;

		private Long inputDataSize;

		private Long outputRows;

		private Long outputDataSize;

		private Long peakMemory;

		private Long operatorCost;

		private String stageId;

		private String state;

		private Double progress;

		public Long getInputRows() {
			return this.inputRows;
		}

		public void setInputRows(Long inputRows) {
			this.inputRows = inputRows;
		}

		public Long getInputDataSize() {
			return this.inputDataSize;
		}

		public void setInputDataSize(Long inputDataSize) {
			this.inputDataSize = inputDataSize;
		}

		public Long getOutputRows() {
			return this.outputRows;
		}

		public void setOutputRows(Long outputRows) {
			this.outputRows = outputRows;
		}

		public Long getOutputDataSize() {
			return this.outputDataSize;
		}

		public void setOutputDataSize(Long outputDataSize) {
			this.outputDataSize = outputDataSize;
		}

		public Long getPeakMemory() {
			return this.peakMemory;
		}

		public void setPeakMemory(Long peakMemory) {
			this.peakMemory = peakMemory;
		}

		public Long getOperatorCost() {
			return this.operatorCost;
		}

		public void setOperatorCost(Long operatorCost) {
			this.operatorCost = operatorCost;
		}

		public String getStageId() {
			return this.stageId;
		}

		public void setStageId(String stageId) {
			this.stageId = stageId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Double getProgress() {
			return this.progress;
		}

		public void setProgress(Double progress) {
			this.progress = progress;
		}
	}

	@Override
	public DescribeDiagnosisSQLInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiagnosisSQLInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
