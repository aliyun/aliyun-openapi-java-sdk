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

	private Integer currentPage;

	private String requestId;

	private String pageSize;

	private Integer totalCount;

	private List<SuspEvent> suspEvents;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

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

		private String dataSource;

		private String eventSubType;

		private String desktopName;

		private String desktopId;

		private String occurrenceTime;

		private String alarmEventTypeDisplay;

		private String alarmUniqueInfo;

		private String desc;

		private String alarmEventNameDisplay;

		private Boolean canCancelFault;

		private String lastTime;

		private String operateMsg;

		private String canBeDealOnLine;

		private String alarmEventType;

		private Integer eventStatus;

		private String operateErrorCode;

		private String alarmEventName;

		private String name;

		private String uniqueInfo;

		private String level;

		private Long id;

		private List<Detail> details;

		public String getDataSource() {
			return this.dataSource;
		}

		public void setDataSource(String dataSource) {
			this.dataSource = dataSource;
		}

		public String getEventSubType() {
			return this.eventSubType;
		}

		public void setEventSubType(String eventSubType) {
			this.eventSubType = eventSubType;
		}

		public String getDesktopName() {
			return this.desktopName;
		}

		public void setDesktopName(String desktopName) {
			this.desktopName = desktopName;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getOccurrenceTime() {
			return this.occurrenceTime;
		}

		public void setOccurrenceTime(String occurrenceTime) {
			this.occurrenceTime = occurrenceTime;
		}

		public String getAlarmEventTypeDisplay() {
			return this.alarmEventTypeDisplay;
		}

		public void setAlarmEventTypeDisplay(String alarmEventTypeDisplay) {
			this.alarmEventTypeDisplay = alarmEventTypeDisplay;
		}

		public String getAlarmUniqueInfo() {
			return this.alarmUniqueInfo;
		}

		public void setAlarmUniqueInfo(String alarmUniqueInfo) {
			this.alarmUniqueInfo = alarmUniqueInfo;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getAlarmEventNameDisplay() {
			return this.alarmEventNameDisplay;
		}

		public void setAlarmEventNameDisplay(String alarmEventNameDisplay) {
			this.alarmEventNameDisplay = alarmEventNameDisplay;
		}

		public Boolean getCanCancelFault() {
			return this.canCancelFault;
		}

		public void setCanCancelFault(Boolean canCancelFault) {
			this.canCancelFault = canCancelFault;
		}

		public String getLastTime() {
			return this.lastTime;
		}

		public void setLastTime(String lastTime) {
			this.lastTime = lastTime;
		}

		public String getOperateMsg() {
			return this.operateMsg;
		}

		public void setOperateMsg(String operateMsg) {
			this.operateMsg = operateMsg;
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

		public Integer getEventStatus() {
			return this.eventStatus;
		}

		public void setEventStatus(Integer eventStatus) {
			this.eventStatus = eventStatus;
		}

		public String getOperateErrorCode() {
			return this.operateErrorCode;
		}

		public void setOperateErrorCode(String operateErrorCode) {
			this.operateErrorCode = operateErrorCode;
		}

		public String getAlarmEventName() {
			return this.alarmEventName;
		}

		public void setAlarmEventName(String alarmEventName) {
			this.alarmEventName = alarmEventName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUniqueInfo() {
			return this.uniqueInfo;
		}

		public void setUniqueInfo(String uniqueInfo) {
			this.uniqueInfo = uniqueInfo;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public List<Detail> getDetails() {
			return this.details;
		}

		public void setDetails(List<Detail> details) {
			this.details = details;
		}

		public static class Detail {

			private String type;

			private String value;

			private String nameDisplay;

			private String name;

			private String valueDisplay;

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

			public String getNameDisplay() {
				return this.nameDisplay;
			}

			public void setNameDisplay(String nameDisplay) {
				this.nameDisplay = nameDisplay;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
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
