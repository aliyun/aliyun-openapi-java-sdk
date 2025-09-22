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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vod.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateTranscodeTemplateGroupRequest extends RpcAcsRequest<UpdateTranscodeTemplateGroupResponse> {
	   

	private String transcodeTemplateList;

	private String locked;

	private String transcodeTemplateGroupId;

	private String name;
	public UpdateTranscodeTemplateGroupRequest() {
		super("vod", "2017-03-21", "UpdateTranscodeTemplateGroup", "vod");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTranscodeTemplateList() {
		return this.transcodeTemplateList;
	}

	public void setTranscodeTemplateList(String transcodeTemplateList) {
		this.transcodeTemplateList = transcodeTemplateList;
		if(transcodeTemplateList != null){
			putQueryParameter("TranscodeTemplateList", transcodeTemplateList);
		}
	}

	public String getLocked() {
		return this.locked;
	}

	public void setLocked(String locked) {
		this.locked = locked;
		if(locked != null){
			putQueryParameter("Locked", locked);
		}
	}

	public String getTranscodeTemplateGroupId() {
		return this.transcodeTemplateGroupId;
	}

	public void setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
		this.transcodeTemplateGroupId = transcodeTemplateGroupId;
		if(transcodeTemplateGroupId != null){
			putQueryParameter("TranscodeTemplateGroupId", transcodeTemplateGroupId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<UpdateTranscodeTemplateGroupResponse> getResponseClass() {
		return UpdateTranscodeTemplateGroupResponse.class;
	}

}
