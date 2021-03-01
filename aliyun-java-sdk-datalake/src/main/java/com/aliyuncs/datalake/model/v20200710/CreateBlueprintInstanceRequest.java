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

package com.aliyuncs.datalake.model.v20200710;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.datalake.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateBlueprintInstanceRequest extends RoaAcsRequest<CreateBlueprintInstanceResponse> {
	   

	private String blueprintType;

	private String targetTable;

	private String executeCapacity;

	private String executeType;

	private String targetDatabase;

	private String targetFormat;

	private String clientToken;

	private String roleName;

	private String dataSourceConfig;

	private String targetLocationUri;

	private String targetPartitions;

	private String executeParameters;

	private String name;

	private String preProcessingConfig;
	public CreateBlueprintInstanceRequest() {
		super("DataLake", "2020-07-10", "CreateBlueprintInstance");
		setUriPattern("/webapi/blueprintinstance/create");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBlueprintType() {
		return this.blueprintType;
	}

	public void setBlueprintType(String blueprintType) {
		this.blueprintType = blueprintType;
		if(blueprintType != null){
			putBodyParameter("BlueprintType", blueprintType);
		}
	}

	public String getTargetTable() {
		return this.targetTable;
	}

	public void setTargetTable(String targetTable) {
		this.targetTable = targetTable;
		if(targetTable != null){
			putBodyParameter("TargetTable", targetTable);
		}
	}

	public String getExecuteCapacity() {
		return this.executeCapacity;
	}

	public void setExecuteCapacity(String executeCapacity) {
		this.executeCapacity = executeCapacity;
		if(executeCapacity != null){
			putBodyParameter("ExecuteCapacity", executeCapacity);
		}
	}

	public String getExecuteType() {
		return this.executeType;
	}

	public void setExecuteType(String executeType) {
		this.executeType = executeType;
		if(executeType != null){
			putBodyParameter("ExecuteType", executeType);
		}
	}

	public String getTargetDatabase() {
		return this.targetDatabase;
	}

	public void setTargetDatabase(String targetDatabase) {
		this.targetDatabase = targetDatabase;
		if(targetDatabase != null){
			putBodyParameter("TargetDatabase", targetDatabase);
		}
	}

	public String getTargetFormat() {
		return this.targetFormat;
	}

	public void setTargetFormat(String targetFormat) {
		this.targetFormat = targetFormat;
		if(targetFormat != null){
			putBodyParameter("TargetFormat", targetFormat);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putHeaderParameter("ClientToken", clientToken);
		}
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		if(roleName != null){
			putBodyParameter("RoleName", roleName);
		}
	}

	public String getDataSourceConfig() {
		return this.dataSourceConfig;
	}

	public void setDataSourceConfig(String dataSourceConfig) {
		this.dataSourceConfig = dataSourceConfig;
		if(dataSourceConfig != null){
			putBodyParameter("DataSourceConfig", dataSourceConfig);
		}
	}

	public String getTargetLocationUri() {
		return this.targetLocationUri;
	}

	public void setTargetLocationUri(String targetLocationUri) {
		this.targetLocationUri = targetLocationUri;
		if(targetLocationUri != null){
			putBodyParameter("TargetLocationUri", targetLocationUri);
		}
	}

	public String getTargetPartitions() {
		return this.targetPartitions;
	}

	public void setTargetPartitions(String targetPartitions) {
		this.targetPartitions = targetPartitions;
		if(targetPartitions != null){
			putBodyParameter("TargetPartitions", targetPartitions);
		}
	}

	public String getExecuteParameters() {
		return this.executeParameters;
	}

	public void setExecuteParameters(String executeParameters) {
		this.executeParameters = executeParameters;
		if(executeParameters != null){
			putBodyParameter("ExecuteParameters", executeParameters);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getPreProcessingConfig() {
		return this.preProcessingConfig;
	}

	public void setPreProcessingConfig(String preProcessingConfig) {
		this.preProcessingConfig = preProcessingConfig;
		if(preProcessingConfig != null){
			putBodyParameter("PreProcessingConfig", preProcessingConfig);
		}
	}

	@Override
	public Class<CreateBlueprintInstanceResponse> getResponseClass() {
		return CreateBlueprintInstanceResponse.class;
	}

}
