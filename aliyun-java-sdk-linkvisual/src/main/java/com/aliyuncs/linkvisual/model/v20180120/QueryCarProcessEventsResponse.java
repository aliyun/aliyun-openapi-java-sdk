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
import com.aliyuncs.linkvisual.transform.v20180120.QueryCarProcessEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCarProcessEventsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer total;

		private Integer pageCount;

		private Integer currentPage;

		private Integer pageSize;

		private List<PageDataItem> pageData;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPageCount() {
			return this.pageCount;
		}

		public void setPageCount(Integer pageCount) {
			this.pageCount = pageCount;
		}

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

		public List<PageDataItem> getPageData() {
			return this.pageData;
		}

		public void setPageData(List<PageDataItem> pageData) {
			this.pageData = pageData;
		}

		public static class PageDataItem {

			private String eventId;

			private Integer eventType;

			private Long eventTime;

			private String eventPicId;

			private String eventPicUrl;

			private String iotId;

			private String subIotId;

			private String subDeviceNickName;

			private String plateNo;

			private String subProductKey;

			private String subDeviceName;

			private Integer actionType;

			private Integer areaIndex;

			private Integer confidence;

			private String taskId;

			public String getEventId() {
				return this.eventId;
			}

			public void setEventId(String eventId) {
				this.eventId = eventId;
			}

			public Integer getEventType() {
				return this.eventType;
			}

			public void setEventType(Integer eventType) {
				this.eventType = eventType;
			}

			public Long getEventTime() {
				return this.eventTime;
			}

			public void setEventTime(Long eventTime) {
				this.eventTime = eventTime;
			}

			public String getEventPicId() {
				return this.eventPicId;
			}

			public void setEventPicId(String eventPicId) {
				this.eventPicId = eventPicId;
			}

			public String getEventPicUrl() {
				return this.eventPicUrl;
			}

			public void setEventPicUrl(String eventPicUrl) {
				this.eventPicUrl = eventPicUrl;
			}

			public String getIotId() {
				return this.iotId;
			}

			public void setIotId(String iotId) {
				this.iotId = iotId;
			}

			public String getSubIotId() {
				return this.subIotId;
			}

			public void setSubIotId(String subIotId) {
				this.subIotId = subIotId;
			}

			public String getSubDeviceNickName() {
				return this.subDeviceNickName;
			}

			public void setSubDeviceNickName(String subDeviceNickName) {
				this.subDeviceNickName = subDeviceNickName;
			}

			public String getPlateNo() {
				return this.plateNo;
			}

			public void setPlateNo(String plateNo) {
				this.plateNo = plateNo;
			}

			public String getSubProductKey() {
				return this.subProductKey;
			}

			public void setSubProductKey(String subProductKey) {
				this.subProductKey = subProductKey;
			}

			public String getSubDeviceName() {
				return this.subDeviceName;
			}

			public void setSubDeviceName(String subDeviceName) {
				this.subDeviceName = subDeviceName;
			}

			public Integer getActionType() {
				return this.actionType;
			}

			public void setActionType(Integer actionType) {
				this.actionType = actionType;
			}

			public Integer getAreaIndex() {
				return this.areaIndex;
			}

			public void setAreaIndex(Integer areaIndex) {
				this.areaIndex = areaIndex;
			}

			public Integer getConfidence() {
				return this.confidence;
			}

			public void setConfidence(Integer confidence) {
				this.confidence = confidence;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}
		}
	}

	@Override
	public QueryCarProcessEventsResponse getInstance(UnmarshallerContext context) {
		return	QueryCarProcessEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
