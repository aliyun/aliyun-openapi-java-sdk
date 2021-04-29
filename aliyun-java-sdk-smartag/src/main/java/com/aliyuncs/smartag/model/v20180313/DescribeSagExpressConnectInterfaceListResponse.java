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
import com.aliyuncs.smartag.transform.v20180313.DescribeSagExpressConnectInterfaceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSagExpressConnectInterfaceListResponse extends AcsResponse {

	private String requestId;

	private List<_Interface> interfaces;

	private List<TaskState> taskStates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<_Interface> getInterfaces() {
		return this.interfaces;
	}

	public void setInterfaces(List<_Interface> interfaces) {
		this.interfaces = interfaces;
	}

	public List<TaskState> getTaskStates() {
		return this.taskStates;
	}

	public void setTaskStates(List<TaskState> taskStates) {
		this.taskStates = taskStates;
	}

	public static class _Interface {

		private String iP;

		private String mask;

		private String vlan;

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

		public String getVlan() {
			return this.vlan;
		}

		public void setVlan(String vlan) {
			this.vlan = vlan;
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
	public DescribeSagExpressConnectInterfaceListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSagExpressConnectInterfaceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
