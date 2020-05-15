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

package com.aliyuncs.pts.model.v20190810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.pts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReplaceOssFileRequest extends RpcAcsRequest<ReplaceOssFileResponse> {
	   

	private String jobId;

	private String sceneId;

	private String originalOssFileUrl;

	private String newOssFileUrl;
	public ReplaceOssFileRequest() {
		super("PTS", "2019-08-10", "ReplaceOssFile");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId);
		}
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putQueryParameter("SceneId", sceneId);
		}
	}

	public String getOriginalOssFileUrl() {
		return this.originalOssFileUrl;
	}

	public void setOriginalOssFileUrl(String originalOssFileUrl) {
		this.originalOssFileUrl = originalOssFileUrl;
		if(originalOssFileUrl != null){
			putQueryParameter("OriginalOssFileUrl", originalOssFileUrl);
		}
	}

	public String getNewOssFileUrl() {
		return this.newOssFileUrl;
	}

	public void setNewOssFileUrl(String newOssFileUrl) {
		this.newOssFileUrl = newOssFileUrl;
		if(newOssFileUrl != null){
			putQueryParameter("NewOssFileUrl", newOssFileUrl);
		}
	}

	@Override
	public Class<ReplaceOssFileResponse> getResponseClass() {
		return ReplaceOssFileResponse.class;
	}

}
