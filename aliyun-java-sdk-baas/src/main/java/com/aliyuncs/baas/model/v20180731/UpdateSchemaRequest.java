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

package com.aliyuncs.baas.model.v20180731;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateSchemaRequest extends RpcAcsRequest<UpdateSchemaResponse> {
	
	public UpdateSchemaRequest() {
		super("Baas", "2018-07-31", "UpdateSchema");
	}

	private String schemaName;

	private Long schemaId;

	private String bizid;

	private String description;

	private String categoryConfigs;

	public String getSchemaName() {
		return this.schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
		if(schemaName != null){
			putBodyParameter("SchemaName", schemaName);
		}
	}

	public Long getSchemaId() {
		return this.schemaId;
	}

	public void setSchemaId(Long schemaId) {
		this.schemaId = schemaId;
		if(schemaId != null){
			putBodyParameter("SchemaId", schemaId.toString());
		}
	}

	public String getBizid() {
		return this.bizid;
	}

	public void setBizid(String bizid) {
		this.bizid = bizid;
		if(bizid != null){
			putBodyParameter("Bizid", bizid);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getCategoryConfigs() {
		return this.categoryConfigs;
	}

	public void setCategoryConfigs(String categoryConfigs) {
		this.categoryConfigs = categoryConfigs;
		if(categoryConfigs != null){
			putBodyParameter("CategoryConfigs", categoryConfigs);
		}
	}

	@Override
	public Class<UpdateSchemaResponse> getResponseClass() {
		return UpdateSchemaResponse.class;
	}

}
