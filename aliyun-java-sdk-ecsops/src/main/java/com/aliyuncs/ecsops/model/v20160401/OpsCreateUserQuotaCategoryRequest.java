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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsCreateUserQuotaCategoryRequest extends RpcAcsRequest<OpsCreateUserQuotaCategoryResponse> {
	   

	private Long burstQuota;

	private Long reservedQuota;

	private Integer networkType;

	private Long resourceType;

	private String operator;

	private String quotaUnit;

	private String zoneId;

	private String categoryName;

	private String resourceName;

	private Integer payType;

	private Long baseQuota;

	private String auditParamStr;
	public OpsCreateUserQuotaCategoryRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateUserQuotaCategory", "ecsops");
		setMethod(MethodType.POST);
	}

	public Long getBurstQuota() {
		return this.burstQuota;
	}

	public void setBurstQuota(Long burstQuota) {
		this.burstQuota = burstQuota;
		if(burstQuota != null){
			putQueryParameter("BurstQuota", burstQuota.toString());
		}
	}

	public Long getReservedQuota() {
		return this.reservedQuota;
	}

	public void setReservedQuota(Long reservedQuota) {
		this.reservedQuota = reservedQuota;
		if(reservedQuota != null){
			putQueryParameter("ReservedQuota", reservedQuota.toString());
		}
	}

	public Integer getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(Integer networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType.toString());
		}
	}

	public Long getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(Long resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType.toString());
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

	public String getQuotaUnit() {
		return this.quotaUnit;
	}

	public void setQuotaUnit(String quotaUnit) {
		this.quotaUnit = quotaUnit;
		if(quotaUnit != null){
			putQueryParameter("QuotaUnit", quotaUnit);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
		if(categoryName != null){
			putQueryParameter("CategoryName", categoryName);
		}
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
		if(resourceName != null){
			putQueryParameter("ResourceName", resourceName);
		}
	}

	public Integer getPayType() {
		return this.payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType.toString());
		}
	}

	public Long getBaseQuota() {
		return this.baseQuota;
	}

	public void setBaseQuota(Long baseQuota) {
		this.baseQuota = baseQuota;
		if(baseQuota != null){
			putQueryParameter("BaseQuota", baseQuota.toString());
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsCreateUserQuotaCategoryResponse> getResponseClass() {
		return OpsCreateUserQuotaCategoryResponse.class;
	}

}
