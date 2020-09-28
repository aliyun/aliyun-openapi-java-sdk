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

package com.aliyuncs.cloudesl.model.v20200201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateUserRequest extends RpcAcsRequest<UpdateUserResponse> {
	   

	private String extraParams;

	private String dingTalkUserId;

	private String userId;

	private String dingTalkCompanyId;
	public UpdateUserRequest() {
		super("cloudesl", "2020-02-01", "UpdateUser", "cloudesl");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtraParams() {
		return this.extraParams;
	}

	public void setExtraParams(String extraParams) {
		this.extraParams = extraParams;
		if(extraParams != null){
			putBodyParameter("ExtraParams", extraParams);
		}
	}

	public String getDingTalkUserId() {
		return this.dingTalkUserId;
	}

	public void setDingTalkUserId(String dingTalkUserId) {
		this.dingTalkUserId = dingTalkUserId;
		if(dingTalkUserId != null){
			putBodyParameter("DingTalkUserId", dingTalkUserId);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	public String getDingTalkCompanyId() {
		return this.dingTalkCompanyId;
	}

	public void setDingTalkCompanyId(String dingTalkCompanyId) {
		this.dingTalkCompanyId = dingTalkCompanyId;
		if(dingTalkCompanyId != null){
			putBodyParameter("DingTalkCompanyId", dingTalkCompanyId);
		}
	}

	@Override
	public Class<UpdateUserResponse> getResponseClass() {
		return UpdateUserResponse.class;
	}

}
