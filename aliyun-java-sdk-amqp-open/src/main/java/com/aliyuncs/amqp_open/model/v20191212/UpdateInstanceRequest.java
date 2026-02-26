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
public class UpdateInstanceRequest extends RpcAcsRequest<UpdateInstanceResponse> {
	   

	private Long maxPrivateTps;

	private String clientToken;

	private Integer storageSize;

	private Integer queueCapacity;

	private Integer tracingStorageTime;

	private Integer maxConnections;

	private Boolean supportTracing;

	private String serverlessChargeType;

	private String instanceType;

	private String instanceId;

	private Boolean supportEip;

	private String modifyType;

	private Long maxEipTps;
	public UpdateInstanceRequest() {
		super("amqp-open", "2019-12-12", "UpdateInstance", "onsproxy");
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

	public String getServerlessChargeType() {
		return this.serverlessChargeType;
	}

	public void setServerlessChargeType(String serverlessChargeType) {
		this.serverlessChargeType = serverlessChargeType;
		if(serverlessChargeType != null){
			putQueryParameter("ServerlessChargeType", serverlessChargeType);
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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

	public String getModifyType() {
		return this.modifyType;
	}

	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
		if(modifyType != null){
			putQueryParameter("ModifyType", modifyType);
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

	@Override
	public Class<UpdateInstanceResponse> getResponseClass() {
		return UpdateInstanceResponse.class;
	}

}
