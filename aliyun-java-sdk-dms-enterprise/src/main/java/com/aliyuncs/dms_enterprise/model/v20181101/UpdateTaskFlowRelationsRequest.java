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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateTaskFlowRelationsRequest extends RpcAcsRequest<UpdateTaskFlowRelationsResponse> {
	   

	@SerializedName("edges")
	private List<Edges> edges;

	private Long dagId;

	private Long tid;
	public UpdateTaskFlowRelationsRequest() {
		super("dms-enterprise", "2018-11-01", "UpdateTaskFlowRelations", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Edges> getEdges() {
		return this.edges;
	}

	public void setEdges(List<Edges> edges) {
		this.edges = edges;	
		if (edges != null) {
			putQueryParameter("Edges" , new Gson().toJson(edges));
		}	
	}

	public Long getDagId() {
		return this.dagId;
	}

	public void setDagId(Long dagId) {
		this.dagId = dagId;
		if(dagId != null){
			putQueryParameter("DagId", dagId.toString());
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public static class Edges {

		@SerializedName("NodeEnd")
		private Long nodeEnd;

		@SerializedName("NodeFrom")
		private Long nodeFrom;

		@SerializedName("EdgeType")
		private Integer edgeType;

		@SerializedName("Id")
		private Long id;

		public Long getNodeEnd() {
			return this.nodeEnd;
		}

		public void setNodeEnd(Long nodeEnd) {
			this.nodeEnd = nodeEnd;
		}

		public Long getNodeFrom() {
			return this.nodeFrom;
		}

		public void setNodeFrom(Long nodeFrom) {
			this.nodeFrom = nodeFrom;
		}

		public Integer getEdgeType() {
			return this.edgeType;
		}

		public void setEdgeType(Integer edgeType) {
			this.edgeType = edgeType;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public Class<UpdateTaskFlowRelationsResponse> getResponseClass() {
		return UpdateTaskFlowRelationsResponse.class;
	}

}
