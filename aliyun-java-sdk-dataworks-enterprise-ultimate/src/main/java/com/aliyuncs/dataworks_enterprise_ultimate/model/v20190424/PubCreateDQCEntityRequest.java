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

package com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PubCreateDQCEntityRequest extends RpcAcsRequest<PubCreateDQCEntityResponse> {
	
	public PubCreateDQCEntityRequest() {
		super("dataworks-enterprise-ultimate", "2019-04-24", "PubCreateDQCEntity");
		setMethod(MethodType.POST);
	}

	private String projectName;

	private Integer entityLevel;

	private String matchExpression;

	private String envType;

	private String tableName;

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putBodyParameter("ProjectName", projectName);
		}
	}

	public Integer getEntityLevel() {
		return this.entityLevel;
	}

	public void setEntityLevel(Integer entityLevel) {
		this.entityLevel = entityLevel;
		if(entityLevel != null){
			putBodyParameter("EntityLevel", entityLevel.toString());
		}
	}

	public String getMatchExpression() {
		return this.matchExpression;
	}

	public void setMatchExpression(String matchExpression) {
		this.matchExpression = matchExpression;
		if(matchExpression != null){
			putBodyParameter("MatchExpression", matchExpression);
		}
	}

	public String getEnvType() {
		return this.envType;
	}

	public void setEnvType(String envType) {
		this.envType = envType;
		if(envType != null){
			putBodyParameter("EnvType", envType);
		}
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
		if(tableName != null){
			putBodyParameter("TableName", tableName);
		}
	}

	@Override
	public Class<PubCreateDQCEntityResponse> getResponseClass() {
		return PubCreateDQCEntityResponse.class;
	}

}
