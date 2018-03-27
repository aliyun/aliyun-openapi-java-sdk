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

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ResetAutoRenewalResourceRequest extends RpcAcsRequest<ResetAutoRenewalResourceResponse> {
	
	public ResetAutoRenewalResourceRequest() {
		super("Phoenixsp-inner", "2016-08-05", "ResetAutoRenewalResource");
	}

	private String instanceNames;

	private String caller;

	private Integer renewalDuration;

	private Boolean autoRenewal;

	private String renewalStatus;

	private String saleCycle;

	private String autoRenewalOffsetDays;

	private Long aliUID;

	private Integer renewalCycUnit;

	private String bid;

	private String resourceType;

	private String operator;

	public String getInstanceNames() {
		return this.instanceNames;
	}

	public void setInstanceNames(String instanceNames) {
		this.instanceNames = instanceNames;
		if(instanceNames != null){
			putQueryParameter("InstanceNames", instanceNames);
		}
	}

	public String getCaller() {
		return this.caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
		if(caller != null){
			putQueryParameter("Caller", caller);
		}
	}

	public Integer getRenewalDuration() {
		return this.renewalDuration;
	}

	public void setRenewalDuration(Integer renewalDuration) {
		this.renewalDuration = renewalDuration;
		if(renewalDuration != null){
			putQueryParameter("RenewalDuration", renewalDuration.toString());
		}
	}

	public Boolean getAutoRenewal() {
		return this.autoRenewal;
	}

	public void setAutoRenewal(Boolean autoRenewal) {
		this.autoRenewal = autoRenewal;
		if(autoRenewal != null){
			putQueryParameter("AutoRenewal", autoRenewal.toString());
		}
	}

	public String getRenewalStatus() {
		return this.renewalStatus;
	}

	public void setRenewalStatus(String renewalStatus) {
		this.renewalStatus = renewalStatus;
		if(renewalStatus != null){
			putQueryParameter("RenewalStatus", renewalStatus);
		}
	}

	public String getSaleCycle() {
		return this.saleCycle;
	}

	public void setSaleCycle(String saleCycle) {
		this.saleCycle = saleCycle;
		if(saleCycle != null){
			putQueryParameter("SaleCycle", saleCycle);
		}
	}

	public String getAutoRenewalOffsetDays() {
		return this.autoRenewalOffsetDays;
	}

	public void setAutoRenewalOffsetDays(String autoRenewalOffsetDays) {
		this.autoRenewalOffsetDays = autoRenewalOffsetDays;
		if(autoRenewalOffsetDays != null){
			putQueryParameter("AutoRenewalOffsetDays", autoRenewalOffsetDays);
		}
	}

	public Long getAliUID() {
		return this.aliUID;
	}

	public void setAliUID(Long aliUID) {
		this.aliUID = aliUID;
		if(aliUID != null){
			putQueryParameter("AliUID", aliUID.toString());
		}
	}

	public Integer getRenewalCycUnit() {
		return this.renewalCycUnit;
	}

	public void setRenewalCycUnit(Integer renewalCycUnit) {
		this.renewalCycUnit = renewalCycUnit;
		if(renewalCycUnit != null){
			putQueryParameter("RenewalCycUnit", renewalCycUnit.toString());
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	@Override
	public Class<ResetAutoRenewalResourceResponse> getResponseClass() {
		return ResetAutoRenewalResourceResponse.class;
	}

}
