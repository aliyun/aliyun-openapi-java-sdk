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

package com.aliyuncs.unimkt.model.v20181207;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ServingPlanMigrateRequest extends RpcAcsRequest<ServingPlanMigrateResponse> {
	   

	private String quotaPerDay;

	private String brandUserId;

	private String endTime;

	private String brandUserNick;

	private String startTime;

	private String proxyUserId;

	private String bizType;

	private String quota;

	private String name;

	private String proxyUserNick;

	private String payType;

	private String taskId;

	private String status;
	public ServingPlanMigrateRequest() {
		super("UniMkt", "2018-12-07", "ServingPlanMigrate", "1.0.0");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQuotaPerDay() {
		return this.quotaPerDay;
	}

	public void setQuotaPerDay(String quotaPerDay) {
		this.quotaPerDay = quotaPerDay;
		if(quotaPerDay != null){
			putBodyParameter("QuotaPerDay", quotaPerDay);
		}
	}

	public String getBrandUserId() {
		return this.brandUserId;
	}

	public void setBrandUserId(String brandUserId) {
		this.brandUserId = brandUserId;
		if(brandUserId != null){
			putBodyParameter("BrandUserId", brandUserId);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime);
		}
	}

	public String getBrandUserNick() {
		return this.brandUserNick;
	}

	public void setBrandUserNick(String brandUserNick) {
		this.brandUserNick = brandUserNick;
		if(brandUserNick != null){
			putBodyParameter("BrandUserNick", brandUserNick);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime);
		}
	}

	public String getProxyUserId() {
		return this.proxyUserId;
	}

	public void setProxyUserId(String proxyUserId) {
		this.proxyUserId = proxyUserId;
		if(proxyUserId != null){
			putBodyParameter("ProxyUserId", proxyUserId);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putBodyParameter("BizType", bizType);
		}
	}

	public String getQuota() {
		return this.quota;
	}

	public void setQuota(String quota) {
		this.quota = quota;
		if(quota != null){
			putBodyParameter("Quota", quota);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getProxyUserNick() {
		return this.proxyUserNick;
	}

	public void setProxyUserNick(String proxyUserNick) {
		this.proxyUserNick = proxyUserNick;
		if(proxyUserNick != null){
			putBodyParameter("ProxyUserNick", proxyUserNick);
		}
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putBodyParameter("PayType", payType);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("TaskId", taskId);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<ServingPlanMigrateResponse> getResponseClass() {
		return ServingPlanMigrateResponse.class;
	}

}
