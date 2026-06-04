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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class MoveMaterialFileRequest extends RpcAcsRequest<MoveMaterialFileResponse> {
	   

	@SerializedName("fileIds")
	private List<String> fileIds;

	private String bizId;

	private String directoryId;
	public MoveMaterialFileRequest() {
		super("WebsiteBuild", "2025-04-29", "MoveMaterialFile");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getFileIds() {
		return this.fileIds;
	}

	public void setFileIds(List<String> fileIds) {
		this.fileIds = fileIds;	
		if (fileIds != null) {
			putQueryParameter("FileIds" , new Gson().toJson(fileIds));
		}	
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getDirectoryId() {
		return this.directoryId;
	}

	public void setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
		if(directoryId != null){
			putQueryParameter("DirectoryId", directoryId);
		}
	}

	@Override
	public Class<MoveMaterialFileResponse> getResponseClass() {
		return MoveMaterialFileResponse.class;
	}

}
