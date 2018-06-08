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

package com.aliyuncs.scdn.model.v20171115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.scdn.transform.v20171115.DescribeScdnServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScdnServiceResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private String openTime;

	private String endTime;

	private String protectType;

	private String protectTypeValue;

	private String bandwidth;

	private String ccProtection;

	private String dDoSBasic;

	private String domainCount;

	private String elasticProtection;

	private String bandwidthValue;

	private String ccProtectionValue;

	private String dDoSBasicValue;

	private String domainCountValue;

	private String elasticProtectionValue;

	private String priceType;

	private String pricingCycle;

	private List<LockReason> operationLocks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getOpenTime() {
		return this.openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getProtectType() {
		return this.protectType;
	}

	public void setProtectType(String protectType) {
		this.protectType = protectType;
	}

	public String getProtectTypeValue() {
		return this.protectTypeValue;
	}

	public void setProtectTypeValue(String protectTypeValue) {
		this.protectTypeValue = protectTypeValue;
	}

	public String getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getCcProtection() {
		return this.ccProtection;
	}

	public void setCcProtection(String ccProtection) {
		this.ccProtection = ccProtection;
	}

	public String getDDoSBasic() {
		return this.dDoSBasic;
	}

	public void setDDoSBasic(String dDoSBasic) {
		this.dDoSBasic = dDoSBasic;
	}

	public String getDomainCount() {
		return this.domainCount;
	}

	public void setDomainCount(String domainCount) {
		this.domainCount = domainCount;
	}

	public String getElasticProtection() {
		return this.elasticProtection;
	}

	public void setElasticProtection(String elasticProtection) {
		this.elasticProtection = elasticProtection;
	}

	public String getBandwidthValue() {
		return this.bandwidthValue;
	}

	public void setBandwidthValue(String bandwidthValue) {
		this.bandwidthValue = bandwidthValue;
	}

	public String getCcProtectionValue() {
		return this.ccProtectionValue;
	}

	public void setCcProtectionValue(String ccProtectionValue) {
		this.ccProtectionValue = ccProtectionValue;
	}

	public String getDDoSBasicValue() {
		return this.dDoSBasicValue;
	}

	public void setDDoSBasicValue(String dDoSBasicValue) {
		this.dDoSBasicValue = dDoSBasicValue;
	}

	public String getDomainCountValue() {
		return this.domainCountValue;
	}

	public void setDomainCountValue(String domainCountValue) {
		this.domainCountValue = domainCountValue;
	}

	public String getElasticProtectionValue() {
		return this.elasticProtectionValue;
	}

	public void setElasticProtectionValue(String elasticProtectionValue) {
		this.elasticProtectionValue = elasticProtectionValue;
	}

	public String getPriceType() {
		return this.priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public String getPricingCycle() {
		return this.pricingCycle;
	}

	public void setPricingCycle(String pricingCycle) {
		this.pricingCycle = pricingCycle;
	}

	public List<LockReason> getOperationLocks() {
		return this.operationLocks;
	}

	public void setOperationLocks(List<LockReason> operationLocks) {
		this.operationLocks = operationLocks;
	}

	public static class LockReason {

		private String lockReason;

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}
	}

	@Override
	public DescribeScdnServiceResponse getInstance(UnmarshallerContext context) {
		return	DescribeScdnServiceResponseUnmarshaller.unmarshall(this, context);
	}
}
