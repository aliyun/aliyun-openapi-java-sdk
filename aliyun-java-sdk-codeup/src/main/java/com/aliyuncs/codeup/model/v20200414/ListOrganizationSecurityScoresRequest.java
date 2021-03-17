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

package com.aliyuncs.codeup.model.v20200414;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListOrganizationSecurityScoresRequest extends RoaAcsRequest<ListOrganizationSecurityScoresResponse> {
	   

	private String accessToken;
	public ListOrganizationSecurityScoresRequest() {
		super("codeup", "2020-04-14", "ListOrganizationSecurityScores");
		setUriPattern("/api/v4/organization/security/scores");
		setMethod(MethodType.GET);
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

	@Override
	public Class<ListOrganizationSecurityScoresResponse> getResponseClass() {
		return ListOrganizationSecurityScoresResponse.class;
	}

}
