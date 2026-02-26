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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyCopilotEmbedConfigRequest extends RpcAcsRequest<ModifyCopilotEmbedConfigResponse> {
	   

	private String copilotId;

	private String dataRange;

	private String moduleName;

	private String agentName;
	public ModifyCopilotEmbedConfigRequest() {
		super("quickbi-public", "2022-01-01", "ModifyCopilotEmbedConfig", "2.2.0");
		setMethod(MethodType.POST);
	}

	public String getCopilotId() {
		return this.copilotId;
	}

	public void setCopilotId(String copilotId) {
		this.copilotId = copilotId;
		if(copilotId != null){
			putQueryParameter("CopilotId", copilotId);
		}
	}

	public String getDataRange() {
		return this.dataRange;
	}

	public void setDataRange(String dataRange) {
		this.dataRange = dataRange;
		if(dataRange != null){
			putQueryParameter("DataRange", dataRange);
		}
	}

	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
		if(moduleName != null){
			putQueryParameter("ModuleName", moduleName);
		}
	}

	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
		if(agentName != null){
			putQueryParameter("AgentName", agentName);
		}
	}

	@Override
	public Class<ModifyCopilotEmbedConfigResponse> getResponseClass() {
		return ModifyCopilotEmbedConfigResponse.class;
	}

}
