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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeSuspEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSuspEventsResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private Integer pageSize;

	private Integer totalCount;

	private Integer currentPage;

	private List<WarningSummary> suspEvents;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public List<WarningSummary> getSuspEvents() {
		return this.suspEvents;
	}

	public void setSuspEvents(List<WarningSummary> suspEvents) {
		this.suspEvents = suspEvents;
	}

	public static class WarningSummary {

		private String lastTime;

		private String occurrenceTime;

		private Long id;

		private String uniqueInfo;

		private String instanceName;

		private String internetIp;

		private String intranetIp;

		private String uuid;

		private String name;

		private String eventSubType;

		private String level;

		private Integer eventStatus;

		private String desc;

		private String operateMsg;

		private String dataSource;

		private Boolean canBeDealOnLine;

		private String saleVersion;

		private String alarmEventType;

		private String alarmEventName;

		private String alarmUniqueInfo;

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

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUniqueInfo() {
			return this.uniqueInfo;
		}

		public void setUniqueInfo(String uniqueInfo) {
			this.uniqueInfo = uniqueInfo;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
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

		public Boolean getCanBeDealOnLine() {
			return this.canBeDealOnLine;
		}

		public void setCanBeDealOnLine(Boolean canBeDealOnLine) {
			this.canBeDealOnLine = canBeDealOnLine;
		}

		public String getSaleVersion() {
			return this.saleVersion;
		}

		public void setSaleVersion(String saleVersion) {
			this.saleVersion = saleVersion;
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
