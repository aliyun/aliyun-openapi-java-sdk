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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeSuspEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSuspEventsResponse extends AcsResponse {

	private String requestId;

	private String pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<SuspEvent> suspEvents;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<SuspEvent> getSuspEvents() {
		return this.suspEvents;
	}

	public void setSuspEvents(List<SuspEvent> suspEvents) {
		this.suspEvents = suspEvents;
	}

	public static class SuspEvent {

		private Long id;

		private String desktopId;

		private String desktopName;

		private String lastTime;

		private String occurrenceTime;

		private String uniqueInfo;

		private String name;

		private String eventSubType;

		private String level;

		private Integer eventStatus;

		private String desc;

		private String operateMsg;

		private String dataSource;

		private String operateErrorCode;

		private Boolean canCancelFault;

		private String canBeDealOnLine;

		private String alarmEventType;

		private String alarmEventName;

		private String alarmUniqueInfo;

		private String alarmEventNameDisplay;

		private String alarmEventTypeDisplay;

		private List<Detail> details;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getDesktopName() {
			return this.desktopName;
		}

		public void setDesktopName(String desktopName) {
			this.desktopName = desktopName;
		}

		public String getLastTime() {
			return this.lastTime;
		}

		public void setLastTime(String lastTime) {
			this.lastTime = lastTime;
		}

		public String getOccurrenceTime() {
			return this.occurrenceTime;
		}

		public void setOccurrenceTime(String occurrenceTime) {
			this.occurrenceTime = occurrenceTime;
		}

		public String getUniqueInfo() {
			return this.uniqueInfo;
		}

		public void setUniqueInfo(String uniqueInfo) {
			this.uniqueInfo = uniqueInfo;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEventSubType() {
			return this.eventSubType;
		}

		public void setEventSubType(String eventSubType) {
			this.eventSubType = eventSubType;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Integer getEventStatus() {
			return this.eventStatus;
		}

		public void setEventStatus(Integer eventStatus) {
			this.eventStatus = eventStatus;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getOperateMsg() {
			return this.operateMsg;
		}

		public void setOperateMsg(String operateMsg) {
			this.operateMsg = operateMsg;
		}

		public String getDataSource() {
			return this.dataSource;
		}

		public void setDataSource(String dataSource) {
			this.dataSource = dataSource;
		}

		public String getOperateErrorCode() {
			return this.operateErrorCode;
		}

		public void setOperateErrorCode(String operateErrorCode) {
			this.operateErrorCode = operateErrorCode;
		}

		public Boolean getCanCancelFault() {
			return this.canCancelFault;
		}

		public void setCanCancelFault(Boolean canCancelFault) {
			this.canCancelFault = canCancelFault;
		}

		public String getCanBeDealOnLine() {
			return this.canBeDealOnLine;
		}

		public void setCanBeDealOnLine(String canBeDealOnLine) {
			this.canBeDealOnLine = canBeDealOnLine;
		}

		public String getAlarmEventType() {
			return this.alarmEventType;
		}

		public void setAlarmEventType(String alarmEventType) {
			this.alarmEventType = alarmEventType;
		}

		public String getAlarmEventName() {
			return this.alarmEventName;
		}

		public void setAlarmEventName(String alarmEventName) {
			this.alarmEventName = alarmEventName;
		}

		public String getAlarmUniqueInfo() {
			return this.alarmUniqueInfo;
		}

		public void setAlarmUniqueInfo(String alarmUniqueInfo) {
			this.alarmUniqueInfo = alarmUniqueInfo;
		}

		public String getAlarmEventNameDisplay() {
			return this.alarmEventNameDisplay;
		}

		public void setAlarmEventNameDisplay(String alarmEventNameDisplay) {
			this.alarmEventNameDisplay = alarmEventNameDisplay;
		}

		public String getAlarmEventTypeDisplay() {
			return this.alarmEventTypeDisplay;
		}

		public void setAlarmEventTypeDisplay(String alarmEventTypeDisplay) {
			this.alarmEventTypeDisplay = alarmEventTypeDisplay;
		}

		public List<Detail> getDetails() {
			return this.details;
		}

		public void setDetails(List<Detail> details) {
			this.details = details;
		}

		public static class Detail {

			private String name;

			private String nameDisplay;

			private String type;

			private String value;

			private String valueDisplay;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getNameDisplay() {
				return this.nameDisplay;
			}

			public void setNameDisplay(String nameDisplay) {
				this.nameDisplay = nameDisplay;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getValueDisplay() {
				return this.valueDisplay;
			}

			public void setValueDisplay(String valueDisplay) {
				this.valueDisplay = valueDisplay;
			}
		}
	}

	@Override
	public DescribeSuspEventsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSuspEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
