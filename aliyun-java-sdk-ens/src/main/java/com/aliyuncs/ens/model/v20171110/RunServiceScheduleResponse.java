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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.RunServiceScheduleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RunServiceScheduleResponse extends AcsResponse {

	private String requestRepeated;

	private Boolean tcpPorts;

	private String requestId;

	private String instanceId;

	private Integer instancePort;

	private String instanceIp;

	private Integer index;

	private List<CommandResult> commandResults;

	public String getRequestRepeated() {
		return this.requestRepeated;
	}

	public void setRequestRepeated(String requestRepeated) {
		this.requestRepeated = requestRepeated;
	}

	public Boolean getTcpPorts() {
		return this.tcpPorts;
	}

	public void setTcpPorts(Boolean tcpPorts) {
		this.tcpPorts = tcpPorts;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Integer getInstancePort() {
		return this.instancePort;
	}

	public void setInstancePort(Integer instancePort) {
		this.instancePort = instancePort;
	}

	public String getInstanceIp() {
		return this.instanceIp;
	}

	public void setInstanceIp(String instanceIp) {
		this.instanceIp = instanceIp;
	}

	public Integer getIndex() {
		return this.index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public List<CommandResult> getCommandResults() {
		return this.commandResults;
	}

	public void setCommandResults(List<CommandResult> commandResults) {
		this.commandResults = commandResults;
	}

	public static class CommandResult {

		private String containerName;

		private String command;

		private String resultMsg;

		public String getContainerName() {
			return this.containerName;
		}

		public void setContainerName(String containerName) {
			this.containerName = containerName;
		}

		public String getCommand() {
			return this.command;
		}

		public void setCommand(String command) {
			this.command = command;
		}

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}
	}

	@Override
	public RunServiceScheduleResponse getInstance(UnmarshallerContext context) {
		return	RunServiceScheduleResponseUnmarshaller.unmarshall(this, context);
	}
}
