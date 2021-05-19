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
import com.aliyuncs.scsp.transform.v20200702.SearchTicketListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchTicketListResponse extends AcsResponse {

	private Integer onePageSize;

	private String requestId;

	private String message;

	private Integer totalPage;

	private Integer totalResults;

	private Integer pageNo;

	private String code;

	private Boolean success;

	private List<DataItem> data;

	public Integer getOnePageSize() {
		return this.onePageSize;
	}

	public void setOnePageSize(Integer onePageSize) {
		this.onePageSize = onePageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalResults() {
		return this.totalResults;
	}

	public void setTotalResults(Integer totalResults) {
		this.totalResults = totalResults;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String memberName;

		private String carbonCopy;

		private Long createTime;

		private Long serviceId;

		private Long ticketId;

		private Integer priority;

		private Long creatorId;

		private String formData;

		private String fromInfo;

		private Long modifiedTime;

		private String taskStatus;

		private String creatorName;

		private Long categoryId;

		private Integer creatorType;

		private Long memberId;

		private Integer caseStatus;

		private Long templateId;

		public String getMemberName() {
			return this.memberName;
		}

		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}

		public String getCarbonCopy() {
			return this.carbonCopy;
		}

		public void setCarbonCopy(String carbonCopy) {
			this.carbonCopy = carbonCopy;
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

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
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
	}

	@Override
	public SearchTicketListResponse getInstance(UnmarshallerContext context) {
		return	SearchTicketListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
