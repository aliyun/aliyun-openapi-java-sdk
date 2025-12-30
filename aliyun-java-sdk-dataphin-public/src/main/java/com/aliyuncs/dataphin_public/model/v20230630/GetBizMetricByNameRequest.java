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
public class GetBizMetricByNameRequest extends RpcAcsRequest<GetBizMetricByNameResponse> {
	   

	private Long opTenantId;

	@SerializedName("bizMetricByNameQuery")
	private BizMetricByNameQuery bizMetricByNameQuery;
	public GetBizMetricByNameRequest() {
		super("dataphin-public", "2023-06-30", "GetBizMetricByName");
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

	public BizMetricByNameQuery getBizMetricByNameQuery() {
		return this.bizMetricByNameQuery;
	}

	public void setBizMetricByNameQuery(BizMetricByNameQuery bizMetricByNameQuery) {
		this.bizMetricByNameQuery = bizMetricByNameQuery;	
		if (bizMetricByNameQuery != null) {
			putBodyParameter("BizMetricByNameQuery" , new Gson().toJson(bizMetricByNameQuery));
		}	
	}

	public static class BizMetricByNameQuery {

		@SerializedName("Draft")
		private Boolean draft;

		@SerializedName("Name")
		private String name;

		public Boolean getDraft() {
			return this.draft;
		}

		public void setDraft(Boolean draft) {
			this.draft = draft;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public Class<GetBizMetricByNameResponse> getResponseClass() {
		return GetBizMetricByNameResponse.class;
	}

}
