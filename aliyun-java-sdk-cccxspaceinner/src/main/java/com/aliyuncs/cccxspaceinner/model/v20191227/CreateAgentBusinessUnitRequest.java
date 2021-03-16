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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAgentBusinessUnitRequest extends RpcAcsRequest<CreateAgentBusinessUnitResponse> {
	   

	private String outerType;

	private String outerBuId;

	private String buName;

	private String outerAdminAccountId;

	private String outerAdminAccountName;
	public CreateAgentBusinessUnitRequest() {
		super("CCCXSpaceInner", "2019-12-27", "CreateAgentBusinessUnit");
		setMethod(MethodType.POST);
	}

	public String getOuterType() {
		return this.outerType;
	}

	public void setOuterType(String outerType) {
		this.outerType = outerType;
		if(outerType != null){
			putBodyParameter("OuterType", outerType);
		}
	}

	public String getOuterBuId() {
		return this.outerBuId;
	}

	public void setOuterBuId(String outerBuId) {
		this.outerBuId = outerBuId;
		if(outerBuId != null){
			putBodyParameter("OuterBuId", outerBuId);
		}
	}

	public String getBuName() {
		return this.buName;
	}

	public void setBuName(String buName) {
		this.buName = buName;
		if(buName != null){
			putBodyParameter("BuName", buName);
		}
	}

	public String getOuterAdminAccountId() {
		return this.outerAdminAccountId;
	}

	public void setOuterAdminAccountId(String outerAdminAccountId) {
		this.outerAdminAccountId = outerAdminAccountId;
		if(outerAdminAccountId != null){
			putBodyParameter("OuterAdminAccountId", outerAdminAccountId);
		}
	}

	public String getOuterAdminAccountName() {
		return this.outerAdminAccountName;
	}

	public void setOuterAdminAccountName(String outerAdminAccountName) {
		this.outerAdminAccountName = outerAdminAccountName;
		if(outerAdminAccountName != null){
			putBodyParameter("OuterAdminAccountName", outerAdminAccountName);
		}
	}

	@Override
	public Class<CreateAgentBusinessUnitResponse> getResponseClass() {
		return CreateAgentBusinessUnitResponse.class;
	}

}
