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

package com.aliyuncs.agency.model.v20161118;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.agency.transform.v20161118.QueryConsumeInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryConsumeInstancesResponse extends AcsResponse {

	private Integer currentPage;

	private Boolean success;

	private Long nextPageMinId;

	private String code;

	private String message;

	private Integer pageSize;

	private Integer totalCount;

	private List<ConsumeInstanceModel> data;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getNextPageMinId() {
		return this.nextPageMinId;
	}

	public void setNextPageMinId(Long nextPageMinId) {
		this.nextPageMinId = nextPageMinId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ConsumeInstanceModel> getData() {
		return this.data;
	}

	public void setData(List<ConsumeInstanceModel> data) {
		this.data = data;
	}

	public static class ConsumeInstanceModel {

		private String consumePeriod;

		private String internetIp;

		private String freeAmount;

		private String tag;

		private String serviceStartTime;

		private Long ownerId;

		private String consumeAmount;

		private String serviceDuration;

		private String region;

		private String consumeCategory;

		private Long bizId;

		private String commodityCode;

		private String serviceEndTime;

		private String instanceId;

		private String unclearAmount;

		private String requireAmount;

		private Long buyerId;

		private String intranetIp;

		private String instanceNick;

		private String consumeDetailMap;

		private String payStatus;

		private String consumeTime;

		private String cashPayAmount;

		private String couponPayAmount;

		public String getConsumePeriod() {
			return this.consumePeriod;
		}

		public void setConsumePeriod(String consumePeriod) {
			this.consumePeriod = consumePeriod;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getFreeAmount() {
			return this.freeAmount;
		}

		public void setFreeAmount(String freeAmount) {
			this.freeAmount = freeAmount;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getServiceStartTime() {
			return this.serviceStartTime;
		}

		public void setServiceStartTime(String serviceStartTime) {
			this.serviceStartTime = serviceStartTime;
		}

		public Long getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(Long ownerId) {
			this.ownerId = ownerId;
		}

		public String getConsumeAmount() {
			return this.consumeAmount;
		}

		public void setConsumeAmount(String consumeAmount) {
			this.consumeAmount = consumeAmount;
		}

		public String getServiceDuration() {
			return this.serviceDuration;
		}

		public void setServiceDuration(String serviceDuration) {
			this.serviceDuration = serviceDuration;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getConsumeCategory() {
			return this.consumeCategory;
		}

		public void setConsumeCategory(String consumeCategory) {
			this.consumeCategory = consumeCategory;
		}

		public Long getBizId() {
			return this.bizId;
		}

		public void setBizId(Long bizId) {
			this.bizId = bizId;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getServiceEndTime() {
			return this.serviceEndTime;
		}

		public void setServiceEndTime(String serviceEndTime) {
			this.serviceEndTime = serviceEndTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getUnclearAmount() {
			return this.unclearAmount;
		}

		public void setUnclearAmount(String unclearAmount) {
			this.unclearAmount = unclearAmount;
		}

		public String getRequireAmount() {
			return this.requireAmount;
		}

		public void setRequireAmount(String requireAmount) {
			this.requireAmount = requireAmount;
		}

		public Long getBuyerId() {
			return this.buyerId;
		}

		public void setBuyerId(Long buyerId) {
			this.buyerId = buyerId;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getInstanceNick() {
			return this.instanceNick;
		}

		public void setInstanceNick(String instanceNick) {
			this.instanceNick = instanceNick;
		}

		public String getConsumeDetailMap() {
			return this.consumeDetailMap;
		}

		public void setConsumeDetailMap(String consumeDetailMap) {
			this.consumeDetailMap = consumeDetailMap;
		}

		public String getPayStatus() {
			return this.payStatus;
		}

		public void setPayStatus(String payStatus) {
			this.payStatus = payStatus;
		}

		public String getConsumeTime() {
			return this.consumeTime;
		}

		public void setConsumeTime(String consumeTime) {
			this.consumeTime = consumeTime;
		}

		public String getCashPayAmount() {
			return this.cashPayAmount;
		}

		public void setCashPayAmount(String cashPayAmount) {
			this.cashPayAmount = cashPayAmount;
		}

		public String getCouponPayAmount() {
			return this.couponPayAmount;
		}

		public void setCouponPayAmount(String couponPayAmount) {
			this.couponPayAmount = couponPayAmount;
		}
	}

	@Override
	public QueryConsumeInstancesResponse getInstance(UnmarshallerContext context) {
		return	QueryConsumeInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
