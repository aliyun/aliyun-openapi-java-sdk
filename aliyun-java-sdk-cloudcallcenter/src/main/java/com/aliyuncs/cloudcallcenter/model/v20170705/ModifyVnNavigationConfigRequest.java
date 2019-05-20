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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyVnNavigationConfigRequest extends RpcAcsRequest<ModifyVnNavigationConfigResponse> {
	
	public ModifyVnNavigationConfigRequest() {
		super("CloudCallCenter", "2017-07-05", "ModifyVnNavigationConfig", "CloudCallCenter", "innerAPI");
	}

	private String complainingConfig;

	private String instanceId;

	private String unrecognizingConfig;

	private String silenceTimeoutConfig;

	private String greetingConfig;

	private String askingBackConfig;

	private String repeatingConfig;

	public String getComplainingConfig() {
		return this.complainingConfig;
	}

	public void setComplainingConfig(String complainingConfig) {
		this.complainingConfig = complainingConfig;
		if(complainingConfig != null){
			putQueryParameter("ComplainingConfig", complainingConfig);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getUnrecognizingConfig() {
		return this.unrecognizingConfig;
	}

	public void setUnrecognizingConfig(String unrecognizingConfig) {
		this.unrecognizingConfig = unrecognizingConfig;
		if(unrecognizingConfig != null){
			putQueryParameter("UnrecognizingConfig", unrecognizingConfig);
		}
	}

	public String getSilenceTimeoutConfig() {
		return this.silenceTimeoutConfig;
	}

	public void setSilenceTimeoutConfig(String silenceTimeoutConfig) {
		this.silenceTimeoutConfig = silenceTimeoutConfig;
		if(silenceTimeoutConfig != null){
			putQueryParameter("SilenceTimeoutConfig", silenceTimeoutConfig);
		}
	}

	public String getGreetingConfig() {
		return this.greetingConfig;
	}

	public void setGreetingConfig(String greetingConfig) {
		this.greetingConfig = greetingConfig;
		if(greetingConfig != null){
			putQueryParameter("GreetingConfig", greetingConfig);
		}
	}

	public String getAskingBackConfig() {
		return this.askingBackConfig;
	}

	public void setAskingBackConfig(String askingBackConfig) {
		this.askingBackConfig = askingBackConfig;
		if(askingBackConfig != null){
			putQueryParameter("AskingBackConfig", askingBackConfig);
		}
	}

	public String getRepeatingConfig() {
		return this.repeatingConfig;
	}

	public void setRepeatingConfig(String repeatingConfig) {
		this.repeatingConfig = repeatingConfig;
		if(repeatingConfig != null){
			putQueryParameter("RepeatingConfig", repeatingConfig);
		}
	}

	@Override
	public Class<ModifyVnNavigationConfigResponse> getResponseClass() {
		return ModifyVnNavigationConfigResponse.class;
	}

}
