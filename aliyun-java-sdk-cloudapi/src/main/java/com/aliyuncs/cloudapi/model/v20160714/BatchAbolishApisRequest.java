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
public class BatchAbolishApisRequest extends RpcAcsRequest<BatchAbolishApisResponse> {
	   

	private String securityToken;

	private List<Api> apis;
	public BatchAbolishApisRequest() {
		super("CloudAPI", "2016-07-14", "BatchAbolishApis", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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
				putQueryParameter("Api." + (depth1 + 1) + ".StageName" , apis.get(depth1).getStageName());
				putQueryParameter("Api." + (depth1 + 1) + ".GroupId" , apis.get(depth1).getGroupId());
				putQueryParameter("Api." + (depth1 + 1) + ".ApiUid" , apis.get(depth1).getApiUid());
				putQueryParameter("Api." + (depth1 + 1) + ".StageId" , apis.get(depth1).getStageId());
			}
		}	
	}

	public static class Api {

		private String stageName;

		private String groupId;

		private String apiUid;

		private String stageId;

		public String getStageName() {
			return this.stageName;
		}

		public void setStageName(String stageName) {
			this.stageName = stageName;
		}

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

		public String getStageId() {
			return this.stageId;
		}

		public void setStageId(String stageId) {
			this.stageId = stageId;
		}
	}

	@Override
	public Class<BatchAbolishApisResponse> getResponseClass() {
		return BatchAbolishApisResponse.class;
	}

}
