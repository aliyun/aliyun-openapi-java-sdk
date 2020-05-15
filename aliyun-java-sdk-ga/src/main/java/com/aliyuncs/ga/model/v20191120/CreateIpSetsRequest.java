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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateIpSetsRequest extends RpcAcsRequest<CreateIpSetsResponse> {
	   

	private String clientToken;

	private String acceleratorId;

	private List<AccelerateRegion> accelerateRegions;
	public CreateIpSetsRequest() {
		super("Ga", "2019-11-20", "CreateIpSets", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
		if(acceleratorId != null){
			putQueryParameter("AcceleratorId", acceleratorId);
		}
	}

	public List<AccelerateRegion> getAccelerateRegions() {
		return this.accelerateRegions;
	}

	public void setAccelerateRegions(List<AccelerateRegion> accelerateRegions) {
		this.accelerateRegions = accelerateRegions;	
		if (accelerateRegions != null) {
			for (int depth1 = 0; depth1 < accelerateRegions.size(); depth1++) {
				putQueryParameter("AccelerateRegion." + (depth1 + 1) + ".AccelerateRegionId" , accelerateRegions.get(depth1).getAccelerateRegionId());
				putQueryParameter("AccelerateRegion." + (depth1 + 1) + ".Bandwidth" , accelerateRegions.get(depth1).getBandwidth());
			}
		}	
	}

	public static class AccelerateRegion {

		private String accelerateRegionId;

		private Integer bandwidth;

		public String getAccelerateRegionId() {
			return this.accelerateRegionId;
		}

		public void setAccelerateRegionId(String accelerateRegionId) {
			this.accelerateRegionId = accelerateRegionId;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}
	}

	@Override
	public Class<CreateIpSetsResponse> getResponseClass() {
		return CreateIpSetsResponse.class;
	}

}
