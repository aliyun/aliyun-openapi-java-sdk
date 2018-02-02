/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.afs.model.v20180112;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateConfigurationRequest extends RpcAcsRequest<CreateConfigurationResponse> {
	
	public CreateConfigurationRequest() {
		super("afs", "2018-01-12", "CreateConfiguration");
	}

	private Long resourceOwnerId;

	private String sourceIp;

	private String configurationName;

	private String maxPV;

	private String configurationMethod;

	private String applyType;

	private String scene;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getConfigurationName() {
		return this.configurationName;
	}

	public void setConfigurationName(String configurationName) {
		this.configurationName = configurationName;
		if(configurationName != null){
			putQueryParameter("ConfigurationName", configurationName);
		}
	}

	public String getMaxPV() {
		return this.maxPV;
	}

	public void setMaxPV(String maxPV) {
		this.maxPV = maxPV;
		if(maxPV != null){
			putQueryParameter("MaxPV", maxPV);
		}
	}

	public String getConfigurationMethod() {
		return this.configurationMethod;
	}

	public void setConfigurationMethod(String configurationMethod) {
		this.configurationMethod = configurationMethod;
		if(configurationMethod != null){
			putQueryParameter("ConfigurationMethod", configurationMethod);
		}
	}

	public String getApplyType() {
		return this.applyType;
	}

	public void setApplyType(String applyType) {
		this.applyType = applyType;
		if(applyType != null){
			putQueryParameter("ApplyType", applyType);
		}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putQueryParameter("Scene", scene);
		}
	}

	@Override
	public Class<CreateConfigurationResponse> getResponseClass() {
		return CreateConfigurationResponse.class;
	}

}
