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
public class UpdateProjectSettingRequest extends RpcAcsRequest<UpdateProjectSettingResponse> {
	
	public UpdateProjectSettingRequest() {
		super("Emr", "2016-04-08", "UpdateProjectSetting", "emr");
	}

	private Long resourceOwnerId;

	private String defaultOssPath;

	private String projectId;

	private String ossConfig;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getDefaultOssPath() {
		return this.defaultOssPath;
	}

	public void setDefaultOssPath(String defaultOssPath) {
		this.defaultOssPath = defaultOssPath;
		if(defaultOssPath != null){
			putQueryParameter("DefaultOssPath", defaultOssPath);
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

	public String getOssConfig() {
		return this.ossConfig;
	}

	public void setOssConfig(String ossConfig) {
		this.ossConfig = ossConfig;
		if(ossConfig != null){
			putQueryParameter("OssConfig", ossConfig);
		}
	}

	@Override
	public Class<UpdateProjectSettingResponse> getResponseClass() {
		return UpdateProjectSettingResponse.class;
	}

}
