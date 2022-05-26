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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyBizCategoryRequest extends RpcAcsRequest<ModifyBizCategoryResponse> {
	   

	private String paramList;

	private Long userId;
	public ModifyBizCategoryRequest() {
		super("account-crm", "2016-06-06", "ModifyBizCategory");
		setMethod(MethodType.POST);
	}

	public String getParamList() {
		return this.paramList;
	}

	public void setParamList(String paramList) {
		this.paramList = paramList;
		if(paramList != null){
			putQueryParameter("ParamList", paramList);
		}
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId.toString());
		}
	}

	@Override
	public Class<ModifyBizCategoryResponse> getResponseClass() {
		return ModifyBizCategoryResponse.class;
	}

}
