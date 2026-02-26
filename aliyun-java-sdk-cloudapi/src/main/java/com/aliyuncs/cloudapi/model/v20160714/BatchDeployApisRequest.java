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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchDeployApisRequest extends RpcAcsRequest<BatchDeployApisResponse> {
	   

	private String stageName;

	private String description;

	private String securityToken;

	private List<Api> apis;
	public BatchDeployApisRequest() {
		super("CloudAPI", "2016-07-14", "BatchDeployApis", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStageName() {
		return this.stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
		if(stageName != null){
			putQueryParameter("StageName", stageName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public List<Api> getApis() {
		return this.apis;
	}

	public void setApis(List<Api> apis) {
		this.apis = apis;	
		if (apis != null) {
			for (int depth1 = 0; depth1 < apis.size(); depth1++) {
				putQueryParameter("Api." + (depth1 + 1) + ".GroupId" , apis.get(depth1).getGroupId());
				putQueryParameter("Api." + (depth1 + 1) + ".ApiUid" , apis.get(depth1).getApiUid());
			}
		}	
	}

	public static class Api {

		private String groupId;

		private String apiUid;

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getApiUid() {
			return this.apiUid;
		}

		public void setApiUid(String apiUid) {
			this.apiUid = apiUid;
		}
	}

	@Override
	public Class<BatchDeployApisResponse> getResponseClass() {
		return BatchDeployApisResponse.class;
	}

}
