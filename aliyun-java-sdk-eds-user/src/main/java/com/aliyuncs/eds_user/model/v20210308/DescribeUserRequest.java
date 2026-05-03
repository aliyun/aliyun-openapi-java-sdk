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

package com.aliyuncs.eds_user.model.v20210308;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eds_user.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserRequest extends RpcAcsRequest<DescribeUserResponse> {
	   

	private String businessChannel;

	private List<String> requireExtraAttributes;

	private String endUserId;
	public DescribeUserRequest() {
		super("eds-user", "2021-03-08", "DescribeUser", "eds-user");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBusinessChannel() {
		return this.businessChannel;
	}

	public void setBusinessChannel(String businessChannel) {
		this.businessChannel = businessChannel;
		if(businessChannel != null){
			putQueryParameter("BusinessChannel", businessChannel);
		}
	}

	public List<String> getRequireExtraAttributes() {
		return this.requireExtraAttributes;
	}

	public void setRequireExtraAttributes(List<String> requireExtraAttributes) {
		this.requireExtraAttributes = requireExtraAttributes;	
		if (requireExtraAttributes != null) {
			for (int depth1 = 0; depth1 < requireExtraAttributes.size(); depth1++) {
				putQueryParameter("RequireExtraAttributes." + (depth1 + 1) , requireExtraAttributes.get(depth1));
			}
		}	
	}

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
		if(endUserId != null){
			putQueryParameter("EndUserId", endUserId);
		}
	}

	@Override
	public Class<DescribeUserResponse> getResponseClass() {
		return DescribeUserResponse.class;
	}

}
