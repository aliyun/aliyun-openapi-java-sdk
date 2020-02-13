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

package com.aliyuncs.dts.model.v20180801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateSynchronizationJobRequest extends RpcAcsRequest<CreateSynchronizationJobResponse> {
	   

	private String period;

	private String destRegion;

	private String clientToken;

	private String topology;

	private String networkType;

	private String ownerId;

	private Integer usedTime;

	private String sourceEndpointInstanceType;

	private String synchronizationJobClass;

	private String sourceRegion;

	private String payType;

	private String destinationEndpointInstanceType;
	public CreateSynchronizationJobRequest() {
		super("Dts", "2018-08-01", "CreateSynchronizationJob", "dts");
		setMethod(MethodType.POST);
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period);
		}
	}

	public String getDestRegion() {
		return this.destRegion;
	}

	public void setDestRegion(String destRegion) {
		this.destRegion = destRegion;
		if(destRegion != null){
			putQueryParameter("DestRegion", destRegion);
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

	public String getTopology() {
		return this.topology;
	}

	public void setTopology(String topology) {
		this.topology = topology;
		if(topology != null){
			putQueryParameter("Topology", topology);
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("networkType", networkType);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public Integer getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(Integer usedTime) {
		this.usedTime = usedTime;
		if(usedTime != null){
			putQueryParameter("UsedTime", usedTime.toString());
		}
	}

	public String getSourceEndpointInstanceType() {
		return this.sourceEndpointInstanceType;
	}

	public void setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
		this.sourceEndpointInstanceType = sourceEndpointInstanceType;
		if(sourceEndpointInstanceType != null){
			putQueryParameter("SourceEndpoint.InstanceType", sourceEndpointInstanceType);
		}
	}

	public String getSynchronizationJobClass() {
		return this.synchronizationJobClass;
	}

	public void setSynchronizationJobClass(String synchronizationJobClass) {
		this.synchronizationJobClass = synchronizationJobClass;
		if(synchronizationJobClass != null){
			putQueryParameter("SynchronizationJobClass", synchronizationJobClass);
		}
	}

	public String getSourceRegion() {
		return this.sourceRegion;
	}

	public void setSourceRegion(String sourceRegion) {
		this.sourceRegion = sourceRegion;
		if(sourceRegion != null){
			putQueryParameter("SourceRegion", sourceRegion);
		}
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	public String getDestinationEndpointInstanceType() {
		return this.destinationEndpointInstanceType;
	}

	public void setDestinationEndpointInstanceType(String destinationEndpointInstanceType) {
		this.destinationEndpointInstanceType = destinationEndpointInstanceType;
		if(destinationEndpointInstanceType != null){
			putQueryParameter("DestinationEndpoint.InstanceType", destinationEndpointInstanceType);
		}
	}

	@Override
	public Class<CreateSynchronizationJobResponse> getResponseClass() {
		return CreateSynchronizationJobResponse.class;
	}

}
