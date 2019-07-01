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

package com.aliyuncs.green.model.v20170823;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeAuditContentItemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAuditContentItemResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<AuditContentItem> auditContentItemList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<AuditContentItem> getAuditContentItemList() {
		return this.auditContentItemList;
	}

	public void setAuditContentItemList(List<AuditContentItem> auditContentItemList) {
		this.auditContentItemList = auditContentItemList;
	}

	public static class AuditContentItem {

		private String parentTaskId;

		private String content;

		private Integer sn;

		private String startTime;

		private String endTime;

		private Integer audit;

		private String auditResult;

		private String suggestion;

		private Long id;

		private List<String> auditIllegalReasons;

		public String getParentTaskId() {
			return this.parentTaskId;
		}

		public void setParentTaskId(String parentTaskId) {
			this.parentTaskId = parentTaskId;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Integer getSn() {
			return this.sn;
		}

		public void setSn(Integer sn) {
			this.sn = sn;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public Integer getAudit() {
			return this.audit;
		}

		public void setAudit(Integer audit) {
			this.audit = audit;
		}

		public String getAuditResult() {
			return this.auditResult;
		}

		public void setAuditResult(String auditResult) {
			this.auditResult = auditResult;
		}

		public String getSuggestion() {
			return this.suggestion;
		}

		public void setSuggestion(String suggestion) {
			this.suggestion = suggestion;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public List<String> getAuditIllegalReasons() {
			return this.auditIllegalReasons;
		}

		public void setAuditIllegalReasons(List<String> auditIllegalReasons) {
			this.auditIllegalReasons = auditIllegalReasons;
		}
	}

	@Override
	public DescribeAuditContentItemResponse getInstance(UnmarshallerContext context) {
		return	DescribeAuditContentItemResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
