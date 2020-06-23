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

package com.aliyuncs.domain.model.v20180129;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.QueryOperationAuditInfoListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOperationAuditInfoListResponse extends AcsResponse {

	private String requestId;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer totalPageNum;

	private Integer pageSize;

	private Boolean prePage;

	private Boolean nextPage;

	private List<OperationAuditRecord> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public Integer getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Integer currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Boolean getPrePage() {
		return this.prePage;
	}

	public void setPrePage(Boolean prePage) {
		this.prePage = prePage;
	}

	public Boolean getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(Boolean nextPage) {
		this.nextPage = nextPage;
	}

	public List<OperationAuditRecord> getData() {
		return this.data;
	}

	public void setData(List<OperationAuditRecord> data) {
		this.data = data;
	}

	public static class OperationAuditRecord {

		private Long id;

		private Long createTime;

		private Long updateTime;

		private String businessName;

		private String domainName;

		private Integer auditType;

		private Integer auditStatus;

		private String auditInfo;

		private String remark;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getBusinessName() {
			return this.businessName;
		}

		public void setBusinessName(String businessName) {
			this.businessName = businessName;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public Integer getAuditType() {
			return this.auditType;
		}

		public void setAuditType(Integer auditType) {
			this.auditType = auditType;
		}

		public Integer getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(Integer auditStatus) {
			this.auditStatus = auditStatus;
		}

		public String getAuditInfo() {
			return this.auditInfo;
		}

		public void setAuditInfo(String auditInfo) {
			this.auditInfo = auditInfo;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}
	}

	@Override
	public QueryOperationAuditInfoListResponse getInstance(UnmarshallerContext context) {
		return	QueryOperationAuditInfoListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
