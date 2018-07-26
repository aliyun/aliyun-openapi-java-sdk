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

package com.aliyuncs.dataworks_public.model.v20180601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateDagRequest extends RpcAcsRequest<CreateDagResponse> {
	
	public CreateDagRequest() {
		super("dataworks-public", "2018-06-01", "CreateDag");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	private String nodeName;

	private String projectName;

	private String instanceName;

	private String bizdate;

	private String flowName;

	public String getNodeName() {
		return this.nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
		if(nodeName != null){
			putQueryParameter("NodeName", nodeName);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public String getBizdate() {
		return this.bizdate;
	}

	public void setBizdate(String bizdate) {
		this.bizdate = bizdate;
		if(bizdate != null){
			putQueryParameter("Bizdate", bizdate);
		}
	}

	public String getFlowName() {
		return this.flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
		if(flowName != null){
			putQueryParameter("FlowName", flowName);
		}
	}

	@Override
	public Class<CreateDagResponse> getResponseClass() {
		return CreateDagResponse.class;
	}

}
