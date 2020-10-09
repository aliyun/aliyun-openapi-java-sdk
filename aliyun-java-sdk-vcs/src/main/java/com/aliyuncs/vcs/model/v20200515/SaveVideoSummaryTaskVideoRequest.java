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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveVideoSummaryTaskVideoRequest extends RpcAcsRequest<SaveVideoSummaryTaskVideoResponse> {
	   

	private String corpId;

	private Boolean saveVideo;

	private Long taskId;
	public SaveVideoSummaryTaskVideoRequest() {
		super("Vcs", "2020-05-15", "SaveVideoSummaryTaskVideo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public Boolean getSaveVideo() {
		return this.saveVideo;
	}

	public void setSaveVideo(Boolean saveVideo) {
		this.saveVideo = saveVideo;
		if(saveVideo != null){
			putBodyParameter("SaveVideo", saveVideo.toString());
		}
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("TaskId", taskId.toString());
		}
	}

	@Override
	public Class<SaveVideoSummaryTaskVideoResponse> getResponseClass() {
		return SaveVideoSummaryTaskVideoResponse.class;
	}

}
