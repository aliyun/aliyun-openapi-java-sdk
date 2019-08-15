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

package com.aliyuncs.emas_appmonitor.model.v20190611;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emas_appmonitor.transform.v20190611.GetAlarmLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAlarmLogResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<AlarmLog> alarmLogList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<AlarmLog> getAlarmLogList() {
		return this.alarmLogList;
	}

	public void setAlarmLogList(List<AlarmLog> alarmLogList) {
		this.alarmLogList = alarmLogList;
	}

	public static class AlarmLog {

		private String alarmItemName;

		private String alarmCondition;

		private Long occurrenceTime;

		private String alarmContent;

		private String appVersion;

		private String alarmItemType;

		private List<String> notifyTypes;

		private List<String> subscribers;

		public String getAlarmItemName() {
			return this.alarmItemName;
		}

		public void setAlarmItemName(String alarmItemName) {
			this.alarmItemName = alarmItemName;
		}

		public String getAlarmCondition() {
			return this.alarmCondition;
		}

		public void setAlarmCondition(String alarmCondition) {
			this.alarmCondition = alarmCondition;
		}

		public Long getOccurrenceTime() {
			return this.occurrenceTime;
		}

		public void setOccurrenceTime(Long occurrenceTime) {
			this.occurrenceTime = occurrenceTime;
		}

		public String getAlarmContent() {
			return this.alarmContent;
		}

		public void setAlarmContent(String alarmContent) {
			this.alarmContent = alarmContent;
		}

		public String getAppVersion() {
			return this.appVersion;
		}

		public void setAppVersion(String appVersion) {
			this.appVersion = appVersion;
		}

		public String getAlarmItemType() {
			return this.alarmItemType;
		}

		public void setAlarmItemType(String alarmItemType) {
			this.alarmItemType = alarmItemType;
		}

		public List<String> getNotifyTypes() {
			return this.notifyTypes;
		}

		public void setNotifyTypes(List<String> notifyTypes) {
			this.notifyTypes = notifyTypes;
		}

		public List<String> getSubscribers() {
			return this.subscribers;
		}

		public void setSubscribers(List<String> subscribers) {
			this.subscribers = subscribers;
		}
	}

	@Override
	public GetAlarmLogResponse getInstance(UnmarshallerContext context) {
		return	GetAlarmLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
