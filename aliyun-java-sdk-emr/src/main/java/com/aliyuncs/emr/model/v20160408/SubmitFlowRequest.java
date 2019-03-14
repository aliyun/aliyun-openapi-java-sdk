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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SubmitFlowRequest extends RpcAcsRequest<SubmitFlowResponse> {
	
	public SubmitFlowRequest() {
		super("Emr", "2016-04-08", "SubmitFlow", "emr");
	}

	private String conf;

	private String projectId;

	private String flowId;

	public String getConf() {
		return this.conf;
	}

	public void setConf(String conf) {
		this.conf = conf;
		if(conf != null){
			putQueryParameter("Conf", conf);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
		if(flowId != null){
			putQueryParameter("FlowId", flowId);
		}
	}

	@Override
	public Class<SubmitFlowResponse> getResponseClass() {
		return SubmitFlowResponse.class;
	}

}
