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

	private Integer isTrigger;

	private String requestId;

	private PageBean pageBean;

	public Integer getIsTrigger() {
		return this.isTrigger;
	}

	public void setIsTrigger(Integer isTrigger) {
		this.isTrigger = isTrigger;
	}

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

		private List<EventItem> event;

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

		public List<EventItem> getEvent() {
			return this.event;
		}

		public void setEvent(List<EventItem> event) {
			this.event = event;
		}

		public static class EventItem {

			private Long eventTime;

			private String eventLevel;

			private String alertRule;

			private String message;

			private Integer alertType;

			private String alertName;

			private Long id;

			private Long alertId;

			private List<String> links;

			public Long getEventTime() {
				return this.eventTime;
			}

			public void setEventTime(Long eventTime) {
				this.eventTime = eventTime;
			}

			public String getEventLevel() {
				return this.eventLevel;
			}

			public void setEventLevel(String eventLevel) {
				this.eventLevel = eventLevel;
			}

			public String getAlertRule() {
				return this.alertRule;
			}

			public void setAlertRule(String alertRule) {
				this.alertRule = alertRule;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public Integer getAlertType() {
				return this.alertType;
			}

			public void setAlertType(Integer alertType) {
				this.alertType = alertType;
			}

			public String getAlertName() {
				return this.alertName;
			}

			public void setAlertName(String alertName) {
				this.alertName = alertName;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getAlertId() {
				return this.alertId;
			}

			public void setAlertId(Long alertId) {
				this.alertId = alertId;
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
