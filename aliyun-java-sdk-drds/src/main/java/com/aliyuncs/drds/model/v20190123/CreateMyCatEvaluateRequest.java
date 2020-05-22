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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMyCatEvaluateRequest extends RpcAcsRequest<CreateMyCatEvaluateResponse> {
	   

	private Integer sequenceType;

	private String taskName;

	private String schemaUrl;

	private Long busPeakQps;

	private Integer qpsIncPercent;

	private String serverUrl;

	private Integer capacityIncPercent;

	private String ruleUrl;

	private List<String> importDbLists;
	public CreateMyCatEvaluateRequest() {
		super("Drds", "2019-01-23", "CreateMyCatEvaluate", "drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getSequenceType() {
		return this.sequenceType;
	}

	public void setSequenceType(Integer sequenceType) {
		this.sequenceType = sequenceType;
		if(sequenceType != null){
			putQueryParameter("SequenceType", sequenceType.toString());
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

	public Long getBusPeakQps() {
		return this.busPeakQps;
	}

	public void setBusPeakQps(Long busPeakQps) {
		this.busPeakQps = busPeakQps;
		if(busPeakQps != null){
			putQueryParameter("BusPeakQps", busPeakQps.toString());
		}
	}

	public Integer getQpsIncPercent() {
		return this.qpsIncPercent;
	}

	public void setQpsIncPercent(Integer qpsIncPercent) {
		this.qpsIncPercent = qpsIncPercent;
		if(qpsIncPercent != null){
			putQueryParameter("QpsIncPercent", qpsIncPercent.toString());
		}
	}

	public String getServerUrl() {
		return this.serverUrl;
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
		if(serverUrl != null){
			putQueryParameter("ServerUrl", serverUrl);
		}
	}

	public Integer getCapacityIncPercent() {
		return this.capacityIncPercent;
	}

	public void setCapacityIncPercent(Integer capacityIncPercent) {
		this.capacityIncPercent = capacityIncPercent;
		if(capacityIncPercent != null){
			putQueryParameter("CapacityIncPercent", capacityIncPercent.toString());
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

	public List<String> getImportDbLists() {
		return this.importDbLists;
	}

	public void setImportDbLists(List<String> importDbLists) {
		this.importDbLists = importDbLists;	
		if (importDbLists != null) {
			for (int i = 0; i < importDbLists.size(); i++) {
				putQueryParameter("ImportDbList." + (i + 1) , importDbLists.get(i));
			}
		}	
	}

	@Override
	public Class<CreateMyCatEvaluateResponse> getResponseClass() {
		return CreateMyCatEvaluateResponse.class;
	}

}
