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
public class DeleteLineageRelationRequest extends RpcAcsRequest<DeleteLineageRelationResponse> {
	   

	private String srcEntityQualifiedName;

	private String destEntityQualifiedName;

	private String relationshipType;

	private String relationshipGuid;
	public DeleteLineageRelationRequest() {
		super("dataworks-public", "2020-05-18", "DeleteLineageRelation");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSrcEntityQualifiedName() {
		return this.srcEntityQualifiedName;
	}

	public void setSrcEntityQualifiedName(String srcEntityQualifiedName) {
		this.srcEntityQualifiedName = srcEntityQualifiedName;
		if(srcEntityQualifiedName != null){
			putQueryParameter("SrcEntityQualifiedName", srcEntityQualifiedName);
		}
	}

	public String getDestEntityQualifiedName() {
		return this.destEntityQualifiedName;
	}

	public void setDestEntityQualifiedName(String destEntityQualifiedName) {
		this.destEntityQualifiedName = destEntityQualifiedName;
		if(destEntityQualifiedName != null){
			putQueryParameter("DestEntityQualifiedName", destEntityQualifiedName);
		}
	}

	public String getRelationshipType() {
		return this.relationshipType;
	}

	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
		if(relationshipType != null){
			putQueryParameter("RelationshipType", relationshipType);
		}
	}

	public String getRelationshipGuid() {
		return this.relationshipGuid;
	}

	public void setRelationshipGuid(String relationshipGuid) {
		this.relationshipGuid = relationshipGuid;
		if(relationshipGuid != null){
			putQueryParameter("RelationshipGuid", relationshipGuid);
		}
	}

	@Override
	public Class<DeleteLineageRelationResponse> getResponseClass() {
		return DeleteLineageRelationResponse.class;
	}

}
