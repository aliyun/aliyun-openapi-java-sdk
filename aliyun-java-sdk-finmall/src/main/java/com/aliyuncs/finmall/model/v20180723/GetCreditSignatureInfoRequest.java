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

package com.aliyuncs.finmall.model.v20180723;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetCreditSignatureInfoRequest extends RpcAcsRequest<GetCreditSignatureInfoResponse> {
	
	public GetCreditSignatureInfoRequest() {
		super("finmall", "2018-07-23", "GetCreditSignatureInfo", "finmall");
	}

	private String creditId;

	private String userId;

	public String getCreditId() {
		return this.creditId;
	}

	public void setCreditId(String creditId) {
		this.creditId = creditId;
		if(creditId != null){
			putQueryParameter("CreditId", creditId);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	@Override
	public Class<GetCreditSignatureInfoResponse> getResponseClass() {
		return GetCreditSignatureInfoResponse.class;
	}

}
