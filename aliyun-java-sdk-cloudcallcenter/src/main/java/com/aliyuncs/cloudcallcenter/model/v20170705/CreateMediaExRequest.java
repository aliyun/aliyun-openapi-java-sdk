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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateMediaExRequest extends RpcAcsRequest<CreateMediaExResponse> {
	
	public CreateMediaExRequest() {
		super("CloudCallCenter", "2017-07-05", "CreateMediaEx", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private String fileName;

	private String name;

	private String description;

	private String ossFilePath;

	private String uploadResult;

	private String type;

	private String content;

	private String ossFileName;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getOssFilePath() {
		return this.ossFilePath;
	}

	public void setOssFilePath(String ossFilePath) {
		this.ossFilePath = ossFilePath;
		if(ossFilePath != null){
			putQueryParameter("OssFilePath", ossFilePath);
		}
	}

	public String getUploadResult() {
		return this.uploadResult;
	}

	public void setUploadResult(String uploadResult) {
		this.uploadResult = uploadResult;
		if(uploadResult != null){
			putQueryParameter("UploadResult", uploadResult);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	public String getOssFileName() {
		return this.ossFileName;
	}

	public void setOssFileName(String ossFileName) {
		this.ossFileName = ossFileName;
		if(ossFileName != null){
			putQueryParameter("OssFileName", ossFileName);
		}
	}

	@Override
	public Class<CreateMediaExResponse> getResponseClass() {
		return CreateMediaExResponse.class;
	}

}
