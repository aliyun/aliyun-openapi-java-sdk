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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCasDatabaseRequest extends RpcAcsRequest<CreateCasDatabaseResponse> {
	   

	private String specId;

	private String workspace;

	private Long storageSize;

	private String engineVersion;

	private String type;

	private String engine;

	private Long instanceCount;

	private String databaseSchemaJsonStr;

	private List<String> appServiceIdsRepeatLists;

	private List<String> appIdsRepeatLists;

	private List<DatabaseAccounts> databaseAccountss;

	private String vSwitchId;

	private String name;
	public CreateCasDatabaseRequest() {
		super("SOFA", "2019-08-15", "CreateCasDatabase", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSpecId() {
		return this.specId;
	}

	public void setSpecId(String specId) {
		this.specId = specId;
		if(specId != null){
			putBodyParameter("SpecId", specId);
		}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
		}
	}

	public Long getStorageSize() {
		return this.storageSize;
	}

	public void setStorageSize(Long storageSize) {
		this.storageSize = storageSize;
		if(storageSize != null){
			putBodyParameter("StorageSize", storageSize.toString());
		}
	}

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
		if(engineVersion != null){
			putBodyParameter("EngineVersion", engineVersion);
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

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
		if(engine != null){
			putBodyParameter("Engine", engine);
		}
	}

	public Long getInstanceCount() {
		return this.instanceCount;
	}

	public void setInstanceCount(Long instanceCount) {
		this.instanceCount = instanceCount;
		if(instanceCount != null){
			putBodyParameter("InstanceCount", instanceCount.toString());
		}
	}

	public String getDatabaseSchemaJsonStr() {
		return this.databaseSchemaJsonStr;
	}

	public void setDatabaseSchemaJsonStr(String databaseSchemaJsonStr) {
		this.databaseSchemaJsonStr = databaseSchemaJsonStr;
		if(databaseSchemaJsonStr != null){
			putBodyParameter("DatabaseSchemaJsonStr", databaseSchemaJsonStr);
		}
	}

	public List<String> getAppServiceIdsRepeatLists() {
		return this.appServiceIdsRepeatLists;
	}

	public void setAppServiceIdsRepeatLists(List<String> appServiceIdsRepeatLists) {
		this.appServiceIdsRepeatLists = appServiceIdsRepeatLists;	
		if (appServiceIdsRepeatLists != null) {
			for (int i = 0; i < appServiceIdsRepeatLists.size(); i++) {
				putBodyParameter("AppServiceIdsRepeatList." + (i + 1) , appServiceIdsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getAppIdsRepeatLists() {
		return this.appIdsRepeatLists;
	}

	public void setAppIdsRepeatLists(List<String> appIdsRepeatLists) {
		this.appIdsRepeatLists = appIdsRepeatLists;	
		if (appIdsRepeatLists != null) {
			for (int i = 0; i < appIdsRepeatLists.size(); i++) {
				putBodyParameter("AppIdsRepeatList." + (i + 1) , appIdsRepeatLists.get(i));
			}
		}	
	}

	public List<DatabaseAccounts> getDatabaseAccountss() {
		return this.databaseAccountss;
	}

	public void setDatabaseAccountss(List<DatabaseAccounts> databaseAccountss) {
		this.databaseAccountss = databaseAccountss;	
		if (databaseAccountss != null) {
			for (int depth1 = 0; depth1 < databaseAccountss.size(); depth1++) {
				putBodyParameter("DatabaseAccounts." + (depth1 + 1) + ".Password" , databaseAccountss.get(depth1).getPassword());
				putBodyParameter("DatabaseAccounts." + (depth1 + 1) + ".Name" , databaseAccountss.get(depth1).getName());
				putBodyParameter("DatabaseAccounts." + (depth1 + 1) + ".Description" , databaseAccountss.get(depth1).getDescription());
				putBodyParameter("DatabaseAccounts." + (depth1 + 1) + ".Privilege" , databaseAccountss.get(depth1).getPrivilege());
			}
		}	
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putBodyParameter("VSwitchId", vSwitchId);
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

	public static class DatabaseAccounts {

		private String password;

		private String name;

		private String description;

		private String privilege;

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPrivilege() {
			return this.privilege;
		}

		public void setPrivilege(String privilege) {
			this.privilege = privilege;
		}
	}

	@Override
	public Class<CreateCasDatabaseResponse> getResponseClass() {
		return CreateCasDatabaseResponse.class;
	}

}
