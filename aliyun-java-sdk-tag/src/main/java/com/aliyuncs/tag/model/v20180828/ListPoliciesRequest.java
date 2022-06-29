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

package com.aliyuncs.tag.model.v20180828;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.tag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListPoliciesRequest extends RpcAcsRequest<ListPoliciesResponse> {
	   

	private List<String> policyNamess;

	private List<String> policyIdss;

	private String nextToken;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String userType;

	private Long ownerId;

	private Integer maxResult;
	public ListPoliciesRequest() {
		super("Tag", "2018-08-28", "ListPolicies", "tag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getPolicyNamess() {
		return this.policyNamess;
	}

	public void setPolicyNamess(List<String> policyNamess) {
		this.policyNamess = policyNamess;	
		if (policyNamess != null) {
			for (int i = 0; i < policyNamess.size(); i++) {
				putQueryParameter("PolicyNames." + (i + 1) , policyNamess.get(i));
			}
		}	
	}

	public List<String> getPolicyIdss() {
		return this.policyIdss;
	}

	public void setPolicyIdss(List<String> policyIdss) {
		this.policyIdss = policyIdss;	
		if (policyIdss != null) {
			for (int i = 0; i < policyIdss.size(); i++) {
				putQueryParameter("PolicyIds." + (i + 1) , policyIdss.get(i));
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

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
		if(userType != null){
			putQueryParameter("UserType", userType);
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

	public Integer getMaxResult() {
		return this.maxResult;
	}

	public void setMaxResult(Integer maxResult) {
		this.maxResult = maxResult;
		if(maxResult != null){
			putQueryParameter("MaxResult", maxResult.toString());
		}
	}

	@Override
	public Class<ListPoliciesResponse> getResponseClass() {
		return ListPoliciesResponse.class;
	}

}
