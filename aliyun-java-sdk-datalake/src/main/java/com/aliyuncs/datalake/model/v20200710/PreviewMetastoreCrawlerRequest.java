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
public class PreviewMetastoreCrawlerRequest extends RoaAcsRequest<PreviewMetastoreCrawlerResponse> {
	   

	private String targetTablePrefix;

	private String datasourceType;

	private String targetUpdateStrategy;

	private String targetDatabase;

	private String datasourcePath;

	private String roleName;

	private String name;

	private String fileFormatConfig;

	private String fileFormat;

	private String datasourceExcludePath;
	public PreviewMetastoreCrawlerRequest() {
		super("DataLake", "2020-07-10", "PreviewMetastoreCrawler");
		setUriPattern("/webapi/crawler/preview");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetTablePrefix() {
		return this.targetTablePrefix;
	}

	public void setTargetTablePrefix(String targetTablePrefix) {
		this.targetTablePrefix = targetTablePrefix;
		if(targetTablePrefix != null){
			putBodyParameter("TargetTablePrefix", targetTablePrefix);
		}
	}

	public String getDatasourceType() {
		return this.datasourceType;
	}

	public void setDatasourceType(String datasourceType) {
		this.datasourceType = datasourceType;
		if(datasourceType != null){
			putBodyParameter("DatasourceType", datasourceType);
		}
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

	public String getTargetDatabase() {
		return this.targetDatabase;
	}

	public void setTargetDatabase(String targetDatabase) {
		this.targetDatabase = targetDatabase;
		if(targetDatabase != null){
			putBodyParameter("TargetDatabase", targetDatabase);
		}
	}

	public String getDatasourcePath() {
		return this.datasourcePath;
	}

	public void setDatasourcePath(String datasourcePath) {
		this.datasourcePath = datasourcePath;
		if(datasourcePath != null){
			putBodyParameter("DatasourcePath", datasourcePath);
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

	public String getFileFormatConfig() {
		return this.fileFormatConfig;
	}

	public void setFileFormatConfig(String fileFormatConfig) {
		this.fileFormatConfig = fileFormatConfig;
		if(fileFormatConfig != null){
			putBodyParameter("FileFormatConfig", fileFormatConfig);
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
	public Class<PreviewMetastoreCrawlerResponse> getResponseClass() {
		return PreviewMetastoreCrawlerResponse.class;
	}

}
