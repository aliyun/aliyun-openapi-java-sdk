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

package com.aliyuncs.sas_api.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribePerDateDataRequest extends RpcAcsRequest<DescribePerDateDataResponse> {
	
	public DescribePerDateDataRequest() {
		super("Sas-api", "2017-07-05", "DescribePerDateData", "sas-api");
	}

	private String sourceIp;

	private Integer apiType;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Integer getApiType() {
		return this.apiType;
	}

	public void setApiType(Integer apiType) {
		this.apiType = apiType;
		if(apiType != null){
			putQueryParameter("ApiType", apiType.toString());
		}
	}

	@Override
	public Class<DescribePerDateDataResponse> getResponseClass() {
		return DescribePerDateDataResponse.class;
	}

}
