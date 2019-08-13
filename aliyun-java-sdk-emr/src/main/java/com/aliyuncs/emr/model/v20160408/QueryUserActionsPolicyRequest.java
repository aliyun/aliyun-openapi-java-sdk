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
import java.util.List;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryUserActionsPolicyRequest extends RpcAcsRequest<QueryUserActionsPolicyResponse> {
	
	public QueryUserActionsPolicyRequest() {
		super("Emr", "2016-04-08", "QueryUserActionsPolicy", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String resourceId;

	private String resourceType;

	private List<String> actionNameLists;

	private String aliyunUserId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public List<String> getActionNameLists() {
		return this.actionNameLists;
	}

	public void setActionNameLists(List<String> actionNameLists) {
		this.actionNameLists = actionNameLists;	
		if (actionNameLists != null) {
			for (int i = 0; i < actionNameLists.size(); i++) {
				putQueryParameter("ActionNameList." + (i + 1) , actionNameLists.get(i));
			}
		}	
	}

	public String getAliyunUserId() {
		return this.aliyunUserId;
	}

	public void setAliyunUserId(String aliyunUserId) {
		this.aliyunUserId = aliyunUserId;
		if(aliyunUserId != null){
			putQueryParameter("AliyunUserId", aliyunUserId);
		}
	}

	@Override
	public Class<QueryUserActionsPolicyResponse> getResponseClass() {
		return QueryUserActionsPolicyResponse.class;
	}

}
