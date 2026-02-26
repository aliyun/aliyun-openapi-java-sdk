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
public class OfflineBizEntityRequest extends RpcAcsRequest<OfflineBizEntityResponse> {
	   

	private Long opTenantId;

	@SerializedName("offlineCommand")
	private OfflineCommand offlineCommand;
	public OfflineBizEntityRequest() {
		super("dataphin-public", "2023-06-30", "OfflineBizEntity");
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

	public OfflineCommand getOfflineCommand() {
		return this.offlineCommand;
	}

	public void setOfflineCommand(OfflineCommand offlineCommand) {
		this.offlineCommand = offlineCommand;	
		if (offlineCommand != null) {
			putBodyParameter("OfflineCommand" , new Gson().toJson(offlineCommand));
		}	
	}

	public static class OfflineCommand {

		@SerializedName("Comment")
		private String comment;

		@SerializedName("Id")
		private Long id;

		@SerializedName("Type")
		private String type;

		@SerializedName("BizUnitId")
		private Long bizUnitId;

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getBizUnitId() {
			return this.bizUnitId;
		}

		public void setBizUnitId(Long bizUnitId) {
			this.bizUnitId = bizUnitId;
		}
	}

	@Override
	public Class<OfflineBizEntityResponse> getResponseClass() {
		return OfflineBizEntityResponse.class;
	}

}
