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
import com.aliyuncs.arms.transform.v20190808.SearchEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchEventsResponse extends AcsResponse {

	private String requestId;

	private Integer isTrigger;

	private PageBean pageBean;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getIsTrigger() {
		return this.isTrigger;
	}

	public void setIsTrigger(Integer isTrigger) {
		this.isTrigger = isTrigger;
	}

	public PageBean getPageBean() {
		return this.pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public static class PageBean {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<EventItem> event;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
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

		public List<EventItem> getEvent() {
			return this.event;
		}

		public void setEvent(List<EventItem> event) {
			this.event = event;
		}

		public static class EventItem {

			private Long id;

			private Long eventTime;

			private Integer alertType;

			private String eventLevel;

			private String message;

			private Long alertId;

			private String alertName;

			private String alertRule;

			private List<String> links;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getEventTime() {
				return this.eventTime;
			}

			public void setEventTime(Long eventTime) {
				this.eventTime = eventTime;
			}

			public Integer getAlertType() {
				return this.alertType;
			}

			public void setAlertType(Integer alertType) {
				this.alertType = alertType;
			}

			public String getEventLevel() {
				return this.eventLevel;
			}

			public void setEventLevel(String eventLevel) {
				this.eventLevel = eventLevel;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public Long getAlertId() {
				return this.alertId;
			}

			public void setAlertId(Long alertId) {
				this.alertId = alertId;
			}

			public String getAlertName() {
				return this.alertName;
			}

			public void setAlertName(String alertName) {
				this.alertName = alertName;
			}

			public String getAlertRule() {
				return this.alertRule;
			}

			public void setAlertRule(String alertRule) {
				this.alertRule = alertRule;
			}

			public List<String> getLinks() {
				return this.links;
			}

			public void setLinks(List<String> links) {
				this.links = links;
			}
		}
	}

	@Override
	public SearchEventsResponse getInstance(UnmarshallerContext context) {
		return	SearchEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
