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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.GetAppJVMConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAppJVMConfigResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Boolean success;

	private List<JvmInfoListItem> jvmInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<JvmInfoListItem> getJvmInfoList() {
		return this.jvmInfoList;
	}

	public void setJvmInfoList(List<JvmInfoListItem> jvmInfoList) {
		this.jvmInfoList = jvmInfoList;
	}

	public static class JvmInfoListItem {

		private String pid;

		private String vmArgs;

		private String hostName;

		private String ip;

		private String agentVersion;

		private String procId;

		public String getPid() {
			return this.pid;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}

		public String getVmArgs() {
			return this.vmArgs;
		}

		public void setVmArgs(String vmArgs) {
			this.vmArgs = vmArgs;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getAgentVersion() {
			return this.agentVersion;
		}

		public void setAgentVersion(String agentVersion) {
			this.agentVersion = agentVersion;
		}

		public String getProcId() {
			return this.procId;
		}

		public void setProcId(String procId) {
			this.procId = procId;
		}
	}

	@Override
	public GetAppJVMConfigResponse getInstance(UnmarshallerContext context) {
		return	GetAppJVMConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
