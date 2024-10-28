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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDataFlowSubTaskRequest extends RpcAcsRequest<CreateDataFlowSubTaskResponse> {
	   

	private String clientToken;

	private String dataFlowTaskId;

	private String srcFilePath;

	private String fileSystemId;

	private Boolean dryRun;

	private String dataFlowId;

	private String dstFilePath;

	private Condition condition;
	public CreateDataFlowSubTaskRequest() {
		super("NAS", "2017-06-26", "CreateDataFlowSubTask", "nas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDataFlowTaskId() {
		return this.dataFlowTaskId;
	}

	public void setDataFlowTaskId(String dataFlowTaskId) {
		this.dataFlowTaskId = dataFlowTaskId;
		if(dataFlowTaskId != null){
			putQueryParameter("DataFlowTaskId", dataFlowTaskId);
		}
	}

	public String getSrcFilePath() {
		return this.srcFilePath;
	}

	public void setSrcFilePath(String srcFilePath) {
		this.srcFilePath = srcFilePath;
		if(srcFilePath != null){
			putQueryParameter("SrcFilePath", srcFilePath);
		}
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getDataFlowId() {
		return this.dataFlowId;
	}

	public void setDataFlowId(String dataFlowId) {
		this.dataFlowId = dataFlowId;
		if(dataFlowId != null){
			putQueryParameter("DataFlowId", dataFlowId);
		}
	}

	public String getDstFilePath() {
		return this.dstFilePath;
	}

	public void setDstFilePath(String dstFilePath) {
		this.dstFilePath = dstFilePath;
		if(dstFilePath != null){
			putQueryParameter("DstFilePath", dstFilePath);
		}
	}

	public Condition getCondition() {
		return this.condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;	
		if (condition != null) {
			
				putQueryParameter("Condition.Size" , condition.getSize());
				putQueryParameter("Condition.ModifyTime" , condition.getModifyTime());
		}	
	}

	public static class Condition {

		private Long size;

		private Long modifyTime;

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public Long getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(Long modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public Class<CreateDataFlowSubTaskResponse> getResponseClass() {
		return CreateDataFlowSubTaskResponse.class;
	}

}
