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
public class UpsertQualityWatchAlertRequest extends RpcAcsRequest<UpsertQualityWatchAlertResponse> {
	   

	private Long opTenantId;

	@SerializedName("upsertCommand")
	private UpsertCommand upsertCommand;
	public UpsertQualityWatchAlertRequest() {
		super("dataphin-public", "2023-06-30", "UpsertQualityWatchAlert");
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

		@SerializedName("WatchId")
		private Long watchId;

		@SerializedName("QualityAlertInfo")
		private QualityAlertInfo qualityAlertInfo;

		public Long getWatchId() {
			return this.watchId;
		}

		public void setWatchId(Long watchId) {
			this.watchId = watchId;
		}

		public QualityAlertInfo getQualityAlertInfo() {
			return this.qualityAlertInfo;
		}

		public void setQualityAlertInfo(QualityAlertInfo qualityAlertInfo) {
			this.qualityAlertInfo = qualityAlertInfo;
		}

		public static class QualityAlertInfo {

			@SerializedName("AlertUserList")
			private List<AlertUserListItem> alertUserList;

			@SerializedName("AlertDutyList")
			private List<AlertDutyListItem> alertDutyList;

			@SerializedName("EnableAlertQualityOwner")
			private Boolean enableAlertQualityOwner;

			@SerializedName("AlertDutyChannelList")
			private List<String> alertDutyChannelList;

			@SerializedName("AlertQualityOwnerChannelList")
			private List<String> alertQualityOwnerChannelList;

			@SerializedName("AlertUserChannelList")
			private List<String> alertUserChannelList;

			public List<AlertUserListItem> getAlertUserList() {
				return this.alertUserList;
			}

			public void setAlertUserList(List<AlertUserListItem> alertUserList) {
				this.alertUserList = alertUserList;
			}

			public List<AlertDutyListItem> getAlertDutyList() {
				return this.alertDutyList;
			}

			public void setAlertDutyList(List<AlertDutyListItem> alertDutyList) {
				this.alertDutyList = alertDutyList;
			}

			public Boolean getEnableAlertQualityOwner() {
				return this.enableAlertQualityOwner;
			}

			public void setEnableAlertQualityOwner(Boolean enableAlertQualityOwner) {
				this.enableAlertQualityOwner = enableAlertQualityOwner;
			}

			public List<String> getAlertDutyChannelList() {
				return this.alertDutyChannelList;
			}

			public void setAlertDutyChannelList(List<String> alertDutyChannelList) {
				this.alertDutyChannelList = alertDutyChannelList;
			}

			public List<String> getAlertQualityOwnerChannelList() {
				return this.alertQualityOwnerChannelList;
			}

			public void setAlertQualityOwnerChannelList(List<String> alertQualityOwnerChannelList) {
				this.alertQualityOwnerChannelList = alertQualityOwnerChannelList;
			}

			public List<String> getAlertUserChannelList() {
				return this.alertUserChannelList;
			}

			public void setAlertUserChannelList(List<String> alertUserChannelList) {
				this.alertUserChannelList = alertUserChannelList;
			}

			public static class AlertUserListItem {

				@SerializedName("Name")
				private String name;

				@SerializedName("Id")
				private String id;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}
			}

			public static class AlertDutyListItem {

				@SerializedName("Name")
				private String name;

				@SerializedName("Id")
				private String id;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}
			}
		}
	}

	@Override
	public Class<UpsertQualityWatchAlertResponse> getResponseClass() {
		return UpsertQualityWatchAlertResponse.class;
	}

}
