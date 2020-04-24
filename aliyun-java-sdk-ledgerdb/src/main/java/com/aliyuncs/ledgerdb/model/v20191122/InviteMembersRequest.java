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

package com.aliyuncs.ledgerdb.model.v20191122;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InviteMembersRequest extends RpcAcsRequest<InviteMembersResponse> {
	   

	private String aliUids;

	private String ledgerId;
	public InviteMembersRequest() {
		super("ledgerdb", "2019-11-22", "InviteMembers", "ledgerdb");
		setMethod(MethodType.POST);
	}

	public String getAliUids() {
		return this.aliUids;
	}

	public void setAliUids(String aliUids) {
		this.aliUids = aliUids;
		if(aliUids != null){
			putBodyParameter("AliUids", aliUids);
		}
	}

	public String getLedgerId() {
		return this.ledgerId;
	}

	public void setLedgerId(String ledgerId) {
		this.ledgerId = ledgerId;
		if(ledgerId != null){
			putBodyParameter("LedgerId", ledgerId);
		}
	}

	@Override
	public Class<InviteMembersResponse> getResponseClass() {
		return InviteMembersResponse.class;
	}

}
