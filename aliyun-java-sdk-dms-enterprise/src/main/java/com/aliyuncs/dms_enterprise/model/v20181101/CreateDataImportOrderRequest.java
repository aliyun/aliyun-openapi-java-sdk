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
public class CreateDataImportOrderRequest extends RpcAcsRequest<CreateDataImportOrderResponse> {
	   

	private Long tid;

	private String attachmentKey;

	@SerializedName("param")
	private Param param;

	private String comment;

	@SerializedName("relatedUserList")
	private List<Long> relatedUserList;
	public CreateDataImportOrderRequest() {
		super("dms-enterprise", "2018-11-01", "CreateDataImportOrder");
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

		@SerializedName("FileEncoding")
		private String fileEncoding;

		@SerializedName("Classify")
		private String classify;

		@SerializedName("FileType")
		private String fileType;

		@SerializedName("CsvFirstRowIsColumnDef")
		private Boolean csvFirstRowIsColumnDef;

		@SerializedName("RollbackAttachmentName")
		private String rollbackAttachmentName;

		@SerializedName("AttachmentName")
		private String attachmentName;

		@SerializedName("ImportMode")
		private String importMode;

		@SerializedName("RollbackSQL")
		private String rollbackSQL;

		@SerializedName("RollbackSqlType")
		private String rollbackSqlType;

		@SerializedName("DbItemList")
		private List<DbItemListItem> dbItemList;

		@SerializedName("InsertType")
		private String insertType;

		@SerializedName("TableName")
		private String tableName;

		@SerializedName("IgnoreError")
		private Boolean ignoreError;

		public String getFileEncoding() {
			return this.fileEncoding;
		}

		public void setFileEncoding(String fileEncoding) {
			this.fileEncoding = fileEncoding;
		}

		public String getClassify() {
			return this.classify;
		}

		public void setClassify(String classify) {
			this.classify = classify;
		}

		public String getFileType() {
			return this.fileType;
		}

		public void setFileType(String fileType) {
			this.fileType = fileType;
		}

		public Boolean getCsvFirstRowIsColumnDef() {
			return this.csvFirstRowIsColumnDef;
		}

		public void setCsvFirstRowIsColumnDef(Boolean csvFirstRowIsColumnDef) {
			this.csvFirstRowIsColumnDef = csvFirstRowIsColumnDef;
		}

		public String getRollbackAttachmentName() {
			return this.rollbackAttachmentName;
		}

		public void setRollbackAttachmentName(String rollbackAttachmentName) {
			this.rollbackAttachmentName = rollbackAttachmentName;
		}

		public String getAttachmentName() {
			return this.attachmentName;
		}

		public void setAttachmentName(String attachmentName) {
			this.attachmentName = attachmentName;
		}

		public String getImportMode() {
			return this.importMode;
		}

		public void setImportMode(String importMode) {
			this.importMode = importMode;
		}

		public String getRollbackSQL() {
			return this.rollbackSQL;
		}

		public void setRollbackSQL(String rollbackSQL) {
			this.rollbackSQL = rollbackSQL;
		}

		public String getRollbackSqlType() {
			return this.rollbackSqlType;
		}

		public void setRollbackSqlType(String rollbackSqlType) {
			this.rollbackSqlType = rollbackSqlType;
		}

		public List<DbItemListItem> getDbItemList() {
			return this.dbItemList;
		}

		public void setDbItemList(List<DbItemListItem> dbItemList) {
			this.dbItemList = dbItemList;
		}

		public String getInsertType() {
			return this.insertType;
		}

		public void setInsertType(String insertType) {
			this.insertType = insertType;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public Boolean getIgnoreError() {
			return this.ignoreError;
		}

		public void setIgnoreError(Boolean ignoreError) {
			this.ignoreError = ignoreError;
		}

		public static class DbItemListItem {

			@SerializedName("DbId")
			private Long dbId;

			@SerializedName("Logic")
			private Boolean logic;

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
	public Class<CreateDataImportOrderResponse> getResponseClass() {
		return CreateDataImportOrderResponse.class;
	}

}
