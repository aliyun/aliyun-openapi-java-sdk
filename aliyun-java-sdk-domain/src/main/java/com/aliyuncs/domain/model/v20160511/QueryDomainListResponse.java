/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.domain.model.v20160511;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20160511.QueryDomainListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDomainListResponse extends AcsResponse {

	private String requestId;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer totalPageNum;

	private Integer pageSize;

	private Boolean prePage;

	private Boolean nextPage;

	private List<Domain> data;

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

	public List<Domain> getData() {
		return this.data;
	}

	public void setData(List<Domain> data) {
		this.data = data;
	}

	public static class Domain {

		private String domainName;

		private String saleId;

		private String deadDate;

		private String regDate;

		private String domainAuditStatus;

		private String domainRegType;

		private String groupId;

		private String domainType;

		private String domainStatus;

		private String deadDateStatus;

		private String productId;

		private Long deadDateLong;

		private Long regDateLong;

		private String remark;

		private Boolean premium;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getSaleId() {
			return this.saleId;
		}

		public void setSaleId(String saleId) {
			this.saleId = saleId;
		}

		public String getDeadDate() {
			return this.deadDate;
		}

		public void setDeadDate(String deadDate) {
			this.deadDate = deadDate;
		}

		public String getRegDate() {
			return this.regDate;
		}

		public void setRegDate(String regDate) {
			this.regDate = regDate;
		}

		public String getDomainAuditStatus() {
			return this.domainAuditStatus;
		}

		public void setDomainAuditStatus(String domainAuditStatus) {
			this.domainAuditStatus = domainAuditStatus;
		}

		public String getDomainRegType() {
			return this.domainRegType;
		}

		public void setDomainRegType(String domainRegType) {
			this.domainRegType = domainRegType;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getDomainType() {
			return this.domainType;
		}

		public void setDomainType(String domainType) {
			this.domainType = domainType;
		}

		public String getDomainStatus() {
			return this.domainStatus;
		}

		public void setDomainStatus(String domainStatus) {
			this.domainStatus = domainStatus;
		}

		public String getDeadDateStatus() {
			return this.deadDateStatus;
		}

		public void setDeadDateStatus(String deadDateStatus) {
			this.deadDateStatus = deadDateStatus;
		}

		public String getProductId() {
			return this.productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public Long getDeadDateLong() {
			return this.deadDateLong;
		}

		public void setDeadDateLong(Long deadDateLong) {
			this.deadDateLong = deadDateLong;
		}

		public Long getRegDateLong() {
			return this.regDateLong;
		}

		public void setRegDateLong(Long regDateLong) {
			this.regDateLong = regDateLong;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public Boolean getPremium() {
			return this.premium;
		}

		public void setPremium(Boolean premium) {
			this.premium = premium;
		}
	}

	@Override
	public QueryDomainListResponse getInstance(UnmarshallerContext context) {
		return	QueryDomainListResponseUnmarshaller.unmarshall(this, context);
	}
}
