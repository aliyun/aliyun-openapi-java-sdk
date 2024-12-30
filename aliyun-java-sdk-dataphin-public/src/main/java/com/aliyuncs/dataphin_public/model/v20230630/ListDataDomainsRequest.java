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
public class ListDataDomainsRequest extends RpcAcsRequest<ListDataDomainsResponse> {
	   

	private Long opTenantId;

	@SerializedName("listQuery")
	private ListQuery listQuery;
	public ListDataDomainsRequest() {
		super("dataphin-public", "2023-06-30", "ListDataDomains");
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

	public ListQuery getListQuery() {
		return this.listQuery;
	}

	public void setListQuery(ListQuery listQuery) {
		this.listQuery = listQuery;	
		if (listQuery != null) {
			putBodyParameter("ListQuery" , new Gson().toJson(listQuery));
		}	
	}

	public static class ListQuery {

		@SerializedName("BizUnitIdList")
		private List<Long> bizUnitIdList;

		@SerializedName("ParentIdList")
		private List<Long> parentIdList;

		@SerializedName("Keyword")
		private String keyword;

		public List<Long> getBizUnitIdList() {
			return this.bizUnitIdList;
		}

		public void setBizUnitIdList(List<Long> bizUnitIdList) {
			this.bizUnitIdList = bizUnitIdList;
		}

		public List<Long> getParentIdList() {
			return this.parentIdList;
		}

		public void setParentIdList(List<Long> parentIdList) {
			this.parentIdList = parentIdList;
		}

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}
	}

	@Override
	public Class<ListDataDomainsResponse> getResponseClass() {
		return ListDataDomainsResponse.class;
	}

}
