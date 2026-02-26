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
public class GetTableLineagesRequest extends RpcAcsRequest<GetTableLineagesResponse> {
	   

	private Long opTenantId;

	@SerializedName("filterQuery")
	private FilterQuery filterQuery;

	private String tableGuid;
	public GetTableLineagesRequest() {
		super("dataphin-public", "2023-06-30", "GetTableLineages");
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

	public FilterQuery getFilterQuery() {
		return this.filterQuery;
	}

	public void setFilterQuery(FilterQuery filterQuery) {
		this.filterQuery = filterQuery;	
		if (filterQuery != null) {
			putBodyParameter("FilterQuery" , new Gson().toJson(filterQuery));
		}	
	}

	public String getTableGuid() {
		return this.tableGuid;
	}

	public void setTableGuid(String tableGuid) {
		this.tableGuid = tableGuid;
		if(tableGuid != null){
			putQueryParameter("TableGuid", tableGuid);
		}
	}

	public static class FilterQuery {

		@SerializedName("NodeEnv")
		private String nodeEnv;

		@SerializedName("NeedUpstream")
		private Boolean needUpstream;

		@SerializedName("NodeIdList")
		private List<String> nodeIdList;

		@SerializedName("NeedDownstream")
		private Boolean needDownstream;

		@SerializedName("NeedNotExistObject")
		private Boolean needNotExistObject;

		public String getNodeEnv() {
			return this.nodeEnv;
		}

		public void setNodeEnv(String nodeEnv) {
			this.nodeEnv = nodeEnv;
		}

		public Boolean getNeedUpstream() {
			return this.needUpstream;
		}

		public void setNeedUpstream(Boolean needUpstream) {
			this.needUpstream = needUpstream;
		}

		public List<String> getNodeIdList() {
			return this.nodeIdList;
		}

		public void setNodeIdList(List<String> nodeIdList) {
			this.nodeIdList = nodeIdList;
		}

		public Boolean getNeedDownstream() {
			return this.needDownstream;
		}

		public void setNeedDownstream(Boolean needDownstream) {
			this.needDownstream = needDownstream;
		}

		public Boolean getNeedNotExistObject() {
			return this.needNotExistObject;
		}

		public void setNeedNotExistObject(Boolean needNotExistObject) {
			this.needNotExistObject = needNotExistObject;
		}
	}

	@Override
	public Class<GetTableLineagesResponse> getResponseClass() {
		return GetTableLineagesResponse.class;
	}

}
