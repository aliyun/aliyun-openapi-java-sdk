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
import com.aliyuncs.domain.transform.v20180129.ScrollDomainListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ScrollDomainListResponse extends AcsResponse {

	private String requestId;

	private Integer totalItemNum;

	private Integer pageSize;

	private String scrollId;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getScrollId() {
		return this.scrollId;
	}

	public void setScrollId(String scrollId) {
		this.scrollId = scrollId;
	}

	public List<Domain> getData() {
		return this.data;
	}

	public void setData(List<Domain> data) {
		this.data = data;
	}

	public static class Domain {

		private String domainName;

		private String instanceId;

		private String expirationDate;

		private String registrationDate;

		private String domainType;

		private String domainStatus;

		private String productId;

		private Long expirationDateLong;

		private Long registrationDateLong;

		private Boolean premium;

		private String domainAuditStatus;

		private String expirationDateStatus;

		private String registrantType;

		private String domainGroupId;

		private String remark;

		private String domainGroupName;

		private Integer expirationCurrDateDiff;

		private String email;

		private String zhRegistrantOrganization;

		private String registrantOrganization;

		private List<String> dnsList;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getExpirationDate() {
			return this.expirationDate;
		}

		public void setExpirationDate(String expirationDate) {
			this.expirationDate = expirationDate;
		}

		public String getRegistrationDate() {
			return this.registrationDate;
		}

		public void setRegistrationDate(String registrationDate) {
			this.registrationDate = registrationDate;
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

		public String getProductId() {
			return this.productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public Long getExpirationDateLong() {
			return this.expirationDateLong;
		}

		public void setExpirationDateLong(Long expirationDateLong) {
			this.expirationDateLong = expirationDateLong;
		}

		public Long getRegistrationDateLong() {
			return this.registrationDateLong;
		}

		public void setRegistrationDateLong(Long registrationDateLong) {
			this.registrationDateLong = registrationDateLong;
		}

		public Boolean getPremium() {
			return this.premium;
		}

		public void setPremium(Boolean premium) {
			this.premium = premium;
		}

		public String getDomainAuditStatus() {
			return this.domainAuditStatus;
		}

		public void setDomainAuditStatus(String domainAuditStatus) {
			this.domainAuditStatus = domainAuditStatus;
		}

		public String getExpirationDateStatus() {
			return this.expirationDateStatus;
		}

		public void setExpirationDateStatus(String expirationDateStatus) {
			this.expirationDateStatus = expirationDateStatus;
		}

		public String getRegistrantType() {
			return this.registrantType;
		}

		public void setRegistrantType(String registrantType) {
			this.registrantType = registrantType;
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

		public Integer getExpirationCurrDateDiff() {
			return this.expirationCurrDateDiff;
		}

		public void setExpirationCurrDateDiff(Integer expirationCurrDateDiff) {
			this.expirationCurrDateDiff = expirationCurrDateDiff;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getZhRegistrantOrganization() {
			return this.zhRegistrantOrganization;
		}

		public void setZhRegistrantOrganization(String zhRegistrantOrganization) {
			this.zhRegistrantOrganization = zhRegistrantOrganization;
		}

		public String getRegistrantOrganization() {
			return this.registrantOrganization;
		}

		public void setRegistrantOrganization(String registrantOrganization) {
			this.registrantOrganization = registrantOrganization;
		}

		public List<String> getDnsList() {
			return this.dnsList;
		}

		public void setDnsList(List<String> dnsList) {
			this.dnsList = dnsList;
		}
	}

	@Override
	public ScrollDomainListResponse getInstance(UnmarshallerContext context) {
		return	ScrollDomainListResponseUnmarshaller.unmarshall(this, context);
	}
}
