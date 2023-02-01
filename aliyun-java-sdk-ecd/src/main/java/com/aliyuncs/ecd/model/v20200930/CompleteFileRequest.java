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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CompleteFileRequest extends RpcAcsRequest<CompleteFileResponse> {
	   

	private String uploadId;

	private String rootId;

	private String controlPolicy;

	private String userId;

	private String parentFolderId;

	private String driveId;

	private String fileName;

	private String operateType;

	private String fileId;

	private String md5;
	public CompleteFileRequest() {
		super("ecd", "2020-09-30", "CompleteFile");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUploadId() {
		return this.uploadId;
	}

	public void setUploadId(String uploadId) {
		this.uploadId = uploadId;
		if(uploadId != null){
			putQueryParameter("UploadId", uploadId);
		}
	}

	public String getRootId() {
		return this.rootId;
	}

	public void setRootId(String rootId) {
		this.rootId = rootId;
		if(rootId != null){
			putQueryParameter("RootId", rootId);
		}
	}

	public String getControlPolicy() {
		return this.controlPolicy;
	}

	public void setControlPolicy(String controlPolicy) {
		this.controlPolicy = controlPolicy;
		if(controlPolicy != null){
			putQueryParameter("ControlPolicy", controlPolicy);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getParentFolderId() {
		return this.parentFolderId;
	}

	public void setParentFolderId(String parentFolderId) {
		this.parentFolderId = parentFolderId;
		if(parentFolderId != null){
			putQueryParameter("ParentFolderId", parentFolderId);
		}
	}

	public String getDriveId() {
		return this.driveId;
	}

	public void setDriveId(String driveId) {
		this.driveId = driveId;
		if(driveId != null){
			putQueryParameter("DriveId", driveId);
		}
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putQueryParameter("FileName", fileName);
		}
	}

	public String getOperateType() {
		return this.operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
		if(operateType != null){
			putQueryParameter("OperateType", operateType);
		}
	}

	public String getFileId() {
		return this.fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
		if(fileId != null){
			putQueryParameter("FileId", fileId);
		}
	}

	public String getMd5() {
		return this.md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
		if(md5 != null){
			putQueryParameter("Md5", md5);
		}
	}

	@Override
	public Class<CompleteFileResponse> getResponseClass() {
		return CompleteFileResponse.class;
	}

}
