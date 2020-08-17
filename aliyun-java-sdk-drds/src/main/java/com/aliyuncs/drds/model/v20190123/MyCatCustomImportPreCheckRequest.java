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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MyCatCustomImportPreCheckRequest extends RpcAcsRequest<MyCatCustomImportPreCheckResponse> {
	   

	private Integer dstPort;

	private String taskName;

	private String schemaUrl;

	private String dstUser;

	private String dstDbNme;

	private String tableMap;

	private String importDb;

	private String dstPwd;

	private String ruleUrl;

	private String dstDrdsInstanceId;
	public MyCatCustomImportPreCheckRequest() {
		super("Drds", "2019-01-23", "MyCatCustomImportPreCheck", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getDstPort() {
		return this.dstPort;
	}

	public void setDstPort(Integer dstPort) {
		this.dstPort = dstPort;
		if(dstPort != null){
			putQueryParameter("DstPort", dstPort.toString());
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
		}
	}

	public String getSchemaUrl() {
		return this.schemaUrl;
	}

	public void setSchemaUrl(String schemaUrl) {
		this.schemaUrl = schemaUrl;
		if(schemaUrl != null){
			putQueryParameter("SchemaUrl", schemaUrl);
		}
	}

	public String getDstUser() {
		return this.dstUser;
	}

	public void setDstUser(String dstUser) {
		this.dstUser = dstUser;
		if(dstUser != null){
			putQueryParameter("DstUser", dstUser);
		}
	}

	public String getDstDbNme() {
		return this.dstDbNme;
	}

	public void setDstDbNme(String dstDbNme) {
		this.dstDbNme = dstDbNme;
		if(dstDbNme != null){
			putQueryParameter("DstDbNme", dstDbNme);
		}
	}

	public String getTableMap() {
		return this.tableMap;
	}

	public void setTableMap(String tableMap) {
		this.tableMap = tableMap;
		if(tableMap != null){
			putQueryParameter("TableMap", tableMap);
		}
	}

	public String getImportDb() {
		return this.importDb;
	}

	public void setImportDb(String importDb) {
		this.importDb = importDb;
		if(importDb != null){
			putQueryParameter("ImportDb", importDb);
		}
	}

	public String getDstPwd() {
		return this.dstPwd;
	}

	public void setDstPwd(String dstPwd) {
		this.dstPwd = dstPwd;
		if(dstPwd != null){
			putQueryParameter("DstPwd", dstPwd);
		}
	}

	public String getRuleUrl() {
		return this.ruleUrl;
	}

	public void setRuleUrl(String ruleUrl) {
		this.ruleUrl = ruleUrl;
		if(ruleUrl != null){
			putQueryParameter("RuleUrl", ruleUrl);
		}
	}

	public String getDstDrdsInstanceId() {
		return this.dstDrdsInstanceId;
	}

	public void setDstDrdsInstanceId(String dstDrdsInstanceId) {
		this.dstDrdsInstanceId = dstDrdsInstanceId;
		if(dstDrdsInstanceId != null){
			putQueryParameter("DstDrdsInstanceId", dstDrdsInstanceId);
		}
	}

	@Override
	public Class<MyCatCustomImportPreCheckResponse> getResponseClass() {
		return MyCatCustomImportPreCheckResponse.class;
	}

}
