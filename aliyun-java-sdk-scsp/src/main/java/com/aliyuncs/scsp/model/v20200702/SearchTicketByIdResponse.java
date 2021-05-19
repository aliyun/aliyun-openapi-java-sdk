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

package com.aliyuncs.scsp.model.v20200702;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.scsp.transform.v20200702.SearchTicketByIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchTicketByIdResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Long httpStatusCode;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Long httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String carbonCopy;

		private String memberName;

		private Long createTime;

		private Long serviceId;

		private Long ticketId;

		private Integer priority;

		private Long creatorId;

		private String formData;

		private String fromInfo;

		private Long modifiedTime;

		private String creatorName;

		private Long categoryId;

		private Integer creatorType;

		private Long memberId;

		private Integer caseStatus;

		private Long templateId;

		private String ticketName;

		private List<ActivitiesItem> activities;

		private List<ActivityRecordsItem> activityRecords;

		public String getCarbonCopy() {
			return this.carbonCopy;
		}

		public void setCarbonCopy(String carbonCopy) {
			this.carbonCopy = carbonCopy;
		}

		public String getMemberName() {
			return this.memberName;
		}

		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(Long serviceId) {
			this.serviceId = serviceId;
		}

		public Long getTicketId() {
			return this.ticketId;
		}

		public void setTicketId(Long ticketId) {
			this.ticketId = ticketId;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public Long getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(Long creatorId) {
			this.creatorId = creatorId;
		}

		public String getFormData() {
			return this.formData;
		}

		public void setFormData(String formData) {
			this.formData = formData;
		}

		public String getFromInfo() {
			return this.fromInfo;
		}

		public void setFromInfo(String fromInfo) {
			this.fromInfo = fromInfo;
		}

		public Long getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(Long modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getCreatorName() {
			return this.creatorName;
		}

		public void setCreatorName(String creatorName) {
			this.creatorName = creatorName;
		}

		public Long getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(Long categoryId) {
			this.categoryId = categoryId;
		}

		public Integer getCreatorType() {
			return this.creatorType;
		}

		public void setCreatorType(Integer creatorType) {
			this.creatorType = creatorType;
		}

		public Long getMemberId() {
			return this.memberId;
		}

		public void setMemberId(Long memberId) {
			this.memberId = memberId;
		}

		public Integer getCaseStatus() {
			return this.caseStatus;
		}

		public void setCaseStatus(Integer caseStatus) {
			this.caseStatus = caseStatus;
		}

		public Long getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}

		public String getTicketName() {
			return this.ticketName;
		}

		public void setTicketName(String ticketName) {
			this.ticketName = ticketName;
		}

		public List<ActivitiesItem> getActivities() {
			return this.activities;
		}

		public void setActivities(List<ActivitiesItem> activities) {
			this.activities = activities;
		}

		public List<ActivityRecordsItem> getActivityRecords() {
			return this.activityRecords;
		}

		public void setActivityRecords(List<ActivityRecordsItem> activityRecords) {
			this.activityRecords = activityRecords;
		}

		public static class ActivitiesItem {

			private String activityFormData;

			private String activityCode;

			public String getActivityFormData() {
				return this.activityFormData;
			}

			public void setActivityFormData(String activityFormData) {
				this.activityFormData = activityFormData;
			}

			public String getActivityCode() {
				return this.activityCode;
			}

			public void setActivityCode(String activityCode) {
				this.activityCode = activityCode;
			}
		}

		public static class ActivityRecordsItem {

			private String actionCode;

			private String actionCodeDesc;

			private String operatorName;

			private String memo;

			private Long gmtCreate;

			public String getActionCode() {
				return this.actionCode;
			}

			public void setActionCode(String actionCode) {
				this.actionCode = actionCode;
			}

			public String getActionCodeDesc() {
				return this.actionCodeDesc;
			}

			public void setActionCodeDesc(String actionCodeDesc) {
				this.actionCodeDesc = actionCodeDesc;
			}

			public String getOperatorName() {
				return this.operatorName;
			}

			public void setOperatorName(String operatorName) {
				this.operatorName = operatorName;
			}

			public String getMemo() {
				return this.memo;
			}

			public void setMemo(String memo) {
				this.memo = memo;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}
		}
	}

	@Override
	public SearchTicketByIdResponse getInstance(UnmarshallerContext context) {
		return	SearchTicketByIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
