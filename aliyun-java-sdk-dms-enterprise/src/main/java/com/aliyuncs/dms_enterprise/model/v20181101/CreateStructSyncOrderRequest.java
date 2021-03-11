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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateStructSyncOrderRequest extends RpcAcsRequest<CreateStructSyncOrderResponse> {
	   

	private Long tid;

	private String attachmentKey;

	@SerializedName("param")
	private Param param;

	private String comment;

	@SerializedName("relatedUserList")
	private List<Long> relatedUserList;
	public CreateStructSyncOrderRequest() {
		super("dms-enterprise", "2018-11-01", "CreateStructSyncOrder");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public String getAttachmentKey() {
		return this.attachmentKey;
	}

	public void setAttachmentKey(String attachmentKey) {
		this.attachmentKey = attachmentKey;
		if(attachmentKey != null){
			putQueryParameter("AttachmentKey", attachmentKey);
		}
	}

	public Param getParam() {
		return this.param;
	}

	public void setParam(Param param) {
		this.param = param;	
		if (param != null) {
			putQueryParameter("Param" , new Gson().toJson(param));
		}	
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
		}
	}

	public List<Long> getRelatedUserList() {
		return this.relatedUserList;
	}

	public void setRelatedUserList(List<Long> relatedUserList) {
		this.relatedUserList = relatedUserList;	
		if (relatedUserList != null) {
			putQueryParameter("RelatedUserList" , new Gson().toJson(relatedUserList));
		}	
	}

	public static class Param {

		@SerializedName("SyncType")
		private String syncType;

		@SerializedName("TableInfoList")
		private List<TableInfoListItem> tableInfoList;

		@SerializedName("Source")
		private Source source;

		@SerializedName("IgnoreError")
		private Boolean ignoreError;

		@SerializedName("Target")
		private Target target;

		public String getSyncType() {
			return this.syncType;
		}

		public void setSyncType(String syncType) {
			this.syncType = syncType;
		}

		public List<TableInfoListItem> getTableInfoList() {
			return this.tableInfoList;
		}

		public void setTableInfoList(List<TableInfoListItem> tableInfoList) {
			this.tableInfoList = tableInfoList;
		}

		public Source getSource() {
			return this.source;
		}

		public void setSource(Source source) {
			this.source = source;
		}

		public Boolean getIgnoreError() {
			return this.ignoreError;
		}

		public void setIgnoreError(Boolean ignoreError) {
			this.ignoreError = ignoreError;
		}

		public Target getTarget() {
			return this.target;
		}

		public void setTarget(Target target) {
			this.target = target;
		}

		public static class TableInfoListItem {

			@SerializedName("SourceTableName")
			private String sourceTableName;

			@SerializedName("TargetTableName")
			private String targetTableName;

			public String getSourceTableName() {
				return this.sourceTableName;
			}

			public void setSourceTableName(String sourceTableName) {
				this.sourceTableName = sourceTableName;
			}

			public String getTargetTableName() {
				return this.targetTableName;
			}

			public void setTargetTableName(String targetTableName) {
				this.targetTableName = targetTableName;
			}
		}

		public static class Source {

			@SerializedName("DbSearchName")
			private String dbSearchName;

			@SerializedName("VersionId")
			private String versionId;

			@SerializedName("DbId")
			private Long dbId;

			@SerializedName("Logic")
			private Boolean logic;

			public String getDbSearchName() {
				return this.dbSearchName;
			}

			public void setDbSearchName(String dbSearchName) {
				this.dbSearchName = dbSearchName;
			}

			public String getVersionId() {
				return this.versionId;
			}

			public void setVersionId(String versionId) {
				this.versionId = versionId;
			}

			public Long getDbId() {
				return this.dbId;
			}

			public void setDbId(Long dbId) {
				this.dbId = dbId;
			}

			public Boolean getLogic() {
				return this.logic;
			}

			public void setLogic(Boolean logic) {
				this.logic = logic;
			}
		}

		public static class Target {

			@SerializedName("DbSearchName")
			private String dbSearchName;

			@SerializedName("VersionId")
			private String versionId;

			@SerializedName("DbId")
			private Long dbId;

			@SerializedName("Logic")
			private Boolean logic;

			public String getDbSearchName() {
				return this.dbSearchName;
			}

			public void setDbSearchName(String dbSearchName) {
				this.dbSearchName = dbSearchName;
			}

			public String getVersionId() {
				return this.versionId;
			}

			public void setVersionId(String versionId) {
				this.versionId = versionId;
			}

			public Long getDbId() {
				return this.dbId;
			}

			public void setDbId(Long dbId) {
				this.dbId = dbId;
			}

			public Boolean getLogic() {
				return this.logic;
			}

			public void setLogic(Boolean logic) {
				this.logic = logic;
			}
		}
	}

	@Override
	public Class<CreateStructSyncOrderResponse> getResponseClass() {
		return CreateStructSyncOrderResponse.class;
	}

}
