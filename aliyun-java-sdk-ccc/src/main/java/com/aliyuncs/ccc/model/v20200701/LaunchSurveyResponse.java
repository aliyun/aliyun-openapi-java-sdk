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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.LaunchSurveyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class LaunchSurveyResponse extends AcsResponse {

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

		private CallContext callContext;

		private UserContext userContext;

		public CallContext getCallContext() {
			return this.callContext;
		}

		public void setCallContext(CallContext callContext) {
			this.callContext = callContext;
		}

		public UserContext getUserContext() {
			return this.userContext;
		}

		public void setUserContext(UserContext userContext) {
			this.userContext = userContext;
		}

		public static class CallContext {

			private String callType;

			private String instanceId;

			private String jobId;

			private List<ChannelContext> channelContexts;

			public String getCallType() {
				return this.callType;
			}

			public void setCallType(String callType) {
				this.callType = callType;
			}

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

			public List<ChannelContext> getChannelContexts() {
				return this.channelContexts;
			}

			public void setChannelContexts(List<ChannelContext> channelContexts) {
				this.channelContexts = channelContexts;
			}

			public static class ChannelContext {

				private Map<Object,Object> associatedData;

				private String callType;

				private String channelFlags;

				private String channelId;

				private String channelState;

				private String destination;

				private Integer index;

				private String jobId;

				private String originator;

				private String releaseInitiator;

				private String releaseReason;

				private String skillGroupId;

				private Long timestamp;

				private String userExtension;

				private String userId;

				public Map<Object,Object> getAssociatedData() {
					return this.associatedData;
				}

				public void setAssociatedData(Map<Object,Object> associatedData) {
					this.associatedData = associatedData;
				}

				public String getCallType() {
					return this.callType;
				}

				public void setCallType(String callType) {
					this.callType = callType;
				}

				public String getChannelFlags() {
					return this.channelFlags;
				}

				public void setChannelFlags(String channelFlags) {
					this.channelFlags = channelFlags;
				}

				public String getChannelId() {
					return this.channelId;
				}

				public void setChannelId(String channelId) {
					this.channelId = channelId;
				}

				public String getChannelState() {
					return this.channelState;
				}

				public void setChannelState(String channelState) {
					this.channelState = channelState;
				}

				public String getDestination() {
					return this.destination;
				}

				public void setDestination(String destination) {
					this.destination = destination;
				}

				public Integer getIndex() {
					return this.index;
				}

				public void setIndex(Integer index) {
					this.index = index;
				}

				public String getJobId() {
					return this.jobId;
				}

				public void setJobId(String jobId) {
					this.jobId = jobId;
				}

				public String getOriginator() {
					return this.originator;
				}

				public void setOriginator(String originator) {
					this.originator = originator;
				}

				public String getReleaseInitiator() {
					return this.releaseInitiator;
				}

				public void setReleaseInitiator(String releaseInitiator) {
					this.releaseInitiator = releaseInitiator;
				}

				public String getReleaseReason() {
					return this.releaseReason;
				}

				public void setReleaseReason(String releaseReason) {
					this.releaseReason = releaseReason;
				}

				public String getSkillGroupId() {
					return this.skillGroupId;
				}

				public void setSkillGroupId(String skillGroupId) {
					this.skillGroupId = skillGroupId;
				}

				public Long getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(Long timestamp) {
					this.timestamp = timestamp;
				}

				public String getUserExtension() {
					return this.userExtension;
				}

				public void setUserExtension(String userExtension) {
					this.userExtension = userExtension;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}
			}
		}

		public static class UserContext {

			private String breakCode;

			private String deviceId;

			private String extension;

			private Long heartbeat;

			private String instanceId;

			private String jobId;

			private String mobile;

			private Boolean outboundScenario;

			private Long reserved;

			private String userId;

			private String userState;

			private String workMode;

			private List<String> signedSkillGroupIdList;

			public String getBreakCode() {
				return this.breakCode;
			}

			public void setBreakCode(String breakCode) {
				this.breakCode = breakCode;
			}

			public String getDeviceId() {
				return this.deviceId;
			}

			public void setDeviceId(String deviceId) {
				this.deviceId = deviceId;
			}

			public String getExtension() {
				return this.extension;
			}

			public void setExtension(String extension) {
				this.extension = extension;
			}

			public Long getHeartbeat() {
				return this.heartbeat;
			}

			public void setHeartbeat(Long heartbeat) {
				this.heartbeat = heartbeat;
			}

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

			public String getMobile() {
				return this.mobile;
			}

			public void setMobile(String mobile) {
				this.mobile = mobile;
			}

			public Boolean getOutboundScenario() {
				return this.outboundScenario;
			}

			public void setOutboundScenario(Boolean outboundScenario) {
				this.outboundScenario = outboundScenario;
			}

			public Long getReserved() {
				return this.reserved;
			}

			public void setReserved(Long reserved) {
				this.reserved = reserved;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getUserState() {
				return this.userState;
			}

			public void setUserState(String userState) {
				this.userState = userState;
			}

			public String getWorkMode() {
				return this.workMode;
			}

			public void setWorkMode(String workMode) {
				this.workMode = workMode;
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
	public LaunchSurveyResponse getInstance(UnmarshallerContext context) {
		return	LaunchSurveyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
