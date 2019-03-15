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

package com.aliyuncs.cr.model.v20160607;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateNamespaceAuthorizationRequest extends RoaAcsRequest<UpdateNamespaceAuthorizationResponse> {
	
	public UpdateNamespaceAuthorizationRequest() {
		super("cr", "2016-06-07", "UpdateNamespaceAuthorization", "cr");
		setUriPattern("/namespace/[Namespace]/authorizations/[AuthorizeId]");
		setMethod(MethodType.POST);
	}

	private Long authorizeId;

	private String namespace;

	public Long getAuthorizeId() {
		return this.authorizeId;
	}

	public void setAuthorizeId(Long authorizeId) {
		this.authorizeId = authorizeId;
		if(authorizeId != null){
			putPathParameter("AuthorizeId", authorizeId.toString());
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putPathParameter("Namespace", namespace);
		}
	}

	@Override
	public Class<UpdateNamespaceAuthorizationResponse> getResponseClass() {
		return UpdateNamespaceAuthorizationResponse.class;
	}

}
