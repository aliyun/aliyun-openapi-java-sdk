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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeployApplicationRequest extends RoaAcsRequest<DeployApplicationResponse> {
	
	public DeployApplicationRequest() {
		super("Edas", "2017-08-01", "DeployApplication");
		setUriPattern("/pop/v5/changeorder/co_deploy");
		setMethod(MethodType.POST);
	}

	private Long buildPackId;

	private String componentIds;

	private String appId;

	private String imageUrl;

	private String groupId;

	private Integer batchWaitTime;

	private Integer batch;

	private String appEnv;

	private String warUrl;

	private String packageVersion;

	private String desc;

	private String deployType;

	public Long getBuildPackId() {
		return this.buildPackId;
	}

	public void setBuildPackId(Long buildPackId) {
		this.buildPackId = buildPackId;
		if(buildPackId != null){
			putQueryParameter("BuildPackId", buildPackId.toString());
		}
	}

	public String getComponentIds() {
		return this.componentIds;
	}

	public void setComponentIds(String componentIds) {
		this.componentIds = componentIds;
		if(componentIds != null){
			putQueryParameter("ComponentIds", componentIds);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putQueryParameter("ImageUrl", imageUrl);
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

	public Integer getBatchWaitTime() {
		return this.batchWaitTime;
	}

	public void setBatchWaitTime(Integer batchWaitTime) {
		this.batchWaitTime = batchWaitTime;
		if(batchWaitTime != null){
			putQueryParameter("BatchWaitTime", batchWaitTime.toString());
		}
	}

	public Integer getBatch() {
		return this.batch;
	}

	public void setBatch(Integer batch) {
		this.batch = batch;
		if(batch != null){
			putQueryParameter("Batch", batch.toString());
		}
	}

	public String getAppEnv() {
		return this.appEnv;
	}

	public void setAppEnv(String appEnv) {
		this.appEnv = appEnv;
		if(appEnv != null){
			putQueryParameter("AppEnv", appEnv);
		}
	}

	public String getWarUrl() {
		return this.warUrl;
	}

	public void setWarUrl(String warUrl) {
		this.warUrl = warUrl;
		if(warUrl != null){
			putQueryParameter("WarUrl", warUrl);
		}
	}

	public String getPackageVersion() {
		return this.packageVersion;
	}

	public void setPackageVersion(String packageVersion) {
		this.packageVersion = packageVersion;
		if(packageVersion != null){
			putQueryParameter("PackageVersion", packageVersion);
		}
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
		if(desc != null){
			putQueryParameter("Desc", desc);
		}
	}

	public String getDeployType() {
		return this.deployType;
	}

	public void setDeployType(String deployType) {
		this.deployType = deployType;
		if(deployType != null){
			putQueryParameter("DeployType", deployType);
		}
	}

	@Override
	public Class<DeployApplicationResponse> getResponseClass() {
		return DeployApplicationResponse.class;
	}

}
