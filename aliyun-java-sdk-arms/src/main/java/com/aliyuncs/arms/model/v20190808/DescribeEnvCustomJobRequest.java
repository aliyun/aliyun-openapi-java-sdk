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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnvCustomJobRequest extends RpcAcsRequest<DescribeEnvCustomJobResponse> {
	   

	private String environmentId;

	private String customJobName;

	private Boolean encryptYaml;
	public DescribeEnvCustomJobRequest() {
		super("ARMS", "2019-08-08", "DescribeEnvCustomJob", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEnvironmentId() {
		return this.environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
		if(environmentId != null){
			putQueryParameter("EnvironmentId", environmentId);
		}
	}

	public String getCustomJobName() {
		return this.customJobName;
	}

	public void setCustomJobName(String customJobName) {
		this.customJobName = customJobName;
		if(customJobName != null){
			putQueryParameter("CustomJobName", customJobName);
		}
	}

	public Boolean getEncryptYaml() {
		return this.encryptYaml;
	}

	public void setEncryptYaml(Boolean encryptYaml) {
		this.encryptYaml = encryptYaml;
		if(encryptYaml != null){
			putQueryParameter("EncryptYaml", encryptYaml.toString());
		}
	}

	@Override
	public Class<DescribeEnvCustomJobResponse> getResponseClass() {
		return DescribeEnvCustomJobResponse.class;
	}

}
