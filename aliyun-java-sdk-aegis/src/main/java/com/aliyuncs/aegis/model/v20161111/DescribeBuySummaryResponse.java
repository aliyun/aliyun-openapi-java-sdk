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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeBuySummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBuySummaryResponse extends AcsResponse {

	private String requestId;

	private BuySummary buySummary;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public BuySummary getBuySummary() {
		return this.buySummary;
	}

	public void setBuySummary(BuySummary buySummary) {
		this.buySummary = buySummary;
	}

	public static class BuySummary {

		private Long expireDateTimestamp;

		private Long purchaseDate;

		private String buyVersion;

		private Integer safePointSurplusDays;

		private Integer safePointdailyCost;

		private Integer capacity;

		private Integer totalMachineNum;

		private Boolean canApplyTrial;

		private String instanceId;

		private Integer useCapacity;

		private Boolean canAccessHidden;

		private Boolean buyStatus;

		private String buyType;

		private Long expireDate;

		private Integer safePointCapacity;

		private Boolean needFeedBack;

		private String safePointBuyVersion;

		private String originalVersion;

		private String originalBuyType;

		private Long safePointExpireDate;

		private Integer specialCount;

		public Long getExpireDateTimestamp() {
			return this.expireDateTimestamp;
		}

		public void setExpireDateTimestamp(Long expireDateTimestamp) {
			this.expireDateTimestamp = expireDateTimestamp;
		}

		public Long getPurchaseDate() {
			return this.purchaseDate;
		}

		public void setPurchaseDate(Long purchaseDate) {
			this.purchaseDate = purchaseDate;
		}

		public String getBuyVersion() {
			return this.buyVersion;
		}

		public void setBuyVersion(String buyVersion) {
			this.buyVersion = buyVersion;
		}

		public Integer getSafePointSurplusDays() {
			return this.safePointSurplusDays;
		}

		public void setSafePointSurplusDays(Integer safePointSurplusDays) {
			this.safePointSurplusDays = safePointSurplusDays;
		}

		public Integer getSafePointdailyCost() {
			return this.safePointdailyCost;
		}

		public void setSafePointdailyCost(Integer safePointdailyCost) {
			this.safePointdailyCost = safePointdailyCost;
		}

		public Integer getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Integer capacity) {
			this.capacity = capacity;
		}

		public Integer getTotalMachineNum() {
			return this.totalMachineNum;
		}

		public void setTotalMachineNum(Integer totalMachineNum) {
			this.totalMachineNum = totalMachineNum;
		}

		public Boolean getCanApplyTrial() {
			return this.canApplyTrial;
		}

		public void setCanApplyTrial(Boolean canApplyTrial) {
			this.canApplyTrial = canApplyTrial;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getUseCapacity() {
			return this.useCapacity;
		}

		public void setUseCapacity(Integer useCapacity) {
			this.useCapacity = useCapacity;
		}

		public Boolean getCanAccessHidden() {
			return this.canAccessHidden;
		}

		public void setCanAccessHidden(Boolean canAccessHidden) {
			this.canAccessHidden = canAccessHidden;
		}

		public Boolean getBuyStatus() {
			return this.buyStatus;
		}

		public void setBuyStatus(Boolean buyStatus) {
			this.buyStatus = buyStatus;
		}

		public String getBuyType() {
			return this.buyType;
		}

		public void setBuyType(String buyType) {
			this.buyType = buyType;
		}

		public Long getExpireDate() {
			return this.expireDate;
		}

		public void setExpireDate(Long expireDate) {
			this.expireDate = expireDate;
		}

		public Integer getSafePointCapacity() {
			return this.safePointCapacity;
		}

		public void setSafePointCapacity(Integer safePointCapacity) {
			this.safePointCapacity = safePointCapacity;
		}

		public Boolean getNeedFeedBack() {
			return this.needFeedBack;
		}

		public void setNeedFeedBack(Boolean needFeedBack) {
			this.needFeedBack = needFeedBack;
		}

		public String getSafePointBuyVersion() {
			return this.safePointBuyVersion;
		}

		public void setSafePointBuyVersion(String safePointBuyVersion) {
			this.safePointBuyVersion = safePointBuyVersion;
		}

		public String getOriginalVersion() {
			return this.originalVersion;
		}

		public void setOriginalVersion(String originalVersion) {
			this.originalVersion = originalVersion;
		}

		public String getOriginalBuyType() {
			return this.originalBuyType;
		}

		public void setOriginalBuyType(String originalBuyType) {
			this.originalBuyType = originalBuyType;
		}

		public Long getSafePointExpireDate() {
			return this.safePointExpireDate;
		}

		public void setSafePointExpireDate(Long safePointExpireDate) {
			this.safePointExpireDate = safePointExpireDate;
		}

		public Integer getSpecialCount() {
			return this.specialCount;
		}

		public void setSpecialCount(Integer specialCount) {
			this.specialCount = specialCount;
		}
	}

	@Override
	public DescribeBuySummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeBuySummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
