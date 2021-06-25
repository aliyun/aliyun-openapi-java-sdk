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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.GetSummaryInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSummaryInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<AgentBotInstanceSummary> agentBotInstanceSummaryList;

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

	public List<AgentBotInstanceSummary> getAgentBotInstanceSummaryList() {
		return this.agentBotInstanceSummaryList;
	}

	public void setAgentBotInstanceSummaryList(List<AgentBotInstanceSummary> agentBotInstanceSummaryList) {
		this.agentBotInstanceSummaryList = agentBotInstanceSummaryList;
	}

	public static class AgentBotInstanceSummary {

		private Long totalCallTime;

		private Long totalCallCount;

		private Integer usedRecordingStorageSpace;

		private String instanceId;

		public Long getTotalCallTime() {
			return this.totalCallTime;
		}

		public void setTotalCallTime(Long totalCallTime) {
			this.totalCallTime = totalCallTime;
		}

		public Long getTotalCallCount() {
			return this.totalCallCount;
		}

		public void setTotalCallCount(Long totalCallCount) {
			this.totalCallCount = totalCallCount;
		}

		public Integer getUsedRecordingStorageSpace() {
			return this.usedRecordingStorageSpace;
		}

		public void setUsedRecordingStorageSpace(Integer usedRecordingStorageSpace) {
			this.usedRecordingStorageSpace = usedRecordingStorageSpace;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public GetSummaryInfoResponse getInstance(UnmarshallerContext context) {
		return	GetSummaryInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
