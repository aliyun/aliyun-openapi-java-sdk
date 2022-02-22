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

package com.aliyuncs.agency.model.v20210609;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetOwnerAgreementInstanceRequest extends RpcAcsRequest<GetOwnerAgreementInstanceResponse> {
	   

	private String aliyunUid;
	public GetOwnerAgreementInstanceRequest() {
		super("Agency", "2021-06-09", "GetOwnerAgreementInstance");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAliyunUid() {
		return this.aliyunUid;
	}

	public void setAliyunUid(String aliyunUid) {
		this.aliyunUid = aliyunUid;
		if(aliyunUid != null){
			putQueryParameter("AliyunUid", aliyunUid);
		}
	}

	@Override
	public Class<GetOwnerAgreementInstanceResponse> getResponseClass() {
		return GetOwnerAgreementInstanceResponse.class;
	}

}
