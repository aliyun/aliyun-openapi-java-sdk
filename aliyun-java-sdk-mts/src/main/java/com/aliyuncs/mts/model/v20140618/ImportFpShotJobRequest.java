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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ImportFpShotJobRequest extends RpcAcsRequest<ImportFpShotJobResponse> {
	   

	private Long resourceOwnerId;

	private String fpDBId;

	private String userData;

	private String resourceOwnerAccount;

	private String fpImportConfig;

	private String ownerAccount;

	private Long ownerId;

	private String pipelineId;

	private String input;
	public ImportFpShotJobRequest() {
		super("Mts", "2014-06-18", "ImportFpShotJob", "mts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getFpDBId() {
		return this.fpDBId;
	}

	public void setFpDBId(String fpDBId) {
		this.fpDBId = fpDBId;
		if(fpDBId != null){
			putQueryParameter("FpDBId", fpDBId);
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getFpImportConfig() {
		return this.fpImportConfig;
	}

	public void setFpImportConfig(String fpImportConfig) {
		this.fpImportConfig = fpImportConfig;
		if(fpImportConfig != null){
			putQueryParameter("FpImportConfig", fpImportConfig);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getPipelineId() {
		return this.pipelineId;
	}

	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
		if(pipelineId != null){
			putQueryParameter("PipelineId", pipelineId);
		}
	}

	public String getInput() {
		return this.input;
	}

	public void setInput(String input) {
		this.input = input;
		if(input != null){
			putQueryParameter("Input", input);
		}
	}

	@Override
	public Class<ImportFpShotJobResponse> getResponseClass() {
		return ImportFpShotJobResponse.class;
	}

}
