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
public class CreateFreeLockCorrectOrderRequest extends RpcAcsRequest<CreateFreeLockCorrectOrderResponse> {
	   

	private Long tid;

	private String attachmentKey;

	@SerializedName("param")
	private Param param;

	private String comment;

	@SerializedName("relatedUserList")
	private List<Long> relatedUserList;
	public CreateFreeLockCorrectOrderRequest() {
		super("dms-enterprise", "2018-11-01", "CreateFreeLockCorrectOrder");
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

		@SerializedName("SqlType")
		private String sqlType;

		@SerializedName("Classify")
		private String classify;

		@SerializedName("RollbackSQL")
		private String rollbackSQL;

		@SerializedName("RollbackSqlType")
		private String rollbackSqlType;

		@SerializedName("DbItemList")
		private List<DbItemListItem> dbItemList;

		@SerializedName("ExecSQL")
		private String execSQL;

		@SerializedName("RollbackAttachmentName")
		private String rollbackAttachmentName;

		@SerializedName("AttachmentName")
		private String attachmentName;

		public String getSqlType() {
			return this.sqlType;
		}

		public void setSqlType(String sqlType) {
			this.sqlType = sqlType;
		}

		public String getClassify() {
			return this.classify;
		}

		public void setClassify(String classify) {
			this.classify = classify;
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

		public String getExecSQL() {
			return this.execSQL;
		}

		public void setExecSQL(String execSQL) {
			this.execSQL = execSQL;
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
	public Class<CreateFreeLockCorrectOrderResponse> getResponseClass() {
		return CreateFreeLockCorrectOrderResponse.class;
	}

}
