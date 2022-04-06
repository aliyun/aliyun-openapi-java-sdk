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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.SearchAlertHistoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchAlertHistoriesResponse extends AcsResponse {

	private String requestId;

	private PageBean pageBean;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PageBean getPageBean() {
		return this.pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public static class PageBean {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<AlarmHistory> alarmHistories;

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

		public List<AlarmHistory> getAlarmHistories() {
			return this.alarmHistories;
		}

		public void setAlarmHistories(List<AlarmHistory> alarmHistories) {
			this.alarmHistories = alarmHistories;
		}

		public static class AlarmHistory {

			private Long alarmTime;

			private String strategyId;

			private Integer alarmResponseCode;

			private String emails;

			private String userId;

			private String alarmSources;

			private String alarmContent;

			private String phones;

			private Integer alarmType;

			private String target;

			private Long id;

			public Long getAlarmTime() {
				return this.alarmTime;
			}

			public void setAlarmTime(Long alarmTime) {
				this.alarmTime = alarmTime;
			}

			public String getStrategyId() {
				return this.strategyId;
			}

			public void setStrategyId(String strategyId) {
				this.strategyId = strategyId;
			}

			public Integer getAlarmResponseCode() {
				return this.alarmResponseCode;
			}

			public void setAlarmResponseCode(Integer alarmResponseCode) {
				this.alarmResponseCode = alarmResponseCode;
			}

			public String getEmails() {
				return this.emails;
			}

			public void setEmails(String emails) {
				this.emails = emails;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getAlarmSources() {
				return this.alarmSources;
			}

			public void setAlarmSources(String alarmSources) {
				this.alarmSources = alarmSources;
			}

			public String getAlarmContent() {
				return this.alarmContent;
			}

			public void setAlarmContent(String alarmContent) {
				this.alarmContent = alarmContent;
			}

			public String getPhones() {
				return this.phones;
			}

			public void setPhones(String phones) {
				this.phones = phones;
			}

			public Integer getAlarmType() {
				return this.alarmType;
			}

			public void setAlarmType(Integer alarmType) {
				this.alarmType = alarmType;
			}

			public String getTarget() {
				return this.target;
			}

			public void setTarget(String target) {
				this.target = target;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}
	}

	@Override
	public SearchAlertHistoriesResponse getInstance(UnmarshallerContext context) {
		return	SearchAlertHistoriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
