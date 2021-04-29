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
import com.aliyuncs.smartag.transform.v20180313.DescribeSagLanListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSagLanListResponse extends AcsResponse {

	private String requestId;

	private List<TaskState> taskStates;

	private List<Lan> lans;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TaskState> getTaskStates() {
		return this.taskStates;
	}

	public void setTaskStates(List<TaskState> taskStates) {
		this.taskStates = taskStates;
	}

	public List<Lan> getLans() {
		return this.lans;
	}

	public void setLans(List<Lan> lans) {
		this.lans = lans;
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

	public static class Lan {

		private String iPType;

		private String lease;

		private String iP;

		private String mask;

		private String startIp;

		private String portName;

		private String endIp;

		public String getIPType() {
			return this.iPType;
		}

		public void setIPType(String iPType) {
			this.iPType = iPType;
		}

		public String getLease() {
			return this.lease;
		}

		public void setLease(String lease) {
			this.lease = lease;
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

		public String getPortName() {
			return this.portName;
		}

		public void setPortName(String portName) {
			this.portName = portName;
		}

		public String getEndIp() {
			return this.endIp;
		}

		public void setEndIp(String endIp) {
			this.endIp = endIp;
		}
	}

	@Override
	public DescribeSagLanListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSagLanListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
