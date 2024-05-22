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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardbx.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeParameterTemplatesRequest extends RpcAcsRequest<DescribeParameterTemplatesResponse> {
	   

	private String dBInstanceId;

	private String paramLevel;
	public DescribeParameterTemplatesRequest() {
		super("polardbx", "2020-02-02", "DescribeParameterTemplates", "polardbx");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getParamLevel() {
		return this.paramLevel;
	}

	public void setParamLevel(String paramLevel) {
		this.paramLevel = paramLevel;
		if(paramLevel != null){
			putQueryParameter("ParamLevel", paramLevel);
		}
	}

	@Override
	public Class<DescribeParameterTemplatesResponse> getResponseClass() {
		return DescribeParameterTemplatesResponse.class;
	}

}
