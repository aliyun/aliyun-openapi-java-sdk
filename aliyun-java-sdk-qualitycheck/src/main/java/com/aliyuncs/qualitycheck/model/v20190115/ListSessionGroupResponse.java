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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.ListSessionGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSessionGroupResponse extends AcsResponse {

	private Integer count;

	private Integer currentPage;

	private Integer pageSize;

	private Integer pageNumber;

	private String resultCountId;

	private String lastDataId;

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<DataItem> data;

	private List<String> messages;

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getResultCountId() {
		return this.resultCountId;
	}

	public void setResultCountId(String resultCountId) {
		this.resultCountId = resultCountId;
	}

	public String getLastDataId() {
		return this.lastDataId;
	}

	public void setLastDataId(String lastDataId) {
		this.lastDataId = lastDataId;
	}

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public List<String> getMessages() {
		return this.messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public static class DataItem {

		private String sessionGroupId;

		private Long schemeTaskConfigId;

		private String schemeTaskConfigName;

		private Long score;

		private Integer sessionCount;

		private Integer hitSessionCount;

		private String callStartTime;

		private Integer reviewStatus;

		private Integer assignStatus;

		private Boolean sessionGroupReviewedOrComplained;

		private String lastDataId;

		private List<String> customerServiceIdList;

		private List<String> customerServiceNameList;

		private List<String> customerIdList;

		private List<String> customerNameList;

		private List<String> callerList;

		private List<String> skillGroupNameList;

		private List<String> reviewerList;

		public String getSessionGroupId() {
			return this.sessionGroupId;
		}

		public void setSessionGroupId(String sessionGroupId) {
			this.sessionGroupId = sessionGroupId;
		}

		public Long getSchemeTaskConfigId() {
			return this.schemeTaskConfigId;
		}

		public void setSchemeTaskConfigId(Long schemeTaskConfigId) {
			this.schemeTaskConfigId = schemeTaskConfigId;
		}

		public String getSchemeTaskConfigName() {
			return this.schemeTaskConfigName;
		}

		public void setSchemeTaskConfigName(String schemeTaskConfigName) {
			this.schemeTaskConfigName = schemeTaskConfigName;
		}

		public Long getScore() {
			return this.score;
		}

		public void setScore(Long score) {
			this.score = score;
		}

		public Integer getSessionCount() {
			return this.sessionCount;
		}

		public void setSessionCount(Integer sessionCount) {
			this.sessionCount = sessionCount;
		}

		public Integer getHitSessionCount() {
			return this.hitSessionCount;
		}

		public void setHitSessionCount(Integer hitSessionCount) {
			this.hitSessionCount = hitSessionCount;
		}

		public String getCallStartTime() {
			return this.callStartTime;
		}

		public void setCallStartTime(String callStartTime) {
			this.callStartTime = callStartTime;
		}

		public Integer getReviewStatus() {
			return this.reviewStatus;
		}

		public void setReviewStatus(Integer reviewStatus) {
			this.reviewStatus = reviewStatus;
		}

		public Integer getAssignStatus() {
			return this.assignStatus;
		}

		public void setAssignStatus(Integer assignStatus) {
			this.assignStatus = assignStatus;
		}

		public Boolean getSessionGroupReviewedOrComplained() {
			return this.sessionGroupReviewedOrComplained;
		}

		public void setSessionGroupReviewedOrComplained(Boolean sessionGroupReviewedOrComplained) {
			this.sessionGroupReviewedOrComplained = sessionGroupReviewedOrComplained;
		}

		public String getLastDataId() {
			return this.lastDataId;
		}

		public void setLastDataId(String lastDataId) {
			this.lastDataId = lastDataId;
		}

		public List<String> getCustomerServiceIdList() {
			return this.customerServiceIdList;
		}

		public void setCustomerServiceIdList(List<String> customerServiceIdList) {
			this.customerServiceIdList = customerServiceIdList;
		}

		public List<String> getCustomerServiceNameList() {
			return this.customerServiceNameList;
		}

		public void setCustomerServiceNameList(List<String> customerServiceNameList) {
			this.customerServiceNameList = customerServiceNameList;
		}

		public List<String> getCustomerIdList() {
			return this.customerIdList;
		}

		public void setCustomerIdList(List<String> customerIdList) {
			this.customerIdList = customerIdList;
		}

		public List<String> getCustomerNameList() {
			return this.customerNameList;
		}

		public void setCustomerNameList(List<String> customerNameList) {
			this.customerNameList = customerNameList;
		}

		public List<String> getCallerList() {
			return this.callerList;
		}

		public void setCallerList(List<String> callerList) {
			this.callerList = callerList;
		}

		public List<String> getSkillGroupNameList() {
			return this.skillGroupNameList;
		}

		public void setSkillGroupNameList(List<String> skillGroupNameList) {
			this.skillGroupNameList = skillGroupNameList;
		}

		public List<String> getReviewerList() {
			return this.reviewerList;
		}

		public void setReviewerList(List<String> reviewerList) {
			this.reviewerList = reviewerList;
		}
	}

	@Override
	public ListSessionGroupResponse getInstance(UnmarshallerContext context) {
		return	ListSessionGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
