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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeSagWanListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSagWanListResponse extends AcsResponse {

	private String requestId;

	private List<Wan> wans;

	private List<TaskState> taskStates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Wan> getWans() {
		return this.wans;
	}

	public void setWans(List<Wan> wans) {
		this.wans = wans;
	}

	public List<TaskState> getTaskStates() {
		return this.taskStates;
	}

	public void setTaskStates(List<TaskState> taskStates) {
		this.taskStates = taskStates;
	}

	public static class Wan {

		private String iPType;

		private String trafficState;

		private Integer priority;

		private String sourceIps;

		private String iSP;

		private String iP;

		private String mask;

		private String startIp;

		private String vlan;

		private String portName;

		private Integer weight;

		private String stopIp;

		private Integer bandWidth;

		private String username;

		private String gateway;

		public String getIPType() {
			return this.iPType;
		}

		public void setIPType(String iPType) {
			this.iPType = iPType;
		}

		public String getTrafficState() {
			return this.trafficState;
		}

		public void setTrafficState(String trafficState) {
			this.trafficState = trafficState;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getSourceIps() {
			return this.sourceIps;
		}

		public void setSourceIps(String sourceIps) {
			this.sourceIps = sourceIps;
		}

		public String getISP() {
			return this.iSP;
		}

		public void setISP(String iSP) {
			this.iSP = iSP;
		}

		public String getIP() {
			return this.iP;
		}

		public void setIP(String iP) {
			this.iP = iP;
		}

		public String getMask() {
			return this.mask;
		}

		public void setMask(String mask) {
			this.mask = mask;
		}

		public String getStartIp() {
			return this.startIp;
		}

		public void setStartIp(String startIp) {
			this.startIp = startIp;
		}

		public String getVlan() {
			return this.vlan;
		}

		public void setVlan(String vlan) {
			this.vlan = vlan;
		}

		public String getPortName() {
			return this.portName;
		}

		public void setPortName(String portName) {
			this.portName = portName;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getStopIp() {
			return this.stopIp;
		}

		public void setStopIp(String stopIp) {
			this.stopIp = stopIp;
		}

		public Integer getBandWidth() {
			return this.bandWidth;
		}

		public void setBandWidth(Integer bandWidth) {
			this.bandWidth = bandWidth;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getGateway() {
			return this.gateway;
		}

		public void setGateway(String gateway) {
			this.gateway = gateway;
		}
	}

	public static class TaskState {

		private String state;

		private String createTime;

		private String errorCode;

		private String errorMessage;

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
	}

	@Override
	public DescribeSagWanListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSagWanListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
