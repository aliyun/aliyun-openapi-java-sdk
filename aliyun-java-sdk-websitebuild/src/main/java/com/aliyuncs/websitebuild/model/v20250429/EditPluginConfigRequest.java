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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class EditPluginConfigRequest extends RpcAcsRequest<EditPluginConfigResponse> {
	   

	private String pluginConfig;

	private String pluginName;

	private String pluginId;

	private String pluginDesc;

	private String bizId;
	public EditPluginConfigRequest() {
		super("WebsiteBuild", "2025-04-29", "EditPluginConfig");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getPluginConfig() {
		return this.pluginConfig;
	}

	public void setPluginConfig(String pluginConfig) {
		this.pluginConfig = pluginConfig;
		if(pluginConfig != null){
			putQueryParameter("PluginConfig", pluginConfig);
		}
	}

	public String getPluginName() {
		return this.pluginName;
	}

	public void setPluginName(String pluginName) {
		this.pluginName = pluginName;
		if(pluginName != null){
			putQueryParameter("PluginName", pluginName);
		}
	}

	public String getPluginId() {
		return this.pluginId;
	}

	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
		if(pluginId != null){
			putQueryParameter("PluginId", pluginId);
		}
	}

	public String getPluginDesc() {
		return this.pluginDesc;
	}

	public void setPluginDesc(String pluginDesc) {
		this.pluginDesc = pluginDesc;
		if(pluginDesc != null){
			putQueryParameter("PluginDesc", pluginDesc);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	@Override
	public Class<EditPluginConfigResponse> getResponseClass() {
		return EditPluginConfigResponse.class;
	}

}
