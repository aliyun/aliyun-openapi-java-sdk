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
public class DescribeUserAnalyzerRequest extends RoaAcsRequest<DescribeUserAnalyzerResponse> {
	   

	private String with;

	private String name;
	public DescribeUserAnalyzerRequest() {
		super("OpenSearch", "2017-12-25", "DescribeUserAnalyzer", "opensearch");
		setUriPattern("/v4/openapi/user-analyzers/[name]");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWith() {
		return this.with;
	}

	public void setWith(String with) {
		this.with = with;
		if(with != null){
			putQueryParameter("with", with);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putPathParameter("name", name);
		}
	}

	@Override
	public Class<DescribeUserAnalyzerResponse> getResponseClass() {
		return DescribeUserAnalyzerResponse.class;
	}

}
