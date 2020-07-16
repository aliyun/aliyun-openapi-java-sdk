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

package com.aliyuncs.openanalytics_open.model.v20180619;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.openanalytics_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyVirtualClusterForSparkRequest extends RpcAcsRequest<ModifyVirtualClusterForSparkResponse> {
	   

	private String defaultExecutorSpecName;

	private Float maxMemory;

	private String sparkModuleReleaseName;

	private String description;

	private Long defaultExecutorNumbers;

	private Float maxCpu;

	private String name;

	private String defaultDriverSpecName;
	public ModifyVirtualClusterForSparkRequest() {
		super("openanalytics-open", "2018-06-19", "ModifyVirtualClusterForSpark", "openanalytics");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDefaultExecutorSpecName() {
		return this.defaultExecutorSpecName;
	}

	public void setDefaultExecutorSpecName(String defaultExecutorSpecName) {
		this.defaultExecutorSpecName = defaultExecutorSpecName;
		if(defaultExecutorSpecName != null){
			putBodyParameter("DefaultExecutorSpecName", defaultExecutorSpecName);
		}
	}

	public Float getMaxMemory() {
		return this.maxMemory;
	}

	public void setMaxMemory(Float maxMemory) {
		this.maxMemory = maxMemory;
		if(maxMemory != null){
			putBodyParameter("MaxMemory", maxMemory.toString());
		}
	}

	public String getSparkModuleReleaseName() {
		return this.sparkModuleReleaseName;
	}

	public void setSparkModuleReleaseName(String sparkModuleReleaseName) {
		this.sparkModuleReleaseName = sparkModuleReleaseName;
		if(sparkModuleReleaseName != null){
			putBodyParameter("SparkModuleReleaseName", sparkModuleReleaseName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public Long getDefaultExecutorNumbers() {
		return this.defaultExecutorNumbers;
	}

	public void setDefaultExecutorNumbers(Long defaultExecutorNumbers) {
		this.defaultExecutorNumbers = defaultExecutorNumbers;
		if(defaultExecutorNumbers != null){
			putBodyParameter("DefaultExecutorNumbers", defaultExecutorNumbers.toString());
		}
	}

	public Float getMaxCpu() {
		return this.maxCpu;
	}

	public void setMaxCpu(Float maxCpu) {
		this.maxCpu = maxCpu;
		if(maxCpu != null){
			putBodyParameter("MaxCpu", maxCpu.toString());
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

	public String getDefaultDriverSpecName() {
		return this.defaultDriverSpecName;
	}

	public void setDefaultDriverSpecName(String defaultDriverSpecName) {
		this.defaultDriverSpecName = defaultDriverSpecName;
		if(defaultDriverSpecName != null){
			putBodyParameter("DefaultDriverSpecName", defaultDriverSpecName);
		}
	}

	@Override
	public Class<ModifyVirtualClusterForSparkResponse> getResponseClass() {
		return ModifyVirtualClusterForSparkResponse.class;
	}

}
