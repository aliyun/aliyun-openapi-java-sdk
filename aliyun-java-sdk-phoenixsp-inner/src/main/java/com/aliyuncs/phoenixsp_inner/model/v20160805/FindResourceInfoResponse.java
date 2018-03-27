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

package com.aliyuncs.phoenixsp_inner.model.v20160805;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.phoenixsp_inner.transform.v20160805.FindResourceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindResourceInfoResponse extends AcsResponse {

	private String requestId;

	private String code;

	private Integer count;

	private List<Data> datas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Data> getDatas() {
		return this.datas;
	}

	public void setDatas(List<Data> datas) {
		this.datas = datas;
	}

	public static class Data {

		private Long aliuid;

		private Long buyerId;

		private String instanceId;

		private String region;

		private String resourceType;

		private String chargeType;

		private Long endTime;

		private Long releaseTime;

		private Long extraEndTime;

		private Long resCreateTime;

		private String billingTag;

		private String commodityCode;

		private String resourceStatus;

		private String resourceSubStatus;

		private Long expectedReleaseTime;

		private String bid;

		private Boolean autoRenewal;

		private String renewalStatus;

		private Integer renewalDuration;

		private Integer renewalCycUnit;

		private String saleCycle;

		private String marketType;

		public Long getAliuid() {
			return this.aliuid;
		}

		public void setAliuid(Long aliuid) {
			this.aliuid = aliuid;
		}

		public Long getBuyerId() {
			return this.buyerId;
		}

		public void setBuyerId(Long buyerId) {
			this.buyerId = buyerId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getReleaseTime() {
			return this.releaseTime;
		}

		public void setReleaseTime(Long releaseTime) {
			this.releaseTime = releaseTime;
		}

		public Long getExtraEndTime() {
			return this.extraEndTime;
		}

		public void setExtraEndTime(Long extraEndTime) {
			this.extraEndTime = extraEndTime;
		}

		public Long getResCreateTime() {
			return this.resCreateTime;
		}

		public void setResCreateTime(Long resCreateTime) {
			this.resCreateTime = resCreateTime;
		}

		public String getBillingTag() {
			return this.billingTag;
		}

		public void setBillingTag(String billingTag) {
			this.billingTag = billingTag;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getResourceStatus() {
			return this.resourceStatus;
		}

		public void setResourceStatus(String resourceStatus) {
			this.resourceStatus = resourceStatus;
		}

		public String getResourceSubStatus() {
			return this.resourceSubStatus;
		}

		public void setResourceSubStatus(String resourceSubStatus) {
			this.resourceSubStatus = resourceSubStatus;
		}

		public Long getExpectedReleaseTime() {
			return this.expectedReleaseTime;
		}

		public void setExpectedReleaseTime(Long expectedReleaseTime) {
			this.expectedReleaseTime = expectedReleaseTime;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public Boolean getAutoRenewal() {
			return this.autoRenewal;
		}

		public void setAutoRenewal(Boolean autoRenewal) {
			this.autoRenewal = autoRenewal;
		}

		public String getRenewalStatus() {
			return this.renewalStatus;
		}

		public void setRenewalStatus(String renewalStatus) {
			this.renewalStatus = renewalStatus;
		}

		public Integer getRenewalDuration() {
			return this.renewalDuration;
		}

		public void setRenewalDuration(Integer renewalDuration) {
			this.renewalDuration = renewalDuration;
		}

		public Integer getRenewalCycUnit() {
			return this.renewalCycUnit;
		}

		public void setRenewalCycUnit(Integer renewalCycUnit) {
			this.renewalCycUnit = renewalCycUnit;
		}

		public String getSaleCycle() {
			return this.saleCycle;
		}

		public void setSaleCycle(String saleCycle) {
			this.saleCycle = saleCycle;
		}

		public String getMarketType() {
			return this.marketType;
		}

		public void setMarketType(String marketType) {
			this.marketType = marketType;
		}
	}

	@Override
	public FindResourceInfoResponse getInstance(UnmarshallerContext context) {
		return	FindResourceInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
