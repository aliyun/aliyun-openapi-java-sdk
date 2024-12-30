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
public class GetLatestSubmitDetailRequest extends RpcAcsRequest<GetLatestSubmitDetailResponse> {
	   

	private Long opTenantId;

	@SerializedName("submitDetailQuery")
	private SubmitDetailQuery submitDetailQuery;
	public GetLatestSubmitDetailRequest() {
		super("dataphin-public", "2023-06-30", "GetLatestSubmitDetail");
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

	public SubmitDetailQuery getSubmitDetailQuery() {
		return this.submitDetailQuery;
	}

	public void setSubmitDetailQuery(SubmitDetailQuery submitDetailQuery) {
		this.submitDetailQuery = submitDetailQuery;	
		if (submitDetailQuery != null) {
			putBodyParameter("SubmitDetailQuery" , new Gson().toJson(submitDetailQuery));
		}	
	}

	public static class SubmitDetailQuery {

		@SerializedName("ObjectType")
		private String objectType;

		@SerializedName("ObjectId")
		private String objectId;

		public String getObjectType() {
			return this.objectType;
		}

		public void setObjectType(String objectType) {
			this.objectType = objectType;
		}

		public String getObjectId() {
			return this.objectId;
		}

		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}
	}

	@Override
	public Class<GetLatestSubmitDetailResponse> getResponseClass() {
		return GetLatestSubmitDetailResponse.class;
	}

}
