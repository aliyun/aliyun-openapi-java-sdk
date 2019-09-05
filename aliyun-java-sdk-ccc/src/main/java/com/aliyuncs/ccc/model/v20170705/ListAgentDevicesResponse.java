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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.ListAgentDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAgentDevicesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<AgentDevice> agentDeviceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<AgentDevice> getAgentDeviceList() {
		return this.agentDeviceList;
	}

	public void setAgentDeviceList(List<AgentDevice> agentDeviceList) {
		this.agentDeviceList = agentDeviceList;
	}

	public static class AgentDevice {

		private String instanceId;

		private Long ramId;

		private Long loginTime;

		private String clientIp;

		private String clientPort;

		private String browserVersion;

		private Integer isLogin;

		private String remark;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getRamId() {
			return this.ramId;
		}

		public void setRamId(Long ramId) {
			this.ramId = ramId;
		}

		public Long getLoginTime() {
			return this.loginTime;
		}

		public void setLoginTime(Long loginTime) {
			this.loginTime = loginTime;
		}

		public String getClientIp() {
			return this.clientIp;
		}

		public void setClientIp(String clientIp) {
			this.clientIp = clientIp;
		}

		public String getClientPort() {
			return this.clientPort;
		}

		public void setClientPort(String clientPort) {
			this.clientPort = clientPort;
		}

		public String getBrowserVersion() {
			return this.browserVersion;
		}

		public void setBrowserVersion(String browserVersion) {
			this.browserVersion = browserVersion;
		}

		public Integer getIsLogin() {
			return this.isLogin;
		}

		public void setIsLogin(Integer isLogin) {
			this.isLogin = isLogin;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}
	}

	@Override
	public ListAgentDevicesResponse getInstance(UnmarshallerContext context) {
		return	ListAgentDevicesResponseUnmarshaller.unmarshall(this, context);
	}
}
