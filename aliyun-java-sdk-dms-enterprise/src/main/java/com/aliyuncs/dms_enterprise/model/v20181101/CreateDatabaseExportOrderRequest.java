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
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDatabaseExportOrderRequest extends RpcAcsRequest<CreateDatabaseExportOrderResponse> {
	   

	private Long parentId;

	private Long tid;

	@SerializedName("relatedUserList")
	private List<Long> relatedUserList;

	@SerializedName("pluginParam")
	private PluginParam pluginParam;

	private String attachmentKey;

	private String comment;
	public CreateDatabaseExportOrderRequest() {
		super("dms-enterprise", "2018-11-01", "CreateDatabaseExportOrder", "dms-enterprise");
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

		@SerializedName("SearchName")
		private String searchName;

		@SerializedName("InstanceId")
		private Long instanceId;

		@SerializedName("DbId")
		private Long dbId;

		@SerializedName("Logic")
		private Boolean logic;

		@SerializedName("Config")
		private Config config;

		public String getClassify() {
			return this.classify;
		}

		public void setClassify(String classify) {
			this.classify = classify;
		}

		public String getSearchName() {
			return this.searchName;
		}

		public void setSearchName(String searchName) {
			this.searchName = searchName;
		}

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
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

		public Config getConfig() {
			return this.config;
		}

		public void setConfig(Config config) {
			this.config = config;
		}

		public static class Config {

			@SerializedName("TargetOption")
			private String targetOption;

			@SerializedName("DataOption")
			private List<String> dataOption;

			@SerializedName("Tables")
			private Map<String,String> tables;

			@SerializedName("ExportContent")
			private String exportContent;

			@SerializedName("SelectedTables")
			private List<String> selectedTables;

			@SerializedName("ExportTypes")
			private List<String> exportTypes;

			@SerializedName("SQLExtOption")
			private List<String> sQLExtOption;

			public String getTargetOption() {
				return this.targetOption;
			}

			public void setTargetOption(String targetOption) {
				this.targetOption = targetOption;
			}

			public List<String> getDataOption() {
				return this.dataOption;
			}

			public void setDataOption(List<String> dataOption) {
				this.dataOption = dataOption;
			}

			public Map<String,String> getTables() {
				return this.tables;
			}

			public void setTables(Map<String,String> tables) {
				this.tables = tables;
			}

			public String getExportContent() {
				return this.exportContent;
			}

			public void setExportContent(String exportContent) {
				this.exportContent = exportContent;
			}

			public List<String> getSelectedTables() {
				return this.selectedTables;
			}

			public void setSelectedTables(List<String> selectedTables) {
				this.selectedTables = selectedTables;
			}

			public List<String> getExportTypes() {
				return this.exportTypes;
			}

			public void setExportTypes(List<String> exportTypes) {
				this.exportTypes = exportTypes;
			}

			public List<String> getSQLExtOption() {
				return this.sQLExtOption;
			}

			public void setSQLExtOption(List<String> sQLExtOption) {
				this.sQLExtOption = sQLExtOption;
			}
		}
	}

	@Override
	public Class<CreateDatabaseExportOrderResponse> getResponseClass() {
		return CreateDatabaseExportOrderResponse.class;
	}

}
