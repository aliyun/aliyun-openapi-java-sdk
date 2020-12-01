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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RollbackApplicationRequest extends RoaAcsRequest<RollbackApplicationResponse> {
	   

	private Integer minReadyInstances;

	private String versionId;

	private String appId;

	private Integer batchWaitTime;

	private String updateStrategy;
	public RollbackApplicationRequest() {
		super("sae", "2019-05-06", "RollbackApplication");
		setUriPattern("/pop/v1/sam/app/rollbackApplication");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getMinReadyInstances() {
		return this.minReadyInstances;
	}

	public void setMinReadyInstances(Integer minReadyInstances) {
		this.minReadyInstances = minReadyInstances;
		if(minReadyInstances != null){
			putQueryParameter("MinReadyInstances", minReadyInstances.toString());
		}
	}

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
		if(versionId != null){
			putQueryParameter("VersionId", versionId);
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

	public Integer getBatchWaitTime() {
		return this.batchWaitTime;
	}

	public void setBatchWaitTime(Integer batchWaitTime) {
		this.batchWaitTime = batchWaitTime;
		if(batchWaitTime != null){
			putQueryParameter("BatchWaitTime", batchWaitTime.toString());
		}
	}

	public String getUpdateStrategy() {
		return this.updateStrategy;
	}

	public void setUpdateStrategy(String updateStrategy) {
		this.updateStrategy = updateStrategy;
		if(updateStrategy != null){
			putQueryParameter("UpdateStrategy", updateStrategy);
		}
	}

	@Override
	public Class<RollbackApplicationResponse> getResponseClass() {
		return RollbackApplicationResponse.class;
	}

}
