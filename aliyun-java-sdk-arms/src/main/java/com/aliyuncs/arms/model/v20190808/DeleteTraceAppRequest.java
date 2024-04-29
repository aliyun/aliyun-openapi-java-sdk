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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteTraceAppRequest extends RpcAcsRequest<DeleteTraceAppResponse> {
	   

	@SerializedName("deleteReason")
	private DeleteReason deleteReason;

	private String appId;

	private String pid;

	private String type;
	public DeleteTraceAppRequest() {
		super("ARMS", "2019-08-08", "DeleteTraceApp", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public DeleteReason getDeleteReason() {
		return this.deleteReason;
	}

	public void setDeleteReason(DeleteReason deleteReason) {
		this.deleteReason = deleteReason;	
		if (deleteReason != null) {
			putQueryParameter("DeleteReason" , new Gson().toJson(deleteReason));
		}	
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
		if(pid != null){
			putQueryParameter("Pid", pid);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public static class DeleteReason {

		@SerializedName("Remark")
		private String remark;

		@SerializedName("ReasonIds")
		private List<ReasonIdsItem> reasonIds;

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public List<ReasonIdsItem> getReasonIds() {
			return this.reasonIds;
		}

		public void setReasonIds(List<ReasonIdsItem> reasonIds) {
			this.reasonIds = reasonIds;
		}

		public static class ReasonIdsItem {

			@SerializedName("Name")
			private String name;

			@SerializedName("Id")
			private Integer id;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}
		}
	}

	@Override
	public Class<DeleteTraceAppResponse> getResponseClass() {
		return DeleteTraceAppResponse.class;
	}

}
