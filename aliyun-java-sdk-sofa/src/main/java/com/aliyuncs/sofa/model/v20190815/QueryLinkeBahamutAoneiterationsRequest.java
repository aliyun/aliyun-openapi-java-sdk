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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeBahamutAoneiterationsRequest extends RpcAcsRequest<QueryLinkeBahamutAoneiterationsResponse> {
	   

	private String value;

	private String q;

	private String bahamutTenant;
	public QueryLinkeBahamutAoneiterationsRequest() {
		super("SOFA", "2019-08-15", "QueryLinkeBahamutAoneiterations", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
		if(value != null){
			putBodyParameter("Value", value);
		}
	}

	public String getQ() {
		return this.q;
	}

	public void setQ(String q) {
		this.q = q;
		if(q != null){
			putBodyParameter("Q", q);
		}
	}

	public String getBahamutTenant() {
		return this.bahamutTenant;
	}

	public void setBahamutTenant(String bahamutTenant) {
		this.bahamutTenant = bahamutTenant;
		if(bahamutTenant != null){
			putBodyParameter("BahamutTenant", bahamutTenant);
		}
	}

	@Override
	public Class<QueryLinkeBahamutAoneiterationsResponse> getResponseClass() {
		return QueryLinkeBahamutAoneiterationsResponse.class;
	}

}
