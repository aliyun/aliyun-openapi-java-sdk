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
public class PushInterventionDictionaryEntriesRequest extends RoaAcsRequest<PushInterventionDictionaryEntriesResponse> {
	   

	private String name;
	public PushInterventionDictionaryEntriesRequest() {
		super("OpenSearch", "2017-12-25", "PushInterventionDictionaryEntries", "opensearch");
		setUriPattern("/v4/openapi/intervention-dictionaries/[name]/entries/actions/bulk");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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
	public Class<PushInterventionDictionaryEntriesResponse> getResponseClass() {
		return PushInterventionDictionaryEntriesResponse.class;
	}

}
