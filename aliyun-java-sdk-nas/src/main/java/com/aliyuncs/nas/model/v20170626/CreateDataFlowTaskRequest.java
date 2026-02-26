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
public class CreateDataFlowTaskRequest extends RpcAcsRequest<CreateDataFlowTaskResponse> {
	   

	private String dstDirectory;

	private String clientToken;

	private String directory;

	private String srcTaskId;

	private String dataType;

	private Boolean createDirIfNotExist;

	private String fileSystemId;

	private Boolean dryRun;

	private String dataFlowId;

	private String entryList;

	private String includes;

	private String conflictPolicy;

	private String taskAction;

	private String transferFileListPath;
	public CreateDataFlowTaskRequest() {
		super("NAS", "2017-06-26", "CreateDataFlowTask", "nas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDstDirectory() {
		return this.dstDirectory;
	}

	public void setDstDirectory(String dstDirectory) {
		this.dstDirectory = dstDirectory;
		if(dstDirectory != null){
			putQueryParameter("DstDirectory", dstDirectory);
		}
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

	public String getDirectory() {
		return this.directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
		if(directory != null){
			putQueryParameter("Directory", directory);
		}
	}

	public String getSrcTaskId() {
		return this.srcTaskId;
	}

	public void setSrcTaskId(String srcTaskId) {
		this.srcTaskId = srcTaskId;
		if(srcTaskId != null){
			putQueryParameter("SrcTaskId", srcTaskId);
		}
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
		if(dataType != null){
			putQueryParameter("DataType", dataType);
		}
	}

	public Boolean getCreateDirIfNotExist() {
		return this.createDirIfNotExist;
	}

	public void setCreateDirIfNotExist(Boolean createDirIfNotExist) {
		this.createDirIfNotExist = createDirIfNotExist;
		if(createDirIfNotExist != null){
			putQueryParameter("CreateDirIfNotExist", createDirIfNotExist.toString());
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

	public String getEntryList() {
		return this.entryList;
	}

	public void setEntryList(String entryList) {
		this.entryList = entryList;
		if(entryList != null){
			putQueryParameter("EntryList", entryList);
		}
	}

	public String getIncludes() {
		return this.includes;
	}

	public void setIncludes(String includes) {
		this.includes = includes;
		if(includes != null){
			putQueryParameter("Includes", includes);
		}
	}

	public String getConflictPolicy() {
		return this.conflictPolicy;
	}

	public void setConflictPolicy(String conflictPolicy) {
		this.conflictPolicy = conflictPolicy;
		if(conflictPolicy != null){
			putQueryParameter("ConflictPolicy", conflictPolicy);
		}
	}

	public String getTaskAction() {
		return this.taskAction;
	}

	public void setTaskAction(String taskAction) {
		this.taskAction = taskAction;
		if(taskAction != null){
			putQueryParameter("TaskAction", taskAction);
		}
	}

	public String getTransferFileListPath() {
		return this.transferFileListPath;
	}

	public void setTransferFileListPath(String transferFileListPath) {
		this.transferFileListPath = transferFileListPath;
		if(transferFileListPath != null){
			putQueryParameter("TransferFileListPath", transferFileListPath);
		}
	}

	@Override
	public Class<CreateDataFlowTaskResponse> getResponseClass() {
		return CreateDataFlowTaskResponse.class;
	}

}
