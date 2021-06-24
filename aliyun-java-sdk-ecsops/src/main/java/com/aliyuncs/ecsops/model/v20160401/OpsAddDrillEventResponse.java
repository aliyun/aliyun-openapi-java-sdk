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
import com.aliyuncs.ecsops.transform.v20160401.OpsAddDrillEventResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsAddDrillEventResponse extends AcsResponse {

	private String requestId;

	private List<DrillEvent> drillEvents;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DrillEvent> getDrillEvents() {
		return this.drillEvents;
	}

	public void setDrillEvents(List<DrillEvent> drillEvents) {
		this.drillEvents = drillEvents;
	}

	public static class DrillEvent {

		private String endTime;

		private String startTime;

		private String drillReason;

		private String drillExecResult;

		private String clusterName;

		private String drillExecTime;

		private String machineId;

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getDrillReason() {
			return this.drillReason;
		}

		public void setDrillReason(String drillReason) {
			this.drillReason = drillReason;
		}

		public String getDrillExecResult() {
			return this.drillExecResult;
		}

		public void setDrillExecResult(String drillExecResult) {
			this.drillExecResult = drillExecResult;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getDrillExecTime() {
			return this.drillExecTime;
		}

		public void setDrillExecTime(String drillExecTime) {
			this.drillExecTime = drillExecTime;
		}

		public String getMachineId() {
			return this.machineId;
		}

		public void setMachineId(String machineId) {
			this.machineId = machineId;
		}
	}

	@Override
	public OpsAddDrillEventResponse getInstance(UnmarshallerContext context) {
		return	OpsAddDrillEventResponseUnmarshaller.unmarshall(this, context);
	}
}
