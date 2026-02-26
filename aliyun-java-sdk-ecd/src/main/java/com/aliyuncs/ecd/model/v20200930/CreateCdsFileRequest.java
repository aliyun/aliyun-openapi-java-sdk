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
public class CreateCdsFileRequest extends RpcAcsRequest<CreateCdsFileResponse> {
	   

	private String fileType;

	private Long fileLength;

	private String endUserId;

	private String groupId;

	private String cdsId;

	private String conflictPolicy;

	private String parentFileId;

	private String fileName;

	private String fileHash;
	public CreateCdsFileRequest() {
		super("ecd", "2020-09-30", "CreateCdsFile", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
		if(fileType != null){
			putQueryParameter("FileType", fileType);
		}
	}

	public Long getFileLength() {
		return this.fileLength;
	}

	public void setFileLength(Long fileLength) {
		this.fileLength = fileLength;
		if(fileLength != null){
			putQueryParameter("FileLength", fileLength.toString());
		}
	}

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
		if(endUserId != null){
			putQueryParameter("EndUserId", endUserId);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getCdsId() {
		return this.cdsId;
	}

	public void setCdsId(String cdsId) {
		this.cdsId = cdsId;
		if(cdsId != null){
			putQueryParameter("CdsId", cdsId);
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

	public String getParentFileId() {
		return this.parentFileId;
	}

	public void setParentFileId(String parentFileId) {
		this.parentFileId = parentFileId;
		if(parentFileId != null){
			putQueryParameter("ParentFileId", parentFileId);
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

	public String getFileHash() {
		return this.fileHash;
	}

	public void setFileHash(String fileHash) {
		this.fileHash = fileHash;
		if(fileHash != null){
			putQueryParameter("FileHash", fileHash);
		}
	}

	@Override
	public Class<CreateCdsFileResponse> getResponseClass() {
		return CreateCdsFileResponse.class;
	}

}
