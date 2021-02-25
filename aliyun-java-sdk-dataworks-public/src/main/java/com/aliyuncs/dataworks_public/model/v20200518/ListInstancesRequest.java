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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListInstancesRequest extends RpcAcsRequest<ListInstancesResponse> {
	   

	private String projectEnv;

	private String owner;

	private String bizName;

	private String beginBizdate;

	private String endBizdate;

	private Long dagId;

	private Integer pageNumber;

	private String nodeName;

	private String programType;

	private String bizdate;

	private Integer pageSize;

	private Long nodeId;

	private Long projectId;
	public ListInstancesRequest() {
		super("dataworks-public", "2020-05-18", "ListInstances");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProjectEnv() {
		return this.projectEnv;
	}

	public void setProjectEnv(String projectEnv) {
		this.projectEnv = projectEnv;
		if(projectEnv != null){
			putBodyParameter("ProjectEnv", projectEnv);
		}
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
		if(owner != null){
			putBodyParameter("Owner", owner);
		}
	}

	public String getBizName() {
		return this.bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
		if(bizName != null){
			putBodyParameter("BizName", bizName);
		}
	}

	public String getBeginBizdate() {
		return this.beginBizdate;
	}

	public void setBeginBizdate(String beginBizdate) {
		this.beginBizdate = beginBizdate;
		if(beginBizdate != null){
			putBodyParameter("BeginBizdate", beginBizdate);
		}
	}

	public String getEndBizdate() {
		return this.endBizdate;
	}

	public void setEndBizdate(String endBizdate) {
		this.endBizdate = endBizdate;
		if(endBizdate != null){
			putBodyParameter("EndBizdate", endBizdate);
		}
	}

	public Long getDagId() {
		return this.dagId;
	}

	public void setDagId(Long dagId) {
		this.dagId = dagId;
		if(dagId != null){
			putBodyParameter("DagId", dagId.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
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

	public String getProgramType() {
		return this.programType;
	}

	public void setProgramType(String programType) {
		this.programType = programType;
		if(programType != null){
			putBodyParameter("ProgramType", programType);
		}
	}

	public String getBizdate() {
		return this.bizdate;
	}

	public void setBizdate(String bizdate) {
		this.bizdate = bizdate;
		if(bizdate != null){
			putBodyParameter("Bizdate", bizdate);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Long getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putBodyParameter("NodeId", nodeId.toString());
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId.toString());
		}
	}

	@Override
	public Class<ListInstancesResponse> getResponseClass() {
		return ListInstancesResponse.class;
	}

}
