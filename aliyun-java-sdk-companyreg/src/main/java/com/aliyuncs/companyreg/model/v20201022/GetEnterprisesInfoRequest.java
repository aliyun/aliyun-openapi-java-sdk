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

package com.aliyuncs.companyreg.model.v20201022;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.companyreg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetEnterprisesInfoRequest extends RpcAcsRequest<GetEnterprisesInfoResponse> {
	   

	private String creditCode;

	private String enterpriseName;
	public GetEnterprisesInfoRequest() {
		super("companyreg", "2020-10-22", "GetEnterprisesInfo", "companyreg");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCreditCode() {
		return this.creditCode;
	}

	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
		if(creditCode != null){
			putQueryParameter("CreditCode", creditCode);
		}
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
		if(enterpriseName != null){
			putQueryParameter("EnterpriseName", enterpriseName);
		}
	}

	@Override
	public Class<GetEnterprisesInfoResponse> getResponseClass() {
		return GetEnterprisesInfoResponse.class;
	}

}
