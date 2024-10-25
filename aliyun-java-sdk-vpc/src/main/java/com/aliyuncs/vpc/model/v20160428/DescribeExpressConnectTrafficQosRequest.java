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
public class DescribeExpressConnectTrafficQosRequest extends RpcAcsRequest<DescribeExpressConnectTrafficQosResponse> {
	   

	private String clientToken;

	private String nextToken;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private List<String> qosIdLists;

	private Long ownerId;

	private List<String> qosNameLists;

	private Integer maxResults;
	public DescribeExpressConnectTrafficQosRequest() {
		super("Vpc", "2016-04-28", "DescribeExpressConnectTrafficQos", "vpc");
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public List<String> getQosIdLists() {
		return this.qosIdLists;
	}

	public void setQosIdLists(List<String> qosIdLists) {
		this.qosIdLists = qosIdLists;	
		if (qosIdLists != null) {
			for (int i = 0; i < qosIdLists.size(); i++) {
				putQueryParameter("QosIdList." + (i + 1) , qosIdLists.get(i));
			}
		}	
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<String> getQosNameLists() {
		return this.qosNameLists;
	}

	public void setQosNameLists(List<String> qosNameLists) {
		this.qosNameLists = qosNameLists;	
		if (qosNameLists != null) {
			for (int i = 0; i < qosNameLists.size(); i++) {
				putQueryParameter("QosNameList." + (i + 1) , qosNameLists.get(i));
			}
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
	public Class<DescribeExpressConnectTrafficQosResponse> getResponseClass() {
		return DescribeExpressConnectTrafficQosResponse.class;
	}

}
