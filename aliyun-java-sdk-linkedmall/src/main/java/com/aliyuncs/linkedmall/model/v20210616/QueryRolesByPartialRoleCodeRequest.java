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

package com.aliyuncs.linkedmall.model.v20210616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkedmall.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryRolesByPartialRoleCodeRequest extends RpcAcsRequest<QueryRolesByPartialRoleCodeResponse> {
	   

	private String partialRoleCode;

	private String tenantId;
	public QueryRolesByPartialRoleCodeRequest() {
		super("linkedmall", "2021-06-16", "QueryRolesByPartialRoleCode", "linkedmall");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPartialRoleCode() {
		return this.partialRoleCode;
	}

	public void setPartialRoleCode(String partialRoleCode) {
		this.partialRoleCode = partialRoleCode;
		if(partialRoleCode != null){
			putQueryParameter("PartialRoleCode", partialRoleCode);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId);
		}
	}

	@Override
	public Class<QueryRolesByPartialRoleCodeResponse> getResponseClass() {
		return QueryRolesByPartialRoleCodeResponse.class;
	}

}
