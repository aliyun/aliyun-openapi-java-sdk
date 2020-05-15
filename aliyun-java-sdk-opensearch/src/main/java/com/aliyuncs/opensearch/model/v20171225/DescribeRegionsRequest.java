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
public class DescribeRegionsRequest extends RoaAcsRequest<DescribeRegionsResponse> {
	   

	private String accept_language;
	public DescribeRegionsRequest() {
		super("OpenSearch", "2017-12-25", "DescribeRegions", "opensearch");
		setUriPattern("/v4/openapi/regions");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccept_language() {
		return this.accept_language;
	}

	public void setAccept_language(String accept_language) {
		this.accept_language = accept_language;
		if(accept_language != null){
			putQueryParameter("accept_language", accept_language);
		}
	}

	@Override
	public Class<DescribeRegionsResponse> getResponseClass() {
		return DescribeRegionsResponse.class;
	}

}
