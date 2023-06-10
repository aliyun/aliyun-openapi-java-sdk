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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityStatInfoRequest extends RpcAcsRequest<DescribeSecurityStatInfoResponse> {
	   

	private String sourceIp;

	private String lang;

	private String resourceDirectoryAccountId;
	public DescribeSecurityStatInfoRequest() {
		super("Sas", "2018-12-03", "DescribeSecurityStatInfo", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getResourceDirectoryAccountId() {
		return this.resourceDirectoryAccountId;
	}

	public void setResourceDirectoryAccountId(String resourceDirectoryAccountId) {
		this.resourceDirectoryAccountId = resourceDirectoryAccountId;
		if(resourceDirectoryAccountId != null){
			putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
		}
	}

	@Override
	public Class<DescribeSecurityStatInfoResponse> getResponseClass() {
		return DescribeSecurityStatInfoResponse.class;
	}

}
