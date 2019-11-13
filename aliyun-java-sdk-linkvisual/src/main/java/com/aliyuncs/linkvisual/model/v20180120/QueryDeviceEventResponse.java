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

package com.aliyuncs.linkvisual.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkvisual.transform.v20180120.QueryDeviceEventResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDeviceEventResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer total;

		private Integer pageSize;

		private Integer page;

		private Integer pageCount;

		private List<ListItem> list;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}

		public Integer getPageCount() {
			return this.pageCount;
		}

		public void setPageCount(Integer pageCount) {
			this.pageCount = pageCount;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String eventId;

			private String eventTime;

			private Integer eventType;

			private String eventDesc;

			private String eventPicId;

			private String eventData;

			public String getEventId() {
				return this.eventId;
			}

			public void setEventId(String eventId) {
				this.eventId = eventId;
			}

			public String getEventTime() {
				return this.eventTime;
			}

			public void setEventTime(String eventTime) {
				this.eventTime = eventTime;
			}

			public Integer getEventType() {
				return this.eventType;
			}

			public void setEventType(Integer eventType) {
				this.eventType = eventType;
			}

			public String getEventDesc() {
				return this.eventDesc;
			}

			public void setEventDesc(String eventDesc) {
				this.eventDesc = eventDesc;
			}

			public String getEventPicId() {
				return this.eventPicId;
			}

			public void setEventPicId(String eventPicId) {
				this.eventPicId = eventPicId;
			}

			public String getEventData() {
				return this.eventData;
			}

			public void setEventData(String eventData) {
				this.eventData = eventData;
			}
		}
	}

	@Override
	public QueryDeviceEventResponse getInstance(UnmarshallerContext context) {
		return	QueryDeviceEventResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
