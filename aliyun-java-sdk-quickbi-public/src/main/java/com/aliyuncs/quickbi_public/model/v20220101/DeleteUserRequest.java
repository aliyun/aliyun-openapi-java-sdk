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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteUserRequest extends RpcAcsRequest<DeleteUserResponse> {
	   

	private String userId;

	private String transferUserId;
	public DeleteUserRequest() {
		super("quickbi-public", "2022-01-01", "DeleteUser", "2.2.0");
		setMethod(MethodType.POST);
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

	public String getTransferUserId() {
		return this.transferUserId;
	}

	public void setTransferUserId(String transferUserId) {
		this.transferUserId = transferUserId;
		if(transferUserId != null){
			putQueryParameter("TransferUserId", transferUserId);
		}
	}

	@Override
	public Class<DeleteUserResponse> getResponseClass() {
		return DeleteUserResponse.class;
	}

}
