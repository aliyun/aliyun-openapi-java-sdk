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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdatePersonalICodeRequest extends RpcAcsRequest<UpdatePersonalICodeResponse> {
	   

	private String quickBIUserId;
	public UpdatePersonalICodeRequest() {
		super("quickbi-public", "2022-01-01", "UpdatePersonalICode", "QuickBI");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getQuickBIUserId() {
		return this.quickBIUserId;
	}

	public void setQuickBIUserId(String quickBIUserId) {
		this.quickBIUserId = quickBIUserId;
		if(quickBIUserId != null){
			putQueryParameter("QuickBIUserId", quickBIUserId);
		}
	}

	@Override
	public Class<UpdatePersonalICodeResponse> getResponseClass() {
		return UpdatePersonalICodeResponse.class;
	}

}
