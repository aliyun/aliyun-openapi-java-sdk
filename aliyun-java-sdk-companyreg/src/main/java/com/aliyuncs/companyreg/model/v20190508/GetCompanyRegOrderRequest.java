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

/**
 * @author auto create
 * @version 
 */
public class GetCompanyRegOrderRequest extends RpcAcsRequest<GetCompanyRegOrderResponse> {
	
	public GetCompanyRegOrderRequest() {
		super("companyreg", "2019-05-08", "GetCompanyRegOrder", "companyreg");
	}

	private String actionTypes;

	private String bizId;

	public String getActionTypes() {
		return this.actionTypes;
	}

	public void setActionTypes(String actionTypes) {
		this.actionTypes = actionTypes;
		if(actionTypes != null){
			putQueryParameter("ActionTypes", actionTypes);
		}
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

	@Override
	public Class<GetCompanyRegOrderResponse> getResponseClass() {
		return GetCompanyRegOrderResponse.class;
	}

}
