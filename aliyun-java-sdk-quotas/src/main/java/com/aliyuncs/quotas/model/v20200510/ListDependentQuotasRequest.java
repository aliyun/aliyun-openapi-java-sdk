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

package com.aliyuncs.quotas.model.v20200510;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.quotas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDependentQuotasRequest extends RpcAcsRequest<ListDependentQuotasResponse> {
	   

	private String productCode;

	private String quotaActionCode;
	public ListDependentQuotasRequest() {
		super("quotas", "2020-05-10", "ListDependentQuotas", "quotas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putBodyParameter("ProductCode", productCode);
		}
	}

	public String getQuotaActionCode() {
		return this.quotaActionCode;
	}

	public void setQuotaActionCode(String quotaActionCode) {
		this.quotaActionCode = quotaActionCode;
		if(quotaActionCode != null){
			putBodyParameter("QuotaActionCode", quotaActionCode);
		}
	}

	@Override
	public Class<ListDependentQuotasResponse> getResponseClass() {
		return ListDependentQuotasResponse.class;
	}

}
