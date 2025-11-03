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

package com.aliyuncs.sophonsoar.model.v20220728;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyPlaybookInputOutputRequest extends RpcAcsRequest<ModifyPlaybookInputOutputResponse> {
	   

	private String paramType;

	private String inputParams;

	private String outputParams;

	private String playbookUuid;

	private String exeConfig;

	private String lang;
	public ModifyPlaybookInputOutputRequest() {
		super("sophonsoar", "2022-07-28", "ModifyPlaybookInputOutput");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getParamType() {
		return this.paramType;
	}

	public void setParamType(String paramType) {
		this.paramType = paramType;
		if(paramType != null){
			putBodyParameter("ParamType", paramType);
		}
	}

	public String getInputParams() {
		return this.inputParams;
	}

	public void setInputParams(String inputParams) {
		this.inputParams = inputParams;
		if(inputParams != null){
			putBodyParameter("InputParams", inputParams);
		}
	}

	public String getOutputParams() {
		return this.outputParams;
	}

	public void setOutputParams(String outputParams) {
		this.outputParams = outputParams;
		if(outputParams != null){
			putBodyParameter("OutputParams", outputParams);
		}
	}

	public String getPlaybookUuid() {
		return this.playbookUuid;
	}

	public void setPlaybookUuid(String playbookUuid) {
		this.playbookUuid = playbookUuid;
		if(playbookUuid != null){
			putBodyParameter("PlaybookUuid", playbookUuid);
		}
	}

	public String getExeConfig() {
		return this.exeConfig;
	}

	public void setExeConfig(String exeConfig) {
		this.exeConfig = exeConfig;
		if(exeConfig != null){
			putBodyParameter("ExeConfig", exeConfig);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putBodyParameter("Lang", lang);
		}
	}

	@Override
	public Class<ModifyPlaybookInputOutputResponse> getResponseClass() {
		return ModifyPlaybookInputOutputResponse.class;
	}

}
