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

package com.aliyuncs.afs.model.v20180112;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ConfigurationStyleRequest extends RpcAcsRequest<ConfigurationStyleResponse> {
	
	public ConfigurationStyleRequest() {
		super("afs", "2018-01-12", "ConfigurationStyle", "afs");
	}

	private String sourceIp;

	private String configurationMethod;

	private String refExtId;

	private String applyType;

	private String scene;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
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

	public String getRefExtId() {
		return this.refExtId;
	}

	public void setRefExtId(String refExtId) {
		this.refExtId = refExtId;
		if(refExtId != null){
			putQueryParameter("RefExtId", refExtId);
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
	public Class<ConfigurationStyleResponse> getResponseClass() {
		return ConfigurationStyleResponse.class;
	}

}
