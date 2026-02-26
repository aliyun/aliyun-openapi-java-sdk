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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteMetaCollectionEntityRequest extends RpcAcsRequest<DeleteMetaCollectionEntityResponse> {
	   

	private String entityQualifiedName;

	private String collectionQualifiedName;
	public DeleteMetaCollectionEntityRequest() {
		super("dataworks-public", "2020-05-18", "DeleteMetaCollectionEntity");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEntityQualifiedName() {
		return this.entityQualifiedName;
	}

	public void setEntityQualifiedName(String entityQualifiedName) {
		this.entityQualifiedName = entityQualifiedName;
		if(entityQualifiedName != null){
			putQueryParameter("EntityQualifiedName", entityQualifiedName);
		}
	}

	public String getCollectionQualifiedName() {
		return this.collectionQualifiedName;
	}

	public void setCollectionQualifiedName(String collectionQualifiedName) {
		this.collectionQualifiedName = collectionQualifiedName;
		if(collectionQualifiedName != null){
			putQueryParameter("CollectionQualifiedName", collectionQualifiedName);
		}
	}

	@Override
	public Class<DeleteMetaCollectionEntityResponse> getResponseClass() {
		return DeleteMetaCollectionEntityResponse.class;
	}

}
