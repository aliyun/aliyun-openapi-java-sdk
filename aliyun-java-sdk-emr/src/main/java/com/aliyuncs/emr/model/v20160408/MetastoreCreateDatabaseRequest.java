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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class MetastoreCreateDatabaseRequest extends RpcAcsRequest<MetastoreCreateDatabaseResponse> {
	
	public MetastoreCreateDatabaseRequest() {
		super("Emr", "2016-04-08", "MetastoreCreateDatabase");
	}

	private Long resourceOwnerId;

	private String dbName;

	private String description;

	private String locationUri;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getLocationUri() {
		return this.locationUri;
	}

	public void setLocationUri(String locationUri) {
		this.locationUri = locationUri;
		if(locationUri != null){
			putQueryParameter("LocationUri", locationUri);
		}
	}

	@Override
	public Class<MetastoreCreateDatabaseResponse> getResponseClass() {
		return MetastoreCreateDatabaseResponse.class;
	}

}
