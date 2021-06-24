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
import com.aliyuncs.ecsops.transform.v20160401.OpsAddCloudOpsDrillEventResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsAddCloudOpsDrillEventResponse extends AcsResponse {

	private String requestId;

	private String bizMessage;

	private String bizCode;

	private DrillEvent drillEvent;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizMessage() {
		return this.bizMessage;
	}

	public void setBizMessage(String bizMessage) {
		this.bizMessage = bizMessage;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public DrillEvent getDrillEvent() {
		return this.drillEvent;
	}

	public void setDrillEvent(DrillEvent drillEvent) {
		this.drillEvent = drillEvent;
	}

	public static class DrillEvent {

		private String status;

		private String token;

		private String exceptionType;

		private String gmtModified;

		private String extInfo;

		private String regionId;

		private String endTime;

		private String startTime;

		private String gmtCreate;

		private String title;

		private List<String> machineIds;

		private List<String> clusters;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public String getExceptionType() {
			return this.exceptionType;
		}

		public void setExceptionType(String exceptionType) {
			this.exceptionType = exceptionType;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(String extInfo) {
			this.extInfo = extInfo;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

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

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public List<String> getMachineIds() {
			return this.machineIds;
		}

		public void setMachineIds(List<String> machineIds) {
			this.machineIds = machineIds;
		}

		public List<String> getClusters() {
			return this.clusters;
		}

		public void setClusters(List<String> clusters) {
			this.clusters = clusters;
		}
	}

	@Override
	public OpsAddCloudOpsDrillEventResponse getInstance(UnmarshallerContext context) {
		return	OpsAddCloudOpsDrillEventResponseUnmarshaller.unmarshall(this, context);
	}
}
