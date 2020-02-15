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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAntChainContractContentRequest extends RpcAcsRequest<CreateAntChainContractContentResponse> {
	   

	private String content;

	private String parentContentId;

	private String projectId;

	private String contentName;

	private Boolean isDirectory;
	public CreateAntChainContractContentRequest() {
		super("Baas", "2018-12-21", "CreateAntChainContractContent", "baas");
		setMethod(MethodType.PUT);
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

	public String getParentContentId() {
		return this.parentContentId;
	}

	public void setParentContentId(String parentContentId) {
		this.parentContentId = parentContentId;
		if(parentContentId != null){
			putBodyParameter("ParentContentId", parentContentId);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getContentName() {
		return this.contentName;
	}

	public void setContentName(String contentName) {
		this.contentName = contentName;
		if(contentName != null){
			putBodyParameter("ContentName", contentName);
		}
	}

	public Boolean getIsDirectory() {
		return this.isDirectory;
	}

	public void setIsDirectory(Boolean isDirectory) {
		this.isDirectory = isDirectory;
		if(isDirectory != null){
			putBodyParameter("IsDirectory", isDirectory.toString());
		}
	}

	@Override
	public Class<CreateAntChainContractContentResponse> getResponseClass() {
		return CreateAntChainContractContentResponse.class;
	}

}
