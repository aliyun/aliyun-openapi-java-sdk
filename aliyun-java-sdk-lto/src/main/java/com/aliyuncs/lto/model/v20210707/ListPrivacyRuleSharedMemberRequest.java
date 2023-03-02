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
public class ListPrivacyRuleSharedMemberRequest extends RpcAcsRequest<ListPrivacyRuleSharedMemberResponse> {
	   

	private String privacyRuleId;
	public ListPrivacyRuleSharedMemberRequest() {
		super("lto", "2021-07-07", "ListPrivacyRuleSharedMember");
		setMethod(MethodType.POST);
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
	public Class<ListPrivacyRuleSharedMemberResponse> getResponseClass() {
		return ListPrivacyRuleSharedMemberResponse.class;
	}

}
