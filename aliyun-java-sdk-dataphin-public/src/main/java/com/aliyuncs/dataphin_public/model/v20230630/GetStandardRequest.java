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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetStandardRequest extends RpcAcsRequest<GetStandardResponse> {
	   

	private Long opTenantId;

	@SerializedName("standardGetQuery")
	private StandardGetQuery standardGetQuery;
	public GetStandardRequest() {
		super("dataphin-public", "2023-06-30", "GetStandard");
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

	public StandardGetQuery getStandardGetQuery() {
		return this.standardGetQuery;
	}

	public void setStandardGetQuery(StandardGetQuery standardGetQuery) {
		this.standardGetQuery = standardGetQuery;	
		if (standardGetQuery != null) {
			putBodyParameter("StandardGetQuery" , new Gson().toJson(standardGetQuery));
		}	
	}

	public static class StandardGetQuery {

		@SerializedName("Nullable")
		private Boolean nullable;

		@SerializedName("StandardStage")
		private String standardStage;

		@SerializedName("StandardId")
		private Long standardId;

		@SerializedName("NeedRelation")
		private Boolean needRelation;

		@SerializedName("Version")
		private Integer version;

		public Boolean getNullable() {
			return this.nullable;
		}

		public void setNullable(Boolean nullable) {
			this.nullable = nullable;
		}

		public String getStandardStage() {
			return this.standardStage;
		}

		public void setStandardStage(String standardStage) {
			this.standardStage = standardStage;
		}

		public Long getStandardId() {
			return this.standardId;
		}

		public void setStandardId(Long standardId) {
			this.standardId = standardId;
		}

		public Boolean getNeedRelation() {
			return this.needRelation;
		}

		public void setNeedRelation(Boolean needRelation) {
			this.needRelation = needRelation;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer version) {
			this.version = version;
		}
	}

	@Override
	public Class<GetStandardResponse> getResponseClass() {
		return GetStandardResponse.class;
	}

}
