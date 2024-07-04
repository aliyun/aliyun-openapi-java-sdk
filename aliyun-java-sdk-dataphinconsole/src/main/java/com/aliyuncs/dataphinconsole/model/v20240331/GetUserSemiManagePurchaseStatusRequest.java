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

package com.aliyuncs.dataphinconsole.model.v20240331;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetUserSemiManagePurchaseStatusRequest extends RpcAcsRequest<GetUserSemiManagePurchaseStatusResponse> {
	   

	private String mainAccountId;

	private String uid;
	public GetUserSemiManagePurchaseStatusRequest() {
		super("DataphinConsole", "2024-03-31", "GetUserSemiManagePurchaseStatus");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getMainAccountId() {
		return this.mainAccountId;
	}

	public void setMainAccountId(String mainAccountId) {
		this.mainAccountId = mainAccountId;
		if(mainAccountId != null){
			putBodyParameter("MainAccountId", mainAccountId);
		}
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putBodyParameter("Uid", uid);
		}
	}

	@Override
	public Class<GetUserSemiManagePurchaseStatusResponse> getResponseClass() {
		return GetUserSemiManagePurchaseStatusResponse.class;
	}

}
