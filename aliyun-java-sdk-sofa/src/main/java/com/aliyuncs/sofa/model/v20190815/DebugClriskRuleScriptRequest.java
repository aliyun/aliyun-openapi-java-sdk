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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DebugClriskRuleScriptRequest extends RpcAcsRequest<DebugClriskRuleScriptResponse> {
	   

	private String fieldValues;

	private String modelDefineId;

	private String script;
	public DebugClriskRuleScriptRequest() {
		super("SOFA", "2019-08-15", "DebugClriskRuleScript", "sofacaferms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFieldValues() {
		return this.fieldValues;
	}

	public void setFieldValues(String fieldValues) {
		this.fieldValues = fieldValues;
		if(fieldValues != null){
			putBodyParameter("FieldValues", fieldValues);
		}
	}

	public String getModelDefineId() {
		return this.modelDefineId;
	}

	public void setModelDefineId(String modelDefineId) {
		this.modelDefineId = modelDefineId;
		if(modelDefineId != null){
			putBodyParameter("ModelDefineId", modelDefineId);
		}
	}

	public String getScript() {
		return this.script;
	}

	public void setScript(String script) {
		this.script = script;
		if(script != null){
			putBodyParameter("Script", script);
		}
	}

	@Override
	public Class<DebugClriskRuleScriptResponse> getResponseClass() {
		return DebugClriskRuleScriptResponse.class;
	}

}
