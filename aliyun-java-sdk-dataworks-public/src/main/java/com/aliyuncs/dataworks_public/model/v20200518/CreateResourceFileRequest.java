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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateResourceFileRequest extends RpcAcsRequest<CreateResourceFileResponse> {
	   

	private Integer fileType;

	private String content;

	private String resourceFile;

	private String originResourceName;

	private Long projectId;

	private String storageURL;

	private String owner;

	private Boolean registerToCalcEngine;

	private Boolean uploadMode;

	private String fileName;

	private String fileFolderPath;

	private String fileDescription;
	public CreateResourceFileRequest() {
		super("dataworks-public", "2020-05-18", "CreateResourceFile");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getFileType() {
		return this.fileType;
	}

	public void setFileType(Integer fileType) {
		this.fileType = fileType;
		if(fileType != null){
			putBodyParameter("FileType", fileType.toString());
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public String getResourceFile() {
		return this.resourceFile;
	}

	public void setResourceFile(String resourceFile) {
		this.resourceFile = resourceFile;
		if(resourceFile != null){
			putBodyParameter("ResourceFile", resourceFile);
		}
	}

	public String getOriginResourceName() {
		return this.originResourceName;
	}

	public void setOriginResourceName(String originResourceName) {
		this.originResourceName = originResourceName;
		if(originResourceName != null){
			putBodyParameter("OriginResourceName", originResourceName);
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

	public String getStorageURL() {
		return this.storageURL;
	}

	public void setStorageURL(String storageURL) {
		this.storageURL = storageURL;
		if(storageURL != null){
			putBodyParameter("StorageURL", storageURL);
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

	public Boolean getRegisterToCalcEngine() {
		return this.registerToCalcEngine;
	}

	public void setRegisterToCalcEngine(Boolean registerToCalcEngine) {
		this.registerToCalcEngine = registerToCalcEngine;
		if(registerToCalcEngine != null){
			putBodyParameter("RegisterToCalcEngine", registerToCalcEngine.toString());
		}
	}

	public Boolean getUploadMode() {
		return this.uploadMode;
	}

	public void setUploadMode(Boolean uploadMode) {
		this.uploadMode = uploadMode;
		if(uploadMode != null){
			putBodyParameter("UploadMode", uploadMode.toString());
		}
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putBodyParameter("FileName", fileName);
		}
	}

	public String getFileFolderPath() {
		return this.fileFolderPath;
	}

	public void setFileFolderPath(String fileFolderPath) {
		this.fileFolderPath = fileFolderPath;
		if(fileFolderPath != null){
			putBodyParameter("FileFolderPath", fileFolderPath);
		}
	}

	public String getFileDescription() {
		return this.fileDescription;
	}

	public void setFileDescription(String fileDescription) {
		this.fileDescription = fileDescription;
		if(fileDescription != null){
			putBodyParameter("FileDescription", fileDescription);
		}
	}

	@Override
	public Class<CreateResourceFileResponse> getResponseClass() {
		return CreateResourceFileResponse.class;
	}

}
