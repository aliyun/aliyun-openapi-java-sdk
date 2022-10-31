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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetMessageUserInfoRequest extends RpcAcsRequest<GetMessageUserInfoResponse> {
	   

	private String cloudUid;
	public GetMessageUserInfoRequest() {
		super("live", "2016-11-01", "GetMessageUserInfo", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCloudUid() {
		return this.cloudUid;
	}

	public void setCloudUid(String cloudUid) {
		this.cloudUid = cloudUid;
		if(cloudUid != null){
			putBodyParameter("CloudUid", cloudUid);
		}
	}

	@Override
	public Class<GetMessageUserInfoResponse> getResponseClass() {
		return GetMessageUserInfoResponse.class;
	}

}
