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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateManualDagRequest extends RpcAcsRequest<CreateManualDagResponse> {
	
	public CreateManualDagRequest() {
		super("dataworks-public", "2018-06-01", "CreateManualDag", "dataworks-public");
		setMethod(MethodType.POST);
	}

	private String projectName;

	private String bizdate;

	private String flowName;

	private String dagPara;

	private String nodePara;

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
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

	public String getDagPara() {
		return this.dagPara;
	}

	public void setDagPara(String dagPara) {
		this.dagPara = dagPara;
		if(dagPara != null){
			putQueryParameter("DagPara", dagPara);
		}
	}

	public String getNodePara() {
		return this.nodePara;
	}

	public void setNodePara(String nodePara) {
		this.nodePara = nodePara;
		if(nodePara != null){
			putQueryParameter("NodePara", nodePara);
		}
	}

	@Override
	public Class<CreateManualDagResponse> getResponseClass() {
		return CreateManualDagResponse.class;
	}

}
