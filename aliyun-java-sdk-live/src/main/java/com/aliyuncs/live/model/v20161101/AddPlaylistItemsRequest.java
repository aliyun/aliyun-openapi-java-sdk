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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddPlaylistItemsRequest extends RpcAcsRequest<AddPlaylistItemsResponse> {
	   

	private String programItems;

	private String programId;

	private String casterId;

	private Long ownerId;

	private String programConfig;
	public AddPlaylistItemsRequest() {
		super("live", "2016-11-01", "AddPlaylistItems", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProgramItems() {
		return this.programItems;
	}

	public void setProgramItems(String programItems) {
		this.programItems = programItems;
		if(programItems != null){
			putQueryParameter("ProgramItems", programItems);
		}
	}

	public String getProgramId() {
		return this.programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
		if(programId != null){
			putQueryParameter("ProgramId", programId);
		}
	}

	public String getCasterId() {
		return this.casterId;
	}

	public void setCasterId(String casterId) {
		this.casterId = casterId;
		if(casterId != null){
			putQueryParameter("CasterId", casterId);
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

	public String getProgramConfig() {
		return this.programConfig;
	}

	public void setProgramConfig(String programConfig) {
		this.programConfig = programConfig;
		if(programConfig != null){
			putQueryParameter("ProgramConfig", programConfig);
		}
	}

	@Override
	public Class<AddPlaylistItemsResponse> getResponseClass() {
		return AddPlaylistItemsResponse.class;
	}

}
