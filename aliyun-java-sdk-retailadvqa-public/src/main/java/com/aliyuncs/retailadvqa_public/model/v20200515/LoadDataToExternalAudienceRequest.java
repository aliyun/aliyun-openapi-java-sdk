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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class LoadDataToExternalAudienceRequest extends RpcAcsRequest<LoadDataToExternalAudienceResponse> {
	   

	private String accessId;

	private String audienceId;

	private String ossPath;
	public LoadDataToExternalAudienceRequest() {
		super("retailadvqa-public", "2020-05-15", "LoadDataToExternalAudience");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getAccessId() {
		return this.accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
		if(accessId != null){
			putQueryParameter("AccessId", accessId);
		}
	}

	public String getAudienceId() {
		return this.audienceId;
	}

	public void setAudienceId(String audienceId) {
		this.audienceId = audienceId;
		if(audienceId != null){
			putQueryParameter("AudienceId", audienceId);
		}
	}

	public String getOssPath() {
		return this.ossPath;
	}

	public void setOssPath(String ossPath) {
		this.ossPath = ossPath;
		if(ossPath != null){
			putQueryParameter("OssPath", ossPath);
		}
	}

	@Override
	public Class<LoadDataToExternalAudienceResponse> getResponseClass() {
		return LoadDataToExternalAudienceResponse.class;
	}

}
