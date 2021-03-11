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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateMetaTableRequest extends RpcAcsRequest<UpdateMetaTableResponse> {
	   

	private Integer visibility;

	private String caption;

	private String newOwnerId;

	private String tableGuid;

	private String addedLabels;

	private String removedLabels;

	private Integer envType;

	private String tableName;

	private Long projectId;

	private Long categoryId;
	public UpdateMetaTableRequest() {
		super("dataworks-public", "2020-05-18", "UpdateMetaTable");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getVisibility() {
		return this.visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
		if(visibility != null){
			putQueryParameter("Visibility", visibility.toString());
		}
	}

	public String getCaption() {
		return this.caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
		if(caption != null){
			putQueryParameter("Caption", caption);
		}
	}

	public String getNewOwnerId() {
		return this.newOwnerId;
	}

	public void setNewOwnerId(String newOwnerId) {
		this.newOwnerId = newOwnerId;
		if(newOwnerId != null){
			putQueryParameter("NewOwnerId", newOwnerId);
		}
	}

	public String getTableGuid() {
		return this.tableGuid;
	}

	public void setTableGuid(String tableGuid) {
		this.tableGuid = tableGuid;
		if(tableGuid != null){
			putQueryParameter("TableGuid", tableGuid);
		}
	}

	public String getAddedLabels() {
		return this.addedLabels;
	}

	public void setAddedLabels(String addedLabels) {
		this.addedLabels = addedLabels;
		if(addedLabels != null){
			putBodyParameter("AddedLabels", addedLabels);
		}
	}

	public String getRemovedLabels() {
		return this.removedLabels;
	}

	public void setRemovedLabels(String removedLabels) {
		this.removedLabels = removedLabels;
		if(removedLabels != null){
			putBodyParameter("RemovedLabels", removedLabels);
		}
	}

	public Integer getEnvType() {
		return this.envType;
	}

	public void setEnvType(Integer envType) {
		this.envType = envType;
		if(envType != null){
			putQueryParameter("EnvType", envType.toString());
		}
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
		if(tableName != null){
			putQueryParameter("TableName", tableName);
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId.toString());
		}
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putQueryParameter("CategoryId", categoryId.toString());
		}
	}

	@Override
	public Class<UpdateMetaTableResponse> getResponseClass() {
		return UpdateMetaTableResponse.class;
	}

}
