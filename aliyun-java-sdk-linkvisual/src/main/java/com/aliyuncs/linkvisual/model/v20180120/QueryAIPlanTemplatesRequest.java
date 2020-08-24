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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryAIPlanTemplatesRequest extends RpcAcsRequest<QueryAIPlanTemplatesResponse> {
	   

	private String appTemplateId;

	private String appVersion;
	public QueryAIPlanTemplatesRequest() {
		super("Linkvisual", "2018-01-20", "QueryAIPlanTemplates", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppTemplateId() {
		return this.appTemplateId;
	}

	public void setAppTemplateId(String appTemplateId) {
		this.appTemplateId = appTemplateId;
		if(appTemplateId != null){
			putQueryParameter("AppTemplateId", appTemplateId);
		}
	}

	public String getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
		if(appVersion != null){
			putQueryParameter("AppVersion", appVersion);
		}
	}

	@Override
	public Class<QueryAIPlanTemplatesResponse> getResponseClass() {
		return QueryAIPlanTemplatesResponse.class;
	}

}
