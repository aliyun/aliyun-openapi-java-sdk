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
public class UpsertQualityArchiveTableRequest extends RpcAcsRequest<UpsertQualityArchiveTableResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("upsertCommand")
	private UpsertCommand upsertCommand;
	public UpsertQualityArchiveTableRequest() {
		super("dataphin-public", "2023-06-30", "UpsertQualityArchiveTable", "Dataphin");
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

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
		if(opUserId != null){
			putQueryParameter("OpUserId", opUserId);
		}
	}

	public UpsertCommand getUpsertCommand() {
		return this.upsertCommand;
	}

	public void setUpsertCommand(UpsertCommand upsertCommand) {
		this.upsertCommand = upsertCommand;	
		if (upsertCommand != null) {
			putBodyParameter("UpsertCommand" , new Gson().toJson(upsertCommand));
		}	
	}

	public static class UpsertCommand {

		@SerializedName("Lifecycle")
		private Integer lifecycle;

		@SerializedName("AddMode")
		private String addMode;

		@SerializedName("ExistTableName")
		private String existTableName;

		@SerializedName("MaxArchiveCount")
		private Long maxArchiveCount;

		@SerializedName("WatchId")
		private Long watchId;

		@SerializedName("ArchiveTableId")
		private Long archiveTableId;

		@SerializedName("NewTableNamePrefix")
		private String newTableNamePrefix;

		@SerializedName("SetActive")
		private Boolean setActive;

		public Integer getLifecycle() {
			return this.lifecycle;
		}

		public void setLifecycle(Integer lifecycle) {
			this.lifecycle = lifecycle;
		}

		public String getAddMode() {
			return this.addMode;
		}

		public void setAddMode(String addMode) {
			this.addMode = addMode;
		}

		public String getExistTableName() {
			return this.existTableName;
		}

		public void setExistTableName(String existTableName) {
			this.existTableName = existTableName;
		}

		public Long getMaxArchiveCount() {
			return this.maxArchiveCount;
		}

		public void setMaxArchiveCount(Long maxArchiveCount) {
			this.maxArchiveCount = maxArchiveCount;
		}

		public Long getWatchId() {
			return this.watchId;
		}

		public void setWatchId(Long watchId) {
			this.watchId = watchId;
		}

		public Long getArchiveTableId() {
			return this.archiveTableId;
		}

		public void setArchiveTableId(Long archiveTableId) {
			this.archiveTableId = archiveTableId;
		}

		public String getNewTableNamePrefix() {
			return this.newTableNamePrefix;
		}

		public void setNewTableNamePrefix(String newTableNamePrefix) {
			this.newTableNamePrefix = newTableNamePrefix;
		}

		public Boolean getSetActive() {
			return this.setActive;
		}

		public void setSetActive(Boolean setActive) {
			this.setActive = setActive;
		}
	}

	@Override
	public Class<UpsertQualityArchiveTableResponse> getResponseClass() {
		return UpsertQualityArchiveTableResponse.class;
	}

}
