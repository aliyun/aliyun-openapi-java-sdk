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

package com.aliyuncs.alb.model.v20200616;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListSecurityPolicyRelationsRequest extends RpcAcsRequest<ListSecurityPolicyRelationsResponse> {
	   

	private List<String> securityPolicyIds;
	public ListSecurityPolicyRelationsRequest() {
		super("Alb", "2020-06-16", "ListSecurityPolicyRelations", "alb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getSecurityPolicyIds() {
		return this.securityPolicyIds;
	}

	public void setSecurityPolicyIds(List<String> securityPolicyIds) {
		this.securityPolicyIds = securityPolicyIds;	
		if (securityPolicyIds != null) {
			for (int depth1 = 0; depth1 < securityPolicyIds.size(); depth1++) {
				putQueryParameter("SecurityPolicyIds." + (depth1 + 1) , securityPolicyIds.get(depth1));
			}
		}	
	}

	@Override
	public Class<ListSecurityPolicyRelationsResponse> getResponseClass() {
		return ListSecurityPolicyRelationsResponse.class;
	}

}
