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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityEventOperationsRequest extends RpcAcsRequest<DescribeSecurityEventOperationsResponse> {
	   

	private Long securityEventId;
	public DescribeSecurityEventOperationsRequest() {
		super("ecd", "2020-09-30", "DescribeSecurityEventOperations", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getSecurityEventId() {
		return this.securityEventId;
	}

	public void setSecurityEventId(Long securityEventId) {
		this.securityEventId = securityEventId;
		if(securityEventId != null){
			putQueryParameter("SecurityEventId", securityEventId.toString());
		}
	}

	@Override
	public Class<DescribeSecurityEventOperationsResponse> getResponseClass() {
		return DescribeSecurityEventOperationsResponse.class;
	}

}
