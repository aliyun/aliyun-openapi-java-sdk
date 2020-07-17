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

package com.aliyuncs.tdsr.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.tdsr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteFileRequest extends RpcAcsRequest<DeleteFileResponse> {
	   

	private String accountId;

	private String paramFile;
	public DeleteFileRequest() {
		super("tdsr", "2020-01-01", "DeleteFile");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putQueryParameter("AccountId", accountId);
		}
	}

	public String getParamFile() {
		return this.paramFile;
	}

	public void setParamFile(String paramFile) {
		this.paramFile = paramFile;
		if(paramFile != null){
			putQueryParameter("ParamFile", paramFile);
		}
	}

	@Override
	public Class<DeleteFileResponse> getResponseClass() {
		return DeleteFileResponse.class;
	}

}
