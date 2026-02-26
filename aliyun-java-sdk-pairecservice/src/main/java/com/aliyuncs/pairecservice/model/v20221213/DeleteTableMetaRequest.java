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
public class DeleteTableMetaRequest extends RoaAcsRequest<DeleteTableMetaResponse> {
	   

	private String instanceId;

	private String tableMetaId;
	public DeleteTableMetaRequest() {
		super("PaiRecService", "2022-12-13", "DeleteTableMeta");
		setUriPattern("/api/v1/tablemetas/[TableMetaId]");
		setMethod(MethodType.DELETE);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getTableMetaId() {
		return this.tableMetaId;
	}

	public void setTableMetaId(String tableMetaId) {
		this.tableMetaId = tableMetaId;
		if(tableMetaId != null){
			putPathParameter("TableMetaId", tableMetaId);
		}
	}

	@Override
	public Class<DeleteTableMetaResponse> getResponseClass() {
		return DeleteTableMetaResponse.class;
	}

}
