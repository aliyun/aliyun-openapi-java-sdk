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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTaskRequest extends RpcAcsRequest<CreateTaskResponse> {
	   

	private String timeVariables;

	private String nodeType;

	private Long dagId;

	private Long tid;

	private String nodeName;

	private String nodeContent;

	private String nodeOutput;

	private String graphParam;
	public CreateTaskRequest() {
		super("dms-enterprise", "2018-11-01", "CreateTask", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTimeVariables() {
		return this.timeVariables;
	}

	public void setTimeVariables(String timeVariables) {
		this.timeVariables = timeVariables;
		if(timeVariables != null){
			putQueryParameter("TimeVariables", timeVariables);
		}
	}

	public String getNodeType() {
		return this.nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
		if(nodeType != null){
			putQueryParameter("NodeType", nodeType);
		}
	}

	public Long getDagId() {
		return this.dagId;
	}

	public void setDagId(Long dagId) {
		this.dagId = dagId;
		if(dagId != null){
			putQueryParameter("DagId", dagId.toString());
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public String getNodeName() {
		return this.nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
		if(nodeName != null){
			putQueryParameter("NodeName", nodeName);
		}
	}

	public String getNodeContent() {
		return this.nodeContent;
	}

	public void setNodeContent(String nodeContent) {
		this.nodeContent = nodeContent;
		if(nodeContent != null){
			putQueryParameter("NodeContent", nodeContent);
		}
	}

	public String getNodeOutput() {
		return this.nodeOutput;
	}

	public void setNodeOutput(String nodeOutput) {
		this.nodeOutput = nodeOutput;
		if(nodeOutput != null){
			putQueryParameter("NodeOutput", nodeOutput);
		}
	}

	public String getGraphParam() {
		return this.graphParam;
	}

	public void setGraphParam(String graphParam) {
		this.graphParam = graphParam;
		if(graphParam != null){
			putQueryParameter("GraphParam", graphParam);
		}
	}

	@Override
	public Class<CreateTaskResponse> getResponseClass() {
		return CreateTaskResponse.class;
	}

}
