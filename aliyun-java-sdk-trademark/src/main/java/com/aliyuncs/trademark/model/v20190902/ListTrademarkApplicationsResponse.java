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
import com.aliyuncs.trademark.transform.v20190902.ListTrademarkApplicationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTrademarkApplicationsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<TrademarkApplication> trademarkApplications;

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

	public List<TrademarkApplication> getTrademarkApplications() {
		return this.trademarkApplications;
	}

	public void setTrademarkApplications(List<TrademarkApplication> trademarkApplications) {
		this.trademarkApplications = trademarkApplications;
	}

	public static class TrademarkApplication {

		private String bizId;

		private String orderId;

		private String applicantName;

		private String trademarkIcon;

		private String trademarkName;

		private String trademarkNumber;

		private Long createTime;

		private Integer applicationType;

		private Integer applicationStatus;

		private String userId;

		private Float orderPrice;

		private Long applicantId;

		private String authorizationUrl;

		private String note;

		private Long updateTime;

		private Integer supplementStatus;

		private Long supplementId;

		private Float totalPrice;

		private Float servicePrice;

		private List<ThirdClassificationItem> thirdClassification;

		private List<String> flags;

		private FirstClassification firstClassification;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
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

		public String getTrademarkName() {
			return this.trademarkName;
		}

		public void setTrademarkName(String trademarkName) {
			this.trademarkName = trademarkName;
		}

		public String getTrademarkNumber() {
			return this.trademarkNumber;
		}

		public void setTrademarkNumber(String trademarkNumber) {
			this.trademarkNumber = trademarkNumber;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Integer getApplicationType() {
			return this.applicationType;
		}

		public void setApplicationType(Integer applicationType) {
			this.applicationType = applicationType;
		}

		public Integer getApplicationStatus() {
			return this.applicationStatus;
		}

		public void setApplicationStatus(Integer applicationStatus) {
			this.applicationStatus = applicationStatus;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Float getOrderPrice() {
			return this.orderPrice;
		}

		public void setOrderPrice(Float orderPrice) {
			this.orderPrice = orderPrice;
		}

		public Long getApplicantId() {
			return this.applicantId;
		}

		public void setApplicantId(Long applicantId) {
			this.applicantId = applicantId;
		}

		public String getAuthorizationUrl() {
			return this.authorizationUrl;
		}

		public void setAuthorizationUrl(String authorizationUrl) {
			this.authorizationUrl = authorizationUrl;
		}

		public String getNote() {
			return this.note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Integer getSupplementStatus() {
			return this.supplementStatus;
		}

		public void setSupplementStatus(Integer supplementStatus) {
			this.supplementStatus = supplementStatus;
		}

		public Long getSupplementId() {
			return this.supplementId;
		}

		public void setSupplementId(Long supplementId) {
			this.supplementId = supplementId;
		}

		public Float getTotalPrice() {
			return this.totalPrice;
		}

		public void setTotalPrice(Float totalPrice) {
			this.totalPrice = totalPrice;
		}

		public Float getServicePrice() {
			return this.servicePrice;
		}

		public void setServicePrice(Float servicePrice) {
			this.servicePrice = servicePrice;
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

			private String classificationCode;

			private String classificationName;

			public String getClassificationCode() {
				return this.classificationCode;
			}

			public void setClassificationCode(String classificationCode) {
				this.classificationCode = classificationCode;
			}

			public String getClassificationName() {
				return this.classificationName;
			}

			public void setClassificationName(String classificationName) {
				this.classificationName = classificationName;
			}
		}

		public static class FirstClassification {

			private String classificationCode;

			private String classificationName;

			public String getClassificationCode() {
				return this.classificationCode;
			}

			public void setClassificationCode(String classificationCode) {
				this.classificationCode = classificationCode;
			}

			public String getClassificationName() {
				return this.classificationName;
			}

			public void setClassificationName(String classificationName) {
				this.classificationName = classificationName;
			}
		}
	}

	@Override
	public ListTrademarkApplicationsResponse getInstance(UnmarshallerContext context) {
		return	ListTrademarkApplicationsResponseUnmarshaller.unmarshall(this, context);
	}
}
