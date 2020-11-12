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

package com.aliyuncs.openanalytics_open.model.v20200928;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.openanalytics_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTableRequest extends RpcAcsRequest<CreateTableResponse> {
	   

	private String tableType;

	private String viewOriginalText;

	private Struct storageDescriptor;

	private Array partitionKeys;

	private String dbName;

	private String viewExpandedText;

	private String tableName;

	private String parameters;
	public CreateTableRequest() {
		super("openanalytics-open", "2020-09-28", "CreateTable", "openanalytics");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTableType() {
		return this.tableType;
	}

	public void setTableType(String tableType) {
		this.tableType = tableType;
		if(tableType != null){
			putQueryParameter("TableType", tableType);
		}
	}

	public String getViewOriginalText() {
		return this.viewOriginalText;
	}

	public void setViewOriginalText(String viewOriginalText) {
		this.viewOriginalText = viewOriginalText;
		if(viewOriginalText != null){
			putQueryParameter("ViewOriginalText", viewOriginalText);
		}
	}

	public Struct getStorageDescriptor() {
		return this.storageDescriptor;
	}

	public void setStorageDescriptor(Struct storageDescriptor) {
		this.storageDescriptor = storageDescriptor;
		if(storageDescriptor != null){
			putQueryParameter("StorageDescriptor", storageDescriptor.toString());
		}
	}

	public Array getPartitionKeys() {
		return this.partitionKeys;
	}

	public void setPartitionKeys(Array partitionKeys) {
		this.partitionKeys = partitionKeys;
		if(partitionKeys != null){
			putQueryParameter("PartitionKeys", partitionKeys.toString());
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

	public String getViewExpandedText() {
		return this.viewExpandedText;
	}

	public void setViewExpandedText(String viewExpandedText) {
		this.viewExpandedText = viewExpandedText;
		if(viewExpandedText != null){
			putQueryParameter("ViewExpandedText", viewExpandedText);
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

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
		if(parameters != null){
			putQueryParameter("Parameters", parameters);
		}
	}

	@Override
	public Class<CreateTableResponse> getResponseClass() {
		return CreateTableResponse.class;
	}

}
