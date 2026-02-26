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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeployInstanceSDGRequest extends RpcAcsRequest<DeployInstanceSDGResponse> {
	   

	private String deploymentType;

	private String sDGId;

	@SerializedName("instanceIds")
	private List<String> instanceIds;
	public DeployInstanceSDGRequest() {
		super("Ens", "2017-11-10", "DeployInstanceSDG", "ens");
		setMethod(MethodType.POST);
	}

	public String getDeploymentType() {
		return this.deploymentType;
	}

	public void setDeploymentType(String deploymentType) {
		this.deploymentType = deploymentType;
		if(deploymentType != null){
			putQueryParameter("DeploymentType", deploymentType);
		}
	}

	public String getSDGId() {
		return this.sDGId;
	}

	public void setSDGId(String sDGId) {
		this.sDGId = sDGId;
		if(sDGId != null){
			putQueryParameter("SDGId", sDGId);
		}
	}

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			putQueryParameter("InstanceIds" , new Gson().toJson(instanceIds));
		}	
	}

	@Override
	public Class<DeployInstanceSDGResponse> getResponseClass() {
		return DeployInstanceSDGResponse.class;
	}

}
