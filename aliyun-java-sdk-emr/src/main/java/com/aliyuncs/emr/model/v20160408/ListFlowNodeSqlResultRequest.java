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
public class ListFlowNodeSqlResultRequest extends RpcAcsRequest<ListFlowNodeSqlResultResponse> {
	
	public ListFlowNodeSqlResultRequest() {
		super("Emr", "2016-04-08", "ListFlowNodeSqlResult", "emr");
	}

	private Integer offset;

	private Integer length;

	private Integer sqlIndex;

	private String nodeInstanceId;

	private String projectId;

	public Integer getOffset() {
		return this.offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
		if(offset != null){
			putQueryParameter("Offset", offset.toString());
		}
	}

	public Integer getLength() {
		return this.length;
	}

	public void setLength(Integer length) {
		this.length = length;
		if(length != null){
			putQueryParameter("Length", length.toString());
		}
	}

	public Integer getSqlIndex() {
		return this.sqlIndex;
	}

	public void setSqlIndex(Integer sqlIndex) {
		this.sqlIndex = sqlIndex;
		if(sqlIndex != null){
			putQueryParameter("SqlIndex", sqlIndex.toString());
		}
	}

	public String getNodeInstanceId() {
		return this.nodeInstanceId;
	}

	public void setNodeInstanceId(String nodeInstanceId) {
		this.nodeInstanceId = nodeInstanceId;
		if(nodeInstanceId != null){
			putQueryParameter("NodeInstanceId", nodeInstanceId);
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

	@Override
	public Class<ListFlowNodeSqlResultResponse> getResponseClass() {
		return ListFlowNodeSqlResultResponse.class;
	}

}
