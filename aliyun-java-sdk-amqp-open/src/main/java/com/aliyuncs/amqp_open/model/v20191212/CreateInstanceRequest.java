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

package com.aliyuncs.amqp_open.model.v20191212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.amqp_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateInstanceRequest extends RpcAcsRequest<CreateInstanceResponse> {
	   

	private Long maxPrivateTps;

	private String clientToken;

	private String periodCycle;

	private Integer storageSize;

	private Integer queueCapacity;

	private Integer tracingStorageTime;

	private Integer maxConnections;

	private Boolean supportTracing;

	private String instanceType;

	private Integer autoRenewPeriod;

	private Integer period;

	private Boolean autoRenew;

	private Boolean supportEip;

	private Long maxEipTps;

	private String paymentType;
	public CreateInstanceRequest() {
		super("amqp-open", "2019-12-12", "CreateInstance", "onsproxy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getMaxPrivateTps() {
		return this.maxPrivateTps;
	}

	public void setMaxPrivateTps(Long maxPrivateTps) {
		this.maxPrivateTps = maxPrivateTps;
		if(maxPrivateTps != null){
			putQueryParameter("MaxPrivateTps", maxPrivateTps.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getPeriodCycle() {
		return this.periodCycle;
	}

	public void setPeriodCycle(String periodCycle) {
		this.periodCycle = periodCycle;
		if(periodCycle != null){
			putQueryParameter("PeriodCycle", periodCycle);
		}
	}

	public Integer getStorageSize() {
		return this.storageSize;
	}

	public void setStorageSize(Integer storageSize) {
		this.storageSize = storageSize;
		if(storageSize != null){
			putQueryParameter("StorageSize", storageSize.toString());
		}
	}

	public Integer getQueueCapacity() {
		return this.queueCapacity;
	}

	public void setQueueCapacity(Integer queueCapacity) {
		this.queueCapacity = queueCapacity;
		if(queueCapacity != null){
			putQueryParameter("QueueCapacity", queueCapacity.toString());
		}
	}

	public Integer getTracingStorageTime() {
		return this.tracingStorageTime;
	}

	public void setTracingStorageTime(Integer tracingStorageTime) {
		this.tracingStorageTime = tracingStorageTime;
		if(tracingStorageTime != null){
			putQueryParameter("TracingStorageTime", tracingStorageTime.toString());
		}
	}

	public Integer getMaxConnections() {
		return this.maxConnections;
	}

	public void setMaxConnections(Integer maxConnections) {
		this.maxConnections = maxConnections;
		if(maxConnections != null){
			putQueryParameter("MaxConnections", maxConnections.toString());
		}
	}

	public Boolean getSupportTracing() {
		return this.supportTracing;
	}

	public void setSupportTracing(Boolean supportTracing) {
		this.supportTracing = supportTracing;
		if(supportTracing != null){
			putQueryParameter("SupportTracing", supportTracing.toString());
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public Integer getAutoRenewPeriod() {
		return this.autoRenewPeriod;
	}

	public void setAutoRenewPeriod(Integer autoRenewPeriod) {
		this.autoRenewPeriod = autoRenewPeriod;
		if(autoRenewPeriod != null){
			putQueryParameter("AutoRenewPeriod", autoRenewPeriod.toString());
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew.toString());
		}
	}

	public Boolean getSupportEip() {
		return this.supportEip;
	}

	public void setSupportEip(Boolean supportEip) {
		this.supportEip = supportEip;
		if(supportEip != null){
			putQueryParameter("SupportEip", supportEip.toString());
		}
	}

	public Long getMaxEipTps() {
		return this.maxEipTps;
	}

	public void setMaxEipTps(Long maxEipTps) {
		this.maxEipTps = maxEipTps;
		if(maxEipTps != null){
			putQueryParameter("MaxEipTps", maxEipTps.toString());
		}
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
		if(paymentType != null){
			putQueryParameter("PaymentType", paymentType);
		}
	}

	@Override
	public Class<CreateInstanceResponse> getResponseClass() {
		return CreateInstanceResponse.class;
	}

}
