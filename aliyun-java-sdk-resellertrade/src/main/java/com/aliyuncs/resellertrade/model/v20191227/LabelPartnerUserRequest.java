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

package com.aliyuncs.resellertrade.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resellertrade.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class LabelPartnerUserRequest extends RpcAcsRequest<LabelPartnerUserResponse> {
	   

	private String userTag;

	private Long userPK;
	public LabelPartnerUserRequest() {
		super("ResellerTrade", "2019-12-27", "LabelPartnerUser");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUserTag() {
		return this.userTag;
	}

	public void setUserTag(String userTag) {
		this.userTag = userTag;
		if(userTag != null){
			putBodyParameter("UserTag", userTag);
		}
	}

	public Long getUserPK() {
		return this.userPK;
	}

	public void setUserPK(Long userPK) {
		this.userPK = userPK;
		if(userPK != null){
			putBodyParameter("UserPK", userPK.toString());
		}
	}

	@Override
	public Class<LabelPartnerUserResponse> getResponseClass() {
		return LabelPartnerUserResponse.class;
	}

}
