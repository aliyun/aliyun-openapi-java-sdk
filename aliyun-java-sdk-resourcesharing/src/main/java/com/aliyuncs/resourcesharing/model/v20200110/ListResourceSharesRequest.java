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

package com.aliyuncs.resourcesharing.model.v20200110;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcesharing.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListResourceSharesRequest extends RpcAcsRequest<ListResourceSharesResponse> {
	   

	private String resourceShareName;

	private String permissionName;

	private String nextToken;

	private List<String> resourceShareIdss;

	private String resourceOwner;

	private String resourceShareStatus;

	private Integer maxResults;
	public ListResourceSharesRequest() {
		super("ResourceSharing", "2020-01-10", "ListResourceShares", "ressharing");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResourceShareName() {
		return this.resourceShareName;
	}

	public void setResourceShareName(String resourceShareName) {
		this.resourceShareName = resourceShareName;
		if(resourceShareName != null){
			putQueryParameter("ResourceShareName", resourceShareName);
		}
	}

	public String getPermissionName() {
		return this.permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
		if(permissionName != null){
			putQueryParameter("PermissionName", permissionName);
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

	public List<String> getResourceShareIdss() {
		return this.resourceShareIdss;
	}

	public void setResourceShareIdss(List<String> resourceShareIdss) {
		this.resourceShareIdss = resourceShareIdss;	
		if (resourceShareIdss != null) {
			for (int i = 0; i < resourceShareIdss.size(); i++) {
				putQueryParameter("ResourceShareIds." + (i + 1) , resourceShareIdss.get(i));
			}
		}	
	}

	public String getResourceOwner() {
		return this.resourceOwner;
	}

	public void setResourceOwner(String resourceOwner) {
		this.resourceOwner = resourceOwner;
		if(resourceOwner != null){
			putQueryParameter("ResourceOwner", resourceOwner);
		}
	}

	public String getResourceShareStatus() {
		return this.resourceShareStatus;
	}

	public void setResourceShareStatus(String resourceShareStatus) {
		this.resourceShareStatus = resourceShareStatus;
		if(resourceShareStatus != null){
			putQueryParameter("ResourceShareStatus", resourceShareStatus);
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
	public Class<ListResourceSharesResponse> getResponseClass() {
		return ListResourceSharesResponse.class;
	}

}
