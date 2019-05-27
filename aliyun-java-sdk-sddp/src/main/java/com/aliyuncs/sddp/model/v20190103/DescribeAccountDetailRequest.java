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

package com.aliyuncs.sddp.model.v20190103;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccountDetailRequest extends RpcAcsRequest<DescribeAccountDetailResponse> {
	
	public DescribeAccountDetailRequest() {
		super("Sddp", "2019-01-03", "DescribeAccountDetail", "sddp");
	}

	private String lang;

	private Long userId;

	private Long accountTypeId;

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
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

	public Long getAccountTypeId() {
		return this.accountTypeId;
	}

	public void setAccountTypeId(Long accountTypeId) {
		this.accountTypeId = accountTypeId;
		if(accountTypeId != null){
			putQueryParameter("AccountTypeId", accountTypeId.toString());
		}
	}

	@Override
	public Class<DescribeAccountDetailResponse> getResponseClass() {
		return DescribeAccountDetailResponse.class;
	}

}
