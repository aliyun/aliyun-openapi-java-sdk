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
public class CreateDataCronClearOrderRequest extends RpcAcsRequest<CreateDataCronClearOrderResponse> {
	   

	private Long tid;

	private String attachmentKey;

	@SerializedName("param")
	private Param param;

	private String comment;

	@SerializedName("relatedUserList")
	private List<Long> relatedUserList;
	public CreateDataCronClearOrderRequest() {
		super("dms-enterprise", "2018-11-01", "CreateDataCronClearOrder");
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

		@SerializedName("Classify")
		private String classify;

		@SerializedName("DbItemList")
		private List<DbItemListItem> dbItemList;

		@SerializedName("CronClearItemList")
		private List<CronClearItemListItem> cronClearItemList;

		@SerializedName("DurationHour")
		private Long durationHour;

		@SerializedName("CronFormat")
		private String cronFormat;

		@SerializedName("specifyDuration")
		private Boolean specifyDuration;

		public String getClassify() {
			return this.classify;
		}

		public void setClassify(String classify) {
			this.classify = classify;
		}

		public List<DbItemListItem> getDbItemList() {
			return this.dbItemList;
		}

		public void setDbItemList(List<DbItemListItem> dbItemList) {
			this.dbItemList = dbItemList;
		}

		public List<CronClearItemListItem> getCronClearItemList() {
			return this.cronClearItemList;
		}

		public void setCronClearItemList(List<CronClearItemListItem> cronClearItemList) {
			this.cronClearItemList = cronClearItemList;
		}

		public Long getDurationHour() {
			return this.durationHour;
		}

		public void setDurationHour(Long durationHour) {
			this.durationHour = durationHour;
		}

		public String getCronFormat() {
			return this.cronFormat;
		}

		public void setCronFormat(String cronFormat) {
			this.cronFormat = cronFormat;
		}

		public Boolean getSpecifyDuration() {
			return this.specifyDuration;
		}

		public void setSpecifyDuration(Boolean specifyDuration) {
			this.specifyDuration = specifyDuration;
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

		public static class CronClearItemListItem {

			@SerializedName("FilterSQL")
			private String filterSQL;

			@SerializedName("RemainDays")
			private Long remainDays;

			@SerializedName("TableName")
			private String tableName;

			@SerializedName("ColumnName")
			private String columnName;

			@SerializedName("TimeUnit")
			private String timeUnit;

			public String getFilterSQL() {
				return this.filterSQL;
			}

			public void setFilterSQL(String filterSQL) {
				this.filterSQL = filterSQL;
			}

			public Long getRemainDays() {
				return this.remainDays;
			}

			public void setRemainDays(Long remainDays) {
				this.remainDays = remainDays;
			}

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public String getColumnName() {
				return this.columnName;
			}

			public void setColumnName(String columnName) {
				this.columnName = columnName;
			}

			public String getTimeUnit() {
				return this.timeUnit;
			}

			public void setTimeUnit(String timeUnit) {
				this.timeUnit = timeUnit;
			}
		}
	}

	@Override
	public Class<CreateDataCronClearOrderResponse> getResponseClass() {
		return CreateDataCronClearOrderResponse.class;
	}

}
