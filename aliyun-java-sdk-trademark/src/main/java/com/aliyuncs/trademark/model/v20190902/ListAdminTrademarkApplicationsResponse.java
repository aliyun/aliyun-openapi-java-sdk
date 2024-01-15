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

package com.aliyuncs.trademark.model.v20190902;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20190902.ListAdminTrademarkApplicationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAdminTrademarkApplicationsResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<TrademarkApplication> trademarkApplications;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<TrademarkApplication> getTrademarkApplications() {
		return this.trademarkApplications;
	}

	public void setTrademarkApplications(List<TrademarkApplication> trademarkApplications) {
		this.trademarkApplications = trademarkApplications;
	}

	public static class TrademarkApplication {

		private String trademarkName;

		private Float orderPrice;

		private Long updateTime;

		private Long createTime;

		private String authorizationUrl;

		private String userId;

		private Integer applicationType;

		private String bizId;

		private Float servicePrice;

		private String applicantName;

		private String trademarkIcon;

		private Long applicantId;

		private Long supplementId;

		private Integer applicationStatus;

		private String trademarkNumber;

		private String note;

		private Integer principalName;

		private Integer supplementStatus;

		private Float totalPrice;

		private String orderId;

		private String systemVersion;

		private List<ThirdClassificationItem> thirdClassification;

		private List<String> flags;

		private FirstClassification firstClassification;

		public String getTrademarkName() {
			return this.trademarkName;
		}

		public void setTrademarkName(String trademarkName) {
			this.trademarkName = trademarkName;
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

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getAuthorizationUrl() {
			return this.authorizationUrl;
		}

		public void setAuthorizationUrl(String authorizationUrl) {
			this.authorizationUrl = authorizationUrl;
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

		public Float getServicePrice() {
			return this.servicePrice;
		}

		public void setServicePrice(Float servicePrice) {
			this.servicePrice = servicePrice;
		}

		public String getApplicantName() {
			return this.applicantName;
		}

		public void setApplicantName(String applicantName) {
			this.applicantName = applicantName;
		}

		public String getTrademarkIcon() {
			return this.trademarkIcon;
		}

		public void setTrademarkIcon(String trademarkIcon) {
			this.trademarkIcon = trademarkIcon;
		}

		public Long getApplicantId() {
			return this.applicantId;
		}

		public void setApplicantId(Long applicantId) {
			this.applicantId = applicantId;
		}

		public Long getSupplementId() {
			return this.supplementId;
		}

		public void setSupplementId(Long supplementId) {
			this.supplementId = supplementId;
		}

		public Integer getApplicationStatus() {
			return this.applicationStatus;
		}

		public void setApplicationStatus(Integer applicationStatus) {
			this.applicationStatus = applicationStatus;
		}

		public String getTrademarkNumber() {
			return this.trademarkNumber;
		}

		public void setTrademarkNumber(String trademarkNumber) {
			this.trademarkNumber = trademarkNumber;
		}

		public String getNote() {
			return this.note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public Integer getPrincipalName() {
			return this.principalName;
		}

		public void setPrincipalName(Integer principalName) {
			this.principalName = principalName;
		}

		public Integer getSupplementStatus() {
			return this.supplementStatus;
		}

		public void setSupplementStatus(Integer supplementStatus) {
			this.supplementStatus = supplementStatus;
		}

		public Float getTotalPrice() {
			return this.totalPrice;
		}

		public void setTotalPrice(Float totalPrice) {
			this.totalPrice = totalPrice;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getSystemVersion() {
			return this.systemVersion;
		}

		public void setSystemVersion(String systemVersion) {
			this.systemVersion = systemVersion;
		}

		public List<ThirdClassificationItem> getThirdClassification() {
			return this.thirdClassification;
		}

		public void setThirdClassification(List<ThirdClassificationItem> thirdClassification) {
			this.thirdClassification = thirdClassification;
		}

		public List<String> getFlags() {
			return this.flags;
		}

		public void setFlags(List<String> flags) {
			this.flags = flags;
		}

		public FirstClassification getFirstClassification() {
			return this.firstClassification;
		}

		public void setFirstClassification(FirstClassification firstClassification) {
			this.firstClassification = firstClassification;
		}

		public static class ThirdClassificationItem {

			private String classificationName;

			private String classificationCode;

			public String getClassificationName() {
				return this.classificationName;
			}

			public void setClassificationName(String classificationName) {
				this.classificationName = classificationName;
			}

			public String getClassificationCode() {
				return this.classificationCode;
			}

			public void setClassificationCode(String classificationCode) {
				this.classificationCode = classificationCode;
			}
		}

		public static class FirstClassification {

			private String classificationName;

			private String classificationCode;

			public String getClassificationName() {
				return this.classificationName;
			}

			public void setClassificationName(String classificationName) {
				this.classificationName = classificationName;
			}

			public String getClassificationCode() {
				return this.classificationCode;
			}

			public void setClassificationCode(String classificationCode) {
				this.classificationCode = classificationCode;
			}
		}
	}

	@Override
	public ListAdminTrademarkApplicationsResponse getInstance(UnmarshallerContext context) {
		return	ListAdminTrademarkApplicationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
