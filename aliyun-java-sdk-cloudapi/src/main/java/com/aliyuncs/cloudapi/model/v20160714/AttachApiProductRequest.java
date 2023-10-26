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
public class AttachApiProductRequest extends RpcAcsRequest<AttachApiProductResponse> {
	   

	private List<Apis> apiss;

	private String securityToken;

	private String apiProductId;
	public AttachApiProductRequest() {
		super("CloudAPI", "2016-07-14", "AttachApiProduct", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Apis> getApiss() {
		return this.apiss;
	}

	public void setApiss(List<Apis> apiss) {
		this.apiss = apiss;	
		if (apiss != null) {
			for (int depth1 = 0; depth1 < apiss.size(); depth1++) {
				putQueryParameter("Apis." + (depth1 + 1) + ".StageName" , apiss.get(depth1).getStageName());
				putQueryParameter("Apis." + (depth1 + 1) + ".ApiId" , apiss.get(depth1).getApiId());
			}
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

	public String getApiProductId() {
		return this.apiProductId;
	}

	public void setApiProductId(String apiProductId) {
		this.apiProductId = apiProductId;
		if(apiProductId != null){
			putQueryParameter("ApiProductId", apiProductId);
		}
	}

	public static class Apis {

		private String stageName;

		private String apiId;

		public String getStageName() {
			return this.stageName;
		}

		public void setStageName(String stageName) {
			this.stageName = stageName;
		}

		public String getApiId() {
			return this.apiId;
		}

		public void setApiId(String apiId) {
			this.apiId = apiId;
		}
	}

	@Override
	public Class<AttachApiProductResponse> getResponseClass() {
		return AttachApiProductResponse.class;
	}

}
