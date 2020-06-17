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
import com.aliyuncs.smartag.transform.v20180313.DescribeSagWifiResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSagWifiResponse extends AcsResponse {

	private String requestId;

	private String isEnable;

	private String ssid;

	private String isBroadcast;

	private String channel;

	private String bandwidth;

	private String isAuth;

	private String authenticationType;

	private String encryptAlgorithm;

	private List<TaskState> taskStates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
	}

	public String getSsid() {
		return this.ssid;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
	}

	public String getIsBroadcast() {
		return this.isBroadcast;
	}

	public void setIsBroadcast(String isBroadcast) {
		this.isBroadcast = isBroadcast;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getIsAuth() {
		return this.isAuth;
	}

	public void setIsAuth(String isAuth) {
		this.isAuth = isAuth;
	}

	public String getAuthenticationType() {
		return this.authenticationType;
	}

	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}

	public String getEncryptAlgorithm() {
		return this.encryptAlgorithm;
	}

	public void setEncryptAlgorithm(String encryptAlgorithm) {
		this.encryptAlgorithm = encryptAlgorithm;
	}

	public List<TaskState> getTaskStates() {
		return this.taskStates;
	}

	public void setTaskStates(List<TaskState> taskStates) {
		this.taskStates = taskStates;
	}

	public static class TaskState {

		private String state;

		private String errorCode;

		private String errorMessage;

		private String createTime;

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
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

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public DescribeSagWifiResponse getInstance(UnmarshallerContext context) {
		return	DescribeSagWifiResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
