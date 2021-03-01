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
public class ModifyMetastoreCrawlerRequest extends RoaAcsRequest<ModifyMetastoreCrawlerResponse> {
	   

	private String targetUpdateStrategy;

	private String executeType;

	private String roleName;

	private String executeCron;

	private Boolean immediatelyRun;

	private String name;

	private String fileFormatConfig;

	private String id;

	private String fileFormat;

	private String datasourceExcludePath;
	public ModifyMetastoreCrawlerRequest() {
		super("DataLake", "2020-07-10", "ModifyMetastoreCrawler");
		setUriPattern("/webapi/crawler/modify");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetUpdateStrategy() {
		return this.targetUpdateStrategy;
	}

	public void setTargetUpdateStrategy(String targetUpdateStrategy) {
		this.targetUpdateStrategy = targetUpdateStrategy;
		if(targetUpdateStrategy != null){
			putBodyParameter("TargetUpdateStrategy", targetUpdateStrategy);
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

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		if(roleName != null){
			putBodyParameter("RoleName", roleName);
		}
	}

	public String getExecuteCron() {
		return this.executeCron;
	}

	public void setExecuteCron(String executeCron) {
		this.executeCron = executeCron;
		if(executeCron != null){
			putBodyParameter("ExecuteCron", executeCron);
		}
	}

	public Boolean getImmediatelyRun() {
		return this.immediatelyRun;
	}

	public void setImmediatelyRun(Boolean immediatelyRun) {
		this.immediatelyRun = immediatelyRun;
		if(immediatelyRun != null){
			putBodyParameter("ImmediatelyRun", immediatelyRun.toString());
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

	public String getFileFormatConfig() {
		return this.fileFormatConfig;
	}

	public void setFileFormatConfig(String fileFormatConfig) {
		this.fileFormatConfig = fileFormatConfig;
		if(fileFormatConfig != null){
			putBodyParameter("FileFormatConfig", fileFormatConfig);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getFileFormat() {
		return this.fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
		if(fileFormat != null){
			putBodyParameter("FileFormat", fileFormat);
		}
	}

	public String getDatasourceExcludePath() {
		return this.datasourceExcludePath;
	}

	public void setDatasourceExcludePath(String datasourceExcludePath) {
		this.datasourceExcludePath = datasourceExcludePath;
		if(datasourceExcludePath != null){
			putBodyParameter("DatasourceExcludePath", datasourceExcludePath);
		}
	}

	@Override
	public Class<ModifyMetastoreCrawlerResponse> getResponseClass() {
		return ModifyMetastoreCrawlerResponse.class;
	}

}
