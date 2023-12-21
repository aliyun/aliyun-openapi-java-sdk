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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListNetworkAccessEndpointsRequest extends RpcAcsRequest<ListNetworkAccessEndpointsResponse> {
	   

	private String networkAccessEndpointType;

	private String nextToken;

	private String vpcRegionId;

	private String networkAccessEndpointStatus;

	private String instanceId;

	private String vpcId;

	private Long maxResults;
	public ListNetworkAccessEndpointsRequest() {
		super("Eiam", "2021-12-01", "ListNetworkAccessEndpoints", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getNetworkAccessEndpointType() {
		return this.networkAccessEndpointType;
	}

	public void setNetworkAccessEndpointType(String networkAccessEndpointType) {
		this.networkAccessEndpointType = networkAccessEndpointType;
		if(networkAccessEndpointType != null){
			putQueryParameter("NetworkAccessEndpointType", networkAccessEndpointType);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getVpcRegionId() {
		return this.vpcRegionId;
	}

	public void setVpcRegionId(String vpcRegionId) {
		this.vpcRegionId = vpcRegionId;
		if(vpcRegionId != null){
			putQueryParameter("VpcRegionId", vpcRegionId);
		}
	}

	public String getNetworkAccessEndpointStatus() {
		return this.networkAccessEndpointStatus;
	}

	public void setNetworkAccessEndpointStatus(String networkAccessEndpointStatus) {
		this.networkAccessEndpointStatus = networkAccessEndpointStatus;
		if(networkAccessEndpointStatus != null){
			putQueryParameter("NetworkAccessEndpointStatus", networkAccessEndpointStatus);
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

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ListNetworkAccessEndpointsResponse> getResponseClass() {
		return ListNetworkAccessEndpointsResponse.class;
	}

}
