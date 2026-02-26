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
public class SharePrivacyRuleRequest extends RpcAcsRequest<SharePrivacyRuleResponse> {
	   

	private String memberIdList;

	private String privacyRuleId;
	public SharePrivacyRuleRequest() {
		super("lto", "2021-07-07", "SharePrivacyRule");
		setMethod(MethodType.POST);
	}

	public String getMemberIdList() {
		return this.memberIdList;
	}

	public void setMemberIdList(String memberIdList) {
		this.memberIdList = memberIdList;
		if(memberIdList != null){
			putQueryParameter("MemberIdList", memberIdList);
		}
	}

	public String getPrivacyRuleId() {
		return this.privacyRuleId;
	}

	public void setPrivacyRuleId(String privacyRuleId) {
		this.privacyRuleId = privacyRuleId;
		if(privacyRuleId != null){
			putQueryParameter("PrivacyRuleId", privacyRuleId);
		}
	}

	@Override
	public Class<SharePrivacyRuleResponse> getResponseClass() {
		return SharePrivacyRuleResponse.class;
	}

}
