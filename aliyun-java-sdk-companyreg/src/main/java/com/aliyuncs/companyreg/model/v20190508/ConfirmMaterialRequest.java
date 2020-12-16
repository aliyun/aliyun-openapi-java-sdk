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

package com.aliyuncs.companyreg.model.v20190508;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.companyreg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConfirmMaterialRequest extends RpcAcsRequest<ConfirmMaterialResponse> {
	   

	private String bizId;

	private String userOtherList;
	public ConfirmMaterialRequest() {
		super("companyreg", "2019-05-08", "ConfirmMaterial");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getUserOtherList() {
		return this.userOtherList;
	}

	public void setUserOtherList(String userOtherList) {
		this.userOtherList = userOtherList;
		if(userOtherList != null){
			putQueryParameter("UserOtherList", userOtherList);
		}
	}

	@Override
	public Class<ConfirmMaterialResponse> getResponseClass() {
		return ConfirmMaterialResponse.class;
	}

}
