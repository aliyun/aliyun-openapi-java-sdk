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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryTrademarkDetailByApplyNumberRequest extends RpcAcsRequest<QueryTrademarkDetailByApplyNumberResponse> {
	   

	private String applyNumber;

	private String env;
	public QueryTrademarkDetailByApplyNumberRequest() {
		super("Trademark", "2018-07-24", "QueryTrademarkDetailByApplyNumber");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getApplyNumber() {
		return this.applyNumber;
	}

	public void setApplyNumber(String applyNumber) {
		this.applyNumber = applyNumber;
		if(applyNumber != null){
			putQueryParameter("ApplyNumber", applyNumber);
		}
	}

	public String getEnv() {
		return this.env;
	}

	public void setEnv(String env) {
		this.env = env;
		if(env != null){
			putQueryParameter("Env", env);
		}
	}

	@Override
	public Class<QueryTrademarkDetailByApplyNumberResponse> getResponseClass() {
		return QueryTrademarkDetailByApplyNumberResponse.class;
	}

}
