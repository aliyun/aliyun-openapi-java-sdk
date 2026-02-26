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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebApplicationRevisionRequest extends RoaAcsRequest<DescribeWebApplicationRevisionResponse> {
	   

	private String revisionId;

	private String namespaceId;

	private String applicationId;
	public DescribeWebApplicationRevisionRequest() {
		super("sae", "2019-05-06", "DescribeWebApplicationRevision", "serverless");
		setUriPattern("/pop/v2/api/web/application-revisions/[ApplicationId]/revisions/[RevisionId]");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRevisionId() {
		return this.revisionId;
	}

	public void setRevisionId(String revisionId) {
		this.revisionId = revisionId;
		if(revisionId != null){
			putPathParameter("RevisionId", revisionId);
		}
	}

	public String getNamespaceId() {
		return this.namespaceId;
	}

	public void setNamespaceId(String namespaceId) {
		this.namespaceId = namespaceId;
		if(namespaceId != null){
			putQueryParameter("NamespaceId", namespaceId);
		}
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putPathParameter("ApplicationId", applicationId);
		}
	}

	@Override
	public Class<DescribeWebApplicationRevisionResponse> getResponseClass() {
		return DescribeWebApplicationRevisionResponse.class;
	}

}
