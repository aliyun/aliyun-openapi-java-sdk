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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddAuthorityTemplateItemsRequest extends RpcAcsRequest<AddAuthorityTemplateItemsResponse> {
	   

	private Long tid;

	private Long templateId;

	@SerializedName("items")
	private List<Items> items;
	public AddAuthorityTemplateItemsRequest() {
		super("dms-enterprise", "2018-11-01", "AddAuthorityTemplateItems", "dms-enterprise");
		setProtocol(ProtocolType.HTTPS);
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

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId.toString());
		}
	}

	public List<Items> getItems() {
		return this.items;
	}

	public void setItems(List<Items> items) {
		this.items = items;	
		if (items != null) {
			putQueryParameter("Items" , new Gson().toJson(items));
		}	
	}

	public static class Items {

		@SerializedName("InstanceId")
		private Integer instanceId;

		@SerializedName("DbId")
		private Integer dbId;

		@SerializedName("PermissionTypes")
		private List<String> permissionTypes;

		@SerializedName("TableName")
		private String tableName;

		@SerializedName("ResourceType")
		private String resourceType;

		public Integer getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Integer instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getDbId() {
			return this.dbId;
		}

		public void setDbId(Integer dbId) {
			this.dbId = dbId;
		}

		public List<String> getPermissionTypes() {
			return this.permissionTypes;
		}

		public void setPermissionTypes(List<String> permissionTypes) {
			this.permissionTypes = permissionTypes;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}
	}

	@Override
	public Class<AddAuthorityTemplateItemsResponse> getResponseClass() {
		return AddAuthorityTemplateItemsResponse.class;
	}

}
