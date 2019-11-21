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
import com.aliyuncs.sas.transform.v20181203.DescribeAlarmEventListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlarmEventListResponse extends AcsResponse {

	private String requestId;

	private List<SuspEventsItem> suspEvents;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SuspEventsItem> getSuspEvents() {
		return this.suspEvents;
	}

	public void setSuspEvents(List<SuspEventsItem> suspEvents) {
		this.suspEvents = suspEvents;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class SuspEventsItem {

		private String alarmUniqueInfo;

		private String solution;

		private String level;

		private Boolean canBeDealOnLine;

		private String description;

		private Long startTime;

		private Long endTime;

		private String alarmEventType;

		private Integer suspiciousEventCount;

		private String uuid;

		private String instanceName;

		private String internetIp;

		private String intranetIp;

		private String alarmEventName;

		private String saleVersion;

		private String dataSource;

		private Boolean canCancelFault;

		private Boolean dealed;

		private Long gmtModified;

		private Boolean hasTraceInfo;

		private String securityEventIds;

		private String operateErrorCode;

		private String alarmEventNameOriginal;

		private String instanceId;

		public String getAlarmUniqueInfo() {
			return this.alarmUniqueInfo;
		}

		public void setAlarmUniqueInfo(String alarmUniqueInfo) {
			this.alarmUniqueInfo = alarmUniqueInfo;
		}

		public String getSolution() {
			return this.solution;
		}

		public void setSolution(String solution) {
			this.solution = solution;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Boolean getCanBeDealOnLine() {
			return this.canBeDealOnLine;
		}

		public void setCanBeDealOnLine(Boolean canBeDealOnLine) {
			this.canBeDealOnLine = canBeDealOnLine;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getAlarmEventType() {
			return this.alarmEventType;
		}

		public void setAlarmEventType(String alarmEventType) {
			this.alarmEventType = alarmEventType;
		}

		public Integer getSuspiciousEventCount() {
			return this.suspiciousEventCount;
		}

		public void setSuspiciousEventCount(Integer suspiciousEventCount) {
			this.suspiciousEventCount = suspiciousEventCount;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
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

		public String getAlarmEventName() {
			return this.alarmEventName;
		}

		public void setAlarmEventName(String alarmEventName) {
			this.alarmEventName = alarmEventName;
		}

		public String getSaleVersion() {
			return this.saleVersion;
		}

		public void setSaleVersion(String saleVersion) {
			this.saleVersion = saleVersion;
		}

		public String getDataSource() {
			return this.dataSource;
		}

		public void setDataSource(String dataSource) {
			this.dataSource = dataSource;
		}

		public Boolean getCanCancelFault() {
			return this.canCancelFault;
		}

		public void setCanCancelFault(Boolean canCancelFault) {
			this.canCancelFault = canCancelFault;
		}

		public Boolean getDealed() {
			return this.dealed;
		}

		public void setDealed(Boolean dealed) {
			this.dealed = dealed;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Boolean getHasTraceInfo() {
			return this.hasTraceInfo;
		}

		public void setHasTraceInfo(Boolean hasTraceInfo) {
			this.hasTraceInfo = hasTraceInfo;
		}

		public String getSecurityEventIds() {
			return this.securityEventIds;
		}

		public void setSecurityEventIds(String securityEventIds) {
			this.securityEventIds = securityEventIds;
		}

		public String getOperateErrorCode() {
			return this.operateErrorCode;
		}

		public void setOperateErrorCode(String operateErrorCode) {
			this.operateErrorCode = operateErrorCode;
		}

		public String getAlarmEventNameOriginal() {
			return this.alarmEventNameOriginal;
		}

		public void setAlarmEventNameOriginal(String alarmEventNameOriginal) {
			this.alarmEventNameOriginal = alarmEventNameOriginal;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	public static class PageInfo {

		private Integer count;

		private Integer pageSize;

		private Integer totalCount;

		private Integer currentPage;

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
	}

	@Override
	public DescribeAlarmEventListResponse getInstance(UnmarshallerContext context) {
		return	DescribeAlarmEventListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
