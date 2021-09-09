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

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private String source;

	private List<Application> applications;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public List<Application> getApplications() {
		return this.applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	public static class Application {

		private String orderId;

		private Float orderPrice;

		private Integer applicationStatus;

		private String companyName;

		private String legalPersonName;

		private Integer applicationType;

		private String companyAddress;

		private String domain;

		private Boolean includeForeignInvestment;

		private String partnerCode;

		private String userId;

		private String bizId;

		private String intentionBizId;

		private String companyArea;

		private Long updateTime;

		private Integer type;

		private String actionType;

		private String version;

		private String produceVersion;

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public Float getOrderPrice() {
			return this.orderPrice;
		}

		public void setOrderPrice(Float orderPrice) {
			this.orderPrice = orderPrice;
		}

		public Integer getApplicationStatus() {
			return this.applicationStatus;
		}

		public void setApplicationStatus(Integer applicationStatus) {
			this.applicationStatus = applicationStatus;
		}

		public String getCompanyName() {
			return this.companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getLegalPersonName() {
			return this.legalPersonName;
		}

		public void setLegalPersonName(String legalPersonName) {
			this.legalPersonName = legalPersonName;
		}

		public Integer getApplicationType() {
			return this.applicationType;
		}

		public void setApplicationType(Integer applicationType) {
			this.applicationType = applicationType;
		}

		public String getCompanyAddress() {
			return this.companyAddress;
		}

		public void setCompanyAddress(String companyAddress) {
			this.companyAddress = companyAddress;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Boolean getIncludeForeignInvestment() {
			return this.includeForeignInvestment;
		}

		public void setIncludeForeignInvestment(Boolean includeForeignInvestment) {
			this.includeForeignInvestment = includeForeignInvestment;
		}

		public String getPartnerCode() {
			return this.partnerCode;
		}

		public void setPartnerCode(String partnerCode) {
			this.partnerCode = partnerCode;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getIntentionBizId() {
			return this.intentionBizId;
		}

		public void setIntentionBizId(String intentionBizId) {
			this.intentionBizId = intentionBizId;
		}

		public String getCompanyArea() {
			return this.companyArea;
		}

		public void setCompanyArea(String companyArea) {
			this.companyArea = companyArea;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public String getActionType() {
			return this.actionType;
		}

		public void setActionType(String actionType) {
			this.actionType = actionType;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getProduceVersion() {
			return this.produceVersion;
		}

		public void setProduceVersion(String produceVersion) {
			this.produceVersion = produceVersion;
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
