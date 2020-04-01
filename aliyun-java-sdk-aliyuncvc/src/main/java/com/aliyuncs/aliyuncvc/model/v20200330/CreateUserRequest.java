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

package com.aliyuncs.aliyuncvc.model.v20200330;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aliyuncvc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateUserRequest extends RpcAcsRequest<CreateUserResponse> {
	   

	private Integer count;

	private String userInfo;
	public CreateUserRequest() {
		super("aliyuncvc", "2020-03-30", "CreateUser", "aliyuncvc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
		if(count != null){
			putBodyParameter("Count", count.toString());
		}
	}

	public String getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
		if(userInfo != null){
			putBodyParameter("UserInfo", userInfo);
		}
	}

	@Override
	public Class<CreateUserResponse> getResponseClass() {
		return CreateUserResponse.class;
	}

}
