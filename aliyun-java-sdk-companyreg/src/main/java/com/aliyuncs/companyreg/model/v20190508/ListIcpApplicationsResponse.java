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

package com.aliyuncs.companyreg.model.v20190508;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20190508.ListIcpApplicationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIcpApplicationsResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private String source;

	private Integer totalCount;

	private List<Application> applications;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Application> getApplications() {
		return this.applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	public static class Application {

		private Integer type;

		private Float orderPrice;

		private Long updateTime;

		private String domain;

		private String produceVersion;

		private String actionType;

		private String userId;

		private Integer applicationType;

		private String bizId;

		private String partnerCode;

		private Boolean includeForeignInvestment;

		private String intentionBizId;

		private String companyAddress;

		private String legalPersonName;

		private String version;

		private Integer applicationStatus;

		private String companyArea;

		private String orderId;

		private String companyName;

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Float getOrderPrice() {
			return this.orderPrice;
		}

		public void setOrderPrice(Float orderPrice) {
			this.orderPrice = orderPrice;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getProduceVersion() {
			return this.produceVersion;
		}

		public void setProduceVersion(String produceVersion) {
			this.produceVersion = produceVersion;
		}

		public String getActionType() {
			return this.actionType;
		}

		public void setActionType(String actionType) {
			this.actionType = actionType;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Integer getApplicationType() {
			return this.applicationType;
		}

		public void setApplicationType(Integer applicationType) {
			this.applicationType = applicationType;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getPartnerCode() {
			return this.partnerCode;
		}

		public void setPartnerCode(String partnerCode) {
			this.partnerCode = partnerCode;
		}

		public Boolean getIncludeForeignInvestment() {
			return this.includeForeignInvestment;
		}

		public void setIncludeForeignInvestment(Boolean includeForeignInvestment) {
			this.includeForeignInvestment = includeForeignInvestment;
		}

		public String getIntentionBizId() {
			return this.intentionBizId;
		}

		public void setIntentionBizId(String intentionBizId) {
			this.intentionBizId = intentionBizId;
		}

		public String getCompanyAddress() {
			return this.companyAddress;
		}

		public void setCompanyAddress(String companyAddress) {
			this.companyAddress = companyAddress;
		}

		public String getLegalPersonName() {
			return this.legalPersonName;
		}

		public void setLegalPersonName(String legalPersonName) {
			this.legalPersonName = legalPersonName;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public Integer getApplicationStatus() {
			return this.applicationStatus;
		}

		public void setApplicationStatus(Integer applicationStatus) {
			this.applicationStatus = applicationStatus;
		}

		public String getCompanyArea() {
			return this.companyArea;
		}

		public void setCompanyArea(String companyArea) {
			this.companyArea = companyArea;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getCompanyName() {
			return this.companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
	}

	@Override
	public ListIcpApplicationsResponse getInstance(UnmarshallerContext context) {
		return	ListIcpApplicationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
