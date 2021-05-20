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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.smartag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDpiSignaturesRequest extends RpcAcsRequest<ListDpiSignaturesResponse> {
	   

	private Long resourceOwnerId;

	private List<String> dpiSignatureNamess;

	private List<String> dpiSignatureIdss;

	private String nextToken;

	private String dpiGroupId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private Integer maxResults;
	public ListDpiSignaturesRequest() {
		super("Smartag", "2018-03-13", "ListDpiSignatures", "smartag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getDpiSignatureNamess() {
		return this.dpiSignatureNamess;
	}

	public void setDpiSignatureNamess(List<String> dpiSignatureNamess) {
		this.dpiSignatureNamess = dpiSignatureNamess;	
		if (dpiSignatureNamess != null) {
			for (int i = 0; i < dpiSignatureNamess.size(); i++) {
				putQueryParameter("DpiSignatureNames." + (i + 1) , dpiSignatureNamess.get(i));
			}
		}	
	}

	public List<String> getDpiSignatureIdss() {
		return this.dpiSignatureIdss;
	}

	public void setDpiSignatureIdss(List<String> dpiSignatureIdss) {
		this.dpiSignatureIdss = dpiSignatureIdss;	
		if (dpiSignatureIdss != null) {
			for (int i = 0; i < dpiSignatureIdss.size(); i++) {
				putQueryParameter("DpiSignatureIds." + (i + 1) , dpiSignatureIdss.get(i));
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

	public String getDpiGroupId() {
		return this.dpiGroupId;
	}

	public void setDpiGroupId(String dpiGroupId) {
		this.dpiGroupId = dpiGroupId;
		if(dpiGroupId != null){
			putQueryParameter("DpiGroupId", dpiGroupId);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
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
	public Class<ListDpiSignaturesResponse> getResponseClass() {
		return ListDpiSignaturesResponse.class;
	}

}
