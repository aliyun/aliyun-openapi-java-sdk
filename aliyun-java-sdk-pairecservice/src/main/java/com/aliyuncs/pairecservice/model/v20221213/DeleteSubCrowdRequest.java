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

package com.aliyuncs.pairecservice.model.v20221213;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteSubCrowdRequest extends RoaAcsRequest<DeleteSubCrowdResponse> {
	   

	private String crowdId;

	private String instanceId;

	private String subCrowdId;
	public DeleteSubCrowdRequest() {
		super("PaiRecService", "2022-12-13", "DeleteSubCrowd");
		setUriPattern("/api/v1/crowds/[CrowdId]/subcrowds/[SubCrowdId]");
		setMethod(MethodType.DELETE);
	}

	public String getCrowdId() {
		return this.crowdId;
	}

	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
		if(crowdId != null){
			putPathParameter("CrowdId", crowdId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getSubCrowdId() {
		return this.subCrowdId;
	}

	public void setSubCrowdId(String subCrowdId) {
		this.subCrowdId = subCrowdId;
		if(subCrowdId != null){
			putPathParameter("SubCrowdId", subCrowdId);
		}
	}

	@Override
	public Class<DeleteSubCrowdResponse> getResponseClass() {
		return DeleteSubCrowdResponse.class;
	}

}
