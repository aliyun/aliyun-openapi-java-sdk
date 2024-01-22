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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RegisterLineageRelationRequest extends RpcAcsRequest<RegisterLineageRelationResponse> {
	   

	@SerializedName("lineageRelationRegisterVO")
	private LineageRelationRegisterVO lineageRelationRegisterVO;
	public RegisterLineageRelationRequest() {
		super("dataworks-public", "2020-05-18", "RegisterLineageRelation");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public LineageRelationRegisterVO getLineageRelationRegisterVO() {
		return this.lineageRelationRegisterVO;
	}

	public void setLineageRelationRegisterVO(LineageRelationRegisterVO lineageRelationRegisterVO) {
		this.lineageRelationRegisterVO = lineageRelationRegisterVO;	
		if (lineageRelationRegisterVO != null) {
			putBodyParameter("LineageRelationRegisterVO" , new Gson().toJson(lineageRelationRegisterVO));
		}	
	}

	public static class LineageRelationRegisterVO {

		@SerializedName("DestEntity")
		private DestEntity destEntity;

		@SerializedName("CreateTimestamp")
		private Long createTimestamp;

		@SerializedName("Relationship")
		private Relationship relationship;

		@SerializedName("SrcEntity")
		private SrcEntity srcEntity;

		public DestEntity getDestEntity() {
			return this.destEntity;
		}

		public void setDestEntity(DestEntity destEntity) {
			this.destEntity = destEntity;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public Relationship getRelationship() {
			return this.relationship;
		}

		public void setRelationship(Relationship relationship) {
			this.relationship = relationship;
		}

		public SrcEntity getSrcEntity() {
			return this.srcEntity;
		}

		public void setSrcEntity(SrcEntity srcEntity) {
			this.srcEntity = srcEntity;
		}

		public static class DestEntity {

			@SerializedName("ParentName")
			private String parentName;

			@SerializedName("QualifiedName")
			private String qualifiedName;

			@SerializedName("Name")
			private String name;

			@SerializedName("DetailUrl")
			private String detailUrl;

			public String getParentName() {
				return this.parentName;
			}

			public void setParentName(String parentName) {
				this.parentName = parentName;
			}

			public String getQualifiedName() {
				return this.qualifiedName;
			}

			public void setQualifiedName(String qualifiedName) {
				this.qualifiedName = qualifiedName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDetailUrl() {
				return this.detailUrl;
			}

			public void setDetailUrl(String detailUrl) {
				this.detailUrl = detailUrl;
			}
		}

		public static class Relationship {

			@SerializedName("Type")
			private String type;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}

		public static class SrcEntity {

			@SerializedName("ParentName")
			private String parentName;

			@SerializedName("QualifiedName")
			private String qualifiedName;

			@SerializedName("Name")
			private String name;

			@SerializedName("DetailUrl")
			private String detailUrl;

			public String getParentName() {
				return this.parentName;
			}

			public void setParentName(String parentName) {
				this.parentName = parentName;
			}

			public String getQualifiedName() {
				return this.qualifiedName;
			}

			public void setQualifiedName(String qualifiedName) {
				this.qualifiedName = qualifiedName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDetailUrl() {
				return this.detailUrl;
			}

			public void setDetailUrl(String detailUrl) {
				this.detailUrl = detailUrl;
			}
		}
	}

	@Override
	public Class<RegisterLineageRelationResponse> getResponseClass() {
		return RegisterLineageRelationResponse.class;
	}

}
