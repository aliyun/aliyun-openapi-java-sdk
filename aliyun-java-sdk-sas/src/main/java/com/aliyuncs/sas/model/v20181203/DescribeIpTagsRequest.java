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
public class DescribeIpTagsRequest extends RpcAcsRequest<DescribeIpTagsResponse> {
	   

	private String ip;

	private String securityEventId;
	public DescribeIpTagsRequest() {
		super("Sas", "2018-12-03", "DescribeIpTags", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putQueryParameter("Ip", ip);
		}
	}

	public String getSecurityEventId() {
		return this.securityEventId;
	}

	public void setSecurityEventId(String securityEventId) {
		this.securityEventId = securityEventId;
		if(securityEventId != null){
			putQueryParameter("SecurityEventId", securityEventId);
		}
	}

	@Override
	public Class<DescribeIpTagsResponse> getResponseClass() {
		return DescribeIpTagsResponse.class;
	}

}
