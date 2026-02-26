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

package com.aliyuncs.linkcard.model.v20210520;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkcard.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetCredentialPoolStatisticsRequest extends RpcAcsRequest<GetCredentialPoolStatisticsResponse> {
	   

	private String date;

	private String credentialNO;
	public GetCredentialPoolStatisticsRequest() {
		super("Linkcard", "2021-05-20", "GetCredentialPoolStatistics");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
		if(date != null){
			putQueryParameter("Date", date);
		}
	}

	public String getCredentialNO() {
		return this.credentialNO;
	}

	public void setCredentialNO(String credentialNO) {
		this.credentialNO = credentialNO;
		if(credentialNO != null){
			putQueryParameter("CredentialNO", credentialNO);
		}
	}

	@Override
	public Class<GetCredentialPoolStatisticsResponse> getResponseClass() {
		return GetCredentialPoolStatisticsResponse.class;
	}

}
