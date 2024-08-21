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

package com.aliyuncs.ecs_workbench.model.v20220220;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ViewInstanceRecordsRequest extends RpcAcsRequest<ViewInstanceRecordsResponse> {
	   

	private String instanceId;

	private String terminalSessionToken;
	public ViewInstanceRecordsRequest() {
		super("ecs-workbench", "2022-02-20", "ViewInstanceRecords", "ecs-workbench");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getTerminalSessionToken() {
		return this.terminalSessionToken;
	}

	public void setTerminalSessionToken(String terminalSessionToken) {
		this.terminalSessionToken = terminalSessionToken;
		if(terminalSessionToken != null){
			putBodyParameter("TerminalSessionToken", terminalSessionToken);
		}
	}

	@Override
	public Class<ViewInstanceRecordsResponse> getResponseClass() {
		return ViewInstanceRecordsResponse.class;
	}

}
