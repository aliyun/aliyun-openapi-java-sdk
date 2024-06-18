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

package com.aliyuncs.domain.model.v20180208;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180208.QueryBrokerDemandResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryBrokerDemandResponse extends AcsResponse {

	private Integer currentPageNum;

	private Integer totalPageNum;

	private Integer pageSize;

	private String requestId;

	private Integer totalItemNum;

	private List<Demand> data;

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

	public List<Demand> getData() {
		return this.data;
	}

	public void setData(List<Demand> data) {
		this.data = data;
	}

	public static class Demand {

		private String status;

		private Float demandPrice;

		private String bizId;

		private String bargainSellerMobile;

		private Long publishTime;

		private Integer produceType;

		private String demandDomain;

		private String description;

		private String mobile;

		private Float servicePayPrice;

		private Float payPrice;

		private Long payTime;

		private Float bargainSellerPrice;

		private Integer orderType;

		private String payDomain;

		private Integer auditStatus;

		private String partnerDomain;

		private Integer purchaseStatus;

		private String email;

		private Float settleBasePrice;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Float getDemandPrice() {
			return this.demandPrice;
		}

		public void setDemandPrice(Float demandPrice) {
			this.demandPrice = demandPrice;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getBargainSellerMobile() {
			return this.bargainSellerMobile;
		}

		public void setBargainSellerMobile(String bargainSellerMobile) {
			this.bargainSellerMobile = bargainSellerMobile;
		}

		public Long getPublishTime() {
			return this.publishTime;
		}

		public void setPublishTime(Long publishTime) {
			this.publishTime = publishTime;
		}

		public Integer getProduceType() {
			return this.produceType;
		}

		public void setProduceType(Integer produceType) {
			this.produceType = produceType;
		}

		public String getDemandDomain() {
			return this.demandDomain;
		}

		public void setDemandDomain(String demandDomain) {
			this.demandDomain = demandDomain;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public Float getServicePayPrice() {
			return this.servicePayPrice;
		}

		public void setServicePayPrice(Float servicePayPrice) {
			this.servicePayPrice = servicePayPrice;
		}

		public Float getPayPrice() {
			return this.payPrice;
		}

		public void setPayPrice(Float payPrice) {
			this.payPrice = payPrice;
		}

		public Long getPayTime() {
			return this.payTime;
		}

		public void setPayTime(Long payTime) {
			this.payTime = payTime;
		}

		public Float getBargainSellerPrice() {
			return this.bargainSellerPrice;
		}

		public void setBargainSellerPrice(Float bargainSellerPrice) {
			this.bargainSellerPrice = bargainSellerPrice;
		}

		public Integer getOrderType() {
			return this.orderType;
		}

		public void setOrderType(Integer orderType) {
			this.orderType = orderType;
		}

		public String getPayDomain() {
			return this.payDomain;
		}

		public void setPayDomain(String payDomain) {
			this.payDomain = payDomain;
		}

		public Integer getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(Integer auditStatus) {
			this.auditStatus = auditStatus;
		}

		public String getPartnerDomain() {
			return this.partnerDomain;
		}

		public void setPartnerDomain(String partnerDomain) {
			this.partnerDomain = partnerDomain;
		}

		public Integer getPurchaseStatus() {
			return this.purchaseStatus;
		}

		public void setPurchaseStatus(Integer purchaseStatus) {
			this.purchaseStatus = purchaseStatus;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Float getSettleBasePrice() {
			return this.settleBasePrice;
		}

		public void setSettleBasePrice(Float settleBasePrice) {
			this.settleBasePrice = settleBasePrice;
		}
	}

	@Override
	public QueryBrokerDemandResponse getInstance(UnmarshallerContext context) {
		return	QueryBrokerDemandResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
