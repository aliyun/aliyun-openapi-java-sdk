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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetKgNeighborRequest extends RpcAcsRequest<GetKgNeighborResponse> {
	   

	private Long opTenantId;

	private String entityType;

	private String entityDataId;

	@SerializedName("neighborsQuery")
	private NeighborsQuery neighborsQuery;

	private String workspaceId;
	public GetKgNeighborRequest() {
		super("dataphin-public", "2023-06-30", "GetKgNeighbor");
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

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
		if(entityType != null){
			putQueryParameter("EntityType", entityType);
		}
	}

	public String getEntityDataId() {
		return this.entityDataId;
	}

	public void setEntityDataId(String entityDataId) {
		this.entityDataId = entityDataId;
		if(entityDataId != null){
			putQueryParameter("EntityDataId", entityDataId);
		}
	}

	public NeighborsQuery getNeighborsQuery() {
		return this.neighborsQuery;
	}

	public void setNeighborsQuery(NeighborsQuery neighborsQuery) {
		this.neighborsQuery = neighborsQuery;	
		if (neighborsQuery != null) {
			putBodyParameter("NeighborsQuery" , new Gson().toJson(neighborsQuery));
		}	
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	public static class NeighborsQuery {

		@SerializedName("DirectionType")
		private String directionType;

		@SerializedName("Depth")
		private Integer depth;

		@SerializedName("RelationTypes")
		private List<String> relationTypes;

		public String getDirectionType() {
			return this.directionType;
		}

		public void setDirectionType(String directionType) {
			this.directionType = directionType;
		}

		public Integer getDepth() {
			return this.depth;
		}

		public void setDepth(Integer depth) {
			this.depth = depth;
		}

		public List<String> getRelationTypes() {
			return this.relationTypes;
		}

		public void setRelationTypes(List<String> relationTypes) {
			this.relationTypes = relationTypes;
		}
	}

	@Override
	public Class<GetKgNeighborResponse> getResponseClass() {
		return GetKgNeighborResponse.class;
	}

}
