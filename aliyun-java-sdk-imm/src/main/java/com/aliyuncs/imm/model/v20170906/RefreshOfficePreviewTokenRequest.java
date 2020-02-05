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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RefreshOfficePreviewTokenRequest extends RpcAcsRequest<RefreshOfficePreviewTokenResponse> {
	   

	private String project;

	private String accessToken;

	private String refreshToken;
	public RefreshOfficePreviewTokenRequest() {
		super("imm", "2017-09-06", "RefreshOfficePreviewToken", "imm");
		setMethod(MethodType.POST);
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		if(accessToken != null){
			putQueryParameter("AccessToken", accessToken);
		}
	}

	public String getRefreshToken() {
		return this.refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
		if(refreshToken != null){
			putQueryParameter("RefreshToken", refreshToken);
		}
	}

	@Override
	public Class<RefreshOfficePreviewTokenResponse> getResponseClass() {
		return RefreshOfficePreviewTokenResponse.class;
	}

}
