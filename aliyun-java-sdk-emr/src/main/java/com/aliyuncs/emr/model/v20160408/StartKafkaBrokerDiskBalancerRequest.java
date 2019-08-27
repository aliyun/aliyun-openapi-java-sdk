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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartKafkaBrokerDiskBalancerRequest extends RpcAcsRequest<StartKafkaBrokerDiskBalancerResponse> {
	
	public StartKafkaBrokerDiskBalancerRequest() {
		super("Emr", "2016-04-08", "StartKafkaBrokerDiskBalancer", "emr");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long throttle;

	private Long resourceOwnerId;

	private Integer brokerId;

	private String clusterId;

	private String balanceThreshold;

	public Long getThrottle() {
		return this.throttle;
	}

	public void setThrottle(Long throttle) {
		this.throttle = throttle;
		if(throttle != null){
			putQueryParameter("Throttle", throttle.toString());
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getBrokerId() {
		return this.brokerId;
	}

	public void setBrokerId(Integer brokerId) {
		this.brokerId = brokerId;
		if(brokerId != null){
			putQueryParameter("BrokerId", brokerId.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getBalanceThreshold() {
		return this.balanceThreshold;
	}

	public void setBalanceThreshold(String balanceThreshold) {
		this.balanceThreshold = balanceThreshold;
		if(balanceThreshold != null){
			putQueryParameter("BalanceThreshold", balanceThreshold);
		}
	}

	@Override
	public Class<StartKafkaBrokerDiskBalancerResponse> getResponseClass() {
		return StartKafkaBrokerDiskBalancerResponse.class;
	}

}
