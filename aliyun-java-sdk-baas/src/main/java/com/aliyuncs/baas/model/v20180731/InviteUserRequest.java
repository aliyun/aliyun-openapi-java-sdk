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

package com.aliyuncs.baas.model.v20180731;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InviteUserRequest extends RpcAcsRequest<InviteUserResponse> {
	
	public InviteUserRequest() {
		super("Baas", "2018-07-31", "InviteUser");
	}

	private String bizid;

	private String bid;

	private Long userId;

	private String userEmail;

	public String getBizid() {
		return this.bizid;
	}

	public void setBizid(String bizid) {
		this.bizid = bizid;
		if(bizid != null){
			putBodyParameter("Bizid", bizid);
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putBodyParameter("Bid", bid);
		}
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId.toString());
		}
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
		if(userEmail != null){
			putBodyParameter("UserEmail", userEmail);
		}
	}

	@Override
	public Class<InviteUserResponse> getResponseClass() {
		return InviteUserResponse.class;
	}

}
