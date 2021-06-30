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

package com.aliyuncs.workbench_inner.model.v20210121;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InnerInitBigAccountSubRequest extends RpcAcsRequest<InnerInitBigAccountSubResponse> {
	   

	private Long subPk;

	private String orgName;

	private String userId;
	public InnerInitBigAccountSubRequest() {
		super("Workbench-inner", "2021-01-21", "InnerInitBigAccountSub");
		setMethod(MethodType.POST);
	}

	public Long getSubPk() {
		return this.subPk;
	}

	public void setSubPk(Long subPk) {
		this.subPk = subPk;
		if(subPk != null){
			putQueryParameter("SubPk", subPk.toString());
		}
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
		if(orgName != null){
			putQueryParameter("OrgName", orgName);
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
	public Class<InnerInitBigAccountSubResponse> getResponseClass() {
		return InnerInitBigAccountSubResponse.class;
	}

}
