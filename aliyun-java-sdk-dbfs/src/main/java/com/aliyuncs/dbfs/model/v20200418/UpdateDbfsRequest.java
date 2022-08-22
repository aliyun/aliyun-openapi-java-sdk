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

package com.aliyuncs.dbfs.model.v20200418;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dbfs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateDbfsRequest extends RpcAcsRequest<UpdateDbfsResponse> {
	   

	private String usedScene;

	private String fsId;

	private String instanceType;

	private String advancedFeatures;
	public UpdateDbfsRequest() {
		super("DBFS", "2020-04-18", "UpdateDbfs", "dbfs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUsedScene() {
		return this.usedScene;
	}

	public void setUsedScene(String usedScene) {
		this.usedScene = usedScene;
		if(usedScene != null){
			putQueryParameter("UsedScene", usedScene);
		}
	}

	public String getFsId() {
		return this.fsId;
	}

	public void setFsId(String fsId) {
		this.fsId = fsId;
		if(fsId != null){
			putQueryParameter("FsId", fsId);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getAdvancedFeatures() {
		return this.advancedFeatures;
	}

	public void setAdvancedFeatures(String advancedFeatures) {
		this.advancedFeatures = advancedFeatures;
		if(advancedFeatures != null){
			putQueryParameter("AdvancedFeatures", advancedFeatures);
		}
	}

	@Override
	public Class<UpdateDbfsResponse> getResponseClass() {
		return UpdateDbfsResponse.class;
	}

}
