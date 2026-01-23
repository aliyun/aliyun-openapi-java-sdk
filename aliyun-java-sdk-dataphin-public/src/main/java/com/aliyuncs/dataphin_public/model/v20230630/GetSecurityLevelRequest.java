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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetSecurityLevelRequest extends RpcAcsRequest<GetSecurityLevelResponse> {
	   

	private Long opTenantId;

	private Long index;
	public GetSecurityLevelRequest() {
		super("dataphin-public", "2023-06-30", "GetSecurityLevel");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public Long getIndex() {
		return this.index;
	}

	public void setIndex(Long index) {
		this.index = index;
		if(index != null){
			putQueryParameter("Index", index.toString());
		}
	}

	@Override
	public Class<GetSecurityLevelResponse> getResponseClass() {
		return GetSecurityLevelResponse.class;
	}

}
