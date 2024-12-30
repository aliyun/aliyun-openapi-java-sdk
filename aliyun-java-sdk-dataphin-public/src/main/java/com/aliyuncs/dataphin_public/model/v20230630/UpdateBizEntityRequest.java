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
public class UpdateBizEntityRequest extends RpcAcsRequest<UpdateBizEntityResponse> {
	   

	private Long opTenantId;

	@SerializedName("updateCommand")
	private UpdateCommand updateCommand;
	public UpdateBizEntityRequest() {
		super("dataphin-public", "2023-06-30", "UpdateBizEntity");
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

	public UpdateCommand getUpdateCommand() {
		return this.updateCommand;
	}

	public void setUpdateCommand(UpdateCommand updateCommand) {
		this.updateCommand = updateCommand;	
		if (updateCommand != null) {
			putBodyParameter("UpdateCommand" , new Gson().toJson(updateCommand));
		}	
	}

	public static class UpdateCommand {

		@SerializedName("BizObject")
		private BizObject bizObject;

		@SerializedName("BizProcess")
		private BizProcess bizProcess;

		@SerializedName("DataDomainId")
		private Long dataDomainId;

		@SerializedName("Id")
		private Long id;

		@SerializedName("Type")
		private String type;

		@SerializedName("BizUnitId")
		private Long bizUnitId;

		public BizObject getBizObject() {
			return this.bizObject;
		}

		public void setBizObject(BizObject bizObject) {
			this.bizObject = bizObject;
		}

		public BizProcess getBizProcess() {
			return this.bizProcess;
		}

		public void setBizProcess(BizProcess bizProcess) {
			this.bizProcess = bizProcess;
		}

		public Long getDataDomainId() {
			return this.dataDomainId;
		}

		public void setDataDomainId(Long dataDomainId) {
			this.dataDomainId = dataDomainId;
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

		public static class BizObject {

			@SerializedName("OwnerUserId")
			private String ownerUserId;

			@SerializedName("DisplayName")
			private String displayName;

			@SerializedName("Name")
			private String name;

			@SerializedName("Description")
			private String description;

			@SerializedName("RefBizEntityIdList")
			private List<Long> refBizEntityIdList;

			@SerializedName("ParentId")
			private Long parentId;

			public String getOwnerUserId() {
				return this.ownerUserId;
			}

			public void setOwnerUserId(String ownerUserId) {
				this.ownerUserId = ownerUserId;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public List<Long> getRefBizEntityIdList() {
				return this.refBizEntityIdList;
			}

			public void setRefBizEntityIdList(List<Long> refBizEntityIdList) {
				this.refBizEntityIdList = refBizEntityIdList;
			}

			public Long getParentId() {
				return this.parentId;
			}

			public void setParentId(Long parentId) {
				this.parentId = parentId;
			}
		}

		public static class BizProcess {

			@SerializedName("OwnerUserId")
			private String ownerUserId;

			@SerializedName("DisplayName")
			private String displayName;

			@SerializedName("Name")
			private String name;

			@SerializedName("PreBizProcessIdList")
			private List<Long> preBizProcessIdList;

			@SerializedName("Description")
			private String description;

			@SerializedName("BizEventEntityIdList")
			private List<Long> bizEventEntityIdList;

			@SerializedName("RefBizEntityIdList")
			private List<Long> refBizEntityIdList;

			public String getOwnerUserId() {
				return this.ownerUserId;
			}

			public void setOwnerUserId(String ownerUserId) {
				this.ownerUserId = ownerUserId;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<Long> getPreBizProcessIdList() {
				return this.preBizProcessIdList;
			}

			public void setPreBizProcessIdList(List<Long> preBizProcessIdList) {
				this.preBizProcessIdList = preBizProcessIdList;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public List<Long> getBizEventEntityIdList() {
				return this.bizEventEntityIdList;
			}

			public void setBizEventEntityIdList(List<Long> bizEventEntityIdList) {
				this.bizEventEntityIdList = bizEventEntityIdList;
			}

			public List<Long> getRefBizEntityIdList() {
				return this.refBizEntityIdList;
			}

			public void setRefBizEntityIdList(List<Long> refBizEntityIdList) {
				this.refBizEntityIdList = refBizEntityIdList;
			}
		}
	}

	@Override
	public Class<UpdateBizEntityResponse> getResponseClass() {
		return UpdateBizEntityResponse.class;
	}

}
