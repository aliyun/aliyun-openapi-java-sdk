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

package com.aliyuncs.opensearch.model.v20171225;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.opensearch.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetSortScriptRequest extends RoaAcsRequest<GetSortScriptResponse> {
	   

	private String appVersionId;

	private String scriptName;

	private String appGroupIdentity;
	public GetSortScriptRequest() {
		super("OpenSearch", "2017-12-25", "GetSortScript", "opensearch");
		setUriPattern("/v4/openapi/app-groups/[appGroupIdentity]/apps/[appVersionId]/sort-scripts/[scriptName]");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppVersionId() {
		return this.appVersionId;
	}

	public void setAppVersionId(String appVersionId) {
		this.appVersionId = appVersionId;
		if(appVersionId != null){
			putPathParameter("appVersionId", appVersionId);
		}
	}

	public String getScriptName() {
		return this.scriptName;
	}

	public void setScriptName(String scriptName) {
		this.scriptName = scriptName;
		if(scriptName != null){
			putPathParameter("scriptName", scriptName);
		}
	}

	public String getAppGroupIdentity() {
		return this.appGroupIdentity;
	}

	public void setAppGroupIdentity(String appGroupIdentity) {
		this.appGroupIdentity = appGroupIdentity;
		if(appGroupIdentity != null){
			putPathParameter("appGroupIdentity", appGroupIdentity);
		}
	}

	@Override
	public Class<GetSortScriptResponse> getResponseClass() {
		return GetSortScriptResponse.class;
	}

}
