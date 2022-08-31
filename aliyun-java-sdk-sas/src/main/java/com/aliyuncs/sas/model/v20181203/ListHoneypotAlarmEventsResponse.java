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
import com.aliyuncs.sas.transform.v20181203.ListHoneypotAlarmEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListHoneypotAlarmEventsResponse extends AcsResponse {

	private String requestId;

	private List<HoneypotAlarmEvent> honeypotAlarmEvents;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<HoneypotAlarmEvent> getHoneypotAlarmEvents() {
		return this.honeypotAlarmEvents;
	}

	public void setHoneypotAlarmEvents(List<HoneypotAlarmEvent> honeypotAlarmEvents) {
		this.honeypotAlarmEvents = honeypotAlarmEvents;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class HoneypotAlarmEvent {

		private Long alarmEventId;

		private String alarmEventType;

		private String alarmEventName;

		private String alarmUniqueInfo;

		private Long firstTime;

		private Long lastTime;

		private String riskLevel;

		private Integer eventCount;

		private Integer operateStatus;

		private List<MergeFieldListItem> mergeFieldList;

		public Long getAlarmEventId() {
			return this.alarmEventId;
		}

		public void setAlarmEventId(Long alarmEventId) {
			this.alarmEventId = alarmEventId;
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

		public Long getFirstTime() {
			return this.firstTime;
		}

		public void setFirstTime(Long firstTime) {
			this.firstTime = firstTime;
		}

		public Long getLastTime() {
			return this.lastTime;
		}

		public void setLastTime(Long lastTime) {
			this.lastTime = lastTime;
		}

		public String getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(String riskLevel) {
			this.riskLevel = riskLevel;
		}

		public Integer getEventCount() {
			return this.eventCount;
		}

		public void setEventCount(Integer eventCount) {
			this.eventCount = eventCount;
		}

		public Integer getOperateStatus() {
			return this.operateStatus;
		}

		public void setOperateStatus(Integer operateStatus) {
			this.operateStatus = operateStatus;
		}

		public List<MergeFieldListItem> getMergeFieldList() {
			return this.mergeFieldList;
		}

		public void setMergeFieldList(List<MergeFieldListItem> mergeFieldList) {
			this.mergeFieldList = mergeFieldList;
		}

		public static class MergeFieldListItem {

			private String fieldType;

			private String fieldKey;

			private String fieldValue;

			private String fieldExtInfo;

			public String getFieldType() {
				return this.fieldType;
			}

			public void setFieldType(String fieldType) {
				this.fieldType = fieldType;
			}

			public String getFieldKey() {
				return this.fieldKey;
			}

			public void setFieldKey(String fieldKey) {
				this.fieldKey = fieldKey;
			}

			public String getFieldValue() {
				return this.fieldValue;
			}

			public void setFieldValue(String fieldValue) {
				this.fieldValue = fieldValue;
			}

			public String getFieldExtInfo() {
				return this.fieldExtInfo;
			}

			public void setFieldExtInfo(String fieldExtInfo) {
				this.fieldExtInfo = fieldExtInfo;
			}
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		private String lastRowKey;

		private String nextToken;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
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

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public String getLastRowKey() {
			return this.lastRowKey;
		}

		public void setLastRowKey(String lastRowKey) {
			this.lastRowKey = lastRowKey;
		}

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}
	}

	@Override
	public ListHoneypotAlarmEventsResponse getInstance(UnmarshallerContext context) {
		return	ListHoneypotAlarmEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
