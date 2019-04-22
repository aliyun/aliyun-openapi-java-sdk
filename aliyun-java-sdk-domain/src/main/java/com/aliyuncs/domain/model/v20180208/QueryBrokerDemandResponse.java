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

	private String requestId;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer pageSize;

	private Integer totalPageNum;

	private List<Demand> data;

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

	public List<Demand> getData() {
		return this.data;
	}

	public void setData(List<Demand> data) {
		this.data = data;
	}

	public static class Demand {

		private String bizId;

		private String status;

		private String demandDomain;

		private Float demandPrice;

		private String mobile;

		private String description;

		private Long publishTime;

		private String payDomain;

		private Float payPrice;

		private Long payTime;

		private Integer produceType;

		private Float bargainSellerPrice;

		private String bargainSellerMobile;

		private Float servicePayPrice;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDemandDomain() {
			return this.demandDomain;
		}

		public void setDemandDomain(String demandDomain) {
			this.demandDomain = demandDomain;
		}

		public Float getDemandPrice() {
			return this.demandPrice;
		}

		public void setDemandPrice(Float demandPrice) {
			this.demandPrice = demandPrice;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getPublishTime() {
			return this.publishTime;
		}

		public void setPublishTime(Long publishTime) {
			this.publishTime = publishTime;
		}

		public String getPayDomain() {
			return this.payDomain;
		}

		public void setPayDomain(String payDomain) {
			this.payDomain = payDomain;
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

		public Integer getProduceType() {
			return this.produceType;
		}

		public void setProduceType(Integer produceType) {
			this.produceType = produceType;
		}

		public Float getBargainSellerPrice() {
			return this.bargainSellerPrice;
		}

		public void setBargainSellerPrice(Float bargainSellerPrice) {
			this.bargainSellerPrice = bargainSellerPrice;
		}

		public String getBargainSellerMobile() {
			return this.bargainSellerMobile;
		}

		public void setBargainSellerMobile(String bargainSellerMobile) {
			this.bargainSellerMobile = bargainSellerMobile;
		}

		public Float getServicePayPrice() {
			return this.servicePayPrice;
		}

		public void setServicePayPrice(Float servicePayPrice) {
			this.servicePayPrice = servicePayPrice;
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
