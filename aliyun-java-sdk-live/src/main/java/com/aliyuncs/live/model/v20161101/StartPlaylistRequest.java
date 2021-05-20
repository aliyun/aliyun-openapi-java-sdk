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
public class StartPlaylistRequest extends RpcAcsRequest<StartPlaylistResponse> {
	   

	private String resumeMode;

	private String startItemId;

	private String programId;

	private Integer offset;

	private Long ownerId;
	public StartPlaylistRequest() {
		super("live", "2016-11-01", "StartPlaylist", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResumeMode() {
		return this.resumeMode;
	}

	public void setResumeMode(String resumeMode) {
		this.resumeMode = resumeMode;
		if(resumeMode != null){
			putQueryParameter("ResumeMode", resumeMode);
		}
	}

	public String getStartItemId() {
		return this.startItemId;
	}

	public void setStartItemId(String startItemId) {
		this.startItemId = startItemId;
		if(startItemId != null){
			putQueryParameter("StartItemId", startItemId);
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

	public Integer getOffset() {
		return this.offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
		if(offset != null){
			putQueryParameter("Offset", offset.toString());
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

	@Override
	public Class<StartPlaylistResponse> getResponseClass() {
		return StartPlaylistResponse.class;
	}

}
