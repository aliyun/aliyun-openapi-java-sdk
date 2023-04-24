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
public class CreateDataExportOrderRequest extends RpcAcsRequest<CreateDataExportOrderResponse> {
	   

	private Long parentId;

	private Long tid;

	@SerializedName("relatedUserList")
	private List<Long> relatedUserList;

	@SerializedName("pluginParam")
	private PluginParam pluginParam;

	private String attachmentKey;

	private String comment;
	public CreateDataExportOrderRequest() {
		super("dms-enterprise", "2018-11-01", "CreateDataExportOrder", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
		if(parentId != null){
			putQueryParameter("ParentId", parentId.toString());
		}
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

	public List<Long> getRelatedUserList() {
		return this.relatedUserList;
	}

	public void setRelatedUserList(List<Long> relatedUserList) {
		this.relatedUserList = relatedUserList;	
		if (relatedUserList != null) {
			putQueryParameter("RelatedUserList" , new Gson().toJson(relatedUserList));
		}	
	}

	public PluginParam getPluginParam() {
		return this.pluginParam;
	}

	public void setPluginParam(PluginParam pluginParam) {
		this.pluginParam = pluginParam;	
		if (pluginParam != null) {
			putQueryParameter("PluginParam" , new Gson().toJson(pluginParam));
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

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
		}
	}

	public static class PluginParam {

		@SerializedName("Classify")
		private String classify;

		@SerializedName("AffectRows")
		private Long affectRows;

		@SerializedName("InstanceId")
		private Long instanceId;

		@SerializedName("Watermark")
		private Watermark watermark;

		@SerializedName("DbId")
		private Long dbId;

		@SerializedName("ExeSQL")
		private String exeSQL;

		@SerializedName("IgnoreAffectRowsReason")
		private String ignoreAffectRowsReason;

		@SerializedName("Logic")
		private Boolean logic;

		@SerializedName("IgnoreAffectRows")
		private Boolean ignoreAffectRows;

		public String getClassify() {
			return this.classify;
		}

		public void setClassify(String classify) {
			this.classify = classify;
		}

		public Long getAffectRows() {
			return this.affectRows;
		}

		public void setAffectRows(Long affectRows) {
			this.affectRows = affectRows;
		}

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}

		public Watermark getWatermark() {
			return this.watermark;
		}

		public void setWatermark(Watermark watermark) {
			this.watermark = watermark;
		}

		public Long getDbId() {
			return this.dbId;
		}

		public void setDbId(Long dbId) {
			this.dbId = dbId;
		}

		public String getExeSQL() {
			return this.exeSQL;
		}

		public void setExeSQL(String exeSQL) {
			this.exeSQL = exeSQL;
		}

		public String getIgnoreAffectRowsReason() {
			return this.ignoreAffectRowsReason;
		}

		public void setIgnoreAffectRowsReason(String ignoreAffectRowsReason) {
			this.ignoreAffectRowsReason = ignoreAffectRowsReason;
		}

		public Boolean getLogic() {
			return this.logic;
		}

		public void setLogic(Boolean logic) {
			this.logic = logic;
		}

		public Boolean getIgnoreAffectRows() {
			return this.ignoreAffectRows;
		}

		public void setIgnoreAffectRows(Boolean ignoreAffectRows) {
			this.ignoreAffectRows = ignoreAffectRows;
		}

		public static class Watermark {

			@SerializedName("DataWatermark")
			private String dataWatermark;

			@SerializedName("FileWatermark")
			private String fileWatermark;

			@SerializedName("Keys")
			private List<String> keys;

			@SerializedName("WatermarkTypes")
			private List<String> watermarkTypes;

			@SerializedName("ColumnName")
			private String columnName;

			public String getDataWatermark() {
				return this.dataWatermark;
			}

			public void setDataWatermark(String dataWatermark) {
				this.dataWatermark = dataWatermark;
			}

			public String getFileWatermark() {
				return this.fileWatermark;
			}

			public void setFileWatermark(String fileWatermark) {
				this.fileWatermark = fileWatermark;
			}

			public List<String> getKeys() {
				return this.keys;
			}

			public void setKeys(List<String> keys) {
				this.keys = keys;
			}

			public List<String> getWatermarkTypes() {
				return this.watermarkTypes;
			}

			public void setWatermarkTypes(List<String> watermarkTypes) {
				this.watermarkTypes = watermarkTypes;
			}

			public String getColumnName() {
				return this.columnName;
			}

			public void setColumnName(String columnName) {
				this.columnName = columnName;
			}
		}
	}

	@Override
	public Class<CreateDataExportOrderResponse> getResponseClass() {
		return CreateDataExportOrderResponse.class;
	}

}
