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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeCommandsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeCommandsResponse extends AcsResponse {

	private String requestId;

	private List<CommandSet> commandSets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CommandSet> getCommandSets() {
		return this.commandSets;
	}

	public void setCommandSets(List<CommandSet> commandSets) {
		this.commandSets = commandSets;
	}

	public static class CommandSet {

		private String commandResult;

		private Integer retryTimes;

		private String commandDetail;

		private Long aliUid;

		private String instanceId;

		private String commandStatus;

		private Long orderId;

		private String commandType;

		private Long id;

		public String getCommandResult() {
			return this.commandResult;
		}

		public void setCommandResult(String commandResult) {
			this.commandResult = commandResult;
		}

		public Integer getRetryTimes() {
			return this.retryTimes;
		}

		public void setRetryTimes(Integer retryTimes) {
			this.retryTimes = retryTimes;
		}

		public String getCommandDetail() {
			return this.commandDetail;
		}

		public void setCommandDetail(String commandDetail) {
			this.commandDetail = commandDetail;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getCommandStatus() {
			return this.commandStatus;
		}

		public void setCommandStatus(String commandStatus) {
			this.commandStatus = commandStatus;
		}

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public String getCommandType() {
			return this.commandType;
		}

		public void setCommandType(String commandType) {
			this.commandType = commandType;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public OpsDescribeCommandsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeCommandsResponseUnmarshaller.unmarshall(this, context);
	}
}
