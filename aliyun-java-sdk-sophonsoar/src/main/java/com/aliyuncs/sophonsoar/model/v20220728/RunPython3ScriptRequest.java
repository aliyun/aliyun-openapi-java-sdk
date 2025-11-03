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
public class RunPython3ScriptRequest extends RpcAcsRequest<RunPython3ScriptResponse> {
	   

	private String params;

	private String nodeName;

	private String playbookUuid;

	private String pythonScript;
	public RunPython3ScriptRequest() {
		super("sophonsoar", "2022-07-28", "RunPython3Script");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
		if(params != null){
			putBodyParameter("Params", params);
		}
	}

	public String getNodeName() {
		return this.nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
		if(nodeName != null){
			putBodyParameter("NodeName", nodeName);
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

	public String getPythonScript() {
		return this.pythonScript;
	}

	public void setPythonScript(String pythonScript) {
		this.pythonScript = pythonScript;
		if(pythonScript != null){
			putBodyParameter("PythonScript", pythonScript);
		}
	}

	@Override
	public Class<RunPython3ScriptResponse> getResponseClass() {
		return RunPython3ScriptResponse.class;
	}

}
