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
public class UpdateMetastoreMigrationRequest extends RoaAcsRequest<UpdateMetastoreMigrationResponse> {
	   

	private String runOptions;

	private String instanceId;

	private String roleName;

	private String name;

	private String metastoreType;

	private String metastoreInfo;

	private String desc;
	public UpdateMetastoreMigrationRequest() {
		super("DataLake", "2020-07-10", "UpdateMetastoreMigration");
		setUriPattern("/webapi/migration/update");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRunOptions() {
		return this.runOptions;
	}

	public void setRunOptions(String runOptions) {
		this.runOptions = runOptions;
		if(runOptions != null){
			putBodyParameter("RunOptions", runOptions);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getMetastoreType() {
		return this.metastoreType;
	}

	public void setMetastoreType(String metastoreType) {
		this.metastoreType = metastoreType;
		if(metastoreType != null){
			putBodyParameter("MetastoreType", metastoreType);
		}
	}

	public String getMetastoreInfo() {
		return this.metastoreInfo;
	}

	public void setMetastoreInfo(String metastoreInfo) {
		this.metastoreInfo = metastoreInfo;
		if(metastoreInfo != null){
			putBodyParameter("MetastoreInfo", metastoreInfo);
		}
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
		if(desc != null){
			putBodyParameter("Desc", desc);
		}
	}

	@Override
	public Class<UpdateMetastoreMigrationResponse> getResponseClass() {
		return UpdateMetastoreMigrationResponse.class;
	}

}
