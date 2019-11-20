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
public class SubmitFpCompareJobRequest extends RpcAcsRequest<SubmitFpCompareJobResponse> {
	   

	private Long resourceOwnerId;

	private String fpDBId;

	private String masterMedia;

	private String userData;

	private String queryMedia;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String pipelineId;

	private String matchedFrameStorage;
	public SubmitFpCompareJobRequest() {
		super("Mts", "2014-06-18", "SubmitFpCompareJob", "mts");
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

	public String getMasterMedia() {
		return this.masterMedia;
	}

	public void setMasterMedia(String masterMedia) {
		this.masterMedia = masterMedia;
		if(masterMedia != null){
			putQueryParameter("MasterMedia", masterMedia);
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

	public String getQueryMedia() {
		return this.queryMedia;
	}

	public void setQueryMedia(String queryMedia) {
		this.queryMedia = queryMedia;
		if(queryMedia != null){
			putQueryParameter("QueryMedia", queryMedia);
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

	public String getMatchedFrameStorage() {
		return this.matchedFrameStorage;
	}

	public void setMatchedFrameStorage(String matchedFrameStorage) {
		this.matchedFrameStorage = matchedFrameStorage;
		if(matchedFrameStorage != null){
			putQueryParameter("MatchedFrameStorage", matchedFrameStorage);
		}
	}

	@Override
	public Class<SubmitFpCompareJobResponse> getResponseClass() {
		return SubmitFpCompareJobResponse.class;
	}

}
