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
public class CreateQueryProcessorRequest extends RoaAcsRequest<CreateQueryProcessorResponse> {
	   

	private Boolean dryRun;

	private Integer appId;

	private String appGroupIdentity;
	public CreateQueryProcessorRequest() {
		super("OpenSearch", "2017-12-25", "CreateQueryProcessor");
		setUriPattern("/v4/openapi/app-groups/[appGroupIdentity]/apps/[appId]/query-processors");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("dryRun", dryRun.toString());
		}
	}

	public Integer getAppId() {
		return this.appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
		if(appId != null){
			putPathParameter("appId", appId.toString());
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
	public Class<CreateQueryProcessorResponse> getResponseClass() {
		return CreateQueryProcessorResponse.class;
	}

}
