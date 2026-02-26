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
public class CreateMetaCollectionRequest extends RpcAcsRequest<CreateMetaCollectionResponse> {
	   

	private String parentQualifiedName;

	private String collectionType;

	private String name;

	private String comment;
	public CreateMetaCollectionRequest() {
		super("dataworks-public", "2020-05-18", "CreateMetaCollection");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getParentQualifiedName() {
		return this.parentQualifiedName;
	}

	public void setParentQualifiedName(String parentQualifiedName) {
		this.parentQualifiedName = parentQualifiedName;
		if(parentQualifiedName != null){
			putQueryParameter("ParentQualifiedName", parentQualifiedName);
		}
	}

	public String getCollectionType() {
		return this.collectionType;
	}

	public void setCollectionType(String collectionType) {
		this.collectionType = collectionType;
		if(collectionType != null){
			putQueryParameter("CollectionType", collectionType);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
		}
	}

	@Override
	public Class<CreateMetaCollectionResponse> getResponseClass() {
		return CreateMetaCollectionResponse.class;
	}

}
