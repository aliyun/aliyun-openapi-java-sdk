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

package com.aliyuncs.pairecservice.model.v20221213;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceResourceTableRequest extends RoaAcsRequest<GetInstanceResourceTableResponse> {
	   

	private String resourceId;

	private String instanceId;

	private String tableName;
	public GetInstanceResourceTableRequest() {
		super("PaiRecService", "2022-12-13", "GetInstanceResourceTable");
		setUriPattern("/api/v1/instances/[InstanceId]/resources/[ResourceId]/tables/[TableName]");
		setMethod(MethodType.GET);
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putPathParameter("ResourceId", resourceId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("InstanceId", instanceId);
		}
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
		if(tableName != null){
			putPathParameter("TableName", tableName);
		}
	}

	@Override
	public Class<GetInstanceResourceTableResponse> getResponseClass() {
		return GetInstanceResourceTableResponse.class;
	}

}
