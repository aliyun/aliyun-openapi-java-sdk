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
public class GetRowPermissionByTableGuidsRequest extends RpcAcsRequest<GetRowPermissionByTableGuidsResponse> {
	   

	private Long opTenantId;

	@SerializedName("getRowPermissionByTableGuidsQuery")
	private GetRowPermissionByTableGuidsQuery getRowPermissionByTableGuidsQuery;
	public GetRowPermissionByTableGuidsRequest() {
		super("dataphin-public", "2023-06-30", "GetRowPermissionByTableGuids");
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

	public GetRowPermissionByTableGuidsQuery getGetRowPermissionByTableGuidsQuery() {
		return this.getRowPermissionByTableGuidsQuery;
	}

	public void setGetRowPermissionByTableGuidsQuery(GetRowPermissionByTableGuidsQuery getRowPermissionByTableGuidsQuery) {
		this.getRowPermissionByTableGuidsQuery = getRowPermissionByTableGuidsQuery;	
		if (getRowPermissionByTableGuidsQuery != null) {
			putBodyParameter("GetRowPermissionByTableGuidsQuery" , new Gson().toJson(getRowPermissionByTableGuidsQuery));
		}	
	}

	public static class GetRowPermissionByTableGuidsQuery {

		@SerializedName("TableGuids")
		private List<String> tableGuids;

		public List<String> getTableGuids() {
			return this.tableGuids;
		}

		public void setTableGuids(List<String> tableGuids) {
			this.tableGuids = tableGuids;
		}
	}

	@Override
	public Class<GetRowPermissionByTableGuidsResponse> getResponseClass() {
		return GetRowPermissionByTableGuidsResponse.class;
	}

}
