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
import com.aliyuncs.domain.transform.v20180129.QueryDomainListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDomainListResponse extends AcsResponse {

	private Boolean prePage;

	private Integer currentPageNum;

	private String requestId;

	private Integer pageSize;

	private Integer totalPageNum;

	private Integer totalItemNum;

	private Boolean nextPage;

	private List<Domain> data;

	public Boolean getPrePage() {
		return this.prePage;
	}

	public void setPrePage(Boolean prePage) {
		this.prePage = prePage;
	}

	public Integer getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Integer currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

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

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
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

		private String domainAuditStatus;

		private String domainGroupId;

		private String remark;

		private String domainGroupName;

		private String registrationDate;

		private String instanceId;

		private String domainName;

		private String expirationDateStatus;

		private String expirationDate;

		private String registrantType;

		private Long expirationDateLong;

		private Integer expirationCurrDateDiff;

		private Boolean premium;

		private Long registrationDateLong;

		private String productId;

		private String domainStatus;

		private String domainType;

		public String getDomainAuditStatus() {
			return this.domainAuditStatus;
		}

		public void setDomainAuditStatus(String domainAuditStatus) {
			this.domainAuditStatus = domainAuditStatus;
		}

		public String getDomainGroupId() {
			return this.domainGroupId;
		}

		public void setDomainGroupId(String domainGroupId) {
			this.domainGroupId = domainGroupId;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getDomainGroupName() {
			return this.domainGroupName;
		}

		public void setDomainGroupName(String domainGroupName) {
			this.domainGroupName = domainGroupName;
		}

		public String getRegistrationDate() {
			return this.registrationDate;
		}

		public void setRegistrationDate(String registrationDate) {
			this.registrationDate = registrationDate;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getExpirationDateStatus() {
			return this.expirationDateStatus;
		}

		public void setExpirationDateStatus(String expirationDateStatus) {
			this.expirationDateStatus = expirationDateStatus;
		}

		public String getExpirationDate() {
			return this.expirationDate;
		}

		public void setExpirationDate(String expirationDate) {
			this.expirationDate = expirationDate;
		}

		public String getRegistrantType() {
			return this.registrantType;
		}

		public void setRegistrantType(String registrantType) {
			this.registrantType = registrantType;
		}

		public Long getExpirationDateLong() {
			return this.expirationDateLong;
		}

		public void setExpirationDateLong(Long expirationDateLong) {
			this.expirationDateLong = expirationDateLong;
		}

		public Integer getExpirationCurrDateDiff() {
			return this.expirationCurrDateDiff;
		}

		public void setExpirationCurrDateDiff(Integer expirationCurrDateDiff) {
			this.expirationCurrDateDiff = expirationCurrDateDiff;
		}

		public Boolean getPremium() {
			return this.premium;
		}

		public void setPremium(Boolean premium) {
			this.premium = premium;
		}

		public Long getRegistrationDateLong() {
			return this.registrationDateLong;
		}

		public void setRegistrationDateLong(Long registrationDateLong) {
			this.registrationDateLong = registrationDateLong;
		}

		public String getProductId() {
			return this.productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public String getDomainStatus() {
			return this.domainStatus;
		}

		public void setDomainStatus(String domainStatus) {
			this.domainStatus = domainStatus;
		}

		public String getDomainType() {
			return this.domainType;
		}

		public void setDomainType(String domainType) {
			this.domainType = domainType;
		}
	}

	@Override
	public QueryDomainListResponse getInstance(UnmarshallerContext context) {
		return	QueryDomainListResponseUnmarshaller.unmarshall(this, context);
	}
}
