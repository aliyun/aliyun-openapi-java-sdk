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
import com.aliyuncs.ccc.transform.v20170705.ListCallEventDetailByContactIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCallEventDetailByContactIdResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String caller;

		private String callee;

		private String callType;

		private String startTime;

		private String privacyNumber;

		private List<CallEventDetail> events;

		public String getCaller() {
			return this.caller;
		}

		public void setCaller(String caller) {
			this.caller = caller;
		}

		public String getCallee() {
			return this.callee;
		}

		public void setCallee(String callee) {
			this.callee = callee;
		}

		public String getCallType() {
			return this.callType;
		}

		public void setCallType(String callType) {
			this.callType = callType;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getPrivacyNumber() {
			return this.privacyNumber;
		}

		public void setPrivacyNumber(String privacyNumber) {
			this.privacyNumber = privacyNumber;
		}

		public List<CallEventDetail> getEvents() {
			return this.events;
		}

		public void setEvents(List<CallEventDetail> events) {
			this.events = events;
		}

		public static class CallEventDetail {

			private String timeStamp;

			private String event;

			private String agentName;

			private String status;

			private String callMode;

			private Integer duration;

			private DetailData detailData;

			public String getTimeStamp() {
				return this.timeStamp;
			}

			public void setTimeStamp(String timeStamp) {
				this.timeStamp = timeStamp;
			}

			public String getEvent() {
				return this.event;
			}

			public void setEvent(String event) {
				this.event = event;
			}

			public String getAgentName() {
				return this.agentName;
			}

			public void setAgentName(String agentName) {
				this.agentName = agentName;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getCallMode() {
				return this.callMode;
			}

			public void setCallMode(String callMode) {
				this.callMode = callMode;
			}

			public Integer getDuration() {
				return this.duration;
			}

			public void setDuration(Integer duration) {
				this.duration = duration;
			}

			public DetailData getDetailData() {
				return this.detailData;
			}

			public void setDetailData(DetailData detailData) {
				this.detailData = detailData;
			}

			public static class DetailData {

				private String eventType;

				private String helper;

				private String satisfactionalResearch;

				private String skillGroup;

				private String hangUper;

				public String getEventType() {
					return this.eventType;
				}

				public void setEventType(String eventType) {
					this.eventType = eventType;
				}

				public String getHelper() {
					return this.helper;
				}

				public void setHelper(String helper) {
					this.helper = helper;
				}

				public String getSatisfactionalResearch() {
					return this.satisfactionalResearch;
				}

				public void setSatisfactionalResearch(String satisfactionalResearch) {
					this.satisfactionalResearch = satisfactionalResearch;
				}

				public String getSkillGroup() {
					return this.skillGroup;
				}

				public void setSkillGroup(String skillGroup) {
					this.skillGroup = skillGroup;
				}

				public String getHangUper() {
					return this.hangUper;
				}

				public void setHangUper(String hangUper) {
					this.hangUper = hangUper;
				}
			}
		}
	}

	@Override
	public ListCallEventDetailByContactIdResponse getInstance(UnmarshallerContext context) {
		return	ListCallEventDetailByContactIdResponseUnmarshaller.unmarshall(this, context);
	}
}
