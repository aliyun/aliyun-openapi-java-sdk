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
public class ListMediaWorkflowExecutionsRequest extends RpcAcsRequest<ListMediaWorkflowExecutionsResponse> {
	   

	private Long resourceOwnerId;

	private String nextPageToken;

	private String mediaWorkflowId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long maximumPageSize;

	private Long ownerId;

	private String mediaWorkflowName;

	private String inputFileURL;
	public ListMediaWorkflowExecutionsRequest() {
		super("Mts", "2014-06-18", "ListMediaWorkflowExecutions", "mts");
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

	public String getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
		if(nextPageToken != null){
			putQueryParameter("NextPageToken", nextPageToken);
		}
	}

	public String getMediaWorkflowId() {
		return this.mediaWorkflowId;
	}

	public void setMediaWorkflowId(String mediaWorkflowId) {
		this.mediaWorkflowId = mediaWorkflowId;
		if(mediaWorkflowId != null){
			putQueryParameter("MediaWorkflowId", mediaWorkflowId);
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

	public Long getMaximumPageSize() {
		return this.maximumPageSize;
	}

	public void setMaximumPageSize(Long maximumPageSize) {
		this.maximumPageSize = maximumPageSize;
		if(maximumPageSize != null){
			putQueryParameter("MaximumPageSize", maximumPageSize.toString());
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

	public String getMediaWorkflowName() {
		return this.mediaWorkflowName;
	}

	public void setMediaWorkflowName(String mediaWorkflowName) {
		this.mediaWorkflowName = mediaWorkflowName;
		if(mediaWorkflowName != null){
			putQueryParameter("MediaWorkflowName", mediaWorkflowName);
		}
	}

	public String getInputFileURL() {
		return this.inputFileURL;
	}

	public void setInputFileURL(String inputFileURL) {
		this.inputFileURL = inputFileURL;
		if(inputFileURL != null){
			putQueryParameter("InputFileURL", inputFileURL);
		}
	}

	@Override
	public Class<ListMediaWorkflowExecutionsResponse> getResponseClass() {
		return ListMediaWorkflowExecutionsResponse.class;
	}

}
