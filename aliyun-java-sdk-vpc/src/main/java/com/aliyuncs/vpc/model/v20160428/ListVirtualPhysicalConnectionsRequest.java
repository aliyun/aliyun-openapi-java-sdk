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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListVirtualPhysicalConnectionsRequest extends RpcAcsRequest<ListVirtualPhysicalConnectionsResponse> {
	   

	private List<String> vlanIdss;

	private String virtualPhysicalConnectionBusinessStatus;

	private List<String> virtualPhysicalConnectionAliUidss;

	private String nextToken;

	private List<String> virtualPhysicalConnectionIdss;

	private Boolean isConfirmed;

	private List<String> virtualPhysicalConnectionStatusess;

	private String physicalConnectionId;

	private Integer maxResults;
	public ListVirtualPhysicalConnectionsRequest() {
		super("Vpc", "2016-04-28", "ListVirtualPhysicalConnections", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getVlanIdss() {
		return this.vlanIdss;
	}

	public void setVlanIdss(List<String> vlanIdss) {
		this.vlanIdss = vlanIdss;	
		if (vlanIdss != null) {
			for (int i = 0; i < vlanIdss.size(); i++) {
				putQueryParameter("VlanIds." + (i + 1) , vlanIdss.get(i));
			}
		}	
	}

	public String getVirtualPhysicalConnectionBusinessStatus() {
		return this.virtualPhysicalConnectionBusinessStatus;
	}

	public void setVirtualPhysicalConnectionBusinessStatus(String virtualPhysicalConnectionBusinessStatus) {
		this.virtualPhysicalConnectionBusinessStatus = virtualPhysicalConnectionBusinessStatus;
		if(virtualPhysicalConnectionBusinessStatus != null){
			putQueryParameter("VirtualPhysicalConnectionBusinessStatus", virtualPhysicalConnectionBusinessStatus);
		}
	}

	public List<String> getVirtualPhysicalConnectionAliUidss() {
		return this.virtualPhysicalConnectionAliUidss;
	}

	public void setVirtualPhysicalConnectionAliUidss(List<String> virtualPhysicalConnectionAliUidss) {
		this.virtualPhysicalConnectionAliUidss = virtualPhysicalConnectionAliUidss;	
		if (virtualPhysicalConnectionAliUidss != null) {
			for (int i = 0; i < virtualPhysicalConnectionAliUidss.size(); i++) {
				putQueryParameter("VirtualPhysicalConnectionAliUids." + (i + 1) , virtualPhysicalConnectionAliUidss.get(i));
			}
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

	public List<String> getVirtualPhysicalConnectionIdss() {
		return this.virtualPhysicalConnectionIdss;
	}

	public void setVirtualPhysicalConnectionIdss(List<String> virtualPhysicalConnectionIdss) {
		this.virtualPhysicalConnectionIdss = virtualPhysicalConnectionIdss;	
		if (virtualPhysicalConnectionIdss != null) {
			for (int i = 0; i < virtualPhysicalConnectionIdss.size(); i++) {
				putQueryParameter("VirtualPhysicalConnectionIds." + (i + 1) , virtualPhysicalConnectionIdss.get(i));
			}
		}	
	}

	public Boolean getIsConfirmed() {
		return this.isConfirmed;
	}

	public void setIsConfirmed(Boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
		if(isConfirmed != null){
			putQueryParameter("IsConfirmed", isConfirmed.toString());
		}
	}

	public List<String> getVirtualPhysicalConnectionStatusess() {
		return this.virtualPhysicalConnectionStatusess;
	}

	public void setVirtualPhysicalConnectionStatusess(List<String> virtualPhysicalConnectionStatusess) {
		this.virtualPhysicalConnectionStatusess = virtualPhysicalConnectionStatusess;	
		if (virtualPhysicalConnectionStatusess != null) {
			for (int i = 0; i < virtualPhysicalConnectionStatusess.size(); i++) {
				putQueryParameter("VirtualPhysicalConnectionStatuses." + (i + 1) , virtualPhysicalConnectionStatusess.get(i));
			}
		}	
	}

	public String getPhysicalConnectionId() {
		return this.physicalConnectionId;
	}

	public void setPhysicalConnectionId(String physicalConnectionId) {
		this.physicalConnectionId = physicalConnectionId;
		if(physicalConnectionId != null){
			putQueryParameter("PhysicalConnectionId", physicalConnectionId);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ListVirtualPhysicalConnectionsResponse> getResponseClass() {
		return ListVirtualPhysicalConnectionsResponse.class;
	}

}
