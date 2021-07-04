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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailadvqa_public.transform.v20200515.CreateDefaultEventResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateDefaultEventResponse extends AcsResponse {

	private String requestId;

	private String errorDesc;

	private String traceId;

	private String errorCode;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorDesc() {
		return this.errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String eventId;

		private String eventName;

		private String eventCode;

		private String eventSourceId;

		private String eventSourceName;

		private Long eventType;

		private String gmtCreate;

		private String gmtModified;

		private String createId;

		private String modifiedId;

		private String orgnizationId;

		private String workspaceId;

		private List<EventAttributeListItem> eventAttributeList;

		public String getEventId() {
			return this.eventId;
		}

		public void setEventId(String eventId) {
			this.eventId = eventId;
		}

		public String getEventName() {
			return this.eventName;
		}

		public void setEventName(String eventName) {
			this.eventName = eventName;
		}

		public String getEventCode() {
			return this.eventCode;
		}

		public void setEventCode(String eventCode) {
			this.eventCode = eventCode;
		}

		public String getEventSourceId() {
			return this.eventSourceId;
		}

		public void setEventSourceId(String eventSourceId) {
			this.eventSourceId = eventSourceId;
		}

		public String getEventSourceName() {
			return this.eventSourceName;
		}

		public void setEventSourceName(String eventSourceName) {
			this.eventSourceName = eventSourceName;
		}

		public Long getEventType() {
			return this.eventType;
		}

		public void setEventType(Long eventType) {
			this.eventType = eventType;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getCreateId() {
			return this.createId;
		}

		public void setCreateId(String createId) {
			this.createId = createId;
		}

		public String getModifiedId() {
			return this.modifiedId;
		}

		public void setModifiedId(String modifiedId) {
			this.modifiedId = modifiedId;
		}

		public String getOrgnizationId() {
			return this.orgnizationId;
		}

		public void setOrgnizationId(String orgnizationId) {
			this.orgnizationId = orgnizationId;
		}

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}

		public List<EventAttributeListItem> getEventAttributeList() {
			return this.eventAttributeList;
		}

		public void setEventAttributeList(List<EventAttributeListItem> eventAttributeList) {
			this.eventAttributeList = eventAttributeList;
		}

		public static class EventAttributeListItem {

			private String eventId;

			private String eventAttributeName;

			private String eventAttributeCode;

			private Long eventAttributeTypeCode;

			public String getEventId() {
				return this.eventId;
			}

			public void setEventId(String eventId) {
				this.eventId = eventId;
			}

			public String getEventAttributeName() {
				return this.eventAttributeName;
			}

			public void setEventAttributeName(String eventAttributeName) {
				this.eventAttributeName = eventAttributeName;
			}

			public String getEventAttributeCode() {
				return this.eventAttributeCode;
			}

			public void setEventAttributeCode(String eventAttributeCode) {
				this.eventAttributeCode = eventAttributeCode;
			}

			public Long getEventAttributeTypeCode() {
				return this.eventAttributeTypeCode;
			}

			public void setEventAttributeTypeCode(Long eventAttributeTypeCode) {
				this.eventAttributeTypeCode = eventAttributeTypeCode;
			}
		}
	}

	@Override
	public CreateDefaultEventResponse getInstance(UnmarshallerContext context) {
		return	CreateDefaultEventResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
