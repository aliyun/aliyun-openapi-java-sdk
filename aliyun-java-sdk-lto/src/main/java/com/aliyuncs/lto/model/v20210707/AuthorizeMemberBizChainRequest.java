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

package com.aliyuncs.lto.model.v20210707;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AuthorizeMemberBizChainRequest extends RpcAcsRequest<AuthorizeMemberBizChainResponse> {
	   

	private String bizChainInfo;

	private String memberId;
	public AuthorizeMemberBizChainRequest() {
		super("lto", "2021-07-07", "AuthorizeMemberBizChain");
		setMethod(MethodType.POST);
	}

	public String getBizChainInfo() {
		return this.bizChainInfo;
	}

	public void setBizChainInfo(String bizChainInfo) {
		this.bizChainInfo = bizChainInfo;
		if(bizChainInfo != null){
			putQueryParameter("BizChainInfo", bizChainInfo);
		}
	}

	public String getMemberId() {
		return this.memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
		if(memberId != null){
			putQueryParameter("MemberId", memberId);
		}
	}

	@Override
	public Class<AuthorizeMemberBizChainResponse> getResponseClass() {
		return AuthorizeMemberBizChainResponse.class;
	}

}
