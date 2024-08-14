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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ClaimChatResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ClaimChatResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private List<String> params;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getParams() {
		return this.params;
	}

	public void setParams(List<String> params) {
		this.params = params;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long contextId;

		private List<ChatContext> chatContexts;

		private UserContext userContext;

		public Long getContextId() {
			return this.contextId;
		}

		public void setContextId(Long contextId) {
			this.contextId = contextId;
		}

		public List<ChatContext> getChatContexts() {
			return this.chatContexts;
		}

		public void setChatContexts(List<ChatContext> chatContexts) {
			this.chatContexts = chatContexts;
		}

		public UserContext getUserContext() {
			return this.userContext;
		}

		public void setUserContext(UserContext userContext) {
			this.userContext = userContext;
		}

		public static class ChatContext {

			private String instanceId;

			private String jobId;

			private String chatType;

			private String callVariables;

			private String accessChannelId;

			private String accessChannelType;

			private String accessChannelName;

			private Boolean beingAssigned;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getChatType() {
				return this.chatType;
			}

			public void setChatType(String chatType) {
				this.chatType = chatType;
			}

			public String getCallVariables() {
				return this.callVariables;
			}

			public void setCallVariables(String callVariables) {
				this.callVariables = callVariables;
			}

			public String getAccessChannelId() {
				return this.accessChannelId;
			}

			public void setAccessChannelId(String accessChannelId) {
				this.accessChannelId = accessChannelId;
			}

			public String getAccessChannelType() {
				return this.accessChannelType;
			}

			public void setAccessChannelType(String accessChannelType) {
				this.accessChannelType = accessChannelType;
			}

			public String getAccessChannelName() {
				return this.accessChannelName;
			}

			public void setAccessChannelName(String accessChannelName) {
				this.accessChannelName = accessChannelName;
			}

			public Boolean getBeingAssigned() {
				return this.beingAssigned;
			}

			public void setBeingAssigned(Boolean beingAssigned) {
				this.beingAssigned = beingAssigned;
			}
		}

		public static class UserContext {

			private Long heartbeat;

			private String extension;

			private String workMode;

			private String deviceId;

			private String userId;

			private Long reserved;

			private String breakCode;

			private String instanceId;

			private Boolean outboundScenario;

			private String deviceState;

			private String mobile;

			private String jobId;

			private String userState;

			private List<String> signedSkillGroupIdList;

			public Long getHeartbeat() {
				return this.heartbeat;
			}

			public void setHeartbeat(Long heartbeat) {
				this.heartbeat = heartbeat;
			}

			public String getExtension() {
				return this.extension;
			}

			public void setExtension(String extension) {
				this.extension = extension;
			}

			public String getWorkMode() {
				return this.workMode;
			}

			public void setWorkMode(String workMode) {
				this.workMode = workMode;
			}

			public String getDeviceId() {
				return this.deviceId;
			}

			public void setDeviceId(String deviceId) {
				this.deviceId = deviceId;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public Long getReserved() {
				return this.reserved;
			}

			public void setReserved(Long reserved) {
				this.reserved = reserved;
			}

			public String getBreakCode() {
				return this.breakCode;
			}

			public void setBreakCode(String breakCode) {
				this.breakCode = breakCode;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Boolean getOutboundScenario() {
				return this.outboundScenario;
			}

			public void setOutboundScenario(Boolean outboundScenario) {
				this.outboundScenario = outboundScenario;
			}

			public String getDeviceState() {
				return this.deviceState;
			}

			public void setDeviceState(String deviceState) {
				this.deviceState = deviceState;
			}

			public String getMobile() {
				return this.mobile;
			}

			public void setMobile(String mobile) {
				this.mobile = mobile;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getUserState() {
				return this.userState;
			}

			public void setUserState(String userState) {
				this.userState = userState;
			}

			public List<String> getSignedSkillGroupIdList() {
				return this.signedSkillGroupIdList;
			}

			public void setSignedSkillGroupIdList(List<String> signedSkillGroupIdList) {
				this.signedSkillGroupIdList = signedSkillGroupIdList;
			}
		}
	}

	@Override
	public ClaimChatResponse getInstance(UnmarshallerContext context) {
		return	ClaimChatResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
