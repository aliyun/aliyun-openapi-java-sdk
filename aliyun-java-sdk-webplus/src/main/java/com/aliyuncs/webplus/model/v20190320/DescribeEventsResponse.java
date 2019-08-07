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

package com.aliyuncs.webplus.model.v20190320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.DescribeEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEventsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<Event> events;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Event> getEvents() {
		return this.events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public static class Event {

		private String eventId;

		private Long eventTimestamp;

		private String eventMessage;

		private String envId;

		private String appId;

		private String eventLevel;

		private String traceId;

		private String enventName;

		private String msgCode;

		private String primaryUserId;

		private String primaryUserName;

		private String secondUserId;

		private String secondUserName;

		private String objectId;

		private String objectName;

		private String objectType;

		private List<ObjectAttr> objectAttrs;

		private List<String> msgParams;

		public String getEventId() {
			return this.eventId;
		}

		public void setEventId(String eventId) {
			this.eventId = eventId;
		}

		public Long getEventTimestamp() {
			return this.eventTimestamp;
		}

		public void setEventTimestamp(Long eventTimestamp) {
			this.eventTimestamp = eventTimestamp;
		}

		public String getEventMessage() {
			return this.eventMessage;
		}

		public void setEventMessage(String eventMessage) {
			this.eventMessage = eventMessage;
		}

		public String getEnvId() {
			return this.envId;
		}

		public void setEnvId(String envId) {
			this.envId = envId;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getEventLevel() {
			return this.eventLevel;
		}

		public void setEventLevel(String eventLevel) {
			this.eventLevel = eventLevel;
		}

		public String getTraceId() {
			return this.traceId;
		}

		public void setTraceId(String traceId) {
			this.traceId = traceId;
		}

		public String getEnventName() {
			return this.enventName;
		}

		public void setEnventName(String enventName) {
			this.enventName = enventName;
		}

		public String getMsgCode() {
			return this.msgCode;
		}

		public void setMsgCode(String msgCode) {
			this.msgCode = msgCode;
		}

		public String getPrimaryUserId() {
			return this.primaryUserId;
		}

		public void setPrimaryUserId(String primaryUserId) {
			this.primaryUserId = primaryUserId;
		}

		public String getPrimaryUserName() {
			return this.primaryUserName;
		}

		public void setPrimaryUserName(String primaryUserName) {
			this.primaryUserName = primaryUserName;
		}

		public String getSecondUserId() {
			return this.secondUserId;
		}

		public void setSecondUserId(String secondUserId) {
			this.secondUserId = secondUserId;
		}

		public String getSecondUserName() {
			return this.secondUserName;
		}

		public void setSecondUserName(String secondUserName) {
			this.secondUserName = secondUserName;
		}

		public String getObjectId() {
			return this.objectId;
		}

		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}

		public String getObjectName() {
			return this.objectName;
		}

		public void setObjectName(String objectName) {
			this.objectName = objectName;
		}

		public String getObjectType() {
			return this.objectType;
		}

		public void setObjectType(String objectType) {
			this.objectType = objectType;
		}

		public List<ObjectAttr> getObjectAttrs() {
			return this.objectAttrs;
		}

		public void setObjectAttrs(List<ObjectAttr> objectAttrs) {
			this.objectAttrs = objectAttrs;
		}

		public List<String> getMsgParams() {
			return this.msgParams;
		}

		public void setMsgParams(List<String> msgParams) {
			this.msgParams = msgParams;
		}

		public static class ObjectAttr {

			private String attributeName;

			private String attributeValue;

			public String getAttributeName() {
				return this.attributeName;
			}

			public void setAttributeName(String attributeName) {
				this.attributeName = attributeName;
			}

			public String getAttributeValue() {
				return this.attributeValue;
			}

			public void setAttributeValue(String attributeValue) {
				this.attributeValue = attributeValue;
			}
		}
	}

	@Override
	public DescribeEventsResponse getInstance(UnmarshallerContext context) {
		return	DescribeEventsResponseUnmarshaller.unmarshall(this, context);
	}
}
