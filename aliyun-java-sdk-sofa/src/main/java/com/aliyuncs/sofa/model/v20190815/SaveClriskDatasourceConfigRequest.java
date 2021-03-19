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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveClriskDatasourceConfigRequest extends RpcAcsRequest<SaveClriskDatasourceConfigResponse> {
	   

	private String dataSourceConfigId;

	private String project;

	private String type;

	private String configAccessKeySecret;

	private String endpoint;

	private String hostName;

	private String password;

	private String bucketName;

	private String configAccessKeyId;

	private String dataSourceConfigName;

	private Long port;

	private String databaseName;

	private String userName;
	public SaveClriskDatasourceConfigRequest() {
		super("SOFA", "2019-08-15", "SaveClriskDatasourceConfig", "sofacaferms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDataSourceConfigId() {
		return this.dataSourceConfigId;
	}

	public void setDataSourceConfigId(String dataSourceConfigId) {
		this.dataSourceConfigId = dataSourceConfigId;
		if(dataSourceConfigId != null){
			putBodyParameter("DataSourceConfigId", dataSourceConfigId);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putBodyParameter("Project", project);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getConfigAccessKeySecret() {
		return this.configAccessKeySecret;
	}

	public void setConfigAccessKeySecret(String configAccessKeySecret) {
		this.configAccessKeySecret = configAccessKeySecret;
		if(configAccessKeySecret != null){
			putBodyParameter("ConfigAccessKeySecret", configAccessKeySecret);
		}
	}

	public String getEndpoint() {
		return this.endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
		if(endpoint != null){
			putBodyParameter("Endpoint", endpoint);
		}
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
		if(hostName != null){
			putBodyParameter("HostName", hostName);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putBodyParameter("Password", password);
		}
	}

	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
		if(bucketName != null){
			putBodyParameter("BucketName", bucketName);
		}
	}

	public String getConfigAccessKeyId() {
		return this.configAccessKeyId;
	}

	public void setConfigAccessKeyId(String configAccessKeyId) {
		this.configAccessKeyId = configAccessKeyId;
		if(configAccessKeyId != null){
			putBodyParameter("ConfigAccessKeyId", configAccessKeyId);
		}
	}

	public String getDataSourceConfigName() {
		return this.dataSourceConfigName;
	}

	public void setDataSourceConfigName(String dataSourceConfigName) {
		this.dataSourceConfigName = dataSourceConfigName;
		if(dataSourceConfigName != null){
			putBodyParameter("DataSourceConfigName", dataSourceConfigName);
		}
	}

	public Long getPort() {
		return this.port;
	}

	public void setPort(Long port) {
		this.port = port;
		if(port != null){
			putBodyParameter("Port", port.toString());
		}
	}

	public String getDatabaseName() {
		return this.databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
		if(databaseName != null){
			putBodyParameter("DatabaseName", databaseName);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putBodyParameter("UserName", userName);
		}
	}

	@Override
	public Class<SaveClriskDatasourceConfigResponse> getResponseClass() {
		return SaveClriskDatasourceConfigResponse.class;
	}

}
